package ex_07072024;

public class Lab008
{
    public static void main(String[] args) {
        System.out.println("Print even number from 1 to 100");
        int n=100;
        for(int i=1;i<=n;i++)
        {
        if(i%2!=0)
            System.out.println( i+" " +"odd number");
        else
            System.out.println(i+" " +"even number");
        }

    }
}
