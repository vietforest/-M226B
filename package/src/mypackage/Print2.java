package mypackage;

import mypackage.MyLocalPrinter.*;
import printer.MyPrinter.*;

import static printer.MyPrinter.stampa;
import static mypackage.MyLocalPrinter.stampa1;

public class Print2 {
    public static void main(String[] args) {
        stampa();
        stampa1();
    }
}
