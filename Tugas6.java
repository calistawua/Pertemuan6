/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

import java.util.Scanner;

/**
 *
 * @author calista2201010294
 * tgl:2024-04-
 */
public class Tugas6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Sisi: ");
        float Sisi = input.nextFloat();
        Luaspersegi LuaspersegiCalculator = new Luaspersegi();
        float luas = LuaspersegiCalculator.HitungLuas(Sisi);
        
        System.out.println("Luas persegi dengan sisi" + Sisi +"adalah: " + luas);
        
    }
    
}
