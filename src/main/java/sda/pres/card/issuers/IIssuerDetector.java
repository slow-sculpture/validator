package sda.pres.card.issuers;

public interface IIssuerDetector {
    String detectIssuer(String cardNo, String filePath);

}
