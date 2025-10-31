/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum9;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String jenisKelamin;
    private boolean isActive;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(){
        this.nama = nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(){
        this.nim = nim;
    }
    
    public String getProdi(){
        return prodi;
    }
    
    public void setProdi(){
        this.prodi = prodi;
    }
    
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    
    public boolean isIsActive(){
        return isActive = true;
    }
    
    public Mahasiswa(String nama,String nim,String prodi,String jenisKelamin,boolean isActive){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
        this.isActive = isActive;

    }
    
    public static ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
}
