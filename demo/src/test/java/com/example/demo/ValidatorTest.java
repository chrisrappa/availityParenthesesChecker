package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    public void shouldReturnFalseWhenPassingInImproperlyClosingStringArray(){

        Validator validator = new Validator();
        assertEquals(false, validator.Validator("(()"));
    }

    @Test
    public void shouldReturnTrueWhenPassingInProperlyCloseBrackets(){

        Validator validator = new Validator();
        assertEquals(true, validator.Validator("(())"));
    }

}