package com.company.utils;

import java.util.Scanner;

public class TextCapture {
    public String textCapture() {
        String originalText = "";
        Scanner entradaEscaner = new Scanner (System.in);
        originalText = entradaEscaner.nextLine ();

        return originalText;
    }
}
