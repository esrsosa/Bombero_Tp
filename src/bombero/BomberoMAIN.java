                                                   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombero;                                              

import BomberoAcceesoDatos.BomberoData;
import BomberoAcceesoDatos.BrigadaData;
import BomberoAcceesoDatos.CuartelData;
import BomberoAcceesoDatos.SiniestrosData;
import BomberosEntidades.Bombero;
import BomberosEntidades.Brigada;
import BomberosEntidades.Cuartel;
import BomberosEntidades.Especialidad;
import BomberosEntidades.Siniestro;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Emanuel Sosa
 */
public class BomberoMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//                BrigadaData b = new BrigadaData();
//                CuartelData c1=new CuartelData();
//                Cuartel c= new Cuartel("Patos salvajes", "Plaza pringles", 23, 32, "2665032890", "s");
//                Brigada br=new Brigada("Perros salchichas", Especialidad.Derrumbes,c );
//                b.agregarBrigada(br);
//        
        
//         SiniestrosData siniestrosData = new SiniestrosData();
//
//        // Llama al método para obtener todos los siniestros ordenados por fecha de resolución
//        List<Siniestro> siniestrosOrdenados = siniestrosData.listarTodosLosSiniestrosOrdenadosPorFechaResolucion();
//
//        // Imprime o utiliza la lista de siniestros según tus necesidades
//        for (Siniestro siniestro : siniestrosOrdenados) {
//            System.out.println("Código: " + siniestro.getCodigo());
//            System.out.println("Tipo: " + siniestro.getTipoSiniestro());
//            System.out.println("Fecha Siniestro: " + siniestro.getFechaSiniestro());
//            System.out.println("Coordenada X: " + siniestro.getCoordenadaX());
//            System.out.println("Coordenada Y: " + siniestro.getCoordenadaY());
//            System.out.println("Detalles: " + siniestro.getDetalles());
//            System.out.println("Código Brigada: " + siniestro.getCodigoBrigada());
//        //    System.out.println("Fecha Resolución: " + siniestro.getFechaResolucion());
//           // System.out.println("Calificación: " + siniestro.getCalificacion());
//            System.out.println("------------------------------------");
//        }
//        
        
        

//         // Supongamos que tienes una instancia de ResolucionDeSiniestro
//        SiniestrosData resolucionDeSiniestro = new SiniestrosData();
//
//        // Crear un objeto Siniestro con datos de prueba
//        Siniestro siniestroPrueba = new Siniestro();
//        siniestroPrueba.setCodigo(1); // Supongamos que el código del siniestro es 1
//        siniestroPrueba.setFechaResolucion(LocalDate.now()); // Fecha actual
//        siniestroPrueba.setCalificacion(5); // Puntuación de prueba
//
//    
//            // Llamar a la función marcarComoResuelto
//             resolucionDeSiniestro.marcarComoResuelto(siniestroPrueba);
//
//     
       

// SiniestrosData sd = new SiniestrosData();
//        Siniestro siniestro = new Siniestro(1);
////siniestro.setTipoSiniestro(TipoSiniestro.INCENDIO); // Ejemplo de configuración de datos
//siniestro.setFechaSiniestro(LocalDate.now()); // Ejemplo de configuración de fecha
//siniestro.setCoordenadaX(10); // Ejemplo de coordenadas X
//siniestro.setCoordenadaY(20); // Ejemplo de coordenadas Y
//siniestro.setDetalles("Detalles del siniestro"); // Ejemplo de detalles
//siniestro.setCodigoBrigada(1); // Ejemplo de código de brigada
//
// SiniestrosData sd = new SiniestrosData();
//        Siniestro siniestro = new Siniestro(1);
////siniestro.setTipoSiniestro(TipoSiniestro.INCENDIO); // Ejemplo de configuración de datos
//siniestro.setFechaSiniestro(LocalDate.now()); // Ejemplo de configuración de fecha
//siniestro.setCoordenadaX(10); // Ejemplo de coordenadas X
//siniestro.setCoordenadaY(20); // Ejemplo de coordenadas Y
//siniestro.setDetalles("Detalles del siniestro"); // Ejemplo de detalles
//siniestro.setCodigoBrigada(1); // Ejemplo de código de brigada
//
//
//        Siniestro s1 = new Siniestro(Especialidad.Incendios, LocalDate.now().minusDays(2), 33, 02, "xx", 2);
//        SiniestrosData s = new SiniestrosData();
//        s.agregarSiniestro(s1);
//        List<Siniestro> siniestrosRecientes = s.listarSiniestrosRecientes();
//        for (Siniestro siniestro : siniestrosRecientes) {
//            System.out.println(siniestro);
//        }
//        
////

//------------------------------------------------------------------------------
//        BrigadaData b = new BrigadaData();
//        CuartelData c = new CuartelData();
//  
//        if (c.codCuartelExiste(2)) {
//            b.asignarBrigadaAcuartel(5, 2);
//            System.out.println("exito");
//        } else {
//            System.out.println("error");
//        }
//        Brigada b1 = new Brigada(5, "sa", Especialidad.Rescate);
//        if (!b.codBrigadaExiste(b1.getCodBrigada())) {
//            b.agregarBrigada(b1);
//        }else{
//            System.out.println("ya existe ese codigo");
//        }
//        
//        List<Brigada> b2 = b.listarBrigadasLibres();
//        for (Brigada siniestro : b2) {
//            System.out.println(siniestro);
//        }
//        SiniestrosData s = new SiniestrosData();
//        System.out.println(s.codigoSiniestroExiste(2));
//----------------------------------------------------
//        BomberoData b1=new BomberoData();
//        Bombero b=new Bombero(1);
//        b1.eliminarBombero(b);
//-------------------------------------------------------- 
//        Siniestro s1 = new Siniestro(Especialidad.Incendios, LocalDate.now().minusDays(2), 33, 02, "xx", 2);
//        SiniestrosData s = new SiniestrosData();
//        s.agregarSiniestro(s1);
//        List<Siniestro> siniestrosRecientes = s.listarSiniestrosRecientes();
//        for (Siniestro siniestro : siniestrosRecientes) {
//            System.out.println(siniestro); 
//        }
//-------------------------------------------------------------------------------------------
       // BomberoData bombero = new BomberoData();
    // bombero.darBajaPorInactividad(1);
//        BomberoData bombero = new BomberoData();
//        Bombero b1 = new Bombero("1", "121212", "Emaraul", "0+", (LocalDate.of(2002, 07, 18)), "2665", 1, true);
//        bombero.actualizarDatos(b1);
//      //  falta agregar brigada y cuertel
//      ///  BomberoData bombero=new BomberoData();
//     //   Bombero b1=new Bombero(1,"44360403","Ema Sosa","0+",(LocalDate.of(2002, 07, 18)),"2665",1, true);
//        bombero.agregarBombero(b1);
//        System.out.println(b1);
//        CuartelData c = new CuartelData();
//        Cuartel cuartel=new Cuartel(1,"la campora", "casa rosada", 345,223, "25555", "aaaaaaaaaaaa");
//        c.agregarCuartel(cuartel);
//             BrigadaData b1=new BrigadaData();
//             Brigada brigada=new Brigada(2, "alfa", Especialidad.Derrumbes, 1);
//             b1.agregarBrigada(brigada);
//        SiniestrosData s1 = new SiniestrosData();
//        Siniestro siniestro = new Siniestro( Especialidad.Incendios, (LocalDate.of(2002, 07, 18)), 233, 444, "perro salchicha", 7);
//        s1.agregarSiniestro(siniestro);
//   }
}
}

