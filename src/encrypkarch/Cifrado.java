/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypkarch;

//import java.io.*;

/**
 *
 * @author CHRISTIAN
     */
public class Cifrado {

    Operaciones a = new Operaciones();

    public final void encriptar(byte[][] texto, byte[] mClaveExp) {
        a.addRoundKey(0, texto, mClaveExp); // primera iteracion

        for (int i = 1; i < 10; i++) { // 8 siguientes iteraciones
            a.subBytes(texto); //sustituimos el texto por los valores de cajaS
            a.shiftRows(texto); //rotamos 2 fila un byte,3 fila dos bytes y 4 fila tres bytes
            a.mixColumns(texto); //cada columna se multiplica por una matrix dada dando una nueva matriz
            a.addRoundKey(i, texto, mClaveExp);
        }

        //ultima iteracion
        a.subBytes(texto);
        a.shiftRows(texto);
        a.addRoundKey(10, texto, mClaveExp);

    }
}
