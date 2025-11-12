
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InterfazTransporte extends javax.swing.JFrame {
    private Empresa empresa;
    private ArrayList<Bus> buses;
    private ArrayList<Pago> pagos;
    private ArrayList<Ruta> rutas;
    private ArrayList<Inspector> inspectores;
    private ArrayList<ActaFiscalizacion> actas;
    public InterfazTransporte() {
        initComponents();
        empresa = new Empresa(5431, "MARIA INES SRL", "87456432111");
        buses = new ArrayList<>();
        pagos = new ArrayList<>();
        rutas = new ArrayList<>();
        inspectores = new ArrayList<>();
        actas = new ArrayList<>();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bRegistarBus = new javax.swing.JButton();
        bRegistrarPago = new javax.swing.JButton();
        bRegistrarRuta = new javax.swing.JButton();
        bRegistrarInspector = new javax.swing.JButton();
        bRegistrarActa = new javax.swing.JButton();
        bMostrarInformacion = new javax.swing.JButton();
        bSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("\"SISTEMA DE TRANSPORTE URBANO\"");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Empresa: MARIA INES SRL");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("RUC: 87456432111");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("ID Empresa: 5431");

        bRegistarBus.setBackground(new java.awt.Color(204, 255, 204));
        bRegistarBus.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bRegistarBus.setText("Registrar Combi");
        bRegistarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarBusActionPerformed(evt);
            }
        });

        bRegistrarPago.setBackground(new java.awt.Color(204, 255, 204));
        bRegistrarPago.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bRegistrarPago.setText("Registar Pago");
        bRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarPagoActionPerformed(evt);
            }
        });

        bRegistrarRuta.setBackground(new java.awt.Color(204, 255, 204));
        bRegistrarRuta.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bRegistrarRuta.setText("Registrar Ruta y Paraderos");
        bRegistrarRuta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bRegistrarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarRutaActionPerformed(evt);
            }
        });

        bRegistrarInspector.setBackground(new java.awt.Color(204, 255, 204));
        bRegistrarInspector.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bRegistrarInspector.setText("Registrar Inspector");
        bRegistrarInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarInspectorActionPerformed(evt);
            }
        });

        bRegistrarActa.setBackground(new java.awt.Color(204, 255, 204));
        bRegistrarActa.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bRegistrarActa.setText("Registrar Acta Fiscalización");
        bRegistrarActa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActaActionPerformed(evt);
            }
        });

        bMostrarInformacion.setBackground(new java.awt.Color(102, 255, 204));
        bMostrarInformacion.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bMostrarInformacion.setText("Mostrar Información");
        bMostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarInformacionActionPerformed(evt);
            }
        });

        bSalida.setBackground(new java.awt.Color(0, 255, 204));
        bSalida.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        bSalida.setText("SALIR");
        bSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bRegistarBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRegistrarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRegistrarRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRegistrarInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRegistrarActa, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(bMostrarInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bRegistarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRegistrarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRegistrarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRegistrarInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRegistrarActa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMostrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRegistarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarBusActionPerformed
     String placa = JOptionPane.showInputDialog(this, "Ingrese la placa de la combi:");
    String capacidadStr = JOptionPane.showInputDialog(this, "Ingrese la capacidad:");
    String estado = JOptionPane.showInputDialog(this, "Estado (Operativo / En mantenimiento):");
    String aforoStr = JOptionPane.showInputDialog(this, "Ingrese el aforo actual:");

    try {
        int capacidad = Integer.parseInt(capacidadStr);
        int aforo = Integer.parseInt(aforoStr);

        if (aforo < 0 || aforo > capacidad) {
            JOptionPane.showMessageDialog(this, "Error: El aforo ingresado excede la capacidad o es negativo.");
        } else {
            Bus bus = new Bus(placa, capacidad, estado, aforo);
            buses.add(bus);
            JOptionPane.showMessageDialog(this, "Combi registrada correctamente");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Debe ingresar valores numéricos válidos en capacidad y aforo.");
    }
    }//GEN-LAST:event_bRegistarBusActionPerformed

    private void bRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarPagoActionPerformed
        try {
        int idPago = Integer.parseInt(JOptionPane.showInputDialog(this, "ID del Pago:"));
        String tipo = JOptionPane.showInputDialog(this, "Tipo de tarifa (normal / estudiante / adulto mayor):");
        double montoBase = Double.parseDouble(JOptionPane.showInputDialog(this, "Monto base:"));
        String medio = JOptionPane.showInputDialog(this, "Medio de pago (efectivo / tarjeta):");

        Pago pago = new Pago(idPago, tipo, montoBase, medio);
        pagos.add(pago);
        JOptionPane.showMessageDialog(this, "Pago registrado correctamente. Monto final: S/ " + pago.calcularMontoFinal());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al registrar pago: " + e.getMessage());
    }
    }//GEN-LAST:event_bRegistrarPagoActionPerformed

    private void bRegistrarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarRutaActionPerformed
        int idRuta = Integer.parseInt(JOptionPane.showInputDialog(this, "ID de la Ruta:"));
        String nombreRuta = JOptionPane.showInputDialog(this, "Nombre de la Ruta:");
        String frecuencia = JOptionPane.showInputDialog(this, "Frecuencia (Ejemplo: 15 min):");

    Ruta ruta = new Ruta(idRuta, nombreRuta, frecuencia);
    int nParaderos = Integer.parseInt(JOptionPane.showInputDialog(this, "¿Cuántos paraderos tiene la ruta?"));

    for (int i = 1; i <= nParaderos; i++) {
        int idParadero = Integer.parseInt(JOptionPane.showInputDialog(this, "ID del Paradero " + i + ":"));
        String nombreParadero = JOptionPane.showInputDialog(this, "Nombre del Paradero " + i + ":");
        String ubicacion = JOptionPane.showInputDialog(this, "Ubicación:");
        Paradero p = new Paradero(idParadero, nombreParadero, ubicacion, i);
        ruta.agregarParadero(p);
    }
    rutas.add(ruta);
    JOptionPane.showMessageDialog(this, "Ruta registrada correctamente");
    }//GEN-LAST:event_bRegistrarRutaActionPerformed

    private void bRegistrarInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarInspectorActionPerformed
         int idInspector = Integer.parseInt(JOptionPane.showInputDialog(this, "ID del Inspector:"));
        String nombreInspector = JOptionPane.showInputDialog(this, "Nombre:");
        String rol = JOptionPane.showInputDialog(this, "Rol:");
        String zona = JOptionPane.showInputDialog(this, "Zona asignada:");
        Inspector inspector = new Inspector(idInspector, nombreInspector, rol, zona);
        inspectores.add(inspector);
        JOptionPane.showMessageDialog(this, "Inspector registrado correctamente");
    }//GEN-LAST:event_bRegistrarInspectorActionPerformed

    private void bRegistrarActaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActaActionPerformed
        int idActa = Integer.parseInt(JOptionPane.showInputDialog(this, "ID del Acta:"));
        String fecha = JOptionPane.showInputDialog(this, "Fecha (dd/mm/aaaa):");
        String infraccion = JOptionPane.showInputDialog(this, "Tipo de infracción:");
        String evidencia = JOptionPane.showInputDialog(this, "Evidencia:");
        ActaFiscalizacion acta = new ActaFiscalizacion(idActa, fecha, infraccion, evidencia);
        actas.add(acta);
        JOptionPane.showMessageDialog(this, "Acta registrada correctamente");
    }//GEN-LAST:event_bRegistrarActaActionPerformed

    private void bMostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarInformacionActionPerformed
         String[] opciones = {"Combis", "Pagos", "Rutas", "Inspectores", "Actas"};
    String seleccion = (String) JOptionPane.showInputDialog(this, "Seleccione qué desea ver:", 
            "Mostrar Información", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

    StringBuilder info = new StringBuilder();

    switch (seleccion) {
        case "Combi":
            if (buses.isEmpty()) info.append("No hay combis registradas.");
            else buses.forEach(b -> info.append(b).append("\n"));
            break;
        case "Pagos":
            if (pagos.isEmpty()) info.append("No hay pagos registrados.");
            else pagos.forEach(p -> info.append(p).append("\n"));
            break;
        case "Rutas":
            if (rutas.isEmpty()) info.append("No hay rutas registradas.");
            else rutas.forEach(r -> info.append(r).append("\n"));
            break;
        case "Inspectores":
            if (inspectores.isEmpty()) info.append("No hay inspectores registrados.");
            else inspectores.forEach(i -> info.append(i).append("\n"));
            break;
        case "Actas":
            if (actas.isEmpty()) info.append("No hay actas registradas.");
            else actas.forEach(a -> info.append(a).append("\n"));
            break;
    }
    JOptionPane.showMessageDialog(this, info.toString());
    }//GEN-LAST:event_bMostrarInformacionActionPerformed

    private void bSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalidaActionPerformed
         int confirm = JOptionPane.showConfirmDialog(this, "¿Desea salir del sistema?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        dispose();
    }
    }//GEN-LAST:event_bSalidaActionPerformed
     public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMostrarInformacion;
    private javax.swing.JButton bRegistarBus;
    private javax.swing.JButton bRegistrarActa;
    private javax.swing.JButton bRegistrarInspector;
    private javax.swing.JButton bRegistrarPago;
    private javax.swing.JButton bRegistrarRuta;
    private javax.swing.JButton bSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}