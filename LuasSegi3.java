/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author calista2201010294
 * tgl:2024-04-29
 */
public class LuasSegi3 {
    private float alas, tinggi, luas;
    
    public LuasSegi3(float Al, float Tinggi){
        alas = Al;
        tinggi = Tinggi;
                
    }
        
    
    public void setALAS(float nVAL){
        alas = nVAL;
    }
    public float getALAS(){
        return alas;
    } 
    public void setTINGGI(float nVAL){
        tinggi = nVAL;
    }
    public float getTINGGI(){
        return tinggi;
    }
    public void HLuasSegi3(){
        luas = (alas*tinggi)/2;
    }
    public float getLUAS(){
        return luas;
    }
}
