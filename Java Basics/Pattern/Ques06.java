import java.util.Scanner;

public class Ques06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        for(int i=num;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);                
            }
            System.out.println();
        }
        sc.close();
    }
}
