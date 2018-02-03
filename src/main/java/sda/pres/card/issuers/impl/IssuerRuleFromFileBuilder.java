package sda.pres.card.issuers.impl;

import sda.pres.card.issuers.IRuleBuilder;
import sda.pres.card.issuers.IssuerRule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IssuerRuleFromFileBuilder implements IRuleBuilder {

    private static final String COMMENT_PREFIX = "#";
    private static final String RULE_SEPARATOR = ";";

    private String filePath;

    public IssuerRuleFromFileBuilder(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<IssuerRule> buildRules() {
        List<IssuerRule> result = new ArrayList<>();

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";
            while (((line = bufferedReader.readLine()) != null)) {
                if (line.startsWith(COMMENT_PREFIX)) { continue; }
                String[] tokens = line.split(RULE_SEPARATOR);
                IssuerRule issuerRule = new IssuerRule();
                issuerRule.setIssuerName(tokens[0]);
                issuerRule.setPrefix(Integer.parseInt(tokens[1]));
                issuerRule.setLength(Integer.parseInt(tokens[2]));
                result.add(issuerRule);
            }
        } catch (Exception e) {
            //TODO: throw exception
        }

        return result;
    }
}
