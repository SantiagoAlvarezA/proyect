/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypkarch;

/**
 *
 * @author CHRISTIAN
 */
import java.io.*;

public class Operaciones {

    public int k; //contador iteraciones

    public Operaciones() {
        k = 0; //contador iteraciones
    }
    public static final int[][] sbox = {{0x63, 0x7c, 0x77, 0x7b, 0xf2, 0x6b, 0x6f, 0xc5, 0x30, 0x01, 0x67, 0x2b, 0xfe, 0xd7, 0xab, 0x76}, {0xca, 0x82, 0xc9, 0x7d, 0xfa, 0x59, 0x47, 0xf0, 0xad, 0xd4, 0xa2, 0xaf, 0x9c, 0xa4, 0x72, 0xc0}, {0xb7, 0xfd, 0x93, 0x26, 0x36, 0x3f, 0xf7, 0xcc, 0x34, 0xa5, 0xe5, 0xf1, 0x71, 0xd8, 0x31, 0x15}, {0x04, 0xc7, 0x23, 0xc3, 0x18, 0x96, 0x05, 0x9a, 0x07, 0x12, 0x80, 0xe2, 0xeb, 0x27, 0xb2, 0x75}, {0x09, 0x83, 0x2c, 0x1a, 0x1b, 0x6e, 0x5a, 0xa0, 0x52, 0x3b, 0xd6, 0xb3, 0x29, 0xe3, 0x2f, 0x84}, {0x53, 0xd1, 0x00, 0xed, 0x20, 0xfc, 0xb1, 0x5b, 0x6a, 0xcb, 0xbe, 0x39, 0x4a, 0x4c, 0x58, 0xcf}, {0xd0, 0xef, 0xaa, 0xfb, 0x43, 0x4d, 0x33, 0x85, 0x45, 0xf9, 0x02, 0x7f, 0x50, 0x3c, 0x9f, 0xa8}, {0x51, 0xa3, 0x40, 0x8f, 0x92, 0x9d, 0x38, 0xf5, 0xbc, 0xb6, 0xda, 0x21, 0x10, 0xff, 0xf3, 0xd2}, {0xcd, 0x0c, 0x13, 0xec, 0x5f, 0x97, 0x44, 0x17, 0xc4, 0xa7, 0x7e, 0x3d, 0x64, 0x5d, 0x19, 0x73}, {0x60, 0x81, 0x4f, 0xdc, 0x22, 0x2a, 0x90, 0x88, 0x46, 0xee, 0xb8, 0x14, 0xde, 0x5e, 0x0b, 0xdb}, {0xe0, 0x32, 0x3a, 0x0a, 0x49, 0x06, 0x24, 0x5c, 0xc2, 0xd3, 0xac, 0x62, 0x91, 0x95, 0xe4, 0x79}, {0xe7, 0xc8, 0x37, 0x6d, 0x8d, 0xd5, 0x4e, 0xa9, 0x6c, 0x56, 0xf4, 0xea, 0x65, 0x7a, 0xae, 0x08}, {0xba, 0x78, 0x25, 0x2e, 0x1c, 0xa6, 0xb4, 0xc6, 0xe8, 0xdd, 0x74, 0x1f, 0x4b, 0xbd, 0x8b, 0x8a}, {0x70, 0x3e, 0xb5, 0x66, 0x48, 0x03, 0xf6, 0x0e, 0x61, 0x35, 0x57, 0xb9, 0x86, 0xc1, 0x1d, 0x9e}, {0xe1, 0xf8, 0x98, 0x11, 0x69, 0xd9, 0x8e, 0x94, 0x9b, 0x1e, 0x87, 0xe9, 0xce, 0x55, 0x28, 0xdf}, {0x8c, 0xa1, 0x89, 0x0d, 0xbf, 0xe6, 0x42, 0x68, 0x41, 0x99, 0x2d, 0x0f, 0xb0, 0x54, 0xbb, 0x16}};
    /**
     * Inverse SBOX table used for invSubBytes
     */
    public static final int[][] invsbox = {{0x52, 0x09, 0x6a, 0xd5, 0x30, 0x36, 0xa5, 0x38, 0xbf, 0x40, 0xa3, 0x9e, 0x81, 0xf3, 0xd7, 0xfb}, {0x7c, 0xe3, 0x39, 0x82, 0x9b, 0x2f, 0xff, 0x87, 0x34, 0x8e, 0x43, 0x44, 0xc4, 0xde, 0xe9, 0xcb}, {0x54, 0x7b, 0x94, 0x32, 0xa6, 0xc2, 0x23, 0x3d, 0xee, 0x4c, 0x95, 0x0b, 0x42, 0xfa, 0xc3, 0x4e}, {0x08, 0x2e, 0xa1, 0x66, 0x28, 0xd9, 0x24, 0xb2, 0x76, 0x5b, 0xa2, 0x49, 0x6d, 0x8b, 0xd1, 0x25}, {0x72, 0xf8, 0xf6, 0x64, 0x86, 0x68, 0x98, 0x16, 0xd4, 0xa4, 0x5c, 0xcc, 0x5d, 0x65, 0xb6, 0x92}, {0x6c, 0x70, 0x48, 0x50, 0xfd, 0xed, 0xb9, 0xda, 0x5e, 0x15, 0x46, 0x57, 0xa7, 0x8d, 0x9d, 0x84}, {0x90, 0xd8, 0xab, 0x00, 0x8c, 0xbc, 0xd3, 0x0a, 0xf7, 0xe4, 0x58, 0x05, 0xb8, 0xb3, 0x45, 0x06}, {0xd0, 0x2c, 0x1e, 0x8f, 0xca, 0x3f, 0x0f, 0x02, 0xc1, 0xaf, 0xbd, 0x03, 0x01, 0x13, 0x8a, 0x6b}, {0x3a, 0x91, 0x11, 0x41, 0x4f, 0x67, 0xdc, 0xea, 0x97, 0xf2, 0xcf, 0xce, 0xf0, 0xb4, 0xe6, 0x73}, {0x96, 0xac, 0x74, 0x22, 0xe7, 0xad, 0x35, 0x85, 0xe2, 0xf9, 0x37, 0xe8, 0x1c, 0x75, 0xdf, 0x6e}, {0x47, 0xf1, 0x1a, 0x71, 0x1d, 0x29, 0xc5, 0x89, 0x6f, 0xb7, 0x62, 0x0e, 0xaa, 0x18, 0xbe, 0x1b}, {0xfc, 0x56, 0x3e, 0x4b, 0xc6, 0xd2, 0x79, 0x20, 0x9a, 0xdb, 0xc0, 0xfe, 0x78, 0xcd, 0x5a, 0xf4}, {0x1f, 0xdd, 0xa8, 0x33, 0x88, 0x07, 0xc7, 0x31, 0xb1, 0x12, 0x10, 0x59, 0x27, 0x80, 0xec, 0x5f}, {0x60, 0x51, 0x7f, 0xa9, 0x19, 0xb5, 0x4a, 0x0d, 0x2d, 0xe5, 0x7a, 0x9f, 0x93, 0xc9, 0x9c, 0xef}, {0xa0, 0xe0, 0x3b, 0x4d, 0xae, 0x2a, 0xf5, 0xb0, 0xc8, 0xeb, 0xbb, 0x3c, 0x83, 0x53, 0x99, 0x61}, {0x17, 0x2b, 0x04, 0x7e, 0xba, 0x77, 0xd6, 0x26, 0xe1, 0x69, 0x14, 0x63, 0x55, 0x21, 0x0c, 0x7d}};

