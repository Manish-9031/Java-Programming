import java.util.Scanner;

public class ayyay2d {
    public static void main(String[] args) {
        int a[][]=new int [2][2];
        System.out.print("entr the  2d array element: ");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=s.nextInt();

            }
        }
        System.out.print("The array element is in matrix form \n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
    }
}
