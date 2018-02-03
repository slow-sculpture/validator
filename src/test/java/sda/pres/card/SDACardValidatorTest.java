package sda.pres.card;


import org.junit.Assert;
import org.junit.Test;

public class SDACardValidatorTest {

    @Test
    public void testValidateCardNumber() throws Exception {
        final String cardNo = "5165201688668791";
        ISDAValidator validator = new SDACardValidator();

        ValidationResult result = validator.validateCardNumber(cardNo, null);

        Assert.assertEquals("MASTER CARD", result.getIssuerName());
        Assert.assertTrue(result.isLuhnPassed());
        Assert.assertEquals(true, result.isLuhnPassed());
    }

    @Test
    public void testValidateCardNumberUNKNOWN() throws Exception {
        final String cardNo = "9911111111111111";
        ISDAValidator validator = new SDACardValidator();

        ValidationResult result = validator.validateCardNumber(cardNo, null);

        Assert.assertEquals("UNKNOWN", result.getIssuerName());
        Assert.assertFalse(result.isLuhnPassed());
        Assert.assertEquals(false, result.isLuhnPassed());
    }

}