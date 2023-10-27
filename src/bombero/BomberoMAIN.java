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
BrigadaData b=new BrigadaData();
        System.out.println(b.listarBrigadasLibres());


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
//        BomberoData bombero = new BomberoData();
//        Bombero b1 = new Bombero(1, "121212", "Ema raul", "0+", (LocalDate.of(2002, 07, 18)), "2665", 1, true);
//        bombero.actualizarDatos(b1);
        //falta agregar brigada y cuertel
//        BomberoData bombero=new BomberoData();
//        Bombero b1=new Bombero(1,"44360403","Ema Sosa","0+",(LocalDate.of(2002, 07, 18)),"2665",1, true);
//        bombero.agregarBombero(b1);
//        System.out.println(b1);
//        CuartelData c = new CuartelData();
//        Cuartel cuartel=new Cuartel(1,"la campora", "casa rosada", 345,223, "25555", "aaaaaaaaaaaa");
//        c.agregarCuartel(cuartel);
//             BrigadaData b1=new BrigadaData();
//             Brigada brigada=new Brigada(2, "alfa", Especialidad.Rescate, true, 1);
//             b1.agregarCuartel(brigada);
//        SiniestrosData s1 = new SiniestrosData();
//        Siniestro siniestro = new Siniestro(1, Especialidad.Incendios, (LocalDate.of(2002, 07, 18)), 233, 444, "perro salchicha", (LocalDate.of(2002, 07, 18)), 7, 1);
//        s1.agregarSiniestro(siniestro);
    }
}
