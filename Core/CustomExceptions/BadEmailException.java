package Core.CustomExceptions;

public class BadEmailException extends Exception{
    public BadEmailException() {
        super("Вы ввели неверный адрес электронной почты");
    }
}