/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypkarch;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.ceil;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvar
 */
public class Main extends javax.swing.JFrame {

    Random random = new Random();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputText = new javax.swing.JTextArea();
        clean = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        keyGenerate = new javax.swing.JButton();
        cypher = new javax.swing.JButton();
        decipher = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        openFolder = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputText = new javax.swing.JTextArea();
        copyToClipBoard = new javax.swing.JButton();
        saveResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cypher algorithm");
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(this.getWidth(), this.getHeight()));
        jPanel1.setMinimumSize(new java.awt.Dimension(this.getWidth(), this.getHeight()));

        jPanel2.setPreferredSize(new java.awt.Dimension(673, 768));

        inputText.setColumns(10);
        inputText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        inputText.setRows(5);
        jScrollPane1.setViewportView(inputText);

        clean.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clean.setText("Limpiar");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setToolTipText("Password");

        keyGenerate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        keyGenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encrypkarch/Icons/key.png"))); // NOI18N
        keyGenerate.setText("Generar una contraseña");
        keyGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyGenerateActionPerformed(evt);
            }
        });

        cypher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cypher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encrypkarch/Icons/crypto.png"))); // NOI18N
        cypher.setText("Cifrar");
        cypher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cypherActionPerformed(evt);
            }
        });

        decipher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        decipher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encrypkarch/Icons/decrypt.png"))); // NOI18N
        decipher.setText("Descifrar");
        decipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decipherActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encrypkarch/Icons/save.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        openFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encrypkarch/Icons/openFolder.png"))); // NOI18N
        openFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFolderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cypher, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decipher, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clean, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(keyGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(openFolder))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openFolder, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(keyGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cypher, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decipher, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(665, 768));

        outputText.setEditable(false);
        outputText.setColumns(20);
        outputText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        outputText.setRows(5);
        jScrollPane3.setViewportView(outputText);

        copyToClipBoard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        copyToClipBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encrypkarch/Icons/copy.png"))); // NOI18N
        copyToClipBoard.setText("Copiar");
        copyToClipBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyToClipBoardActionPerformed(evt);
            }
        });

        saveResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encrypkarch/Icons/save.png"))); // NOI18N
        saveResult.setText("Guardar");
        saveResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(copyToClipBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveResult, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copyToClipBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveResult, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void copyToClipBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyToClipBoardActionPerformed
        copyToClipBoard();
    }//GEN-LAST:event_copyToClipBoardActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        inputText.setText("");
    }//GEN-LAST:event_cleanActionPerformed

    private void keyGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyGenerateActionPerformed
        keyGenerate();
    }//GEN-LAST:event_keyGenerateActionPerformed

    private void saveResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveResultActionPerformed
        // TODO add your handling code here:
        if (!outputText.getText().isEmpty()) {
            createFileTxt(outputText.getText(), "Result");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede guardar un archivo vacio");
        }
    }//GEN-LAST:event_saveResultActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!password.getText().isEmpty()) {
            createFileTxt(password.getText(), "Password");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede guardar un archivo vacio \npor favor genere una contraseña");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void openFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFolderActionPerformed
        openFileTxt();
    }//GEN-LAST:event_openFolderActionPerformed

    private void cypherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cypherActionPerformed
        // TODO add your handling code here:
        if (!inputText.getText().isEmpty() && !password.getText().isEmpty()) {
            int[][] arrayText = arrayText(inputText.getText());
            String cryptograma = "";
            for (int[] fila : arrayText) {
                System.out.println();
                int[] text = new int[16];
                int i = 0;
                for (int col : fila) {
                    text[i] = col;
                    i++;
                    // System.out.print(Integer.toHexString(x) + " ");
                }
                cryptograma += cifrar(text, arrayPassword(password.getText()));

            }

            outputText.setText(cryptograma);
        } else {
            JOptionPane.showMessageDialog(null, "El campo de contraseña o entrada de texto estan vacios");
        }

