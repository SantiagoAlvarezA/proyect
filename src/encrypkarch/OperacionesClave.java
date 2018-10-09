/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypkarch;

import static encrypkarch.Operaciones.gmul;
import static encrypkarch.Operaciones.valorCajaS;

/**
 *
 * @author Alvar
 */
public class OperacionesClave {

    int[] dec = new int[16];

    public int[] getDec() {
        return dec;
    }

    public void subBytes(byte[][] texto) {

        for (int i = 0; i < texto.length; i++) //Sub-Byte subroutine
        {
            for (int j = 0; j < texto[0].length; j++) {

                byte hex = texto[j][i];

                hex = (byte) valorCajaS(i);

            }

        }
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String hex = String.format("%02x", texto[j][i]);
                dec[a] = Integer.parseInt(hex, 16);
                a++;
            }
        }
    }

    public void shiftRows(byte[][] texto) {
        for (int i = 1; i < texto.length; i++) {
            texto[i] = leftrotate(texto[i], i);
        }
    }

    private byte[] leftrotate(byte[] arr, int times) {
        assert (arr.length == 4);
        if (times % 4 == 0) {
            return arr;
        }
        while (times > 0) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = (byte) temp;
            --times;
        }
        return arr;
    }

    public final void mixColumns(byte[][] texto) { //cada columna se multiplica por una matrix dada

        byte[] a = new byte[4]; //copia del array r

        byte[] b = new byte[4]; //cada elemento del array a multiplicado por 2

        byte c;
        byte j;

        byte h;

        for (j = 0; j < 4; j++) {
            for (c = 0; c < 4; c++) {
                a[c] = texto[c][j];

                h = (byte) ((char) texto[c][j] >> 7); //desplazamiento aritmético a la derecha
                b[c] = (byte) (texto[c][j] << 1); //elimina implícitamente high  porque b[c] es un char de 8 bits, por lo que XOR por 0x1b y no 0x11b en la siguiente línea
                b[c] ^= 0x1B & h;
            }

            texto[0][j] = (byte) (gmul(a[0], 2) ^ gmul(a[3], 1) ^ gmul(a[2], 1) ^ gmul(a[1], 3));
            texto[1][j] = (byte) (gmul(a[1], 2) ^ gmul(a[0], 1) ^ gmul(a[3], 1) ^ gmul(a[2], 3));
            texto[2][j] = (byte) (gmul(a[2], 2) ^ gmul(a[1], 1) ^ gmul(a[0], 1) ^ gmul(a[3], 3));
            texto[3][j] = (byte) (gmul(a[3], 2) ^ gmul(a[2], 1) ^ gmul(a[1], 1) ^ gmul(a[0], 3));
        }

    }

}