    public static int valorCajaS(int pos) {

        int[] cajas = {
            0x63, 0x7C, 0x77, 0x7B, 0xF2, 0x6B, 0x6F, 0xC5, 0x30, 0x01, 0x67, 0x2B, 0xFE, 0xD7, 0xAB, 0x76,
            0xCA, 0x82, 0xC9, 0x7D, 0xFA, 0x59, 0x47, 0xF0, 0xAD, 0xD4, 0xA2, 0xAF, 0x9C, 0xA4, 0x72, 0xC0,
            0xB7, 0xFD, 0x93, 0x26, 0x36, 0x3F, 0xF7, 0xCC, 0x34, 0xA5, 0xE5, 0xF1, 0x71, 0xD8, 0x31, 0x15,
            0x04, 0xC7, 0x23, 0xC3, 0x18, 0x96, 0x05, 0x9A, 0x07, 0x12, 0x80, 0xE2, 0xEB, 0x27, 0xB2, 0x75,
            0x09, 0x83, 0x2C, 0x1A, 0x1B, 0x6E, 0x5A, 0xA0, 0x52, 0x3B, 0xD6, 0xB3, 0x29, 0xE3, 0x2F, 0x84,
            0x53, 0xD1, 0x00, 0xED, 0x20, 0xFC, 0xB1, 0x5B, 0x6A, 0xCB, 0xBE, 0x39, 0x4A, 0x4C, 0x58, 0xCF,
            0xD0, 0xEF, 0xAA, 0xFB, 0x43, 0x4D, 0x33, 0x85, 0x45, 0xF9, 0x02, 0x7F, 0x50, 0x3C, 0x9F, 0xA8,
            0x51, 0xA3, 0x40, 0x8F, 0x92, 0x9D, 0x38, 0xF5, 0xBC, 0xB6, 0xDA, 0x21, 0x10, 0xFF, 0xF3, 0xD2,
            0xCD, 0x0C, 0x13, 0xEC, 0x5F, 0x97, 0x44, 0x17, 0xC4, 0xA7, 0x7E, 0x3D, 0x64, 0x5D, 0x19, 0x73,
            0x60, 0x81, 0x4F, 0xDC, 0x22, 0x2A, 0x90, 0x88, 0x46, 0xEE, 0xB8, 0x14, 0xDE, 0x5E, 0x0B, 0xDB,
            0xE0, 0x32, 0x3A, 0x0A, 0x49, 0x06, 0x24, 0x5C, 0xC2, 0xD3, 0xAC, 0x62, 0x91, 0x95, 0xE4, 0x79,
            0xE7, 0xC8, 0x37, 0x6D, 0x8D, 0xD5, 0x4E, 0xA9, 0x6C, 0x56, 0xF4, 0xEA, 0x65, 0x7A, 0xAE, 0x08,
            0xBA, 0x78, 0x25, 0x2E, 0x1C, 0xA6, 0xB4, 0xC6, 0xE8, 0xDD, 0x74, 0x1F, 0x4B, 0xBD, 0x8B, 0x8A,
            0x70, 0x3E, 0xB5, 0x66, 0x48, 0x03, 0xF6, 0x0E, 0x61, 0x35, 0x57, 0xB9, 0x86, 0xC1, 0x1D, 0x9E,
            0xE1, 0xF8, 0x98, 0x11, 0x69, 0xD9, 0x8E, 0x94, 0x9B, 0x1E, 0x87, 0xE9, 0xCE, 0x55, 0x28, 0xDF,
            0x8C, 0xA1, 0x89, 0x0D, 0xBF, 0xE6, 0x42, 0x68, 0x41, 0x99, 0x2D, 0x0F, 0xB0, 0x54, 0xBB, 0x16
        };

        return cajas[pos];
    }

