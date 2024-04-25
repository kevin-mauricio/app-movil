/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author INSTRUCTOR
 */
public class CrearVendedores extends javax.swing.JPanel {

    ConsumoAPI conexion = new ConsumoAPI();
    Gson gson = new Gson();

    public CrearVendedores() {
        initComponents();
        initComponentsAlter();
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
        etq_titulo = new javax.swing.JLabel();
        etq_cedula = new javax.swing.JLabel();
        campo_contrasenia = new javax.swing.JPasswordField();
        campo_cedula = new javax.swing.JTextField();
        etq_pass = new javax.swing.JLabel();
        campo_contrasenia_confirmada = new javax.swing.JPasswordField();
        etq_pass3 = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etq_emial = new javax.swing.JLabel();
        campo_emial = new javax.swing.JTextField();
        btn_crear_vendedor = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Crear Vendedor");
        etq_titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(49, 138, 222)));

        etq_cedula.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(49, 138, 222));
        etq_cedula.setText("CEDULA");

        campo_contrasenia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campo_contrasenia.setForeground(Color.decode("#318ade")
        );
        campo_contrasenia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));
        campo_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_contraseniaActionPerformed(evt);
            }
        });
        campo_contrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_contraseniaKeyReleased(evt);
            }
        });

        campo_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_cedula.setForeground(Color.decode("#318ade"));
        campo_cedula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        etq_pass.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_pass.setForeground(new java.awt.Color(49, 138, 222));
        etq_pass.setText("CONTRASEÑA");

        campo_contrasenia_confirmada.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        campo_contrasenia_confirmada.setForeground(Color.decode("#318ade")
        );
        campo_contrasenia_confirmada.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));
        campo_contrasenia_confirmada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_contrasenia_confirmadaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_contrasenia_confirmadaKeyReleased(evt);
            }
        });

        etq_pass3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_pass3.setForeground(new java.awt.Color(49, 138, 222));
        etq_pass3.setText("CONFIRMAR CONTRASEÑA");

        etq_nombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre.setText("NOMBRE:");

        campo_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre.setForeground(Color.decode("#318ade"));
        campo_nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        etq_emial.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_emial.setForeground(new java.awt.Color(49, 138, 222));
        etq_emial.setText("CORREO");

        campo_emial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_emial.setForeground(Color.decode("#318ade"));
        campo_emial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        btn_crear_vendedor.setBackground(Color.decode("#318ade"));
        btn_crear_vendedor.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_crear_vendedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear_vendedor.setText("CREAR");
        btn_crear_vendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crear_vendedor.setFocusable(false);
        btn_crear_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_vendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campo_emial)
                                .addComponent(etq_cedula, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo_cedula)
                                .addComponent(campo_contrasenia_confirmada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etq_emial)
                            .addComponent(etq_pass3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etq_nombre)
                                .addComponent(campo_nombre)
                                .addComponent(campo_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etq_pass))))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btn_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etq_cedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etq_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_emial)
                    .addComponent(etq_pass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_emial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(etq_pass3)
                .addGap(4, 4, 4)
                .addComponent(campo_contrasenia_confirmada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btn_crear_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crear_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_vendedorActionPerformed

        String contrasenia = campo_contrasenia.getText();
        String pass2 = campo_contrasenia_confirmada.getText();

        if (contrasenia.equals(pass2)) {
            String nombre = campo_nombre.getText();
            String cedula = campo_cedula.getText();
            String email = campo_emial.getText();
            if (contrasenia.length() > 0 && pass2.length() > 0 && nombre.length() > 0 && cedula.length() > 0 && email.length() > 0) {
                if (validarcorreo(email)) {
                    Map<String, String> ingresarData = new HashMap<>();
                    ingresarData.put("correo", email);
                    ingresarData.put("contrasenia", contrasenia);
                    ingresarData.put("nombre", nombre);
                    ingresarData.put("documento", cedula);

                    try {
                        String temporal = conexion.consumoPOST("https://apiparqueadero.000webhostapp.com/usuarios/Insert.php", ingresarData);

                        JsonObject jsonObject = gson.fromJson(temporal, JsonObject.class);

                        if (jsonObject.has("mesagge")) {
                            String mensajeDeError = jsonObject.get("mesagge").getAsString();
                            
                            if (mensajeDeError.equals("ERROR##SQL")) {
                                JOptionPane.showMessageDialog(null, "Intentalo de nuevo, Probablemente el usuario y correo ya existan");
                            }else{
                            JOptionPane.showMessageDialog(null, "Usuario Creado con exito");
                                campo_cedula.setText("");
                                campo_contrasenia.setText("");
                                campo_contrasenia_confirmada.setText("");
                                campo_emial.setText("");
                                campo_nombre.setText("");
                                campo_cedula.requestFocus();
                            }

                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Intentalo de nuevo Probablemente la cedula o correo ya existan");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de Correo invalido");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos son Necesarios");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña de validacion incorrecta");
        }
    }//GEN-LAST:event_btn_crear_vendedorActionPerformed

    private void campo_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_contraseniaActionPerformed

    private void campo_contraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_contraseniaKeyReleased

    }//GEN-LAST:event_campo_contraseniaKeyReleased

    private void campo_contrasenia_confirmadaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_contrasenia_confirmadaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_contrasenia_confirmadaKeyReleased

    private void campo_contrasenia_confirmadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_contrasenia_confirmadaKeyPressed
        if (evt.getKeyChar() == '\n') {
            String contrasenia = campo_contrasenia.getText();
            String pass2 = campo_contrasenia_confirmada.getText();

            if (contrasenia.equals(pass2)) {
                String nombre = campo_nombre.getText();
                String cedula = campo_cedula.getText();
                String email = campo_emial.getText();
                if (contrasenia.length() > 0 && pass2.length() > 0 && nombre.length() > 0 && cedula.length() > 0 && email.length() > 0) {
                    if (validarcorreo(email)) {
                        Map<String, String> ingresarData = new HashMap<>();
                        ingresarData.put("correo", email);
                        ingresarData.put("contrasenia", contrasenia);
                        ingresarData.put("nombre", nombre);
                        ingresarData.put("documento", cedula);

                        try {
                            String temporal = conexion.consumoPOST("https://apiparqueadero.000webhostapp.com/usuarios/Insert.php", ingresarData);

                            System.out.println(temporal);
                            JsonObject jsonObject = gson.fromJson(temporal, JsonObject.class);
                            System.out.println(jsonObject.toString());
                            
                            if (jsonObject.has("mesagge")) {
                                String mensajeDeError = jsonObject.get("mesagge").getAsString();
                                if (mensajeDeError.equals("ERROR##SQL")) {
                                    JOptionPane.showMessageDialog(null, "Intentalo de nuevo, Probablemente el usuario y correo ya existan");
                                }else {
                                    JOptionPane.showMessageDialog(null, "Usuario Creado con exito");
                                    campo_cedula.setText("");
                                    campo_contrasenia.setText("");
                                    campo_contrasenia_confirmada.setText("");
                                    campo_emial.setText("");
                                    campo_nombre.setText("");
                                    campo_cedula.requestFocus();
                                }
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Intentalo de nuevo Probablemente la cedula o correo ya existan");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Formato de Correo invalido");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Todos los campos son Necesarios");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña de validacion incorrecta");
            }
        }
    }//GEN-LAST:event_campo_contrasenia_confirmadaKeyPressed

    public boolean validarcorreo(String correo) {
        boolean validar = false;
        int cont = 0;
        int contPuntos = 0;
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i) == '@') {
                cont++;
            }
            if (cont == 1 && correo.charAt(i) == '.') {
                contPuntos++;
            }
        }
        if (cont == 1 && contPuntos == 2 || cont == 1 && contPuntos == 1) {
            Color colorRGB = new Color(154, 168, 213);
            Border borde = BorderFactory.createLineBorder(colorRGB, 2);
            campo_emial.setBorder(borde);
            validar = true;
        } else {
            Border borderColor = new LineBorder(Color.RED, 1, true);
            Border borderPadding = new EmptyBorder(2, 5, 2, 5);
            Border borderRojo = new CompoundBorder(borderColor, borderPadding);
            campo_emial.setBorder(borderRojo);
        }
        return validar;
    }

    public void initComponentsAlter() {
        soloNumeros(campo_cedula);
    }

    public void soloNumeros(JTextField campo) {
        PlainDocument doc = (PlainDocument) campo.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (esNumero(string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (esNumero(text)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean esNumero(String text) {
                return text.matches("^[0-9]*\\.?[0-9]*$");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear_vendedor;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JPasswordField campo_contrasenia;
    private javax.swing.JPasswordField campo_contrasenia_confirmada;
    private javax.swing.JTextField campo_emial;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_emial;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_pass;
    private javax.swing.JLabel etq_pass3;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}