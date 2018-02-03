package sda.pres.card;

public class App 
{
    public static void main( String[] args ) {
        ISDAValidator validator = new SDACardValidator();
        ValidationResult validationResult = validator.validateCardNumber(args[0], args[1]);
        System.out.println("ISSUER: " + validationResult.getIssuerName());
        System.out.println("LUHN PASSED:" + validationResult.isLuhnPassed());
    }
}
