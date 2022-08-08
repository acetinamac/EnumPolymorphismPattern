package com.github.arminmac.enumpoly;

public enum CardType {
    VISA,
    MASTERCARD
}

public enum VisaCardType implements CardLogoType {

    private String code;

    VisaCardType(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public CardType getCartType() {
        return CardType.VISA;
    }
}


