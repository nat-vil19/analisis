package Modelo.DAO;

import Modelo.Boleto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoletoDAO {
    public int registrarBoleto(Boleto boleto) throws SQLException, Exception {
        // En este INSERT, NO se incluye ID_BOLETO, CODIGO_QR ni FECHA_EMISION (lo genera el trigger/BD)
        String sql = "INSERT INTO Boleto (ID_TURISTA, ID_CIRCUITO, ID_HORARIO, FECHA_VISITA, PRECIO, TIPO_BOLETO) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";
        
        int idGenerado = -1;

        try (Connection conn = DBConexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) { 
            
            // 1. Asignar los valores del objeto Boleto al PreparedStatement
            ps.setLong(1, boleto.getIdTurista());
            ps.setLong(2, boleto.getIdCircuito());
            ps.setLong(3, boleto.getIdHorario());
            ps.setDate(4, new java.sql.Date(boleto.getFechaVisita().getTime()));
            ps.setDouble(5, boleto.getPrecio());
            ps.setString(6, boleto.getTipoBoleto());

            // 2. Ejecutar y recuperar el ID generado
            ps.executeUpdate();
            
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    idGenerado = rs.getInt(1); 
                }
            }
        }
        return idGenerado;
    }
}
