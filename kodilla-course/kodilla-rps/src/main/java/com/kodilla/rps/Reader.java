package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {
    private Scanner in = new Scanner(System.in);

    public int readInt() {
        while (true) {
            try {
                return in.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Enter only numbers!");
                in.next();
            }
        }
    }

    public String readLine() {
        return in.nextLine();
    }

    public String readKey() {
        return in.next();
    }
}
