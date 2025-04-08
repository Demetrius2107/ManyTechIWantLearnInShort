package com.lip.Pagex;

import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

    public static boolean isValidPassword(String password) {
        return PASSWORD_PATTERN.matcher(password).matches();
    }

    public static void main(String[] args) {
        // 包含大小写字母和数字的有效密码
        String validPassword = "Ab1";
        // 仅包含大小写字母的无效密码
        String invalidPassword1 = "Abc";
        // 仅包含小写字母和数字的无效密码
        String invalidPassword2 = "ab1";

        System.out.println("包含大小写字母和数字的密码是否有效: " + isValidPassword(validPassword));
        System.out.println("仅包含大小写字母的密码是否有效: " + isValidPassword(invalidPassword1));
        System.out.println("仅包含小写字母和数字的密码是否有效: " + isValidPassword(invalidPassword2));
    }
}    