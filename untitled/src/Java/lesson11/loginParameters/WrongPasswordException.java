package Java.lesson11.loginParameters;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);
    }
    public WrongPasswordException() {
    }
}
