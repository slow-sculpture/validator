package sda.pres.card.issuers.impl;

import sda.pres.card.issuers.IRuleBuilder;

public class IssuerRuleBuilderFactory {
    public static IRuleBuilder produce(String filePath){
        IRuleBuilder rulesBuilder = null;
        if (filePath != null && !filePath.isEmpty()) {
            rulesBuilder = new IssuerRuleFromFileBuilder(filePath);
        } else {
            rulesBuilder = new IssuerRuleBuilder();
        }
        return rulesBuilder;
    }
}
