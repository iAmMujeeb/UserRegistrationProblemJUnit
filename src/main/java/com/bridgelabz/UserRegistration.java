package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean checkValidity(String value) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,8}$");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    public int validateUser(String firstName, String lastName, String emailId, String phNum, String password) {
        int entryFN = 0;
        int entryLN = 0;
        int entryemailId = 0;
        int entryPhNum = 0;
        int entryPassword = 0;

        UserRegistration.checkValidity(firstName);
        if (UserRegistration.checkValidity(firstName)) {
            entryFN = 1;
        } else {
            entryFN = 0;
        }
        UserRegistration.checkValidity(lastName);
        if (UserRegistration.checkValidity(lastName)) {
            entryLN = 1;
        } else {
            entryLN = 0;
        }

        Pattern pattern = Pattern.compile("^abc([.+-]?[0-9]{3})*[@][a-zA-Z0-9]{1,8}.[a-z]{3}.*([a-z]{2,3})*$");
        Matcher matcher = pattern.matcher(emailId);
        if (matcher.matches()) {
            entryemailId = 1;
        } else {
            entryemailId = 0;
        }

        Pattern pattern1 = Pattern.compile("^[+]91[0-9]{10}$");
        Matcher matcher1 = pattern1.matcher(phNum);
        if (matcher1.matches())
            entryPhNum = 1;
        else
            entryPhNum = 0;

        Pattern pattern2 = Pattern.compile("^[A-Z][0-9][$&+,:;=?@#|'<>.-^*()%!][a-zA-Z0-9]{5}$");
        Matcher matcher2 = pattern2.matcher(password);
        if (matcher2.matches())
            entryPassword = 1;
        else
            entryPassword = 0;
        if (((entryFN==entryLN)&&(entryemailId==entryPhNum))&&(entryPassword == 1)){
            return 1;
        }else
            return 0;
    }
}
