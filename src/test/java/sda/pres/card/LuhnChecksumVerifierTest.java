package sda.pres.card;

import org.junit.Assert;
import org.junit.Test;
import sda.pres.card.checksums.IChecksumVerifier;
import sda.pres.card.checksums.LuhnChecksumVerifier;

public class LuhnChecksumVerifierTest{

    @Test
    public void testVerify() throws Exception {
        String cardNo = "18606";
        IChecksumVerifier checksumVerifier = new LuhnChecksumVerifier();

        boolean result = checksumVerifier.verify(cardNo);

        Assert.assertTrue(result);
    }

    @Test
    public void testVerifyNegatively() throws Exception {
        String cardNo = "18605";
        IChecksumVerifier checksumVerifier = new LuhnChecksumVerifier();

        boolean result = checksumVerifier.verify(cardNo);

        Assert.assertFalse(result);
    }

    @Test
    public void testVerifyPositive() throws Exception {
        String cardNo = "1412";
        IChecksumVerifier checksumVerifier = new LuhnChecksumVerifier();

        boolean result = checksumVerifier.verify(cardNo);

        Assert.assertTrue(result);
    }

    @Test
    public void testVerifyNeg2() throws Exception {
        String cardNo = "2421";
        IChecksumVerifier checksumVerifier = new LuhnChecksumVerifier();

        boolean result = checksumVerifier.verify(cardNo);

        Assert.assertFalse(result);
    }

}