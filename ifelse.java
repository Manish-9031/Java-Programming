import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("enter two numbers :=");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a==b){
            System.out.println("Both number are equal ");
        }
        else{
            System.out.println("Numbers are not equal");
        }
    }
}
