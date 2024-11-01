/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author rioan
 */
public class BMI {
     float tinggi;
     float berat;
     
     public BMI(float tinggi, float berat){
         
         this.tinggi = tinggi;
         this.berat = berat;
         
     }
     float setBmi(){
         float meter = tinggi/100;
         return berat / (meter*meter);
     }
     
     void getBmi() {
         float BMI = setBmi();
         System.out.printf("Bmi Anda : %.1f%n", BMI);
         
         if(BMI < 18)
         {
             System.out.println("Kurus");
         }
         
         else if(BMI > 18 && BMI <=25)
         {
             System.out.println("Ideal");
         }
         
         else if(BMI > 25 && BMI <= 30)
         {
             System.out.println("Gemoy");
         }
         
         else if(BMI > 30)
         {
             System.out.println("Obesitas");
         }
     }
}
