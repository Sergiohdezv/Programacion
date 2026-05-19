import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {
    private JTextField huecoNombre, huecoEdad, huecoCurso;
    JFrame ventana = new JFrame("Formulario de Estudiante");

    public Formulario() {
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Datos del estudiante"));
        ventana.add(panel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.ipadx = 50;

        panel.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        huecoNombre = new JTextField(15);
        panel.add(huecoNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Edad:"), gbc);
        gbc.gridx = 1;
        huecoEdad = new JTextField(15);
        panel.add(huecoEdad, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Curso:"), gbc);
        gbc.gridx = 1;
        huecoCurso = new JTextField(15);
        panel.add(huecoCurso, gbc);

        JButton boton = new JButton("Guardar");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = huecoNombre.getText();
                String edadTexto = huecoEdad.getText();
                String curso = huecoCurso.getText();

                if (nombre.isEmpty() || edadTexto.isEmpty() || curso.isEmpty()) {
                    JOptionPane.showMessageDialog(ventana,
                            "Por favor, llena todos los campos",
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

                JOptionPane.showMessageDialog(
                        ventana,
                        "Nombre: " + est.getNombre() + "\n" +
                                "Edad: " + est.getEdad() + "\n" +
                                "Curso: " + est.getCurso(),
                        "Estudiante",
                        JOptionPane.INFORMATION_MESSAGE
                );

            }
        });

        JPanel panelBoton = new JPanel();
        panelBoton.add(boton);
        ventana.add(panelBoton, BorderLayout.SOUTH);

        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}