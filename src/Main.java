import com.enigma.model.Fighter;
import com.enigma.model.Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException {
       Hero hero = new Hero("Fighter", 100, "Alucard",20);
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("==Pilih Role Hero==");
       System.out.print("==Fighter==");
       System.out.print("==Assasin==");
       System.out.print("==Marksman==");
       System.out.print("==Tank==");
       System.out.print("==Mage==");
       System.out.println("==Support==");
       String inputHero = reader.readLine();
       hero.setRoleHero(inputHero);
       Fighter fighter = new Fighter("Fighter", 10, "Alucard", 100, 50,10.0,1);
       fighter.setNameHero(reader.readLine());
       System.out.println("Input Level");
       Integer inputLevel = Integer.parseInt(reader.readLine());
       System.out.println(fighter.increaseLevel(inputLevel,100.0));
       System.out.println("Input Hit");
       Integer inputHit = Integer.parseInt(reader.readLine());
       System.out.println(fighter.hitHero(inputHit));

//    public static void main(String[] args){
//        Heroes gundala = new Heroes(100,100,15);
//        Heroes saitama = new Heroes(100,500,50);
//
//        saitama.attack(gundala);
//
//        System.out.println(gundala.print());
//        System.out.println(saitama.print());
//
//        Integer b = 7;
//        b = kurang(b);
//        System.out.println(b);
//
//    }
//    static Integer kurang(Integer a){
//        return a-1;
    }

}