    public static int invalorCajaS(int pos) {
        int[] cajas = {
            0x52, 0x09, 0x6a, 0xd5, 0x30, 0x36, 0xa5, 0x38, 0xbf, 0x40, 0xa3, 0x9e, 0x81, 0xf3, 0xd7, 0xfb,
            0x7c, 0xe3, 0x39, 0x82, 0x9b, 0x2f, 0xff, 0x87, 0x34, 0x8e, 0x43, 0x44, 0xc4, 0xde, 0xe9, 0xcb,
            0x54, 0x7b, 0x94, 0x32, 0xa6, 0xc2, 0x23, 0x3d, 0xee, 0x4c, 0x95, 0x0b, 0x42, 0xfa, 0xc3, 0x4e,
            0x08, 0x2e, 0xa1, 0x66, 0x28, 0xd9, 0x24, 0xb2, 0x76, 0x5b, 0xa2, 0x49, 0x6d, 0x8b, 0xd1, 0x25,
            0x72, 0xf8, 0xf6, 0x64, 0x86, 0x68, 0x98, 0x16, 0xd4, 0xa4, 0x5c, 0xcc, 0x5d, 0x65, 0xb6, 0x92,
            0x6c, 0x70, 0x48, 0x50, 0xfd, 0xed, 0xb9, 0xda, 0x5e, 0x15, 0x46, 0x57, 0xa7, 0x8d, 0x9d, 0x84,
            0x90, 0xd8, 0xab, 0x00, 0x8c, 0xbc, 0xd3, 0x0a, 0xf7, 0xe4, 0x58, 0x05, 0xb8, 0xb3, 0x45, 0x06,
            0xd0, 0x2c, 0x1e, 0x8f, 0xca, 0x3f, 0x0f, 0x02, 0xc1, 0xaf, 0xbd, 0x03, 0x01, 0x13, 0x8a, 0x6b,
            0x3a, 0x91, 0x11, 0x41, 0x4f, 0x67, 0xdc, 0xea, 0x97, 0xf2, 0xcf, 0xce, 0xf0, 0xb4, 0xe6, 0x73,
            0x96, 0xac, 0x74, 0x22, 0xe7, 0xad, 0x35, 0x85, 0xe2, 0xf9, 0x37, 0xe8, 0x1c, 0x75, 0xdf, 0x6e,
            0x47, 0xf1, 0x1a, 0x71, 0x1d, 0x29, 0xc5, 0x89, 0x6f, 0xb7, 0x62, 0x0e, 0xaa, 0x18, 0xbe, 0x1b,
            0xfc, 0x56, 0x3e, 0x4b, 0xc6, 0xd2, 0x79, 0x20, 0x9a, 0xdb, 0xc0, 0xfe, 0x78, 0xcd, 0x5a, 0xf4,
            0x1f, 0xdd, 0xa8, 0x33, 0x88, 0x07, 0xc7, 0x31, 0xb1, 0x12, 0x10, 0x59, 0x27, 0x80, 0xec, 0x5f,
            0x60, 0x51, 0x7f, 0xa9, 0x19, 0xb5, 0x4a, 0x0d, 0x2d, 0xe5, 0x7a, 0x9f, 0x93, 0xc9, 0x9c, 0xef,
            0xa0, 0xe0, 0x3b, 0x4d, 0xae, 0x2a, 0xf5, 0xb0, 0xc8, 0xeb, 0xbb, 0x3c, 0x83, 0x53, 0x99, 0x61,
            0x17, 0x2b, 0x04, 0x7e, 0xba, 0x77, 0xd6, 0x26, 0xe1, 0x69, 0x14, 0x63, 0x55, 0x21, 0x0c, 0x7d
        };
        return cajas[pos];
    }
    //matriz rcon
    public static int[] rCon = {0x8d, 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b,
        0x36, 0x6c, 0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a,
        0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2,
        0x9f, 0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb, 0x8d,
        0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8, 0xab, 0x4d,
        0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a, 0xd4, 0xb3, 0x7d, 0xfa, 0xef,
        0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94, 0x33,
        0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63,
        0xc6, 0x97, 0x35, 0x6a, 0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72, 0xe4,
        0xd3, 0xbd, 0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a,
        0x74, 0xe8, 0xcb, 0x8d, 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36,
        0x6c, 0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a, 0xd4,
        0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f,
        0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb, 0x8d, 0x01,
        0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8, 0xab, 0x4d, 0x9a,
        0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a, 0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5,
        0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94, 0x33, 0x66,
        0xcc, 0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb};
    private int[] iteraciones = new int[256];

