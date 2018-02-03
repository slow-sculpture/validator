package sda.pres.card;

public interface ISDAValidator {
    ValidationResult validateCardNumber(String cardNo, String rulesBaseFilePath);
}
