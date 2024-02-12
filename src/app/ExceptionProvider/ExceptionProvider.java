package app.ExceptionProvider;

import java.util.Scanner;

public class ExceptionProvider {

    public String getHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height: ");
        return scanner.nextLine().trim();
    }
}
