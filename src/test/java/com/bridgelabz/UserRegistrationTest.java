package com.bridgelabz;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    private String emailId;
    private int expectedResult;
    private UserRegistration userRegistration;

    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }

    public UserRegistrationTest(String emailId, int expectedResult) {
        super();
        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc@gmail.com", 1}, {"abc@gmail.com", 1}, {"abc@gmail.com", 1}});
    }

    @Test
    public void testEmails() {
        System.out.println("User Added = : " + expectedResult);
        assertEquals(expectedResult, userRegistration.validateEmailId(emailId));
    }

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
