package ex2;

import java.io.IOException;

class TestAuthentification {
    public static void main(String[] args) {
        authenticate();
    }

    public static void authenticate() {
        while (true) {
            try {
                Authentification auth = new Authentification();
                String login = auth.getUserLogin();
                String password = auth.getUserPwd();

                System.out.println("Authentication successful!");
                break;
            } catch (WrongLoginException | WrongPwdException | WrongInputLength e) {
                System.out.println(e.getMessage());
                System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}