    public static byte gmul(byte a, int b) {
        byte p = 0;
        byte hiBitSet;
        for (byte counter = 0; Byte.toUnsignedInt(counter) < 8; counter++) {
            if ((Byte.toUnsignedInt((byte) b) & 1) == 1) {
                p = (byte) (Byte.toUnsignedInt(p) ^ Byte.toUnsignedInt(a));
            }
            hiBitSet = (byte) (Byte.toUnsignedInt(a) & 0x80);
            a = (byte) (Byte.toUnsignedInt(a) << 1);
            if (Byte.toUnsignedInt(hiBitSet) == 0x80) {
                a = (byte) (Byte.toUnsignedInt(a) ^ 0x1b);
            }
            b = (byte) (Byte.toUnsignedInt((byte) b) >> 1);
        }
        return p;
    }

    //operacion para expandir a clave
    public final void expandirClave(byte[][] arrClave, byte[] mClaveExp) {
        int i;
        int j;
        int k;
        k = 0;

        byte[] copia = new byte[4];
        byte copia2 = 0;

        for (i = 0; i < 4; i++) { //pasamos la clave a los primeras posiciones de clave expandida
            for (j = 0; j < 4; j++) {
                mClaveExp[k] = arrClave[j][i];
                k++;

            }
        }

        for (i = 4; i < 44; i++) {

            for (j = 0; j < 4; j++) {
                copia[j] = mClaveExp[(i - 1) * 4 + j]; //metemos la ultima columna en copia

                if (copia[j] < 0) {
                    copia[j] = (byte) (copia[j] * -1);

                }
            }

            if (i % 4 == 0) { //cada cuatro filas

                copia2 = copia[0]; //RW, el primer elemento lo metemos al final de la columna
                copia[0] = copia[1];
                copia[1] = copia[2];
                copia[2] = copia[3];
                copia[3] = copia2;

                //S{}W, se aplica la caja S a cada uno de los 4 bytes de entrada
                copia[0] = (byte) valorCajaS(copia[0]);
                copia[1] = (byte) valorCajaS(copia[1]);
                copia[2] = (byte) valorCajaS(copia[2]);
                copia[3] = (byte) valorCajaS(copia[3]);

                if (copia[0] < 0) {
                    copia[0] = (byte) (copia[0] * -1);
                }
                if (copia[1] < 0) {
                    copia[1] = (byte) (copia[1] * -1);
                }
                if (copia[2] < 0) {
                    copia[2] = (byte) (copia[2] * -1);
                }
                if (copia[3] < 0) {
                    copia[3] = (byte) (copia[3] * -1);
                }

                copia[0] = (byte) (copia[0] ^ rCon[i / 4]);
                copia[1] = (byte) (copia[1] ^ rCon[i / 4]);
                copia[2] = (byte) (copia[2] ^ rCon[i / 4]);
                copia[3] = (byte) (copia[3] ^ rCon[i / 4]);//suma bit a bit cte rcon

            }
            //suma bit a bit entre una cte. y el resultado anterior
            mClaveExp[i * 4 + 0] = (byte) (mClaveExp[(i - 4) * 4 + 0] ^ copia[0]);
            mClaveExp[i * 4 + 1] = (byte) (mClaveExp[(i - 4) * 4 + 1] ^ copia[1]);
            mClaveExp[i * 4 + 2] = (byte) (mClaveExp[(i - 4) * 4 + 2] ^ copia[2]);
            mClaveExp[i * 4 + 3] = (byte) (mClaveExp[(i - 4) * 4 + 3] ^ copia[3]);

        }

    }

