import java.util.Scanner;

public class Ques07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num= sc.nextInt();
        for(int i=num;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print(i);
            System.out.println();
        }
        sc.close();
    }
}
