/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import listas.NoDato;

/**
 *
 * @author BSOD
 */
public class Menu extends javax.swing.JFrame {

    private String fechaInicio;
    private String fechaFin;
    private String tipo;
    private boolean estado;

    /**
     * Creates new form Menu
     */
    public Menu() throws IOException, NoDato {
        initComponents();
        fechaInicio = null;
        fechaFin = null;
        tipo = null;
        estado = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotones = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        titulo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        rangoFechas = new javax.swing.JLabel();
        fechaI = new javax.swing.JLabel();
        jDateI = new com.toedter.calendar.JDateChooser();
        fechaF = new javax.swing.JLabel();
        jDateF = new com.toedter.calendar.JDateChooser();
        jSeparator4 = new javax.swing.JSeparator();
        deseaFiltroTipo = new javax.swing.JLabel();
        fondoMutuo = new javax.swing.JRadioButton();
        depositoAplazo = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        ejecutar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        bsod = new javax.swing.JLabel();
        fondoInmobiliario = new javax.swing.JRadioButton();
        bonos = new javax.swing.JRadioButton();
        sinFiltro = new javax.swing.JRadioButton();
        grupoDeBotones.add(fondoMutuo);
        grupoDeBotones.add(depositoAplazo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titulo.setText("Skynet - Informe Estadístico");

        rangoFechas.setText("Ingrese un rango de fechas:");

        fechaI.setText("Fecha inicial");

        fechaF.setText("Fecha final");

        deseaFiltroTipo.setText("Seleccione el filtro por tipo de inversión:");

        grupoDeBotones.add(fondoMutuo);
        fondoMutuo.setText("Fondo Mutuo");
        fondoMutuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoMutuoActionPerformed(evt);
            }
        });

        grupoDeBotones.add(depositoAplazo);
        depositoAplazo.setText("Depósito a plazo fijo");

        ejecutar.setBackground(new java.awt.Color(51, 255, 51));
        ejecutar.setText("Aceptar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });

        bsod.setText("© BSOD - Todos los derechos reservados");

        grupoDeBotones.add(fondoInmobiliario);
        fondoInmobiliario.setText("Fondo Inmobiliario");

        grupoDeBotones.add(bonos);
        bonos.setText("Bonos");

        grupoDeBotones.add(sinFiltro);
        sinFiltro.setText("Sin filtro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bsod)
                    .addComponent(titulo)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(ejecutar)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bonos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rangoFechas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaF))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositoAplazo)
                            .addComponent(fondoInmobiliario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fondoMutuo)
                                .addGap(69, 69, 69)
                                .addComponent(sinFiltro))
                            .addComponent(deseaFiltroTipo))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(rangoFechas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(deseaFiltroTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fondoMutuo)
                            .addComponent(sinFiltro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(depositoAplazo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fondoInmobiliario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bonos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ejecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsod)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
        boolean okfecha = false;
        boolean okfiltro = false;
        String tipoInversion = "";

        try {
            try {
                if (jDateI.getDate().compareTo(jDateF.getDate()) > 0) {
                    throw new NullPointerException();
                }
                fechaInicio = new SimpleDateFormat("dd-MMM-yyyy").format(jDateI.getDate());
                fechaFin = new SimpleDateFormat("dd-MMM-yyyy").format(jDateF.getDate());

                okfecha = true;
            } catch (NullPointerException e) {
                okfecha = false;
                JOptionPane.showMessageDialog(null, "Verifique el ingreso de las fechas.",
                        "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
            }
            
            try {
                if (fondoMutuo.getModel().isSelected()) {
                    tipo = "FM";
                    tipoInversion = "Fondo Mutuo";
                } else if (depositoAplazo.getModel().isSelected()) {
                    tipo = "DF";
                    tipoInversion = "Depósito a plazo fijo";
                } else if (fondoInmobiliario.getModel().isSelected()) {
                    tipo = "FI";
                    tipoInversion = "Fondo Inmobiliario";
                } else if (bonos.getModel().isSelected()) {
                    tipo = "BO";
                    tipoInversion = "Bonos";
                } else if (sinFiltro.getModel().isSelected()) {
                    tipo = "GR";
                    tipoInversion = "Sin filtro ";
                }
                if (tipo == null) {
                    okfiltro = false;
                    throw new NullPointerException();
                } else {
                    okfiltro = true;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un tipo de filtro.",
                        "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {
            System.out.println("...");
        } finally {
            if (okfecha && okfiltro) {
                estado = true;
                JOptionPane.showMessageDialog(null, "Su solicitud esta siendo realizada para los siguientes parámetros:"
                        + "\n"
                        + "\n   Fecha inicial:          " + fechaInicio
                        + "\n   Fecha final:             " + fechaFin
                        + "\n   Tipo de inversión: "+tipoInversion
                        + "\n"
                        + "\nPor favor, espere...",
                        "¡Paciencia!", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_ejecutarActionPerformed

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void cambiarEstado() {
        System.exit(0);
    }

    private void fondoMutuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoMutuoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fondoMutuoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(Menu.class
                            .getName()).log(Level.SEVERE, null, ex);

                } catch (NoDato ex) {
                    Logger.getLogger(Menu.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bonos;
    private javax.swing.JLabel bsod;
    private javax.swing.JRadioButton depositoAplazo;
    private javax.swing.JLabel deseaFiltroTipo;
    private javax.swing.JButton ejecutar;
    private javax.swing.JLabel fechaF;
    private javax.swing.JLabel fechaI;
    private javax.swing.JRadioButton fondoInmobiliario;
    private javax.swing.JRadioButton fondoMutuo;
    private javax.swing.ButtonGroup grupoDeBotones;
    private com.toedter.calendar.JDateChooser jDateF;
    private com.toedter.calendar.JDateChooser jDateI;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel rangoFechas;
    private javax.swing.JRadioButton sinFiltro;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
