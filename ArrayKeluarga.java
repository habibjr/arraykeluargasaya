/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.keluarga;

/**
 *
 * @author user
 */
public class ArrayKeluarga {

    public static void main(String[] args) {
        String [] ortu = {"Dwi Muryani", "Kusman"};
        String [] anak = {"Abdul Hakim Amrullah","Nur Khabib Fahrur Rozi"};
        String [][] sepupu = {
            {"Devi","0822-3380-7649"},
            {"Robi","0838-3140-0344"},
            {"cicik","0853-9976-1116"}};
        
        System.out.println("Namaku Adalah "+anak[1]);
        System.out.println("Saya "+anak.length+" Bersaudara");
        
        System.out.println("");
        for (int i = 0;i<anak.length;i++){
            if (anak[i]=="Nur Khabib Fahrur Rozi"){
                System.out.println("Saya adalah anak ke-"+(i+1));
            }
        }
        
        System.out.println("");
        System.out.println("Nama Orang Tua Saya Adalah : ");
        for (int i=0;i<ortu.length;i++){
            System.out.println(ortu[i]);
            }
        
        System.out.println("");
        System.out.println("Anak-Anaknya Bernama :");
        for (int i = 0; i<anak.length;i++){
            System.out.println(anak[i]);
            }
        System.out.println("");
        System.out.println("Sedikit yang saya sebutkan Nama sepupu saya");
        for (int i = 0; i<sepupu.length;i++){
            System.out.println(sepupu[i][0]);
            System.out.println("   No Teleponnya : "+sepupu[i][1]);
        }
        
    }
    
}
