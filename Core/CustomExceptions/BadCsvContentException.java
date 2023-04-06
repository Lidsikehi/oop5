package Core.CustomExceptions;

public class BadCsvContentException extends Exception{
    public BadCsvContentException() {
        super("Указан неверный CSV-файл, не удается загрузить телефонную книгу");
    }
}
