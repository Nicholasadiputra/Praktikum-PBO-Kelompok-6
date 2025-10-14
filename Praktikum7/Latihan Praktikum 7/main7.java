/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main7;
import java.util.Random;
/**
 *
 * @author user
 */

public class main7 {
    public static void main(String[] args) {
        boolean gameState = true;
        Random rand = new Random();

        // Membuat objek player
        Player hero = new Player();
        hero.setHp(100);
        hero.setBaseDamage(35);

        // Membuat objek Goblin (turunan dari Enemy)
        Goblin goblin = new Goblin();
        goblin.setHp(100);
        goblin.setBaseDamage(20);

        System.out.println("===== Pertarungan Dimulai =====");

        do {
            System.out.println("Player HP: " + hero.getHp() + " | Goblin HP: " + goblin.getHp());
            System.out.println("===============================\n");

            // If-statement cek status pemain
            if (hero.isAlive() && !goblin.isAlive()) {
                System.out.println("Player menang!");
                gameState = false;
                break;
            } else if (!hero.isAlive()) {
                System.out.println("Player kalah!");
                System.out.println("===== GAME OVER =====");
                gameState = false;
                break;
            }

            // RNG untuk menyerang
            int dice = rand.nextInt(6);
            if (dice > 2) {
                hero.attack(goblin);
            } else {
                goblin.attack(hero);
            }

        } while (gameState);

        System.out.println("\n===== Pertarungan Selesai =====");
    }
}

