/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypsarch;

/**
 *
 * @author CHRISTIAN
 */
public class Descifrado {

    Operaciones a = new Operaciones();

    public final void desencriptar(byte[][] texto, byte[] mClaveExp) {

        a.addRoundKey(10, texto, mClaveExp);
        a.invShiftRows(texto);
        a.invSubBytes(texto);

        for (int i = 9; i > 0; i--) {
            a.addRoundKey(i, texto, mClaveExp);
            a.invmixColumns(texto);
            a.invShiftRows(texto);
            a.invSubBytes(texto);
        }
        a.addRoundKey(0, texto, mClaveExp);

    }
}
