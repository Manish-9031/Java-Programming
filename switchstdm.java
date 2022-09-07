import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class switchstdm {
    public static void main(String[] args) {
        System.out.print("Enter 1 to 7 number Your choice:");
        Scanner ob=new Scanner(System.in);
        int day=ob.nextInt();
        switch(day){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wedenesday");
            break;
            case 5:
            System.out.println("Thrusday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturesday");
            break;
            default:
            System.out.println("Invalid number please enter 1 to 7");

        }
    }
}
