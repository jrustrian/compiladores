/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;

/**
 *
 * @author vm-modern15
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    //STRING para guardar el path del archivo abierto
    private String filePath;
    
    
    private void syntacticAnalyzer(){
        String ST = txtInput.getText();
        
        codigo.LexerCup lexerCup = new codigo.LexerCup(new StringReader(ST));
        
        
        Syntax s = new Syntax(new codigo.LexerCup(new StringReader(ST)));
        
        try {
            s.parse();
            System.out.println("Analizis Sintactico Aprobado");
            String output;
            output = s.getOutput();
            //output="-";
            txtResult.append(output);
            txtResult.append("\n-Fin ejecucion\n\n");
            s.cleanOutput();
            
            
        } catch (Exception ex) {
            Symbol sym = s.getS();
            
            //System.out.println("Eror de sintaxis. Linea: " + (sym.right + 1) + 
            //        "Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtResult.append("Eror de sintaxis. Linea: " + (sym.right + 1) + 
                    "Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtResult.append("\n-Fin ejecucion\n\n");
           // Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void lexicalAnalyzer() throws IOException{
        int line = 1;
        String code = txtInput.getText();
        Reader reader = new StringReader(code);
        Lexer lexer = new Lexer(reader);
        
        String result;
        result = "INICIO\nTOKEN\t\t\tLEXEME\n";
        result += "-- LINEA " + line + " --\n";
        Tokens token;
        
        while (true) {
            token = lexer.yylex();
            if (token == null) {
                result += "FIN";
                //txtResult.setText(result);
                System.out.println(result);
                return;
            }

            switch (token) {
                case EOL:
                    line++;
                    result += "-- LINEA " + line + " --\n";
                    break;
                case IF:
                    result += " <RESERVADA IF> \t\t" + lexer.yytext() + "\n";
                    break;
                case ELSE:
                    result += " <RESERVADA ELSE> \t\t" + lexer.yytext() + "\n";
                    break;
                case WHILE:
                    result += " <RESERVADA WHILE> \t\t" + lexer.yytext() + "\n";
                    break;
                case EQUALS:
                    result += " <OPERATOR EQUALS> \t\t" + lexer.yytext() + "\n";
                    break;
                case ADDITION:
                    result += " <OPERATOR ADDITION>\t\t\t" + lexer.yytext() + "\n";
                    break;
                case SUBTRACTION:
                    result += " <OPERATOR SUBTRACTION>\t\t\t" + lexer.yytext() + "\n";
                    break;
                case MULTIPLICATION:
                    result += " <OPERATOR MULTIPLICATION>\t\t" + lexer.yytext() + "\n";
                    break;
                case DIVISION:
                    result += " <OPERATOR DIVISION>\t\t\t" + lexer.yytext() + "\n";
                    break;
                case OPENING_PARENTHESIS:
                    result += " <OPENING_PARENTHESES>\t\t\t" + lexer.yytext() + "\n";
                    break;
                case CLOSING_PARENTHESIS:
                    result += " <CLOSING_PARENTHESES>\t\t\t" + lexer.yytext() + "\n";
                    break;
                case OPENING_BRACE:
                    result += " <OPENING_BRACE>\t\t\t" + lexer.yytext() + "\n";
                    break;
                case CLOSING_BRACE:
                    result += " <CLOSING_BRACE>\t\t\t" + lexer.yytext() + "\n";
                    break;
                case OPENING_BRACKET:
                    result += " <OPENING_BRACKET>\t\t\t" + lexer.yytext() + "\n";
                    break;
                case CLOSING_BRACKET:
                    result += " <CLOSING_BRACKET>\t\t\t" + lexer.yytext() + "\n";
                    break;
                case SEMICOLON:
                    result += " <SYMBOL SEMICOLON>\t\t" + lexer.yytext() + "\n";
                    break;
                case MAIN:
                    result += " <RESERVADA MAIN>\t\t" + lexer.yytext() + "\n";
                    break;
                case INTEGER:
                    result += " <INTEGER>\t\t\t\t" + lexer.yytext() + "\n";
                    break;
                case DECIMAL:
                    result += " <DECIMAL>\t\t\t\t" + lexer.yytext() + "\n";
                    break;
                case IDENTIFIER:
                    result += " <IDENTIFIER>\t\t\t\t" + lexer.yytext() + "\n";
                    break;
                case STRING:
                    result += " <STRING>\t\t\t\t" + lexer.yytext() + "\n";
                    break;
                default:
                    result += " < \t\t" + lexer.yytext() + "\n";
                    break;
            }

        }
            
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        btnClearConsole = new javax.swing.JButton();
        txtSaveAs = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnAnalyze = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        txtInput.setColumns(20);
        txtInput.setRows(5);
        jScrollPane2.setViewportView(txtInput);

        txtResult.setEditable(false);
        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        btnClearConsole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clean.png"))); // NOI18N
        btnClearConsole.setText("Limpiar");
        btnClearConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearConsoleActionPerformed(evt);
            }
        });

        txtSaveAs.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveAs.setText("Guardar como");
        txtSaveAs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSaveAs.setBorderPainted(false);

        btnSave.setBackground(new java.awt.Color(255, 255, 204));
        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSave.setText("Guardar");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setBorderPainted(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnAnalyze.setBackground(new java.awt.Color(255, 255, 204));
        btnAnalyze.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalyze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/run.png"))); // NOI18N
        btnAnalyze.setText("Correr");
        btnAnalyze.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnalyze.setBorderPainted(false);
        btnAnalyze.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnalyze.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeActionPerformed(evt);
            }
        });

        btnOpenFile.setBackground(new java.awt.Color(255, 255, 204));
        btnOpenFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpenFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open.png"))); // NOI18N
        btnOpenFile.setText("Abrir");
        btnOpenFile.setToolTipText("");
        btnOpenFile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOpenFile.setBorderPainted(false);
        btnOpenFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpenFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaveAs, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 388, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClearConsole)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpenFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAnalyze)
                    .addComponent(txtSaveAs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClearConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeActionPerformed
        try {
            // TODO add your handling code here:
            
            lexicalAnalyzer();
            syntacticAnalyzer();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAnalyzeActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        StringBuilder code = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile()));
            String codeLine = br.readLine();
            
            File currentFile = chooser.getSelectedFile();
            this.filePath =  currentFile.getAbsolutePath();
            
            while (codeLine!=null) {
                code.append(codeLine);
                code.append(System.lineSeparator());
                codeLine = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*while(scanner.hasNext()) {
            data += scanner.toString();
        }*/
        txtInput.setText(code.toString());
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnClearConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearConsoleActionPerformed
        // TODO add your handling code here:
        txtResult.setText(null);
    }//GEN-LAST:event_btnClearConsoleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(this.filePath != null);
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyze;
    private javax.swing.JButton btnClearConsole;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JButton txtSaveAs;
    // End of variables declaration//GEN-END:variables
}
