package sda.pres.card.issuers.impl;

import sda.pres.card.issuers.IRuleBuilder;
import sda.pres.card.issuers.IssuerRule;

import java.util.ArrayList;
import java.util.List;

public class IssuerRuleBuilder implements IRuleBuilder {
    @Override
    public List<IssuerRule> buildRules() {
        List<IssuerRule> issuerRules = new ArrayList<>();

        IssuerRule rule1 = new IssuerRule();
        rule1.setIssuerName("Visa");
        rule1.setLength(16);
        rule1.setPrefix(4);

        IssuerRule rule2 = new IssuerRule();
        rule2.setIssuerName("MASTER CARD");
        rule2.setLength(16);
        rule2.setPrefix(51);

        IssuerRule rule3 = new IssuerRule();
        rule3.setIssuerName("MASTER CARD");
        rule3.setLength(16);
        rule3.setPrefix(52);

        IssuerRule rule4 = new IssuerRule();
        rule4.setIssuerName("MASTER CARD");
        rule4.setLength(16);
        rule4.setPrefix(53);

        IssuerRule rule5 = new IssuerRule();
        rule5.setIssuerName("MASTER CARD");
        rule5.setLength(16);
        rule5.setPrefix(54);

        IssuerRule rule6 = new IssuerRule();
        rule6.setIssuerName("MASTER CARD");
        rule6.setLength(16);
        rule6.setPrefix(55);

        IssuerRule rule7 = new IssuerRule();
        rule7.setIssuerName("AMERICAN EXPRESS");
        rule7.setLength(15);
        rule7.setPrefix(34);

        IssuerRule rule8 = new IssuerRule();
        rule8.setIssuerName("AMERICAN EXPRESS");
        rule8.setLength(15);
        rule8.setPrefix(37);

        issuerRules.add(rule1);
        issuerRules.add(rule2);
        issuerRules.add(rule3);
        issuerRules.add(rule4);
        issuerRules.add(rule5);
        issuerRules.add(rule6);
        issuerRules.add(rule7);
        issuerRules.add(rule8);
        return issuerRules;
    }
}
