package sda.pres.card;

import sda.pres.card.checksums.IChecksumVerifier;
import sda.pres.card.checksums.LuhnChecksumVerifier;
import sda.pres.card.issuers.IIssuerDetector;
import sda.pres.card.issuers.impl.IssuerDetector;

public class SDACardValidator implements ISDAValidator {

    @Override
    public ValidationResult validateCardNumber(String cardNo, String ruleBaseFilePath) {
        ValidationResult result = new ValidationResult();

        IIssuerDetector issuerDetector = new IssuerDetector();
        String issuerName = issuerDetector.detectIssuer(cardNo, ruleBaseFilePath);

        IChecksumVerifier checksumVerifier = new LuhnChecksumVerifier();
        boolean checksumValidationResult = checksumVerifier.verify(cardNo);

        result.setIssuerName(issuerName);
        result.setLuhnPassed(checksumValidationResult);
        return result;
    }
}
