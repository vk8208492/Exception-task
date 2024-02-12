package app.ExceptionValidator;

import app.HeightException.HeightException;
import com.sun.xml.internal.ws.handler.HandlerException;

public class ExceptionValidator {
    private static final int MAX_HEIGHT = 355;
    public static final String INPUT_REGEX = "^\\d + $";

    public String validateInputHeight(String input) throws IllegalArgumentException {
        if ( !input.matches(INPUT_REGEX) )
            throw new IllegalArgumentException(input + " is wrong height");
        return input;
    }

    public String validateHeight(String height) throws HandlerException {
        if ( Integer.parseInt(height) < MAX_HEIGHT ) {
            throw new HandlerException("Height" + height + "is height of"  +  MAX_HEIGHT + "!");
        }
        return "Height" + height + "is OK!";
    }
}