//        byte a = 4;
//        int x = (int) a;
//        Stritn strHex = new String(Integer.toHexString(x));
//        System.out.println(strHex);
//////        if (!inputText.getText().isEmpty() && !password.getText().isEmpty()) {
//////            cifrar();
//////        } else {
//////            JOptionPane.showMessageDialog(null, "El campo de contraseña o entrada de texto estan vacios");
//////        }
    }//GEN-LAST:event_cypherActionPerformed

    private void decipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decipherActionPerformed
        // TODO add your handling code here:
        if (!inputText.getText().isEmpty() && !password.getText().isEmpty()) {
            int[][] arrayText = arrayText(inputText.getText());

            String texto = "";
            for (int[] fila : arrayText) {
                System.out.println();
                int[] text = new int[16];
                int i = 0;
                for (int col : fila) {
                    text[i] = col;
                    i++;
                    // System.out.print(Integer.toHexString(x) + " ");
                }
                texto += descifrar(text, arrayPassword(password.getText()));

            }

            outputText.setText(texto);

        } else {
            JOptionPane.showMessageDialog(null, "El campo de contraseña o entrada de texto estan vacios");
        }

    }//GEN-LAST:event_decipherActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clean;
    private javax.swing.JButton copyToClipBoard;
    private javax.swing.JButton cypher;
    private javax.swing.JButton decipher;
    private javax.swing.JTextArea inputText;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton keyGenerate;
    private javax.swing.JButton openFolder;
    private javax.swing.JTextArea outputText;
    private javax.swing.JTextField password;
    private javax.swing.JButton saveResult;
    // End of variables declaration//GEN-END:variables

    public int[][] arrayText(String text) {

        byte[] arrayByte = text.getBytes();

        //bloques de 16 bytes para el texto**********
        int[][] arrayBlok = new int[(int) ceil(arrayByte.length / 16.0)][16];
        int iArrayBytes = 0, jArrayBytes = 0;

        for (int i = 0; i < arrayByte.length; i++) {
            if (jArrayBytes < 16) {
                arrayBlok[iArrayBytes][jArrayBytes] = arrayByte[i];
                jArrayBytes++;
            } else {
                iArrayBytes++;
                i--;
                jArrayBytes = 0;
            }
        }

        return arrayBlok;
    }

    public int[] arrayPassword(String text) {
        byte[] arrayByte = text.getBytes();
        int[] array = new int[16];
        for (int i = 0; i < arrayByte.length; i++) {
            array[i] = arrayByte[i];
        }
        return array;
    }

    public String descifrar(int[] crypt, int[] passwd) {
        String text = "";
        Cifrado c = new Cifrado();
        Descifrado d = new Descifrado();
        Scanner lee = new Scanner(System.in);
        // System.out.println("texto");

        //String decimal=lee.next(); 
        //int a =Integer.parseInt(decimal,16);
        // System.out.println("aaa"+a);
        int iter;

        byte[] mClaveExp = new byte[256];

        int[] clave = passwd;//{0x63, 0x68, 0x72, 0x69, 0x73, 0x74, 0x69, 0x61, 0x6e, 0x63, 0x68, 0x72, 0x69, 0x73, 0x74, 0x69}; //clave

        int[] arrTexto = crypt;//{0x70,  0xa7,  0xbc,  0xdd,  0x79,  0x30,  0x84,  0xd1,  0x68,  0x81,  0xd8,  0x01,  0xa9,  0x54,  0xd4,  0xae};

        char resp;

        byte[][] texto = new byte[4][4];
        byte[][] mClave = new byte[4][4];

        System.out.print("*********************************************************************************");
        System.out.print("\n");
        System.out.print("*                                      KARCH                                    *");
        System.out.print("\n");
        System.out.print("*********************************************************************************");
        System.out.print("\n");
        System.out.print("\n");

        System.out.print("CLAVE: ");
        for (int i = 0; i < 16; i++) {
            System.out.printf(" %02x ", clave[i]);
        }
        System.out.print("\nTEXTO: ");
        for (int i = 0; i < 16; i++) {
            System.out.printf(" %02x ", arrTexto[i]);
        }

        System.out.print("\n\n********************************************************************************************");
        System.out.print("\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mClave[j][i] = (byte) clave[i * 4 + j]; // convierte clave a cifrar en una matriz 4X4
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                texto[j][i] = (byte) arrTexto[i * 4 + j]; // texto a cifrar en una matriz 4X4
            }
        }

        Operaciones aes = new Operaciones();
        byte[] tempRef_mClaveExp = mClaveExp;
        aes.expandirClave(mClave, tempRef_mClaveExp); //expandir la clave y guardarla en un array
        mClaveExp = tempRef_mClaveExp;
        byte[] tempRef_mClaveExp2 = mClaveExp;
        //c.encriptar(texto, tempRef_mClaveExp2);
        d.desencriptar(texto, mClaveExp);//ciframos el texto
        mClaveExp = tempRef_mClaveExp2;

        System.out.print("\n\n\n*****************************TEXTO DESCIFRADO**************************\n");
        System.out.print("\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String hex = String.format("%02x", texto[j][i]);
                int dec = Integer.parseInt(hex, 16);
                //cryptograma += (char) dec;

                text += (char) dec;
                System.out.printf(" 0x%02x, ", texto[j][i]);

            }
        }
        System.out.print("\n\n********************************************************************");
        System.out.print("\n");
        System.out.print("\n\n\n\n");

        return text;
    }

    public String cifrar(int[] tex, int[] passwd) {
        String cryptograma = "";
        Cifrado c = new Cifrado();
        byte[] mClaveExp = new byte[256];

        int[] clave = passwd;//{0x63, 0x68, 0x72, 0x69, 0x73, 0x74, 0x69, 0x61, 0x6e, 0x63, 0x68, 0x72, 0x69, 0x73, 0x74, 0x69}; //clave

        int[] arrTexto = tex;

        byte[][] texto = new byte[4][4];
        byte[][] mClave = new byte[4][4];

        System.out.print("*********************************************************************************");
        System.out.print("\n");
        System.out.print("*                                      KARCH                                    *");
        System.out.print("\n");
        System.out.print("*********************************************************************************");
        System.out.print("\n");
        System.out.print("\n");

        System.out.print("CLAVE: ");
        for (int i = 0; i < 16; i++) {
            System.out.printf(" %02x ", clave[i]);
        }
        System.out.print("\nTEXTO: ");
        for (int i = 0; i < 16; i++) {
            System.out.printf(" %02x ", arrTexto[i]);
        }

        System.out.print("\n\n********************************************************************************************");
        System.out.print("\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mClave[j][i] = (byte) clave[i * 4 + j]; // convierte clave a cifrar en una matriz 4X4
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                texto[j][i] = (byte) arrTexto[i * 4 + j]; // texto a cifrar en una matriz 4X4
            }
        }

        Operaciones aes = new Operaciones();
        byte[] tempRef_mClaveExp = mClaveExp;
        aes.expandirClave(mClave, tempRef_mClaveExp); //expandir la clave y guardarla en un array
        mClaveExp = tempRef_mClaveExp;
        byte[] tempRef_mClaveExp2 = mClaveExp;
        c.encriptar(texto, tempRef_mClaveExp2);
        mClaveExp = tempRef_mClaveExp2;

        System.out.print("\n\n\n*****************************TEXTO CIFRADO**************************\n");
        System.out.print("\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                String hex = String.format("%02x", texto[j][i]);
                int dec = Integer.parseInt(hex, 16);
                cryptograma += (char) dec;
                //txt += (char) dec;

                System.out.printf(" 0x%02x, ", texto[j][i]);
            }
        }
        System.out.print("\n\n********************************************************************");
        System.out.print("\n\n");
        return cryptograma;
    }

    //metodo para copiar el resultado al clipboard
    public void copyToClipBoard() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection data = new StringSelection(outputText.getText());
        clipboard.setContents(data, data);
    }

    //generador de contraseñas
    public void keyGenerate() {

        String pass = "";
        for (int i = 0; i < 16;) {

            int numero = (random.nextInt(256));
            if (numero > 31 && numero < 127) {

                pass += (char) numero;
                i++;
            }

        }
        this.password.setText(pass);
    }

    public void createFileTxt(String data, String nameFile) {
        String path;
        FileWriter flwriter = null;
        BufferedWriter bfwriter;
        try {
            boolean exist = false;
            while (!exist) {

                JFileChooser jFileChooser = new javax.swing.JFileChooser();
                if (jFileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    path = jFileChooser.getSelectedFile().getAbsolutePath() + nameFile + ".txt";
                    File file = new File(path);
                    if (!file.exists()) {
                        flwriter = new FileWriter(path);
                        bfwriter = new BufferedWriter(flwriter);
                        bfwriter.write(data);
                        bfwriter.close();
                        exist = true;
                        JOptionPane.showMessageDialog(null, "El archivo se guardo con exito.");
                    } else {
                        exist = false;
                        JOptionPane.showMessageDialog(null, "El archivo que estas intentando crear ya existe.");
                    }
                } else {
                    exist = true;
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }
            }
        }
    }

    public void openFileTxt() {
        JOptionPane.showMessageDialog(null, "abriendo el archivo");
    }
}
