package sda.pres.card;

import org.junit.Assert;
import org.junit.Test;
import sda.pres.card.issuers.IIssuerDetector;
import sda.pres.card.issuers.impl.IssuerDetector;

public class IssuerDetectorTest {
    @Test
    public void testDetectIssuer() {
        final String cardNo = "5111111111111111";

        IIssuerDetector issuerDetector = new IssuerDetector();
        String result = issuerDetector.detectIssuer(cardNo, null);

        Assert.assertEquals("MASTER CARD".toLowerCase(), result.toLowerCase());
    }
    @Test
    public void testDetectIssuerVISA() {
        final String cardNo = "4111111111111111";

        IIssuerDetector issuerDetector = new IssuerDetector();
        String result = issuerDetector.detectIssuer(cardNo, null);

        Assert.assertEquals("VISA".toLowerCase(), result.toLowerCase());
    }
    @Test
    public void testDetectIssuerAMEX() {
        final String cardNo = "341111111111111";

        IIssuerDetector issuerDetector = new IssuerDetector();
        String result = issuerDetector.detectIssuer(cardNo, null);

        Assert.assertEquals("AMERICAN EXPRESS".toLowerCase(), result.toLowerCase());
    }

    @Test
    public void testDetectIssuerUNKNOWN() {
        final String cardNo = "6111111111111111";

        IIssuerDetector issuerDetector = new IssuerDetector();
        String result = issuerDetector.detectIssuer(cardNo, null);

        Assert.assertEquals("UNKNOWN".toLowerCase(), result.toLowerCase());
    }

}