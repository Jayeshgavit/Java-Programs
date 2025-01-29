import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

            Scanner sc = new Scanner(System.in);
            int mynum = (int)(Math.random()*100);

             int usernum = 0;
            do{
                System.out.print("Guess the number : ");
                 usernum = sc.nextInt();
                if(usernum == mynum){
                    System.out.println("Wooho ... correct!" );
                    break;
                }else if(usernum > mynum){
                    System.out.println(" number to large.. try again with small" );
                }else {
                    System.out.println("your number is too small. try again with large" );
                }
            }while (usernum >= 0);

        System.out.println("my number was " + mynum);
        }

    }
