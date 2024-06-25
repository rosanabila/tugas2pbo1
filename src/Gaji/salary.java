/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gaji;

/**
 *
 * @author User
 */
public class salary {
    
    private String golongan;
    private String status_menikah;
    private int Jumlah_anak;
    private int masa_kerja;
    private int gapok, tunjangan_menikah, tunjangan_anak, tunjangan_kerja; 
    
    public salary(){}
    // constructor
    public salary (String gol){
        this.golongan = gol;
    }
    
    public salary (String gol, String sts){
        this.golongan = gol;
        this.status_menikah = sts;
    }
    
    public salary (String gol, String sts, int ank){
        this.golongan = gol;
        this.status_menikah = sts;
        this.Jumlah_anak = ank;
    }
    
    public salary (String gol, String sts, int ank, int masa_kerja){
        this.golongan = gol;
        this.status_menikah = sts;
        this.Jumlah_anak = ank;
        this.masa_kerja = masa_kerja;
    }

    public void setGolongan(String gol){
        this.golongan = gol;
    }
    
    public int getGajiPokok(){
        this.gapok = 0;
        
        if(this.golongan.equals("I")){
            this.gapok = 2500000;
        }   else if (this.golongan.equals("II")){
            this.gapok = 3000000;
        }   else if (this.golongan.equals("III")) {
            this.gapok = 3500000;
        }   else {
            this.gapok = 4000000;
        }
        
        return this.gapok;
        
    }
    
    public void setStatusMenikah(String status) {
        this.status_menikah = status;
    }
    public int getTunjanganMenikah(){
        this.tunjangan_menikah = 0;
        
        if(this.status_menikah.equals("menikah")){
            this.tunjangan_menikah = 1000000;
        } else{
            this.tunjangan_menikah = 250000;
        }
        return this.tunjangan_menikah;
    }
    
    public void setJumlahAnak (int anak){
        this.Jumlah_anak = anak;
    }
    
    public int getTunjanganAnak(){
        this.tunjangan_anak = 0;
        
        if (this.Jumlah_anak ==0){
            this.tunjangan_anak = 0;
        }else if(this.Jumlah_anak >= 1 && this.Jumlah_anak <= 2){
            this.tunjangan_anak = 700000;
        } else if (this.Jumlah_anak >= 3 && this.Jumlah_anak <= 5){
            this.tunjangan_anak = 1000000;
        } else {
            this.tunjangan_anak = 1200000;
        }
        return tunjangan_anak;
    }
    
    public void setMasaKerja(int masaKerja) {
        this.masa_kerja = masaKerja;
    }
    
    public int getTunjanganKerja(){
        this.tunjangan_kerja = 0;
        
        if (this.masa_kerja <= 2){
            this.tunjangan_kerja = 250000;
        }else if (this.masa_kerja >= 3 && this.masa_kerja <=5){
            this.tunjangan_kerja = 500000;
        }else {
            this.tunjangan_kerja = 1200000;
        }
        return tunjangan_kerja;
    }
    
    public int gajiTotal(){
        return this.gapok+ this.tunjangan_menikah+this.tunjangan_anak+ this.tunjangan_kerja;
    }
}

