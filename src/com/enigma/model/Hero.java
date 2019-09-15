package com.enigma.model;

public class Hero {
   protected String role;
   protected Integer mana;
   protected String nmHero;
   protected Integer damage;
   protected Integer healthPoint;

   public Hero(String role, Integer mana, String nmHero, Integer damage) {
       this.role = role;
       this.mana = mana;
       this.nmHero = nmHero;
       this.damage = damage;
   }
   public String setRoleHero(String roleHero){
       switch (roleHero){
           case "Fighter":
               System.out.println("Hero Fighter Terpilih dan Masukkan Nama Hero");
               break;
           case "Asassin":
               System.out.println("Hero Assasin Terpilih dan Masukkan Nama Hero");
               break;
           default:
       }
       return roleHero;
   }
}