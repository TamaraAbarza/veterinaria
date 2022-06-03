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
import veterinaria.modelo.Mascota;
import veterinaria.modelo.Tratamiento;
import veterinaria.modelo.Visita;

public class VisitaData {

    private Connection con = null;
    private Conexion conexion;

    public VisitaData(Conexion conexion) {
        try {
            this.conexion = conexion;
            this.con = conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la conexion");
        }
    }

    public boolean guardarVisita(Visita visita) {
        boolean aux = false;
        try {
            String sql = "INSERT INTO visita (idMascota, fechaVisita, detalle, peso, idTratamiento, activo) VALUES ( ? , ? , ? , ? , ? , ?);";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setDate(2, Date.valueOf(visita.getFechaVisita()));
            ps.setString(3, visita.getDetalle());
            ps.setDouble(4, visita.getPeso());
            ps.setInt(5, visita.getTratamiento().getIdTratamiento());
            ps.setInt(6, visita.isActivo() ? 1 : 0);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                visita.setIdVisita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardó la visita correctamente");
                MascotaData md = new MascotaData(conexion);
                aux = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar la visita");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error desde guardar visita: " + ex.getMessage());
        }
        return aux;
    }

    public boolean borrarVisita(int idMascota, int idTratamiento) {

        boolean borrar = false;
        try {
            String sql = "DELETE FROM visita WHERE idMascota =? and idTratamiento =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMascota);
            ps.setInt(2, idTratamiento);

            int rs = ps.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se borró la visita ");
                borrar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error, no se pudo borrar la visita ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde borrar visita: " + ex);
        }
        return borrar;
    }

    public boolean modificarVisita(Visita visita) {

        boolean modificar = false;
        String sql = "UPDATE visita SET idMascota=?, fechaVisita=?, detalle=?, peso=?, idTratamiento=?, activo=? WHERE idVisita=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, visita.getMascota().getIdMascota());
            ps.setDate(2, Date.valueOf(visita.getFechaVisita()));
            ps.setString(3, visita.getDetalle());
            ps.setDouble(4, visita.getPeso());
            ps.setInt(5, visita.getTratamiento().getIdTratamiento());
            ps.setInt(6, visita.isActivo() ? 1 : 0);
            ps.setInt(7, visita.getIdVisita());

            int rs = ps.executeUpdate();

            if (rs > 0) {
                modificar = true;
                JOptionPane.showMessageDialog(null, "Se modifico correctamente la visita");
            } else {
                JOptionPane.showMessageDialog(null, "Error, no se pudo modificar la visita. La visita que intenta modifcar no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde modificar visita " + ex);
        }
        return modificar;
    }

    public List<Visita> obtenerVisitas() {
        List<Visita> visitas = new ArrayList<Visita>();
        try {

            String sql = "SELECT * FROM visita ORDER BY fechaVisita ASC;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Visita visita;

            while (rs.next()) {
                visita = new Visita();

                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(buscarMascota(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(buscarTratamiento(rs.getInt("idTratamiento")));
                visita.setActivo(rs.getBoolean("activo"));

                visitas.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error desde obtener visitas: " + ex.getMessage());
        }

        return visitas;
    }

    public List<Visita> obtenerVisitasxMascota(int idMascota) {
        List<Visita> visitas = new ArrayList<Visita>();
        try {

            String sql = "SELECT * FROM visita WHERE idMascota = ? ORDER BY fechaVisita ASC;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();
            Visita visita;

            while (rs.next()) {
                visita = new Visita();

                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(buscarMascota(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(buscarTratamiento((rs.getInt("idTratamiento"))));
                visita.setActivo(rs.getBoolean("activo"));

                visitas.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error desde obtener visitas por mascotas: " + ex.getMessage());
        }

        return visitas;
    }

    public List<Visita> obtenerVisitasxTratamiento(String tipoTratamiento) {
        List<Visita> visitas = new ArrayList<Visita>();
        try {
            String sql = "SELECT * FROM visita, tratamiento WHERE visita.idTratamiento = tratamiento.idTratamiento AND tratamiento.tipoTratamiento LIKE ? ORDER BY fechaVisita ASC;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + tipoTratamiento + "%");
            ResultSet rs = ps.executeQuery();
            Visita visita;

            while (rs.next()) {
                visita = new Visita();

                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(buscarMascota(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(buscarTratamiento((rs.getInt("idTratamiento"))));
                visita.setActivo(rs.getBoolean("activo"));

                visitas.add(visita);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error desde obtener visitas por tratamiento: " + ex.getMessage());
        }

        return visitas;
    }

    public List<Visita> obtenerVisitasEActivo() {
        List<Visita> visitas = new ArrayList<Visita>();
        try {

            String sql = "SELECT * FROM visita WHERE activo=1 ORDER BY fechaVisita ASC;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Visita visita;

            while (rs.next()) {
                visita = new Visita();

                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(buscarMascota(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(buscarTratamientoActivo(rs.getInt("idTratamiento")));
                visita.setActivo(rs.getBoolean("activo"));

                visitas.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error desde obtener visitas: " + ex.getMessage());
        }

        return visitas;
    }

    public List<Visita> obtenerVisitasxMascotaEActivo(int idMascota) {
        List<Visita> visitas = new ArrayList<Visita>();
        try {

            String sql = "SELECT * FROM visita WHERE idMascota = ? AND activo=1  ORDER BY fechaVisita ASC;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();
            Visita visita;

            while (rs.next()) {
                visita = new Visita();

                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setMascota(buscarMascota(rs.getInt("idMascota")));
                visita.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                visita.setDetalle(rs.getString("detalle"));
                visita.setPeso(rs.getDouble("peso"));
                visita.setTratamiento(buscarTratamientoActivo((rs.getInt("idTratamiento"))));
                visita.setActivo(rs.getBoolean("activo"));

                visitas.add(visita);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error desde obtener visitas por mascotas: " + ex.getMessage());
        }

        return visitas;
    }

    public Mascota buscarMascota(int idMascota) {
        MascotaData md = new MascotaData(conexion);
        return md.buscarMascota(idMascota);
    }

    public Tratamiento buscarTratamiento(int idTratamiento) {
        TratamientoData td = new TratamientoData(conexion);
        return td.buscarTratamiento(idTratamiento);
    }

    public Tratamiento buscarTratamientoActivo(int idTratamiento) {
        TratamientoData td = new TratamientoData(conexion);
        return td.buscarTratamientoActivo(idTratamiento);
    }

    //peso promedio
    public double calcularPesoMedio(int idMascota) {
        ArrayList<Double> pesos = new ArrayList<Double>();
        double peso;
        try {

            String sql = "SELECT peso FROM visita WHERE idMascota = ? ORDER BY fechaVisita DESC LIMIT 10;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                peso = (rs.getDouble("peso"));
                pesos.add(peso);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error desde obtener visitas por mascotas: " + ex.getMessage());
        }
        peso = 0;
        for (Double it : pesos) {
            peso += it;
        }
        return peso = peso / pesos.size();

    }

    public double PesoActual(int idMascota) {
        double peso = 0;
        try {

            String sql = "SELECT peso FROM visita WHERE idMascota = ? ORDER BY fechaVisita DESC LIMIT 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                peso = (rs.getDouble("peso"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error desde obtener peso actual " + ex.getMessage());
        }

        return peso;

    }
}
