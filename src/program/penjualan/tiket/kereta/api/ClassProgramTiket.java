/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.penjualan.tiket.kereta.api;

/**
 *
 * @author Ardy Sendleep
 */
public class ClassProgramTiket {
    public String Nama;
    public String KodeKereta;
    public String NamaKereta;
    public String Jurusan;
    public String JenisTiket;
    public int HargaTiket;
    public int JumlahTiket;
    public int Totalbayar;
    
    @Override
    public String toString(){     
        return Nama +"-" + KodeKereta +"-" + NamaKereta + "-" + Jurusan +"-" + JenisTiket + "-" + HargaTiket+"-" + JumlahTiket + "-" + Totalbayar;
    }
  }

