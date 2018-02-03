package sda.pres.card.issuers.impl;

import org.junit.Assert;
import org.junit.Test;
import sda.pres.card.issuers.IRuleBuilder;
import sda.pres.card.issuers.IssuerRule;

import java.util.List;

public class IssuerRuleFromFileBuilderTest {

    private static final String RULES_TXT_FILENAME = "rules.txt";

    @Test
    public void buildRules() throws Exception {
        String filePath = getClass().getClassLoader().getResource(RULES_TXT_FILENAME).getPath();
        IRuleBuilder builder = new IssuerRuleFromFileBuilder(filePath);
        List<IssuerRule> rules = builder.buildRules();

        Assert.assertTrue(rules.size() == 8);
    }

    @Test
    public void buildRules2() throws Exception {
        String filePath = getClass().getClassLoader().getResource(RULES_TXT_FILENAME).getPath();
        IRuleBuilder builderForExpectedValues = new IssuerRuleBuilder();
        List<IssuerRule> expectedRules = builderForExpectedValues.buildRules();

        IRuleBuilder builder = new IssuerRuleFromFileBuilder(filePath);
        List<IssuerRule> rules = builder.buildRules();

        Assert.assertTrue(rules.size() == 8);
        Assert.assertEquals(expectedRules, rules);
    }

}