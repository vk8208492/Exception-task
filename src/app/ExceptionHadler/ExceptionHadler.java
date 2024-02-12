package app.ExceptionHadler;

import app.ExceptionValidator.ExceptionValidator;
import com.sun.xml.internal.ws.handler.HandlerException;

public class ExceptionHadler {

    public String HandleException(String exception) {

        ExceptionValidator validator = new ExceptionValidator();
        try {
            return validator.validateHeight(validator.validateInputHeight(exception));
        } catch (IllegalArgumentException | HandlerException e) {
            return e.getMessage();
        }
    }
}
