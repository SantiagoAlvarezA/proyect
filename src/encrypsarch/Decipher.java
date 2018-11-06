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
public class Decipher {

    Operations a = new Operations();

    public final void decipher(byte[][] text, byte[] mKeyExp) {

        a.addRoundKey(10, text, mKeyExp);
        a.invShiftRows(text);
        a.invSubBytes(text);

        for (int i = 9; i > 0; i--) {
            a.addRoundKey(i, text, mKeyExp);
            a.invmixColumns(text);
            a.invShiftRows(text);
            a.invSubBytes(text);
        }
        a.addRoundKey(0, text, mKeyExp);

    }
}
