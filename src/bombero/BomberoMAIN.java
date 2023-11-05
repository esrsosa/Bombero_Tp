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
<<<<<<< HEAD
        
 SiniestrosData sd = new SiniestrosData();
        Siniestro siniestro = new Siniestro(1);
//siniestro.setTipoSiniestro(TipoSiniestro.INCENDIO); // Ejemplo de configuración de datos
siniestro.setFechaSiniestro(LocalDate.now()); // Ejemplo de configuración de fecha
siniestro.setCoordenadaX(10); // Ejemplo de coordenadas X
siniestro.setCoordenadaY(20); // Ejemplo de coordenadas Y
siniestro.setDetalles("Detalles del siniestro"); // Ejemplo de detalles
siniestro.setCodigoBrigada(1); // Ejemplo de código de brigada
=======
        Siniestro s1 = new Siniestro(Especialidad.Incendios, LocalDate.now().minusDays(2), 33, 02, "xx", 1);
        SiniestrosData s = new SiniestrosData();
        s.agregarSiniestro(s1);
        List<Siniestro> siniestrosRecientes = s.listarSiniestrosRecientes();
        for (Siniestro siniestro : siniestrosRecientes) {
            System.out.println(siniestro);
        }
>>>>>>> 1509e1e8bdd00463bfa898e672f5a2e459ac22b7

//------------------------------------------------------------------------------
//        BrigadaData b = new BrigadaData();
//        CuartelData c = new CuartelData();
//  
//        if (c.codCuartelExiste(2)&& b.codBrigadaExiste(5)) {
//            b.asignarBrigadaAcuartel(5, 2);
//            System.out.println("exito");
//        } else {
//            System.out.println("error");
//        }
        //Brigada b1 = new Brigada(5, "sa", Especialidad.Rescate);
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
//        Siniestro s1 = new Siniestro(4, Especialidad.Incendios, LocalDate.now().minusDays(2), 33, 02, "xx", 2);
//        SiniestrosData s = new SiniestrosData();
//        s.agregarSiniestro(s1);
//        List<Siniestro> siniestrosRecientes = s.listarSiniestrosRecientes();
//        for (Siniestro siniestro : siniestrosRecientes) {
//            System.out.println(siniestro); 
//        }
//        BomberoData bombero = new BomberoData();
//     bombero.darBajaPorInactividad(1);
//      //  BomberoData bombero = new BomberoData();
//        Bombero b1 = new Bombero("1", "121212", "Ema raul", "0+", (LocalDate.of(2002, 07, 18)), "2665", 1, true);
//        bombero.actualizarDatos(b1);
//      //  falta agregar brigada y cuertel
//      ///  BomberoData bombero=new BomberoData();
//     //   Bombero b1=new Bombero(1,"44360403","Ema Sosa","0+",(LocalDate.of(2002, 07, 18)),"2665",1, true);
//        bombero.agregarBombero(b1);
//        System.out.println(b1);
//        CuartelData c = new CuartelData();
//        Cuartel cuartel=new Cuartel(1,"la campora", "casa rosada", 345,223, "25555", "aaaaaaaaaaaa");
//        c.agregarCuartel(cuartel);
//            // BrigadaData b1=new BrigadaData();
//             Brigada brigada=new Brigada(2, "alfa", Especialidad.Rescate, true, 1);
//           //  b1.agregarCuartel(brigada);
//     //   SiniestrosData s1 = new SiniestrosData();
//      //  Siniestro siniestro = new Siniestro(1, Especialidad.Incendios, (LocalDate.of(2002, 07, 18)), 233, 444, "perro salchicha", (LocalDate.of(2002, 07, 18)), 7, 1);
//       // s1.agregarSiniestro(siniestro);
    }

}
