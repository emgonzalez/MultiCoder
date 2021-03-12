package com.company;

import com.company.utils.InvokeEncoders;
import com.company.utils.TextCapture;

import static com.company.utils.IsAlpha.isAlpha;


public class Main {

    public static void main(String[] args) {

        Boolean isAlpha = false;

        System.out.println ("Por favor introduzca el  texto a codificar:");
        while(!isAlpha){
            TextCapture textCapture = new TextCapture();
            String originalText = textCapture.textCapture();

            isAlpha = isAlpha(originalText);

            if ((isAlpha)) {
                InvokeEncoders invokeEncoders = new InvokeEncoders();
                invokeEncoders.invokeEncoders(originalText);
            } else {
                System.out.println("El texto no debe contener números ni caracteres especiales. Ingrese otro texto:");
            }
        }
    }
}
