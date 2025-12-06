package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    // Paneles principales
    private JPanel panelMenuLateral; // El menú de navegación
    private JPanel panelContenidoCentral; // Donde cargaremos las otras vistas (Turista, Boleto, etc.)
    private PanelRegistroTurista panelRegistroTurista;

    public VentanaPrincipal() {
        setTitle("Sistema de Gestión de Boletos - Machu Picchu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700); // Tamaño inicial de la ventana
        setLayout(new BorderLayout()); // Usamos BorderLayout para dividir la ventana

        // Inicializar paneles
        inicializarComponentes();

        // Configuración final de la ventana
        setLocationRelativeTo(null); // Centra la ventana
        setVisible(true);
    }

    private void inicializarComponentes() {
        // --- 1. Panel de Menú Lateral (WEST) ---
        crearPanelMenuLateral();
        this.add(panelMenuLateral, BorderLayout.WEST);

        // --- 2. Panel de Contenido Central (CENTER) ---
        panelContenidoCentral = new JPanel();
        panelContenidoCentral.setLayout(new CardLayout()); // Usamos CardLayout para cambiar vistas
        panelContenidoCentral.setBackground(Color.LIGHT_GRAY);
        this.add(panelContenidoCentral, BorderLayout.CENTER);

        // Agregar un panel de inicio (temporal)
        panelContenidoCentral.add(new JLabel("Bienvenido al Sistema de Boletos", JLabel.CENTER), "Inicio");

        // Instanciar el panel de registro
        panelRegistroTurista = new PanelRegistroTurista();

        // 2. Panel de Contenido Central (CENTER) 
        panelContenidoCentral = new JPanel();
        panelContenidoCentral.setLayout(new CardLayout()); // Usamos CardLayout
        this.add(panelContenidoCentral, BorderLayout.CENTER);

        // 3. Añadir el nuevo panel con una clave (CardLayout)
        panelContenidoCentral.add(new JLabel("Bienvenido...", JLabel.CENTER), "Inicio");
        panelContenidoCentral.add(panelRegistroTurista, "RegistroTurista");
    }

    // Implementación del menú (ver paso 2)
    private void crearPanelMenuLateral() {
        panelMenuLateral = new JPanel();
        panelMenuLateral.setLayout(new GridLayout(6, 1, 10, 10)); // 6 filas, 1 columna, con espacios
        panelMenuLateral.setPreferredSize(new Dimension(200, 0)); // Ancho fijo del menú
        panelMenuLateral.setBackground(new Color(40, 40, 80)); // Un color azul oscuro para el menú
        panelMenuLateral.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10)); // Padding

        // Título del Menú
        JLabel titulo = new JLabel("MENÚ PRINCIPAL", JLabel.CENTER);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        panelMenuLateral.add(titulo);

        // Funciones principales
        JButton btnVenta = new JButton("Venta de Boletos");
        JButton btnRegistroTurista = new JButton("Registro Turistas");
        btnRegistroTurista.addActionListener(e -> {
            CardLayout cl = (CardLayout) (panelContenidoCentral.getLayout());
            cl.show(panelContenidoCentral, "RegistroTurista"); 
        });
        
        JButton btnReportes = new JButton("Reportes y Aforo");
        JButton btnAcceso = new JButton("Control de Acceso");

        // Estilo de los botones
        btnVenta.setForeground(Color.WHITE);
        btnVenta.setBackground(new Color(60, 60, 100));
        btnVenta.setFocusPainted(false);

        // Agregar al panel lateral
        panelMenuLateral.add(btnVenta);
        panelMenuLateral.add(btnRegistroTurista);
        panelMenuLateral.add(btnReportes);
        panelMenuLateral.add(btnAcceso);

        // Agregamos un separador o espacio
        panelMenuLateral.add(new JLabel(""));

        // Botón de Salir
        JButton btnSalir = new JButton("Salir");
        btnSalir.setForeground(Color.RED);
        btnSalir.setBackground(new Color(60, 60, 100));
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(e -> System.exit(0));
        panelMenuLateral.add(btnSalir);
    }

    // Método principal para probar la ventana
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal());
    }
}
