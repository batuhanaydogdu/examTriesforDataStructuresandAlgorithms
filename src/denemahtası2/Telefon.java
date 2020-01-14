/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemahtası2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author win7
 */
public class Telefon {
    
   
    private String name ;
    static int number=0;
    String color;
    private String MadeIn ;
    private boolean isOn;
    private ArrayList<String> ListOfApplications ;
    
           
    public Telefon () {
        ListOfApplications = new ArrayList();
        
        
    
}
    public void PrintApp(){
        for (int x=0;x<ListOfApplications.size(); x++){
             System.out.println(ListOfApplications.get(x));
        }
    }
    
    public Telefon (String color,String name){
        this.color = color;
        this.name=name;
        this.MadeIn="Sıvas";  
        ListOfApplications = new ArrayList();
        
    }

    public Telefon(String name, String color, String MadeIn, boolean isOn) {
        this.name = name;
        this.color = color;
        this.MadeIn = MadeIn;
        this.isOn = isOn;
        ListOfApplications = new ArrayList();
        
    }
    
    public void turnOn(){
        isOn=true;
        System.out.println("tel açıldı");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void AddApplication(String x){
        
        ListOfApplications.add(x);
        
       
    }

    @Override
    public String toString() {
        return " name ="+name+" color ="+color+" MadeIn="+MadeIn;
        
    }
    
    public static void main(String[] args) {
     
        Telefon iremintel=new Telefon();
        System.out.println(iremintel.toString());
        iremintel.setName("qweqweqweqw");
        iremintel.AddApplication("Whatsapp");
        iremintel.AddApplication("instagram");
        iremintel.AddApplication("twitter");
        iremintel.AddApplication("Salah irem");
        iremintel.AddApplication("sensin ukala");
        iremintel.AddApplication("hayır");
        
                
        
        Telefon s2 = new Telefon("gri", "Einstein");
        Scanner x=new Scanner(System.in);
        Random se=new Random();
        int a;
//        a=x.nextInt();
//        a=se.nextInt(31);
//        System.out.println(se);
        ArrayList<Telefon> ListOfTelefon = new ArrayList();
        ListOfTelefon.add(iremintel);
        ListOfTelefon.add(s2);
        System.out.println(ListOfTelefon.get(0).getName());
        ListOfTelefon.remove(0);
                System.out.println(ListOfTelefon.get(0).getName());

        ListOfTelefon.remove(s2);
        System.out.println(ListOfTelefon.get(0).getName());
        
        
        
    }
    
    
    
}
