package sda.pres.card.issuers.impl;

import sda.pres.card.issuers.IIssuerDetector;
import sda.pres.card.issuers.IRuleBuilder;
import sda.pres.card.issuers.IssuerRule;

import java.util.List;

public class IssuerDetector implements IIssuerDetector {

    @Override
    public String detectIssuer(String cardNo, String filePath) {
        String result = "UNKNOWN";

        //TODO: utworzyc nowa fabryke lub zmodyfikowac istniejaca tak aby
        //typem zwracanym byla List<IssuerRule> a nie IRuleBuilder


       /* //wyrzucenie logiki do fabryki
        //fabryka - w celu wsadzenia tworzenia wszystkich elementow tworzycych obiekty
        //w jedno miejsce
        //wzywamy fabryke a ona tworzy odpowiedni obiekt*/

        //=================linie do zmainy=======================
        IRuleBuilder rulesBuilder = IssuerRuleBuilderFactory.produce(filePath);
        List<IssuerRule> issuerRules = rulesBuilder.buildRules();
        //=======================================================
        IssuerRuleListBuilderFactory list = new IssuerRuleListBuilderFactory();
        List<IssuerRule> issuerRules1 = list.build(filePath);





        // algorytm przyrównuje każdą regułę do stringa cardNo przekazanego jako parametr
        // jeśli uda się dopasować regułę (program "wejdzie w ifa"), do zmiennej result
        // zostanie przypisana wartość name z obiektu reprezentującego regułę

        /**
         * for (int i = 0; i < issuerRules.size();i++) {
         *     IssuerRule issuerRule = issuerRules.get(i);
         * }
         */
        for (IssuerRule issuerRule : issuerRules) {
            if (cardNo.startsWith(String.valueOf(issuerRule.getPrefix())) && cardNo.length() == issuerRule.getLength()) {
                result = issuerRule.getIssuerName();
            }
        }
        return result;
    }
}
