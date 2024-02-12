package app;

import app.ExceptionHadler.ExceptionHadler;
import app.ExceptionProvider.ExceptionProvider;

public class Exception {

    public static void main(String[] args){

        ExceptionProvider provider = new ExceptionProvider();
        String height = provider.getHeight();
        ExceptionHadler hadler = new ExceptionHadler();
        getOUtPut(hadler.HandleException(height));
        getOUtPut("Some code.");
    }
    private static void getOUtPut(String output) {
        System.out.println(output);
    }
}
