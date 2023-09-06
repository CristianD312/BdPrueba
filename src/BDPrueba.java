
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BDPrueba {

    // Datos de conexión a la base de datos MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/prueba2";
    private static final String USUARIO = "root";
    private static final String PASS = "";

    public static void main(String[] args) throws SQLException {
        try {
            DriverManager.getConnection(URL, USUARIO, PASS);
            JOptionPane.showMessageDialog(null, "Conexión realizada con exito!: ");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudo mostrar los registros, error: " + e.toString());

        }

    }

}
