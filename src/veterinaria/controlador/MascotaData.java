package veterinaria.controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veterinaria.modelo.Cliente;
import veterinaria.modelo.Mascota;

public class MascotaData {

    private Connection con = null;
    private Conexion conexion;

    public MascotaData(Conexion conexion) {
        try {
            this.conexion = conexion;
            this.con = conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la conexion");
        }
    }

    public boolean guardarMascota(Mascota mascota) {
        boolean insc = false;
        try {
            String sql = "INSERT INTO mascota (alias, sexo, especie, raza, colorPelo, fechaNac, idCliente, activo) VALUES ( ? , ? , ?, ?, ?, ?, ?, ?);";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelo());
            ps.setDate(6, Date.valueOf(mascota.getFechaNac()));
            ps.setInt(7, mascota.getCliente().getIdCliente());
            ps.setInt(8, mascota.isActivo() ? 1 : 0);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mascota.setIdMascota(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Se registro la mascota correctamente");
                insc = true;
            } else {
//                JOptionPane.showMessageDialog(null, "No se pudo obtener el id luego de insertar una mascota");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar la mascota: " + ex.getMessage());
        }
        return insc;
    }

    public Mascota buscarMascota(int idMascota) {
        Mascota mascota = null;

        String sql = "SELECT * FROM mascota WHERE activo =1 AND idMascota =?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMascota);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
//                mascota.setPesoMedio(rs.getDouble("pesoMedio"));
//                mascota.setPesoActual(rs.getDouble("pesoActual"));
                Cliente c = buscarCliente(rs.getInt("idCliente"));
                mascota.setCliente(c);
                mascota.setActivo(rs.getBoolean("activo"));
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde buscar mascota " + ex);
        }
//
//        if (mascota != null) {
////            JOptionPane.showMessageDialog(null, "Se encontró a la mascota " + mascota);
//        } else {
//            JOptionPane.showMessageDialog(null, "Error, no existe la mascota que intenta buscar");
//        }
        return mascota;
    }

    public boolean borrarMascota(int idMascota) {

        boolean borrar = false;
        String sql = "UPDATE mascota SET activo =0 WHERE idMascota=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMascota);
            int rs = ps.executeUpdate();

            if (rs > 0) {
//                JOptionPane.showMessageDialog(null, "Se borró a la mascota ");
                borrar = true;
            } else {
//                JOptionPane.showMessageDialog(null, "Error, la mascota no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde borrar mascota " + ex);
        }
        return borrar;
    }

    public boolean modificarMascota(Mascota mascota) {

        boolean modificar = false;
        String sql = "UPDATE mascota SET alias=?, sexo=?, especie=?, raza=?, colorPelo=?, fechaNac=?, idCliente=?, activo=? WHERE idMascota=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelo());
            ps.setDate(6, Date.valueOf(mascota.getFechaNac()));
//            ps.setDouble(7, mascota.getPesoMedio());
//            ps.setDouble(8, mascota.getPesoActual());
            ps.setInt(7, mascota.getCliente().getIdCliente());
            ps.setInt(8, mascota.isActivo() ? 1 : 0);
            ps.setInt(9, mascota.getIdMascota());

            int rs = ps.executeUpdate();

            if (rs > 0) {
                modificar = true;
//                JOptionPane.showMessageDialog(null, "Se modifico correctamente a la mascota " + mascota);
            } else {
//                JOptionPane.showMessageDialog(null, "Error, no se pudo modificar la mascota. La mascota que intenta modifcar no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde modificar mascota " + ex);
        }
        return modificar;
    }

    public boolean activarMascota(int idMascota) {

        boolean activar = false;
        String sql = "UPDATE mascota SET activo =1 WHERE idMascota=?";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMascota);
            int rs = ps.executeUpdate();

            if (rs > 0) {
                activar = true;
//                JOptionPane.showMessageDialog(null, "Se activo el estado de la mascota");
            } else {
//                JOptionPane.showMessageDialog(null, "Error, la mascota no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar mascota " + ex);
        }

        return activar;
    }

    //LISTA
    public List<Mascota> obtenerMascotas() {
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        try {
            String sql = "SELECT * FROM mascota WHERE activo=1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Mascota mascota;
            while (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
//                mascota.setPesoMedio(rs.getDouble("pesoMedio"));
//                mascota.setPesoActual(rs.getDouble("pesoActual"));
                Cliente c = buscarCliente(rs.getInt("idCliente"));
                mascota.setCliente(c);
                mascota.setActivo(rs.getBoolean("activo"));
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }

        return mascotas;
    }

    //LISTAS DE MASCOTAS DE UN DUENIO
    public List<Mascota> obtenerMascotasPorDuenio(int idCliente) {
        List<Mascota> mascotas = new ArrayList<Mascota>();
        try {
            String sql = "SELECT * FROM mascota WHERE activo=1 AND idCliente =?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            Mascota mascota;
            while (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
//                mascota.setPesoMedio(rs.getDouble("pesoMedio"));
//                mascota.setPesoActual(rs.getDouble("pesoActual"));
                Cliente c = buscarCliente(rs.getInt("idCliente"));
                mascota.setCliente(c);
                mascota.setActivo(rs.getBoolean("activo"));
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }

        return mascotas;
    }

    public List<Mascota> obtenerMascotasInativas() {
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        try {
            String sql = "SELECT * FROM mascota WHERE activo=0;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Mascota mascota;
            while (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelo(rs.getString("colorPelo"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
//                mascota.setPesoMedio(rs.getDouble("pesoMedio"));
//                mascota.setPesoActual(rs.getDouble("pesoActual"));
                Cliente c = buscarCliente(rs.getInt("idCliente"));
                mascota.setCliente(c);
                mascota.setActivo(rs.getBoolean("activo"));
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        return mascotas;
    }

    public Cliente buscarCliente(int idCliente) {
        ClienteData cd = new ClienteData(conexion);
        return cd.buscarCliente(idCliente);
    }

}
