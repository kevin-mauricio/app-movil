
package principal;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;


public class InfoParqueadero extends javax.swing.JPanel {

    
    

    JsonObject datosParqueadero;
    public InfoParqueadero(JsonObject datosParqueadero) {
        this.datosParqueadero = datosParqueadero;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etq_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        etq_nombre1 = new javax.swing.JLabel();
        etq_tarifas = new javax.swing.JLabel();
        etq_nombre3 = new javax.swing.JLabel();
        etq_nombre4 = new javax.swing.JLabel();
        etq_nombre5 = new javax.swing.JLabel();
        priceCarro = new javax.swing.JLabel();
        priceCamioneta = new javax.swing.JLabel();
        priceCamion = new javax.swing.JLabel();
        priceMoto = new javax.swing.JLabel();
        etq_mensaje = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACION BASICA");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(49, 138, 222)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        etq_nombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre.setText("NOMBRE:");

        campo_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_nombre.setForeground(Color.decode("#318ade"));
        campo_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        etq_direccion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(49, 138, 222));
        etq_direccion.setText("DIRECCIÓN:");

        campo_direccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_direccion.setForeground(Color.decode("#318ade"));
        campo_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_direccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#318ade")));

        etq_nombre1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre1.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre1.setText("CARRO");

        etq_tarifas.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        etq_tarifas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_tarifas.setText("TARIFAS ACTUALES");
        etq_tarifas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(49, 138, 222)));

        etq_nombre3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre3.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre3.setText("MOTO");

        etq_nombre4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre4.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre4.setText("CAMION");

        etq_nombre5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        etq_nombre5.setForeground(new java.awt.Color(49, 138, 222));
        etq_nombre5.setText("CAMIONETA");

        priceCarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        priceCamioneta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        priceCamion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        priceMoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(etq_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_direccion)
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(etq_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_nombre3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceMoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(etq_nombre5)
                        .addGap(75, 75, 75)
                        .addComponent(etq_nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(priceCamioneta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(priceCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(etq_tarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_nombre)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_direccion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(etq_tarifas)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombre1)
                    .addComponent(etq_nombre5)
                    .addComponent(etq_nombre3)
                    .addComponent(etq_nombre4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceCamioneta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        etq_mensaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etq_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_mensaje;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_nombre1;
    private javax.swing.JLabel etq_nombre3;
    private javax.swing.JLabel etq_nombre4;
    private javax.swing.JLabel etq_nombre5;
    public javax.swing.JLabel etq_tarifas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel priceCamion;
    private javax.swing.JLabel priceCamioneta;
    private javax.swing.JLabel priceCarro;
    private javax.swing.JLabel priceMoto;
    // End of variables declaration//GEN-END:variables

    public void initComponentsAlter() {
       String nombreParqueadero = datosParqueadero.getAsJsonObject("registros").get("nombre").getAsString();
       String direccionParqueadero = datosParqueadero.getAsJsonObject("registros").get("direccion").getAsString();
       String tarifaCarro = datosParqueadero.getAsJsonObject("registros").get("carro").getAsString();
       String tarifaMoto = datosParqueadero.getAsJsonObject("registros").get("moto").getAsString();
       String tarifaCamion = datosParqueadero.getAsJsonObject("registros").get("camiones").getAsString();
       String tarifaCamioneta = datosParqueadero.getAsJsonObject("registros").get("camioneta").getAsString();
       
       priceMoto.setText(formatoMoneda(tarifaMoto));
       priceCamion.setText(formatoMoneda(tarifaCamion));
       priceCamioneta.setText(formatoMoneda(tarifaCamioneta));
       priceCarro.setText(formatoMoneda(tarifaCarro));
       campo_nombre.setText(nombreParqueadero);
       campo_direccion.setText(direccionParqueadero);
       campo_direccion.setEditable(false);
       campo_nombre.setEditable(false);
    }
    public static String formatoMoneda(String numeroString) {
        try {
            // Parsea el valor de la cadena a float
            float numero = Float.parseFloat(numeroString);

            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setGroupingSeparator('.');
            symbols.setDecimalSeparator(',');
            String pattern = "###,###,###,###.##"; // Patrón para el formato de moneda colombiana

            DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
            return decimalFormat.format(numero);
        } catch (NumberFormatException e) {
            // Manejo de excepciones en caso de que la cadena no sea un número válido
            return "Formato no válido";
        }
    }
}
