package com.company.utils;

import com.company.encode.BinaryEncoder;
import com.company.encode.MorseEncoder;
import com.company.encode.MurcielagoEncoder;

public class InvokeEncoders {
    public void invokeEncoders(String originalText){
        MorseEncoder morseEncoder = new MorseEncoder();
        morseEncoder.encode(originalText);

        BinaryEncoder binaryEncoder = new BinaryEncoder();
        binaryEncoder.encode(originalText);

        MurcielagoEncoder murcielagoEncoder = new MurcielagoEncoder();
        murcielagoEncoder.encode(originalText);
    }
}
