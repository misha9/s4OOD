import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    System.out.println("enter the no.of lines = ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mid=(2*n+1)/2;
    for (int i=1 ; i<=mid ; i++)
    { for ( int s=1 ; s<= (mid-i) ; s++)
    {   System.out.print(" ");
    }
    for (int j=1 ; j<=(i*2-1) ; j++)
    {
        if(i<=(2*n+1)/2)
        {
        if (j>(n)/2&&j<=(2*i-1-((n)/2)))
            System.out.print(" ");
        else
            System.out.print("1");
        }
    }
    System.out.println();
    }
    for (int i=1 ; i<=mid-1 ; i++)
    {   for ( int s=1 ; s<= i ; s++)
    {       System.out.print(" ");
    }
        for (int j=1 ; j<= 2*(mid-i)-1 ; j++)
    {
        if(i<(2*n+1)/2)
        {
            if (j>(n)/2&&j<=(2*(mid-i)-1-((n)/2)))
                System.out.print(" ");
            else
                System.out.print("1");
        }
    }
    System.out.println();
} }}
