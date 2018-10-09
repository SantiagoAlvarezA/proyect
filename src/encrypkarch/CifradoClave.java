/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypkarch;

/**
 *
 * @author Alvar
 */
public class CifradoClave {

    int[] clave = new int[16];

    public int[] getClave() {
        return clave;
    }

    OperacionesClave a = new OperacionesClave();

    public final void encriptar_cave(byte[][] texto) {

        for (int i = 1; i < 8; i++) {
            a.subBytes(texto);
            a.shiftRows(texto);
            a.mixColumns(texto);

        }
        a.subBytes(texto);
        a.shiftRows(texto);
        clave = a.getDec();

    }
}