    //operacion addRoundKey
    public final void addRoundKey(int pos, byte[][] texto, byte[] mClaveExp) {
        byte[] copia = new byte[256];

        for (int i = 0; i < 4; i++) { //copia en un array la matriz texto
            for (int j = 0; j < 4; j++) {
                copia[i * 4 + j] = texto[j][i];
            }
        }

        System.out.print("\n R");
        System.out.print(pos);
        System.out.print(" (SUBCLAVE = ");
        for (int i = 0; i < 16; i++) {

            System.out.printf("%02x", mClaveExp[pos * 16 + i]); //mostramos la subclave
        }

        for (int i = 0; i < 16; i++) {
            copia[i] ^= mClaveExp[pos * 16 + i];
            //sumamos bit a bit: byte de subclave y byte de texto
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                texto[j][i] = copia[i * 4 + j]; //se guarda en la matriz 4x4 el resultado
                iteraciones[k] = texto[j][i]; //guardamos tambien en array

                k++;
            }
        }

        System.out.print(") = ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%02x", texto[j][i]); //mostramos resultado final
            }
        }
        System.out.print("\n");
    }

    // operacion subBytes
    public void subBytes(byte[][] texto) {

        for (int i = 0; i < texto.length; i++) //Sub-Byte subroutine
        {
            for (int j = 0; j < texto[0].length; j++) {

                byte hex = texto[j][i];

                hex = (byte) valorCajaS(i);

            }

        }

    }

    public void invSubBytes(byte[][] texto) {
        for (int i = 0; i < texto.length; i++) //Inverse Sub-Byte subroutine
        {
            for (int j = 0; j < texto[0].length; j++) {
                byte hex = texto[j][i];
                hex = (byte) invalorCajaS(i);
            }
        }
    }
    // operacion shiftRows

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

    public void invShiftRows(byte[][] texto) {
        for (int i = 1; i < texto.length; i++) {
            texto[i] = rightrotate(texto[i], i);
        }
    }

    private byte[] rightrotate(byte[] texto, int times) {
        if (texto.length == 0 || texto.length == 1 || times % 4 == 0) {
            return texto;
        }
        while (times > 0) {
            int temp = texto[texto.length - 1];
            for (int i = texto.length - 1; i > 0; i--) {
                texto[i] = texto[i - 1];
            }
            texto[0] = (byte) temp;
            --times;
        }
        return texto;
    }

// operacion  mixColumns
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

    public final void invmixColumns(byte[][] texto) { //cada columna se multiplica por una matrix dada

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

            texto[0][j] = (byte) (gmul(a[0], 14) ^ gmul(a[3], 9) ^ gmul(a[2], 13) ^ gmul(a[1], 11));
            texto[1][j] = (byte) (gmul(a[1], 14) ^ gmul(a[0], 9) ^ gmul(a[3], 13) ^ gmul(a[2], 11));
            texto[2][j] = (byte) (gmul(a[2], 14) ^ gmul(a[1], 9) ^ gmul(a[0], 13) ^ gmul(a[3], 11));
            texto[3][j] = (byte) (gmul(a[3], 14) ^ gmul(a[2], 9) ^ gmul(a[1], 13) ^ gmul(a[0], 11));

        }
    }

}
