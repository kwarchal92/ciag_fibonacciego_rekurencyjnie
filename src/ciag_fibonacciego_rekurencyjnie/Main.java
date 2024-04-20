package ciag_fibonacciego_rekurencyjnie;

class Fibonacci
{
    public int fibonacci(int n)
    {
        switch (n)
        {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
public class Main {
    public static void main(String[] args)
    {
        int i, n = 10;
        Fibonacci liczby = new Fibonacci();

        System.out.println("Program znajduje rekurencyjnie " + n + " pierwszych liczb Fibonacciego.");
        System.out.println();

        for (i = 0; i < n; i++)
        {
            System.out.println(liczby.fibonacci(i) + ".");
        }
    }
}
