package sda.pres.card.issuers.impl;


import sda.pres.card.issuers.IssuerRule;

import java.util.ArrayList;
import java.util.List;


public class IssuerRuleListBuilderFactory  {
    public static List<IssuerRule> build(String path) {
        List<IssuerRule> listOfRules = null;
        if (path != null && !path.isEmpty()) {
            IssuerRuleFromFileBuilder fromFile = new IssuerRuleFromFileBuilder(path);
            listOfRules = fromFile.buildRules();
        } else {
            IssuerRuleBuilder builder = new IssuerRuleBuilder();
            listOfRules = builder.buildRules();
        }
        return listOfRules;
    }
}
