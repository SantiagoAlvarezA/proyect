package encrypkarch;

import java.awt.Event;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.ceil;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import javax.swing.InputMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Santiago
 */
public class Main extends javax.swing.JFrame {

    Random random = new Random();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        inputText.setLineWrap(true);
        outputText.setLineWrap(true);
        InputMap map2 = password.getInputMap(password.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
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
        savePassword = new javax.swing.JButton();
        openFolder = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputText = new javax.swing.JTextArea();
        copyToClipBoard = new javax.swing.JButton();
        saveResult = new javax.swing.JButton();
        copyCryptogram = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cypher algorithm");
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setMaximumSize(new java.awt.Dimension(this.getWidth(), this.getHeight()));
        jPanel1.setMinimumSize(new java.awt.Dimension(this.getWidth(), this.getHeight()));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Texto original", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18))); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(673, 768));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

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
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });

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

        savePassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        savePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encrypkarch/Icons/save.png"))); // NOI18N
        savePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePasswordActionPerformed(evt);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cypher, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decipher, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keyGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savePassword))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(openFolder))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(openFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(keyGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(savePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cypher, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decipher, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criptograma / Texto decifrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(665, 768));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setHorizontalScrollBar(null);

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
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(copyToClipBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveResult, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copyToClipBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveResult, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        copyCryptogram.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        copyCryptogram.setText("<<");
        copyCryptogram.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        copyCryptogram.setMaximumSize(new java.awt.Dimension(32, 32));
        copyCryptogram.setMinimumSize(new java.awt.Dimension(32, 32));
        copyCryptogram.setPreferredSize(new java.awt.Dimension(32, 32));
        copyCryptogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyCryptogramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyCryptogram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(copyCryptogram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveResultActionPerformed
        // TODO add your handling code here:
        if (!outputText.getText().isEmpty()) {
            createFileTxt(outputText.getText(), "Result");

        } else {
            JOptionPane.showMessageDialog(null, "No se puede guardar un archivo vacio");
        }
    }//GEN-LAST:event_saveResultActionPerformed

    private void copyToClipBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyToClipBoardActionPerformed
        copyToClipBoard();
    }//GEN-LAST:event_copyToClipBoardActionPerformed

    private void openFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFolderActionPerformed
        openFileTxt();
    }//GEN-LAST:event_openFolderActionPerformed

    private void savePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePasswordActionPerformed
        // TODO add your handling code here:
        if (!password.getText().isEmpty()) {
            createFileTxt(password.getText(), "Password");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede guardar un archivo vacio \npor favor genere una contraseña");
        }
    }//GEN-LAST:event_savePasswordActionPerformed

    private void decipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decipherActionPerformed
        if (!inputText.getText().isEmpty() && !password.getText().isEmpty()) {
            int[][] arrayText = arrayCryptogram(inputText.getText());

            String texto = "";
            for (int[] fila : arrayText) {
                System.out.println();
                int[] text = new int[16];
                int i = 0;
                for (int col : fila) {
                    text[i] = col;
                    i++;
                }
                texto += descifrar(text, arrayPassword(password.getText()));

            }

            outputText.setText(texto);

        } else {
            JOptionPane.showMessageDialog(null, "El campo de contraseña o entrada de texto estan vacios");
        }
    }//GEN-LAST:event_decipherActionPerformed

    private void cypherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cypherActionPerformed
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
                }
                cryptograma += cifrar(text, arrayPassword(password.getText()));

            }

            outputText.setText(cryptograma);
        } else {
            JOptionPane.showMessageDialog(null, "El campo de contraseña o entrada de texto estan vacios");
        }
    }//GEN-LAST:event_cypherActionPerformed

    private void keyGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyGenerateActionPerformed
        keyGenerate();
    }//GEN-LAST:event_keyGenerateActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        inputText.setText("");
    }//GEN-LAST:event_cleanActionPerformed

    private void copyCryptogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyCryptogramActionPerformed
        if (!outputText.getText().isEmpty()) {
            inputText.setText(outputText.getText());
            outputText.setText("");
        }
    }//GEN-LAST:event_copyCryptogramActionPerformed

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        // TODO add your handling code here:

        if (password.getText().length() == 16) {
            evt.consume();
        }
    }//GEN-LAST:event_passwordKeyTyped

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        //                

    }//GEN-LAST:event_passwordKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clean;
    private javax.swing.JButton copyCryptogram;
    private javax.swing.JButton copyToClipBoard;
    private javax.swing.JButton cypher;
    private javax.swing.JButton decipher;
    private javax.swing.JTextArea inputText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton keyGenerate;
    private javax.swing.JButton openFolder;
    private javax.swing.JTextArea outputText;
    private javax.swing.JTextField password;
    private javax.swing.JButton savePassword;
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

    public int[][] arrayCryptogram(String text) {
        String[] texto = new String[text.length() / 2];
        int t = 0;
        for (int i = 0; i < text.length();) {
            texto[t] = text.substring(i, i + 2);
            i = i + 2;
            t++;
        }
        int[][] arrayBlok = new int[(int) ceil(texto.length / 16.0)][16];
        int iArrayBytes = 0, jArrayBytes = 0;

        for (int i = 0; i < texto.length; i++) {
            if (jArrayBytes < 16) {
                arrayBlok[iArrayBytes][jArrayBytes] = Integer.parseInt(texto[i], 16);
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
        byte[] arrayByte = text.getBytes(StandardCharsets.UTF_8);
        int[] array = new int[16];
        for (int i = 0; i < arrayByte.length; i++) {
            array[i] = arrayByte[i];
        }
        return array;
    }

    @SuppressWarnings("UnusedAssignment")
    public String descifrar(int[] crypt, int[] passwd) {
        String text = "";
        Descifrado d = new Descifrado();

        byte[] mClaveExp = new byte[256];

        int[] clave = passwd;
        int[] arrTexto = crypt;
        byte[][] texto = new byte[4][4];
        byte[][] mClave = new byte[4][4];

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
        d.desencriptar(texto, mClaveExp);//ciframos el texto
        mClaveExp = tempRef_mClaveExp2;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (0 != texto[j][i]) {
                    String hex = String.format("%02x", texto[j][i]);
                    int dec = Integer.parseInt(hex, 16);
                    text += (char) dec;
                }
            }
        }

        return text;
    }

    @SuppressWarnings("UnusedAssignment")
    public String cifrar(int[] tex, int[] passwd) {
        String cryptograma = "";
        Cifrado c = new Cifrado();
        byte[] mClaveExp = new byte[256];

        int[] clave = passwd;
        int[] arrTexto = tex;

        byte[][] texto = new byte[4][4];
        byte[][] mClave = new byte[4][4];

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

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                String hex = String.format("%02x", texto[j][i]);
                cryptograma += hex;//dec + " ";

            }
        }
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
                        if (nameFile.equals("Result")) {
                            outputText.setText("");
                        } else if (nameFile.equals("Password")) {
                            password.setText("");
                        }
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
        String path;
        BufferedReader bufferedReader;
        String readLine;

        boolean open = false;
        while (!open) {
            JFileChooser jFileChooser = new JFileChooser();
            if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                inputText.setText("");
                path = jFileChooser.getSelectedFile().getAbsolutePath();
                try {
                    bufferedReader = new BufferedReader(new FileReader(new File(path)));
                    readLine = bufferedReader.readLine();
                    while (readLine != null) {
                        inputText.append(readLine);
                        readLine = bufferedReader.readLine();

                    }
                    open = true;
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                    open = true;
                }

            } else {
                open = true;
            }
        }
    }
}
