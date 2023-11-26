package ex2;

import java.io.IOException;
import java.util.Scanner;

class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPwdException extends Exception {
    public WrongPwdException(String message) {
        super(message);
    }
}

class WrongInputLength extends Exception {
    public WrongInputLength(String message) {
        super(message);
    }
}

public class Authentification {
    private static final String LoginCorrect = "scott";
    private static final String PwdCorrect = "tiger";

    public static String getUserLogin() throws WrongLoginException, IOException, WrongInputLength {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = scanner.nextLine();

        if (!login.equals(LoginCorrect)) {
            throw new WrongLoginException("Incorrect login!");
        }

        if (login.length() > 10) {
            throw new WrongInputLength("Login length exceeds 10 characters!");
        }

        return login;
    }

    public static String getUserPwd() throws WrongPwdException, IOException, WrongInputLength {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = scanner.nextLine();

        if (!pwd.equals(PwdCorrect)) {
            throw new WrongPwdException("Incorrect password!");
        }

        if (pwd.length() > 10) {
            throw new WrongInputLength("Password length exceeds 10 characters!");
        }

        return pwd;
    }
}
