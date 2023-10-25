/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombero;

import BomberoAcceesoDatos.BomberoData;
import BomberosEntidades.Bombero;
import java.time.LocalDate;

/**
 *
 * @author Emanuel Sosa
 */
public class BomberoMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BomberoData bombero=new BomberoData();
        Bombero b1=new Bombero(1,"44360403","Ema Sosa","0+",(LocalDate.of(2002, 07, 18)),"2665",22, true);
        bombero.agregarBombero(b1);
        System.out.println("b1");
        }
}
