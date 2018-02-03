package sda.pres.card.issuers.impl;

import sda.pres.card.issuers.IIssuerDetector;
import sda.pres.card.issuers.IRuleBuilder;
import sda.pres.card.issuers.IssuerRule;

import java.util.List;

public class IssuerDetector implements IIssuerDetector {

    @Override
    public String detectIssuer(String cardNo, String filePath) {
        String result = "UNKNOWN";

        //TODO: zaimplementować klasę fabryki zwracającej obiekty typu IRuleBuilder
        //na bazie parametru filePath
        IRuleBuilder rulesBuilder = null;
        if (filePath != null && !filePath.isEmpty()) {
            rulesBuilder = new IssuerRuleFromFileBuilder(filePath);
        } else {
            rulesBuilder = new IssuerRuleBuilder();
        }

        List<IssuerRule> issuerRules = rulesBuilder.buildRules();

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
