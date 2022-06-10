package veterinaria.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veterinaria.modelo.Tratamiento;

public class TratamientoData {

    private Connection con = null;
    private Conexion conexion;

    public TratamientoData(Conexion conexion) {
        try {
            this.conexion = conexion;
            this.con = conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la conexion");
        }
    }

    public Tratamiento guardarTratamiento(Tratamiento tratamiento) {
        boolean aux = false;
        try {
            String sql = "INSERT INTO tratamiento (descripcion, medicamento, importe, tipoTratamiento, activo) VALUES ( ? , ? , ?, ?, ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tratamiento.getDescripcion());
            ps.setString(2, tratamiento.getMedicamento());
            ps.setDouble(3, tratamiento.getImporte());
            ps.setString(4, tratamiento.getTipoTratamiento());
            ps.setInt(5, tratamiento.isActivo() ? 1 : 0);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                tratamiento.setIdTratamiento(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Se guardó el tratamiento correctamente");
                aux = true;
            } else {
//                JOptionPane.showMessageDialog(null, "No se pudo guardar el tratamiento");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde guardar tratamiento: " + ex.getMessage());
        }

        return tratamiento;
    }

    public boolean bajaTratamiento(int idTratamiento) {

        boolean borrar = false;
        String sql = "UPDATE tratamiento SET activo =0 WHERE idTratamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idTratamiento);
            int rs = ps.executeUpdate();

            if (rs > 0) {
//                JOptionPane.showMessageDialog(null, "Se dió de baja el tratamiento");
                borrar = true;
            } else {
//                JOptionPane.showMessageDialog(null, "Error, el tratamiento ingresado no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde la baja de tratamiento " + ex);
        }
        return borrar;
    }
    
    public boolean activarTratamiento(int idTratamiento) {

        boolean aux = false;
        String sql = "UPDATE tratamiento SET activo =1 WHERE idTratamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idTratamiento);
            int rs = ps.executeUpdate();

            if (rs > 0) {
//                JOptionPane.showMessageDialog(null, "Se dió de alta el tratamiento");
                aux = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error, el tratamiento que intenta dar de alta no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde la alta de tratamiento " + ex);
        }
        return aux;
    }


    public boolean modificarTratamiento(Tratamiento tratamiento) {

        boolean modificar = false;
        String sql = "UPDATE tratamiento SET descripcion=?, medicamento=?, importe=?, tipoTratamiento=?, activo=? WHERE idTratamiento=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, tratamiento.getDescripcion());
            ps.setString(2, tratamiento.getMedicamento());
            ps.setDouble(3, tratamiento.getImporte());
            ps.setString(4, tratamiento.getTipoTratamiento());
            ps.setInt(5, tratamiento.isActivo() ? 1 : 0);
            ps.setInt(6, tratamiento.getIdTratamiento());

            int rs = ps.executeUpdate();

            if (rs > 0) {
                modificar = true;
//                JOptionPane.showMessageDialog(null, "Se modifico correctamente el tratamiento ");
            } else {
//                JOptionPane.showMessageDialog(null, "Error, no se pudo modificar el tratamiento.Verifique que el tratamiento que intenta ingresar corresponda a un tratamiento activo y existente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde modificar tratamiento " + ex);
        }
        return modificar;
    }
    
//consultar
    public Tratamiento buscarTratamiento(int idTratamiento) {
        Tratamiento tratamiento = null;

        String sql = "SELECT * FROM tratamiento WHERE idTratamiento =?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idTratamiento);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tratamiento = new Tratamiento();

                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setMedicamento(rs.getString("medicamento"));
                tratamiento.setImporte(rs.getDouble("importe"));
                tratamiento.setTipoTratamiento(rs.getString("tipoTratamiento"));
                tratamiento.setActivo(rs.getBoolean("activo"));
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde buscar tratamiento " + ex);
        }

        if (tratamiento != null) {
//            JOptionPane.showMessageDialog(null, "Se encontró el tratamiento " + tratamiento);
        } else {
//            JOptionPane.showMessageDialog(null, "Error, no existe el tratamiento que intenta buscar");
        }
        return tratamiento;
    }
  
//     public Tratamiento buscarTratamientoActivo(int idTratamiento) {
//        Tratamiento tratamiento = null;
//
//        String sql = "SELECT * FROM tratamiento WHERE activo =1 AND idTratamiento =?;";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, idTratamiento);
//
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                tratamiento = new Tratamiento();
//
//                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
//                tratamiento.setDescripcion(rs.getString("descripcion"));
//                tratamiento.setMedicamento(rs.getString("medicamento"));
//                tratamiento.setImporte(rs.getDouble("importe"));
//                tratamiento.setTipoTratamiento(rs.getString("tipoTratamiento"));
//                tratamiento.setActivo(rs.getBoolean("activo"));
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error de conexion desde buscar tratamiento " + ex);
//        }
//
//        if (tratamiento != null) {
//            JOptionPane.showMessageDialog(null, "Se encontró el tratamiento " + tratamiento);
//        } else {
//            JOptionPane.showMessageDialog(null, "Error, no existe el tratamiento que intenta buscar");
//        }
//        return tratamiento;
//    }
    //LISTA
    public List<Tratamiento> obtenerTratamientos() {
        ArrayList <Tratamiento> tratamientos = new ArrayList <Tratamiento>();

        try {
            String sql = "SELECT * FROM tratamiento WHERE activo =1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Tratamiento tratamiento;
            while (rs.next()) {
                tratamiento= new Tratamiento();
                
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setMedicamento(rs.getString("medicamento"));
                tratamiento.setImporte(rs.getDouble("importe"));
                tratamiento.setTipoTratamiento(rs.getString("tipoTratamiento"));
                tratamiento.setActivo(rs.getBoolean("activo"));
                tratamientos.add(tratamiento);
            }
            ps.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error al obtener la lista de tratamientos: " + ex.getMessage());
        }

        return tratamientos;
    }
    
     public List<Tratamiento> obtenerTratamientosInactivos() {
        ArrayList <Tratamiento> tratamientos = new ArrayList <Tratamiento>();

        try {
            String sql = "SELECT * FROM tratamiento WHERE activo =0;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Tratamiento tratamiento;
            while (rs.next()) {
                tratamiento= new Tratamiento();
                
                tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setMedicamento(rs.getString("medicamento"));
                tratamiento.setImporte(rs.getDouble("importe"));
                tratamiento.setTipoTratamiento(rs.getString("tipoTratamiento"));
                tratamiento.setActivo(rs.getBoolean("activo"));
                tratamientos.add(tratamiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener la lista de tratamientos: " + ex.getMessage());
        }

        return tratamientos;
    }
    
}
