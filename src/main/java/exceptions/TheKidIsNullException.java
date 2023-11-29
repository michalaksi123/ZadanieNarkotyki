package exceptions;

public class TheKidIsNullException extends RuntimeException {
    public TheKidIsNullException() {
    }

    public TheKidIsNullException(String message) { super(message);}
}
