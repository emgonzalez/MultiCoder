package com.company.encode;

import com.company.interfaces.EncoderInterface;

import java.util.HashMap;
import java.util.Map;

public class MorseEncoder implements EncoderInterface {

    @Override
    public void encode(String text){
        morseEncoder(text);
    }

    public void morseEncoder(String textToMorse) {
        //String textToMorse = Input.getString("Enter a phrase in English.");
        //String textToMorse = "abAB";
        textToMorse = textToMorse.toUpperCase();

        int i = 0;

        while(i <textToMorse.length()) {
            Map<Character, String> morse = new HashMap<Character, String>();
            morse.put('A', ".-");
            morse.put('B', "-...");
            morse.put('C',  "-.-.");
            morse.put('D',  "-..");
            morse.put('E',    ".");
            morse.put('F', "..-.");
            morse.put('G',  "--.");
            morse.put('H', "....");
            morse.put('I',   "..");
            morse.put('J', ".---");
            morse.put('K',   "-.-");
            morse.put('L', ".-..");
            morse.put('M',   "--");
            morse.put('N',   "-.");
            morse.put('O',  "---");
            morse.put('P', ".--.");
            morse.put('Q', "--.-");
            morse.put('R', ".-.");
            morse.put('S',  "...");
            morse.put('T',   "-");
            morse.put('U',  "..-");
            morse.put('V', "...-");
            morse.put('W',  ".--");
            morse.put('X', "-..-");
            morse.put('Y', "-.--");
            morse.put('Z', "--..");
            System.out.print(morse.get(textToMorse.charAt(i)));
            i++;
        }
        System.out.println(" (Morse)");
    }

}
