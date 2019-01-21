/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptsarch;

//import java.io.*;

/**
 *
 * @author CHRISTIAN
 */
public class Cipher {

    Operations a = new Operations();

    public final void cipher(byte[][] text, byte[] mKeyExp) {
        a.addRoundKey(0, text, mKeyExp); // primera iteracion

        for (int i = 1; i < 10; i++) { // 8 siguientes iteraciones
            a.subBytes(text); //sustituimos el texto por los valores de cajaS
            a.shiftRows(text); //rotamos 2 fila un byte,3 fila dos bytes y 4 fila tres bytes
            a.mixColumns(text); //cada columna se multiplica por una matrix dada dando una nueva matriz
            a.addRoundKey(i, text, mKeyExp);
        }

        //ultima iteracion
        a.subBytes(text);
        a.shiftRows(text);
        a.addRoundKey(10, text, mKeyExp);

    }
}
