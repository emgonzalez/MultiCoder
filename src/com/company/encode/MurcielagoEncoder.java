package com.company.encode;

import com.company.interfaces.EncoderInterface;

public class MurcielagoEncoder implements EncoderInterface {
    private final char[] clave = {'M', 'U', 'R', 'C', 'I', 'E', 'L', 'A', 'G', 'O'};

    @Override
    public void encode(String text){
        murcielagoEncoder(text);
    }

    public void murcielagoEncoder(String textToMurcielago) {
        char[] ch = textToMurcielago.toCharArray();
        char[] chNuevo = transcribirPalabra(ch);

        String str2 = String.valueOf(chNuevo);
        System.out.println(str2 + (" (Murcielago)"));

    }

    private char[] transcribirPalabra(char[] pal) {
        //instanciar arreglo resultante
        char[] result = new char[pal.length];
        //recorrer el arreglo de la palabra original
        for (int i = 0; i < pal.length; i++) {
            //obtener la letra a intercambiar y agregarla al nuevo arreglo

            result[i] = buscarLetraClave(pal[i]);
        }
        return result;
    }

    private char buscarLetraClave(char letra) {
        //recorrer el arreglo de la palabra murcielago
        for (int i = 0; i < clave.length; i++) {
            //si la letra buscada se encuentra dentro de la palabra murcielago
            if (clave[i] == letra || Character.toUpperCase(letra) == clave[i]) {
                //retornar como char la posición numérica de la letra en la palabra murcielago
                return Integer.toString(i).charAt(0);
            }
        }
        //si no se encuentra la letra buscada en el arreglo murcielago, se retorna la misma letra
        return letra;

    }



}
