package com.company;

import java.util.Random;

public class Boss  {
    private int bossAttack;
    private int bossHealth;
    private int bossProtect;

    public void havingProtectType(){
    Random random = new Random();
    int r = random.nextInt(50)+1;
    bossProtect = r;
    }


    private Boss(int bossAttack, int bossHealth, int bossProtect) {
        this.bossAttack = bossAttack;
        this.bossHealth = bossHealth;
        this.bossProtect = bossProtect;
    }

    public int getBossAttack() {
        return bossAttack;
    }

    public void setBossAttack(int bossAttack) {
        this.bossAttack = bossAttack;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossProtect() {
        return bossProtect;
    }

    public void setBossProtect(int bossProtect) {
        this.bossProtect = bossProtect;
    }
   public static void bossProtectChange (Hero hero){
       Random r = new Random();
       int randomNum = r.nextInt(3)+1;





    }
}
