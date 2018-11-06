/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypsarch;

/**
 *
 * @author Alvar
 */
public class CipherKey {

    int[] clave = new int[16];

    public int[] getKey() {
        return clave;
    }

    OperationsKey a = new OperationsKey();

    public final void cipherKey(byte[][] text) {

        for (int i = 1; i < 8; i++) {
            a.subBytes(text);
            a.shiftRows(text);
            a.mixColumns(text);

        }
        a.subBytes(text);
        a.shiftRows(text);
        clave = a.getDec();

    }
}
