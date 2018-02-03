package sda.pres.card.issuers.impl;

import org.junit.Assert;
import org.junit.Test;
import sda.pres.card.issuers.IRuleBuilder;
import sda.pres.card.issuers.IssuerRule;

import java.util.List;

import static org.junit.Assert.*;

public class IssuerRuleFromFileBuilderTest {
    @Test
    public void buildRules() throws Exception {
        IRuleBuilder builder = new IssuerRuleFromFileBuilder(null);
        List<IssuerRule> rules = builder.buildRules();

        Assert.assertTrue(rules.size() == 8);
    }

    @Test
    public void buildRules2() throws Exception {
        IRuleBuilder builderForExpectedValues = new IssuerRuleBuilder();
        List<IssuerRule> expectedRules = builderForExpectedValues.buildRules();

        IRuleBuilder builder = new IssuerRuleFromFileBuilder(null);
        List<IssuerRule> rules = builder.buildRules();

        Assert.assertTrue(rules.size() == 8);
        Assert.assertEquals(expectedRules, rules);
    }

}