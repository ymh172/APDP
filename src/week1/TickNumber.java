package week1;

import java.util.Scanner;

public class TickNumber {


    public String askTicketNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ticket Number");
        String num = sc.nextLine();
        return num;
    }

    public void checkValidTicket(){
        boolean con=false;
        boolean allditgitornot = false;
        do {
            String ticketNum = askTicketNum();
            int noChar = ticketNum.length();
            if(noChar>=9 && noChar<=12){
                allditgitornot=checkDigitorNot(ticketNum);
                if(allditgitornot){
                    if (noChar==9){
                        int ticket = Integer.parseInt(ticketNum);
                        int lastDropDigit = ticket % 7;
                        ticketNum+=String.valueOf(lastDropDigit);
                        System.out.println("Ticket number is valid after correction");
                    }
                    else{
                        System.out.println("Ticket number is valid");
                    }
                }
                else{
                    con = true;
                    System.out.println("Try again. Please be ensure ticket number is all digit");
                }

            }
            else {
                con=true;
                System.out.println("Try again. Please check your number of ticketnumber");
            }
        }while(con);


    }

    public boolean checkDigitorNot(String ticketNum){
        boolean digitOrNot=true;
        for (int i=0; i<ticketNum.length();i++){
           if (!Character.isDigit(ticketNum.charAt(i))){
               digitOrNot=false;
               break;
           }
        }
        return digitOrNot;
    }

    public static void main(String[] args) {
        TickNumber obj = new TickNumber();
        obj.checkValidTicket();
    }

}