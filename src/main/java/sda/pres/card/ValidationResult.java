package sda.pres.card;

public class ValidationResult {
    private String issuerName;
    private boolean luhnPassed = false;

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public boolean isLuhnPassed() {
        return luhnPassed;
    }

    public void setLuhnPassed(boolean luhnPassed) {
        this.luhnPassed = luhnPassed;
    }
}
