/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main7;

/**
 *
 * @author user
 */
public class Enemy {
    private int hp;
    private int baseDamage;

    //Getter dan Setter
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    // Method untuk menyerang, akan di-override oleh subclass
    public void attack(Player player) {
        System.out.println("Enemy memberikan damage sebesar " + this.baseDamage);
        player.setHp(player.getHp() - baseDamage);
    }

    public boolean isAlive() {
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }
    }
}

