package com.github.arminmac.enumpoly;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface Types {

    String getCode();

    CardType getCartType();

    static Optional<Types> fromCode(String code) {
        List<Types> visaTypes = List.of(VisaCardType.Values());

        return null;
    }

    static Set<Types> fromCardType(CardType cardType) {
        return null;
    }

}
