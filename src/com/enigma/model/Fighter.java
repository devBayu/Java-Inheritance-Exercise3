package com.enigma.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fighter extends Hero {
    private Integer level = 1;
    private Double exp = 0.0;
    private Integer punch;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Fighter(String role, Integer mana, String nmHero, Integer damage, Integer level, Double exp, Integer punch) {
        super(role, mana, nmHero, damage);
        this.level = level;
        this.exp = exp;
        this.punch = punch;
    }

    public void setNameHero(String nameHero)throws IOException {
        this.nmHero = nameHero;
        System.out.println("Hero Terpilih " + nameHero);
    }
    public void increaseLevel(Integer level, Double exp) {
        this.exp = exp * level;
        if (5 <= level) {
            System.out.println("Maksimal 5");
        } else {
            for (int i = 1; i <= level; i++) {
                this.level++;
                this.healthPoint = this.healthPoint + 500;
                this.mana = this.mana + 100;
                this.damage = this.damage + 30;
                System.out.println("Level anda sekarang" + this.level);
                System.out.println("HP anda sekarang" + this.healthPoint);
                System.out.println("Mana anda sekarang" + this.mana);
                System.out.println("Damage anda sekarang" + this.damage);
                System.out.println("Anda naik level"+level+""+"level");
                System.out.println(print());
            }
        }
    }
        public void hitHero(Integer punch)throws IOException{
            for (int i = 1; i <= punch; i++) {
                this.healthPoint = this.healthPoint - this.damage;
                System.out.println("HP anda tersisa" + this.healthPoint);
        }
    }
    public String print() {
        return "Fighter{" +
                "role=" + role +
                ", mana=" + mana +
                ", nmHero='" + nmHero +
                ", damage=" + damage +
                ", healthPoint=" + healthPoint +
                '}';
    }
}