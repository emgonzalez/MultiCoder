package com.company.encode;

import com.company.interfaces.EncoderInterface;

public class BinaryEncoder implements EncoderInterface {

    @Override
    public void encode(String text){
        binaryEncoder(text);
    }

    public void binaryEncoder(String textToBinary) {

        StringBuilder result = new StringBuilder();
        char[] chars = textToBinary.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))
                            .replaceAll(" ", "0"));
            result.append(" ");
        }

        System.out.println(result.toString() + " (Binario)");

    }

}
