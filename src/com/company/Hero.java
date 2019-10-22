package com.company;

import java.util.Random;

public class Hero {
    int heroHealth ;
    int heroAttack ;
   int superAttack ;

    public Hero(){}

    public Hero (int heroHealth, int heroAttack, int superAttack){
        this.heroAttack = heroAttack ;
        this.heroHealth = heroHealth ;
        this.superAttack = superAttack ;
    }
    Random random = new Random();
    int randomNum = random.nextInt (3)+1;

    }




