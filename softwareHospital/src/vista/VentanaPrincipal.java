/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controladora.Hospital;
import excepction.ExceptionArregloLleno;
import excepction.ExceptionElementoFueraDeRango;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Enfermedad;
import util.Fecha;
import util.ListaArreglo;


public class VentanaPrincipal extends javax.swing.JFrame {

    private final Hospital hospital;

    
    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Software Hospital");
        hospital = new Hospital();
        actualizarValoresFooter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        jButtonImportar = new javax.swing.JButton();
        jButtonExportar = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(45, 0), new java.awt.Dimension(45, 0), new java.awt.Dimension(62317, 32767));
        jButtonCerrar = new javax.swing.JButton();
        jPanelContent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonAniadir = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonOrdenarAlf = new javax.swing.JButton();
        jButtonOrdenarTalla = new javax.swing.JButton();
        jButtonOrdenarPeso = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabelEnfermedades = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabelImagenes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButtonAniadirEnfermedad = new javax.swing.JButton();
        jButtonEliminarEnfermedad = new javax.swing.JButton();
        jButtonModificarEnfermedad = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButtonAniadirImagen = new javax.swing.JButton();
        jButtonEliminarImagen = new javax.swing.JButton();
        jButtonModificarImagen = new javax.swing.JButton();
        jPanelFooter = new javax.swing.JPanel();
        jLabelCantPacientes = new javax.swing.JLabel();
        jLabelCantidadEnfermedades = new javax.swing.JLabel();
        jLabelCantidadImagenes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanelHeader.setMaximumSize(new java.awt.Dimension(12000, 40));
        jPanelHeader.setMinimumSize(new java.awt.Dimension(0, 40));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(500, 40));
        jPanelHeader.setLayout(new javax.swing.BoxLayout(jPanelHeader, javax.swing.BoxLayout.X_AXIS));

        jButtonImportar.setText("Importar");
        jButtonImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportarActionPerformed(evt);
            }
        });
        jPanelHeader.add(jButtonImportar);

        jButtonExportar.setText("Exportar");
        jButtonExportar.setBorderPainted(false);
        jButtonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarActionPerformed(evt);
            }
        });
        jPanelHeader.add(jButtonExportar);
        jPanelHeader.add(filler2);

        jButtonCerrar.setText("Salir");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanelHeader.add(jButtonCerrar);

        getContentPane().add(jPanelHeader);

        jPanelContent.setLayout(new javax.swing.BoxLayout(jPanelContent, javax.swing.BoxLayout.X_AXIS));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        jButtonAniadir.setText("Añadir");
        jButtonAniadir.setMaximumSize(new java.awt.Dimension(76, 32));
        jButtonAniadir.setMinimumSize(new java.awt.Dimension(76, 32));
        jPanel3.add(jButtonAniadir);

        jButtonEliminar.setText("Eliminar");
        jPanel3.add(jButtonEliminar);

        jButtonOrdenarAlf.setText("PorNombre");
        jButtonOrdenarAlf.setMaximumSize(new java.awt.Dimension(76, 32));
        jButtonOrdenarAlf.setMinimumSize(new java.awt.Dimension(76, 32));
        jPanel3.add(jButtonOrdenarAlf);

        jButtonOrdenarTalla.setText("Talla");
        jButtonOrdenarTalla.setMaximumSize(new java.awt.Dimension(76, 32));
        jButtonOrdenarTalla.setMinimumSize(new java.awt.Dimension(76, 32));
        jPanel3.add(jButtonOrdenarTalla);

        jButtonOrdenarPeso.setText("Peso");
        jButtonOrdenarPeso.setMaximumSize(new java.awt.Dimension(76, 32));
        jButtonOrdenarPeso.setMinimumSize(new java.awt.Dimension(76, 32));
        jPanel3.add(jButtonOrdenarPeso);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setText("Pacientes");
        jPanel4.add(jLabel1);

        jScrollPane1.setViewportView(jList1);

        jPanel4.add(jScrollPane1);

        jPanel1.add(jPanel4);

        jPanelContent.add(jPanel1);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jLabelEnfermedades.setText("Enfermedades");
        jPanel5.add(jLabelEnfermedades);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tratamiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setMaximumSize(new java.awt.Dimension(213219, 64));
        jTable1.setPreferredSize(new java.awt.Dimension(60, 64));
        jScrollPane2.setViewportView(jTable1);

        jPanel5.add(jScrollPane2);

        jPanel2.add(jPanel5);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jLabelImagenes.setText("Imagenes");
        jPanel6.add(jLabelImagenes);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha", "Tipo", "Comentario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel6.add(jScrollPane3);

        jPanel2.add(jPanel6);

        jPanelContent.add(jPanel2);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));

        jPanel9.setMaximumSize(new java.awt.Dimension(32767, 32863));
        jPanel9.setPreferredSize(new java.awt.Dimension(99, 192));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.Y_AXIS));

        jButtonAniadirEnfermedad.setText("Añadir");
        jButtonAniadirEnfermedad.setMaximumSize(new java.awt.Dimension(76, 32));
        jButtonAniadirEnfermedad.setMinimumSize(new java.awt.Dimension(76, 32));
        jButtonAniadirEnfermedad.setPreferredSize(new java.awt.Dimension(76, 32));
        jButtonAniadirEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAniadirEnfermedadActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonAniadirEnfermedad);

        jButtonEliminarEnfermedad.setText("Eliminar");
        jPanel9.add(jButtonEliminarEnfermedad);

        jButtonModificarEnfermedad.setText("Modificar");
        jButtonModificarEnfermedad.setMaximumSize(new java.awt.Dimension(76, 32));
        jButtonModificarEnfermedad.setMinimumSize(new java.awt.Dimension(76, 32));
        jButtonModificarEnfermedad.setPreferredSize(new java.awt.Dimension(76, 32));
        jPanel9.add(jButtonModificarEnfermedad);

        jPanel7.add(jPanel9);

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.Y_AXIS));

        jButtonAniadirImagen.setText("Añadir");
        jButtonAniadirImagen.setMaximumSize(new java.awt.Dimension(76, 32));
        jButtonAniadirImagen.setMinimumSize(new java.awt.Dimension(76, 32));
        jButtonAniadirImagen.setPreferredSize(new java.awt.Dimension(76, 32));
        jPanel8.add(jButtonAniadirImagen);

        jButtonEliminarImagen.setText("Eliminar");
        jButtonEliminarImagen.setMaximumSize(new java.awt.Dimension(76, 32));
        jButtonEliminarImagen.setMinimumSize(new java.awt.Dimension(76, 32));
        jPanel8.add(jButtonEliminarImagen);

        jButtonModificarImagen.setText("Modificar");
        jButtonModificarImagen.setMaximumSize(new java.awt.Dimension(76, 32));
        jButtonModificarImagen.setMinimumSize(new java.awt.Dimension(76, 32));
        jButtonModificarImagen.setPreferredSize(new java.awt.Dimension(76, 32));
        jPanel8.add(jButtonModificarImagen);

        jPanel7.add(jPanel8);

        jPanelContent.add(jPanel7);

        getContentPane().add(jPanelContent);

        jPanelFooter.setMaximumSize(new java.awt.Dimension(12400, 60));
        jPanelFooter.setMinimumSize(new java.awt.Dimension(0, 60));
        jPanelFooter.setPreferredSize(new java.awt.Dimension(600, 80));
        jPanelFooter.setLayout(new java.awt.GridLayout(1, 3));

        jLabelCantPacientes.setText("Cantidad de Pacientes: 100");
        jLabelCantPacientes.setInheritsPopupMenu(false);
        jLabelCantPacientes.setMaximumSize(new java.awt.Dimension(30, 16));
        jLabelCantPacientes.setMinimumSize(new java.awt.Dimension(30, 16));
        jLabelCantPacientes.setPreferredSize(new java.awt.Dimension(25, 16));
        jPanelFooter.add(jLabelCantPacientes);

        jLabelCantidadEnfermedades.setText("Cantidad de Enfermedades: 100");
        jLabelCantidadEnfermedades.setMaximumSize(new java.awt.Dimension(30, 16));
        jLabelCantidadEnfermedades.setMinimumSize(new java.awt.Dimension(30, 16));
        jLabelCantidadEnfermedades.setPreferredSize(new java.awt.Dimension(25, 16));
        jPanelFooter.add(jLabelCantidadEnfermedades);

        jLabelCantidadImagenes.setText("Cantidad de Imagenes: 100");
        jLabelCantidadImagenes.setMaximumSize(new java.awt.Dimension(30, 16));
        jLabelCantidadImagenes.setMinimumSize(new java.awt.Dimension(30, 16));
        jLabelCantidadImagenes.setPreferredSize(new java.awt.Dimension(25, 16));
        jPanelFooter.add(jLabelCantidadImagenes);

        getContentPane().add(jPanelFooter);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExportarActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonImportarActionPerformed

    private void jButtonAniadirEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAniadirEnfermedadActionPerformed
        AdicionarEnfermedad dialog = new AdicionarEnfermedad(this,true);
        
        boolean aceptado = dialog.ejecutar();
        
        if(aceptado==true){
            Enfermedad enfermedad = dialog.getObjEnfermedad();
            if(enfermedad != null){
                try {
                    hospital.addEnfermedad(enfermedad);
                    actualizarValoresTablaEnfermedades();
                } catch (ExceptionArregloLleno ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExceptionElementoFueraDeRango ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
       
    }//GEN-LAST:event_jButtonAniadirEnfermedadActionPerformed
    }
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButtonAniadir;
    private javax.swing.JButton jButtonAniadirEnfermedad;
    private javax.swing.JButton jButtonAniadirImagen;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminarEnfermedad;
    private javax.swing.JButton jButtonEliminarImagen;
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JButton jButtonImportar;
    private javax.swing.JButton jButtonModificarEnfermedad;
    private javax.swing.JButton jButtonModificarImagen;
    private javax.swing.JButton jButtonOrdenarAlf;
    private javax.swing.JButton jButtonOrdenarPeso;
    private javax.swing.JButton jButtonOrdenarTalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCantPacientes;
    private javax.swing.JLabel jLabelCantidadEnfermedades;
    private javax.swing.JLabel jLabelCantidadImagenes;
    private javax.swing.JLabel jLabelEnfermedades;
    private javax.swing.JLabel jLabelImagenes;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void actualizarValoresFooter() {
        
        String prefijo = jLabelCantPacientes.getText().split(":")[0];
        jLabelCantPacientes.setText(prefijo+": "+hospital.getCantRealPacientes());
        
        prefijo = jLabelCantidadEnfermedades.getText().split(":")[0];
        jLabelCantidadEnfermedades.setText(prefijo+": "+hospital.getCantRealEnfermedad());
        
        prefijo = jLabelCantidadImagenes.getText().split(":")[0];
        jLabelCantidadImagenes.setText(prefijo+": "+hospital.getCantRealImagen());
    }
    
    private void actualizarValoresTablaEnfermedades() throws ExceptionElementoFueraDeRango{
        ListaArreglo<Enfermedad> enfermedades = hospital.getEnfermedad();
        
        Object [] nombresColumnas = {"Nombre","Fecha","Tratamiento"};
        
        DefaultTableModel model = new DefaultTableModel(nombresColumnas, 0);
        
        for(int i=0;i<enfermedades.cantElementos();i++){
            String nombre = enfermedades.obtener(i).getNombreEnfermedad();
            Fecha fechaEnfermedad = enfermedades.obtener(i).getFechaEnfermedad();
            String tratamiento = enfermedades.obtener(i).getTratamiento();
            Object [] fila = {nombre,fechaEnfermedad,tratamiento};
            model.addRow(fila);
        }
        
        this.jTable1.setModel(model);
    }
}
