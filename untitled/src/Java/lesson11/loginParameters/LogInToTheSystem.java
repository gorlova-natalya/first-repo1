package Java.lesson11.loginParameters;

public class LogInToTheSystem {

    private String login;
    private String password;
    private String confirmPassword;

    public LogInToTheSystem(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public static boolean enterTheSystem(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password);
            checkConfirmPassword(password, confirmPassword);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void checkLogin(String login) throws WrongLoginException {
        int maxLoginLength = 20;
        if (login.length() > maxLoginLength || login.contains(" ")) {
            throw new WrongLoginException("Неверный логин");
        }
    }

    private static void checkPassword(String password) throws WrongPasswordException {
        int maxPasswordLength = 20;
        if (password.length() > maxPasswordLength || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Неверный пароль");
        }
    }

    private static void checkConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль повторен неверно");
        }
    }
}
