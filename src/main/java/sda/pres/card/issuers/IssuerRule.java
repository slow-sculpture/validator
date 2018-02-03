package sda.pres.card.issuers;

public class IssuerRule {
    private String issuerName;
    private int prefix;
    private int length;

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o1) {
        boolean result = false;
        IssuerRule objectToCompare = (IssuerRule) o1;
        if (objectToCompare.getIssuerName().toLowerCase().equals(issuerName.toLowerCase())
                && objectToCompare.getLength() == length
                && objectToCompare.getPrefix() == prefix) {
            result = true;
        }
        return result;
    }
}
