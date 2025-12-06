package Modelo.DAO;

import Modelo.Turista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TuristaDAO {
    // 1. Método para registrar (crear) un nuevo turista
    public int registrarTurista(Turista turista) throws SQLException, Exception {
        // La sentencia SQL: NO incluimos ID_TURISTA ni FECHA_REGISTRO (la BD lo gestiona)
        String sql = "INSERT INTO Turista (DOCUMENTO_IDENTIDAD, TIPO_DOCUMENTO, NOMBRES, APELLIDOS, NACIONALIDAD, EMAIL, TELEFONO) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        int idGenerado = -1;
        
        // Usamos try-with-resources para asegurar que la conexión y el PreparedStatement se cierren automáticamente
        try (Connection conn = DBConexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) { 
            
            // 2. Asignar los valores a los parámetros (?)
            ps.setString(1, turista.getDocumentoIdentidad());
            ps.setString(2, turista.getTipoDocumento());
            ps.setString(3, turista.getNombres());
            ps.setString(4, turista.getApellidos());
            ps.setString(5, turista.getNacionalidad());
            ps.setString(6, turista.getEmail());
            ps.setString(7, turista.getTelefono());

            // 3. Ejecutar la inserción
            ps.executeUpdate();
            
            // 4. Recuperar el ID (BIGSERIAL) generado por PostgreSQL
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    idGenerado = rs.getInt(1); // El ID está en la primera columna
                    turista.setIdTurista(idGenerado); // Opcional: actualiza el objeto Java
                }
            }
        }
        return idGenerado;
    }
}
