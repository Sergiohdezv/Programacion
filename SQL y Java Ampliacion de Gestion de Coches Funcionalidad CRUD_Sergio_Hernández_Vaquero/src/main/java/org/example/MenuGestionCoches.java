package org.example;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class MenuGestionCoches extends JFrame {

    private JTable tabla;
    private DefaultTableModel modelo;

    public MenuGestionCoches() {

        setTitle("Gestión de Coches");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem itemAgregar = new JMenuItem("Añadir coche");
        JMenuItem itemMostrar = new JMenuItem("Mostrar coches");

        menu.add(itemAgregar);
        menu.add(itemMostrar);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);

        JLabel etiqueta = new JLabel("Sistema de gestión de coches", SwingConstants.CENTER);
        add(etiqueta, BorderLayout.CENTER);

        itemAgregar.addActionListener(e -> abrirFormularioCoche());
        itemMostrar.addActionListener(e -> mostrarTablaCoches());
    }

    private void abrirFormularioCoche() {

        JFrame ventana = new JFrame("Añadir coche");
        ventana.setSize(300, 200);
        ventana.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JTextField txtMarca = new JTextField();
        JTextField txtAnio = new JTextField();
        JTextField txtColor = new JTextField();

        JButton btnGuardar = new JButton("Guardar");

        panel.add(new JLabel("Marca:"));
        panel.add(txtMarca);
        panel.add(new JLabel("Año:"));
        panel.add(txtAnio);
        panel.add(new JLabel("Color:"));
        panel.add(txtColor);
        panel.add(new JLabel());
        panel.add(btnGuardar);

        ventana.add(panel);
        ventana.setVisible(true);

        btnGuardar.addActionListener(e -> {

            String marca = txtMarca.getText().trim();
            String anioTexto = txtAnio.getText().trim();
            String color = txtColor.getText().trim();

            if (marca.isEmpty() || anioTexto.isEmpty() || color.isEmpty()) {
                JOptionPane.showMessageDialog(ventana, "Campos vacíos");
                return;
            }

            try {
                int anio = Integer.parseInt(anioTexto);

                String sql = "INSERT INTO coches (marca, anio, color) VALUES (?, ?, ?)";

                try (Connection con = ConexionBD.obtenerConexion();
                     PreparedStatement ps = con.prepareStatement(sql)) {

                    ps.setString(1, marca);
                    ps.setInt(2, anio);
                    ps.setString(3, color);

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(ventana, "Coche añadido");
                    ventana.dispose();
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Año inválido");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    private void mostrarTablaCoches() {

        JFrame ventana = new JFrame("Lista de coches");
        ventana.setSize(600, 300);
        ventana.setLocationRelativeTo(this);

        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Marca");
        modelo.addColumn("Año");
        modelo.addColumn("Color");

        tabla = new JTable(modelo);

        cargarDatos();

        JButton btnEliminar = new JButton("Eliminar");
        JButton btnActualizar = new JButton("Actualizar");

        btnEliminar.addActionListener(e -> eliminarCoche());
        btnActualizar.addActionListener(e -> actualizarCoche());

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnEliminar);
        panelBotones.add(btnActualizar);

        ventana.add(new JScrollPane(tabla), BorderLayout.CENTER);
        ventana.add(panelBotones, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }

    private void cargarDatos() {

        modelo.setRowCount(0);

        String sql = "SELECT * FROM coches";

        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                modelo.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("marca"),
                        rs.getInt("anio"),
                        rs.getString("color")
                });
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void eliminarCoche() {

        int fila = tabla.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un coche");
            return;
        }

        int id = (int) modelo.getValueAt(fila, 0);

        String sql = "DELETE FROM coches WHERE id=?";

        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            cargarDatos();

            JOptionPane.showMessageDialog(this, "Eliminado");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void actualizarCoche() {

        int fila = tabla.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un coche");
            return;
        }

        int id = (int) modelo.getValueAt(fila, 0);

        String nuevaMarca = JOptionPane.showInputDialog("Nueva marca:");
        String nuevoAnio = JOptionPane.showInputDialog("Nuevo año:");
        String nuevoColor = JOptionPane.showInputDialog("Nuevo color:");

        try {
            int anio = Integer.parseInt(nuevoAnio);

            String sql = "UPDATE coches SET marca=?, anio=?, color=? WHERE id=?";

            try (Connection con = ConexionBD.obtenerConexion();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, nuevaMarca);
                ps.setInt(2, anio);
                ps.setString(3, nuevoColor);
                ps.setInt(4, id);

                ps.executeUpdate();

                cargarDatos();

                JOptionPane.showMessageDialog(this, "Actualizado");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Datos inválidos");
        }
    }
}