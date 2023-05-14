package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void happyTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        int actualValidate = userRegistration.validateUser("Mujeeb", "Saifi", "abc@gmail.com", "+912233445566", "A1@asdfg");
        Assertions.assertEquals(1, actualValidate);
    }

    @Test
    public void sadTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        int actualValidate = userRegistration.validateUser("mujeeb", "saifi", "@abc@gmail.com", "0+912233445566", "@A1@asdfg");
        Assertions.assertEquals(1, actualValidate);
    }

}
