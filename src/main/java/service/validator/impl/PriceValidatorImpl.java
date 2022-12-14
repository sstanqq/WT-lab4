package main.java.service.validator.impl;

import service.validator.AbstractValidator;

public class PriceValidatorImpl extends AbstractValidator {
    private static final String PRICE_REGEX = "^(([1-9]\\d*\\.\\d+)|(0[1-9]*\\.\\d+)|(\\d\\.\\d+)|(0)|([1-9]\\d*))$";

    @Override
    protected String getRegex() {
        return PRICE_REGEX;
    }
}