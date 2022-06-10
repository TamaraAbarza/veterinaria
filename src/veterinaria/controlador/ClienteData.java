package veterinaria.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import veterinaria.modelo.Cliente;

public class ClienteData {

    private Connection con = null;

    public ClienteData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    public boolean guardarCliente(Cliente cliente) {
        boolean insert = true;
        String sql = "INSERT INTO cliente (dni, nombre, apellido, telefono, direccion, contactoAlternativo, activo)  VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setLong(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setLong(6, cliente.getContactoAlternativo());
            ps.setInt(7, cliente.isActivo() ? 1 : 0);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

//            JOptionPane.showMessageDialog(null, " Se agregó al cliente " + cliente + " correctamente");

            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
            } else {

//                JOptionPane.showMessageDialog(null, "Error al intentar agregar al cliente");
                insert = false;
            }
            ps.close();
        } catch (SQLException ex) {
            insert=false;
                JOptionPane.showMessageDialog(null, "Error. El dni ingresado ya existe, corresponde al cliente " + cliente+ ": "+ex);
        }
        return insert;
    }

    public Cliente buscarCliente(int idCliente) {
        Cliente cliente = null;

        String sql = "SELECT * FROM cliente WHERE activo =1 AND idCliente =?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCliente);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDireccion(rs.getString("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setContactoAlternativo(rs.getLong("contactoAlternativo"));
                cliente.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde buscar cliente " + ex);
        }

        if (cliente != null) {
//            JOptionPane.showMessageDialog(null, "Se encontró al cliente " + cliente);
        } else {
//            JOptionPane.showMessageDialog(null, "Error, no existe el cliente que intenta buscar");
        }
        return cliente;
    }

    public boolean borrarCliente(int idCliente) {

        boolean borrar = false;
        String sql = "UPDATE cliente SET activo =0 WHERE idCliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCliente);
            int rs = ps.executeUpdate();

            if (rs > 0) {
//                JOptionPane.showMessageDialog(null, "Se borró al cliente ");
                borrar = true;
            } else {
//                JOptionPane.showMessageDialog(null, "Error, el cliente no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde borrar cliente " + ex);
        }
        return borrar;
    }

    public boolean modificarCliente(Cliente cliente) {

        boolean modificar = false;
        String sql = "UPDATE cliente SET dni=?, nombre=?, apellido=?, telefono=?, direccion=?, contactoAlternativo=?, activo=? WHERE idCliente=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setLong(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setLong(6, cliente.getContactoAlternativo());
            ps.setInt(7, cliente.isActivo() ? 1 : 0);
            ps.setInt(8, cliente.getIdCliente());

            int rs = ps.executeUpdate();

            if (rs > 0) {
                modificar = true;
//                JOptionPane.showMessageDialog(null, "Se modifico correctamente al cliente " + cliente);
            } else {
//                JOptionPane.showMessageDialog(null, "Error, no se pudo modificar al cliente. El cliente que intenta modifcar no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde modificar cliente " + ex);
        }
        return modificar;
    }

    public boolean activarCliente(int idCliente) {

        boolean activar = false;
        String sql = "UPDATE cliente SET activo =1 WHERE idCliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCliente);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                activar = true;
//                JOptionPane.showMessageDialog(null, "Se activo el estado del cliente ");
            } else {
//                JOptionPane.showMessageDialog(null, "Error, el cliente no existe");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar cliente " + ex);

        }
        return activar;
    }

    public List<Cliente> obtenerClientes() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT * FROM cliente WHERE activo=1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Cliente cliente;
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDireccion(rs.getString("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setContactoAlternativo(rs.getLong("contactoAlternativo"));
                cliente.setActivo(rs.getBoolean("activo"));

                clientes.add(cliente);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }

        return clientes;
    }

    //EXTRAS
    public Cliente buscarClienteDni(int dni) {
        Cliente cliente = null;

        String sql = "SELECT * FROM cliente WHERE activo =1 AND dni =?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setContactoAlternativo(rs.getLong("contactoAlternativo"));
                cliente.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde buscar cliente por dni" + ex);
        }

        if (cliente != null) {
//            JOptionPane.showMessageDialog(null, "Se encontró al cliente " + cliente);
        } else {
//            JOptionPane.showMessageDialog(null, "Error, no existe el cliente que intenta buscar");
        }
        return cliente;
    }
    
    public List<Cliente> obtenerClientesInactivos() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT * FROM cliente WHERE activo=0;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Cliente cliente;
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDireccion(rs.getString("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setContactoAlternativo(rs.getLong("contactoAlternativo"));
                cliente.setActivo(rs.getBoolean("activo"));

                clientes.add(cliente);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }

        return clientes;
    }
}
