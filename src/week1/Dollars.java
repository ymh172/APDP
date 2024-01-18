package week1;

import java.util.Scanner;

public class Dollars {

        int totalAmount;

        public Dollars(int amount){
            this.totalAmount = amount;
        }

        public void calculate(){

            int twenties = totalAmount / 20;
            int remainingAmountAfterTwenties = totalAmount % 20;

            int tens = remainingAmountAfterTwenties / 10;
            int remainingAmountAfterTens = remainingAmountAfterTwenties % 10;

            int fives = remainingAmountAfterTens / 5;
            int ones = remainingAmountAfterTens % 5;


            System.out.println("Amount: $" + totalAmount);
            System.out.println("Twenties: " + twenties);
            System.out.println("Tens: " + tens);
            System.out.println("Fives: " + fives);
            System.out.println("Ones: " + ones);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter amount : ");
            int totalAmount = sc.nextInt();
            Dollars obj = new Dollars(totalAmount);
            obj.calculate();
        }

    }


