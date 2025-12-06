package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelRegistroTurista extends JPanel {
    
    // Componentes de la Interfaz
    private JTextField txtDocumento;
    private JComboBox<String> cmbTipoDocumento;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtNacionalidad;
    private JTextField txtEmail;
    private JTextField txtTelefono;
    private JButton btnRegistrar;
    
    // Constructor
    public PanelRegistroTurista() {
        // Usamos GridBagLayout para un formulario bien estructurado
        setLayout(new GridBagLayout()); 
        setBackground(Color.WHITE); // Fondo blanco para mayor claridad
        
        // Llamar al método de inicialización
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espacio entre componentes
        gbc.anchor = GridBagConstraints.WEST; // Alinear a la izquierda

        // --- Título del Panel ---
        JLabel lblTitulo = new JLabel("REGISTRO DE TURISTAS");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0; // Columna 0
        gbc.gridy = 0; // Fila 0
        gbc.gridwidth = 2; // Ocupa 2 columnas
        add(lblTitulo, gbc);

        // Resetear gridwidth para los campos
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Estirar componentes horizontalmente

        // --- FILA 1: Tipo y Número de Documento ---
        gbc.gridy = 1;
        
        add(new JLabel("Tipo de Documento:"), gbc);
        cmbTipoDocumento = new JComboBox<>(new String[]{"DNI", "Pasaporte", "Carné de Extranjería"});
        gbc.gridx = 1;
        add(cmbTipoDocumento, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Nº de Documento:"), gbc);
        txtDocumento = new JTextField(20);
        gbc.gridx = 1;
        add(txtDocumento, gbc);

        // --- FILA 3: Nombres y Apellidos ---
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Nombres:"), gbc);
        txtNombres = new JTextField(20);
        gbc.gridx = 1;
        add(txtNombres, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Apellidos:"), gbc);
        txtApellidos = new JTextField(20);
        gbc.gridx = 1;
        add(txtApellidos, gbc);

        // --- FILA 5: Nacionalidad ---
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Nacionalidad:"), gbc);
        txtNacionalidad = new JTextField(20);
        gbc.gridx = 1;
        add(txtNacionalidad, gbc);
        
        // --- FILA 6: Contacto ---
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(new JLabel("Email:"), gbc);
        txtEmail = new JTextField(20);
        gbc.gridx = 1;
        add(txtEmail, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(new JLabel("Teléfono:"), gbc);
        txtTelefono = new JTextField(20);
        gbc.gridx = 1;
        add(txtTelefono, gbc);

        // --- FILA Final: Botón Registrar ---
        btnRegistrar = new JButton("REGISTRAR TURISTA");
        btnRegistrar.setBackground(new Color(34, 139, 34)); // Verde para acción principal
        btnRegistrar.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2; // Ocupa todo el ancho
        gbc.insets = new Insets(20, 10, 10, 10); // Más espacio arriba
        add(btnRegistrar, gbc);
    }
    
    // Método clave para que el Controlador obtenga los datos
    public String getDocumentoIdentidad() {
        return txtDocumento.getText();
    }
    
    // ... Agregar el resto de getters para Nombres, Apellidos, Email, etc. ...
    
    public String getTipoDocumentoSeleccionado() {
        return (String) cmbTipoDocumento.getSelectedItem();
    }

    // Aquí irá el método para adjuntar el Controlador
    public void setControlador(ActionListener controlador) {
        btnRegistrar.addActionListener(controlador);
        // Podrías añadir más listeners aquí si tienes botones adicionales
    }

    // Método para limpiar campos (llamado por el Controlador después de un registro exitoso)
    public void limpiarCampos() {
        txtDocumento.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtNacionalidad.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        cmbTipoDocumento.setSelectedIndex(0);
    }
}