package week1;

    public class Dollars {

        int amount;

        public Dollars(int amount){
            this.amount = amount;
        }

        public void calculate(){
            int twenties = amount / 20;
            int remainingAmountAfterTwenties = amount % 20;

            int tens = remainingAmountAfterTwenties / 10;
            int remainingAmountAfterTens = remainingAmountAfterTwenties % 10;

            int fives = remainingAmountAfterTens / 5;
            int ones = remainingAmountAfterTens % 5;


            System.out.println("Amount: $" + amount);
            System.out.println("Twenties: " + twenties);
            System.out.println("Tens: " + tens);
            System.out.println("Fives: " + fives);
            System.out.println("Ones: " + ones);
        }
        public static void main(String[] args) {
            Dollars obj = new Dollars(50);
            obj.calculate();
        }

    }


