import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class FormularioTabla {

    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private DefaultTableModel modeloTabla;

    public FormularioTabla() {

        JFrame ventana = new JFrame("Lista de Estudiantes");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());


        JPanel panelFormulario = new JPanel(new GridBagLayout());
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Agregar Estudiante"));
        ventana.add(panelFormulario, BorderLayout.NORTH);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;


        JTextField txtNombre = new JTextField(12);
        JTextField txtEdad = new JTextField(12);
        JTextField txtCurso = new JTextField(12);


        panelFormulario.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        panelFormulario.add(txtNombre, gbc);


        gbc.gridx = 0;
        gbc.gridy = 1;
        panelFormulario.add(new JLabel("Edad:"), gbc);
        gbc.gridx = 1;
        panelFormulario.add(txtEdad, gbc);


        gbc.gridx = 0;
        gbc.gridy = 2;
        panelFormulario.add(new JLabel("Curso:"), gbc);
        gbc.gridx = 1;
        panelFormulario.add(txtCurso, gbc);


        JButton btnAgregar = new JButton("Agregar");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelFormulario.add(btnAgregar, gbc);


        String[] columnas = {"Nombre", "Edad", "Curso"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modeloTabla);

        JScrollPane scroll = new JScrollPane(tabla);
        ventana.add(scroll, BorderLayout.CENTER);


        btnAgregar.addActionListener((ActionEvent e) -> {

            String nombre = txtNombre.getText();
            String edadTexto = txtEdad.getText();
            String curso = txtCurso.getText();

            if (nombre.isEmpty() || edadTexto.isEmpty() || curso.isEmpty()) {
                JOptionPane.showMessageDialog(ventana,
                        "Por favor, completa todos los campos",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            int edad;
            try {
                edad = Integer.parseInt(edadTexto);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana,
                        "La edad debe ser un número",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Estudiante est = new Estudiante(nombre, edad, curso);
            listaEstudiantes.add(est);


            modeloTabla.addRow(new Object[]{est.getNombre(), est.getEdad(), est.getCurso()});


            txtNombre.setText("");
            txtEdad.setText("");
            txtCurso.setText("");
        });

        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
