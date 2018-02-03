package sda.pres.card.issuers;

import sda.pres.card.issuers.IssuerRule;

import java.util.List;

public interface IRuleBuilder {
    List<IssuerRule> buildRules();
}
