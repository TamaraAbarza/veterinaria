package veterinaria;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import veterinaria.controlador.ClienteData;
import veterinaria.controlador.Conexion;
import veterinaria.controlador.MascotaData;
import veterinaria.controlador.TratamientoData;
import veterinaria.controlador.VisitaData;
import veterinaria.modelo.Cliente;
import veterinaria.modelo.Mascota;
import veterinaria.modelo.Tratamiento;
import veterinaria.modelo.Visita;

public class VeterinariaTest {

    public static void main(String[] args) {

        try {

            Conexion conexion = new Conexion();

            ClienteData clienteData = new ClienteData(conexion);
            MascotaData mascotaData = new MascotaData(conexion);
            TratamientoData tratamientoData = new TratamientoData(conexion);
            VisitaData visitaData = new VisitaData(conexion);

////***********************************************************************************************************************
//            //PRUEBA DE CLIENTE DATA
//            Cliente cliente1 = new Cliente(123, "Tamara", "Abarza", 2664340080L, "Quinto centenario", 2665456789L, true);
//            Cliente cliente2 = new Cliente(41566432, "Luciano", "Cejas", 2664534322L, "falucho 543", 2665456780L, true);
//            Cliente cliente3 = new Cliente(41321456, "Tania", "Aguero", 2664334455L, "falucho 543", 2664234567L, true);
//
//            //AGREGAR CLIENTE
//            clienteData.guardarCliente(cliente1);
//            clienteData.guardarCliente(cliente2);
//            clienteData.guardarCliente(cliente3);
//
//            //BUSCAR CLIENTE
//            clienteData.buscarCliente(7);
//            //buscar cliente que no existe
//            clienteData.buscarCliente(334);
//
//            //BUSCAR CLIENTE POR DNI
//            System.out.println(clienteData.buscarClienteDni(123));
//
//            //BORRAR CLIENTE
//            clienteData.borrarCliente(5);
//            //borrar cliente que no existe
//            clienteData.borrarCliente(323);
//
//            //ACTIVAR CLIENTE
//            clienteData.activarCliente(5);
//
//            //MODIFICAR CLIENTE
//            Cliente cModificar = new Cliente(7, 41321456, "Tania", "Aguero", 2664334455L, "Barrio atte1", 2664234567L, true);
//            clienteData.modificarCliente(cModificar);
//
//            //LISTA OBTENER CLIENTES
//            List<Cliente> clientes = clienteData.obtenerClientes();
//            System.out.println(clientes);

////* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//            //PRUEBA MASCOTA DATA
//            Cliente tamara = clienteData.buscarCliente(5);
//            Cliente tania = clienteData.buscarCliente(7);
//            Mascota mascota1 = new Mascota("Chester", "hembra", "perro", "pointer inglés", "chocolate con blanco", LocalDate.of(2019, 12, 5), tamara, true);
//            Mascota mascota2 = new Mascota(4, "Chester", "macho", "perro", "pointer inglés", "chocolate con blanco", LocalDate.of(2019, 12, 5), tamara, true);
//            Mascota mascota3 = new Mascota("Ambar", "hembra", "perro", "mestiza", "marron claro", LocalDate.of(2020, 6, 12), tamara, true);
//            Mascota mascota4 = new Mascota("Luna", "hembra", "gato", "siames", "blanco", LocalDate.of(2015, 1, 21), tania, true);
//
//            //AGREGAR MASCOTA
//            mascotaData.guardarMascota(mascota1);
//            mascotaData.guardarMascota(mascota3);
//            mascotaData.guardarMascota(mascota4);
//
//            //BUSCAR MASCOTA
//            mascotaData.buscarMascota(4);
//            //buscar mascota que no existe
//            mascotaData.buscarMascota(134);
//
//            //MOFICAR MASCOTA
//            mascotaData.modificarMascota(mascota2);
//
//            //BORRAR MASCOTA
//            mascotaData.borrarMascota(6);
//            //borrar mascota que no existe
//            mascotaData.borrarMascota(234);
//
//            //ACTIVAR MASCOTA
//            mascotaData.activarMascota(6);
//
//            //LISTA DE MASCOTAS
//            //OBTENER TODAS LAS MASCOTAS
//            List<Mascota> mascotas = mascotaData.obtenerMascotas();
//            System.out.println(mascotas);
//
//            //OBTENER MASCOTAS DE UN DUEÑO
//            List<Mascota> m = mascotaData.obtenerMascotasPorDuenio(tamara);
//            System.out.println(m);

////* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//            //PRUEBA TRATAMIENTO
//            Tratamiento t1 = new Tratamiento("se aplico la vacuna parainfluenza canina", "Nobivac", 1200, "vacunacion", true);
//            Tratamiento t2 = new Tratamiento("se aplicó un desparasitante en gotas", "Dermovital", 500, "desparacitacion", true);
//
//            //GUARDAR UN TRATAMIENTO
//            tratamientoData.guardarTratamiento(t1);
//            tratamientoData.guardarTratamiento(t2);
//
//            //DAR DE BAJA UN TRATAMIENTO 
//            tratamientoData.bajaTratamiento(3);
//
//            //ALTA TRATAMIENTO
//            tratamientoData.activarTratamiento(3);
//
//            //MODIFICAR TRATAMIENTO
//            Tratamiento t3 = new Tratamiento(3, "se aplicó la vacuna parainfluenza canina", "Nobivac", 1600, "vacunación", true);
//            tratamientoData.modificarTratamiento(t3);
//
//            //BUSCAR TRATAMIENTO
//            //me permite despues usarlo cuando listo las visitas de tratamientos activos e inactivos
//            tratamientoData.buscarTratamiento(3);
//
//            //BUSCAR SOLO TRATAMIENTOS ACTIVOS
//            tratamientoData.buscarTratamientoActivo(4);
//
//            //Lista de tratamientos
//            List<Tratamiento> t = tratamientoData.obtenerTratamientos();
//            System.out.println(t);
//
////*******************************************************************************************************************************************************

////PRUEBA VISITA
//            Mascota m1 = mascotaData.buscarMascota(4);
//            Mascota m2 = mascotaData.buscarMascota(5);
//            Tratamiento t4 = tratamientoData.buscarTratamiento(3);
//            Tratamiento t5 = tratamientoData.buscarTratamiento(4);
//            Tratamiento tNuevo= new Tratamiento("se le realizó un baño, corte de pelo y un tratamiento para pulgas", "Osspret", 1500, "baño y corte de pelo", true);
//            tratamientoData.guardarTratamiento(tNuevo);
//            Tratamiento t6= tratamientoData.buscarTratamiento(5);

            
//            Visita v1 = new Visita(m1, LocalDate.of(2022, 5, 7), "adelgazamiento", 20, t5, true);
//            Visita v2 = new Visita(m2, LocalDate.of(2022, 4, 15), "no presenta síntomas", 12, t4, true);
//            Visita v3 = new Visita(m1, LocalDate.of(2021, 10, 21), "no presenta síntomas", 23, t4, true);
//            Visita v4 = new Visita(10, m1, LocalDate.of(2021, 10, 20), "no presenta síntomas", 23, t5, true);
//            Visita v5 = new Visita(m2, LocalDate.of(2019, 5, 7), "pulgas", 10, t6, true);

//            //GUARDAR VISITA
//            visitaData.guardarVisita(v1);
//            visitaData.guardarVisita(v2);
//            visitaData.guardarVisita(v3);
//            visitaData.guardarVisita(v5);

            //BORRAR VISITA
//            visitaData.borrarVisita(m2.getIdMascota(), t6.getIdTratamiento());
            
            //MODIFICAR VISITA
//            visitaData.modificarVisita(v4);

//            // LISTA OBTENER VISITAS
//            List<Visita> visitas = visitaData.obtenerVisitas();
//            System.out.println(visitas);
//
//            //LISTA OBTENER VISITAS POR MASCOTA
//            List<Visita> vxm = visitaData.obtenerVisitasxMascota(5);
//            System.out.println(vxm);

//            //LISTA OBTENER VISITAS POR TRATAMIENTO
//            List<Visita> visitaxTrat = visitaData.obtenerVisitasxTratamiento("desp");
//            System.out.println(visitaxTrat);

//              //OBTENER VISITAS CON TRATAMIENTO ACTIVO
//            List<Visita> visitaActiva= visitaData.obtenerVisitasEActivo();
//            System.out.println(visitaActiva);

//              //OBTENER VISITAS POR MASCOTA CON TRATAMIENTO ACTIVO
//            List<Visita> visitaActivaMasc= visitaData.obtenerVisitasxMascotaEActivo(4);
//            System.out.println(visitaActivaMasc);

//            //PRUEBO EL PESO PROMEDIO
//            System.out.println(visitaData.calcularPesoMedio(4));
//            
//            //PRUEBO EL PESO ACTUAL
//            System.out.println(visitaData.PesoActual(4));

//VISITAS POR FECHA
//            List<Visita> v = visitaData.obtenerVisitasxFecha("2022-04-15","2022-06-02");
//            System.out.println(v);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VeterinariaTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
