import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        int a[]=new int [6]; // This is also create arry
        System.out.println("enter the element of ayyay");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<6;i++){
            a[i]=s.nextInt();
        }
        //for(int b : a) // This is for each loop
        for(int j=0;j<6;j++)
        {
            System.out.println(j);
        }
    }
}
