package Blocks;

import java.util.Random;

class Dice {
    static int dots,roll1,roll2,flag;
    Random number = new Random();

    public Dice(){
        dots = number.nextInt(6)+1 ;
    }

    public void roll1(){
        roll1 = number.nextInt(dots)+1;
    }
    public void roll2(){
        roll2 = number.nextInt(dots)+1;
    }

    public static int getDots1(){
        return roll1;
    }

    public static int getDots2(){
        return roll2;
    }
    public static void getSame(){
        while(roll1 == roll2){
            flag++;
        }
    }
}
