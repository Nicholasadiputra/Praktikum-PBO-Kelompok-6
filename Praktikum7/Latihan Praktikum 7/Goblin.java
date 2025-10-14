/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main7;
import java.util.Random;
/**
 *
 * @author user
 */


public class Goblin extends Enemy {
    // Override method attack() dari superclass Enemy
    @Override
    public void attack(Player player) {
        Random rand = new Random();
        // Menghasilkan angka acak antara 0 hingga 99
        int chance = rand.nextInt(100);

        // 5% kemungkinan (jika angka < 5)
        if (chance < 5) {
            int doubleDamage = getBaseDamage() * 2;
            System.out.println("Goblin melancarkan serangan kritis!");
            System.out.println("Memberikan " + doubleDamage + " damage!");
            player.setHp(player.getHp() - doubleDamage);
        } else { // 95% kemungkinan
            System.out.println("Goblin menyerang!");
            System.out.println("Memberikan " + getBaseDamage() + " damage!");
            player.setHp(player.getHp() - getBaseDamage());
        }
    }
}
