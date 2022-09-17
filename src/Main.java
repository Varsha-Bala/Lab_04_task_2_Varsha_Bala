public class Main
{
    public static void main(String[] args)
    {
       double fallCost = 124.3;
       double winterCost = 140.7;
       double springCost = 142.3;
       double summerCost = 130.7;
       double yearlyCost = fallCost + winterCost +springCost + summerCost;

        System.out.println("Your fall cost is "+fallCost);
        System.out.println("Your winter cost is "+winterCost);
        System.out.println("Your spring cost is "+springCost);
        System.out.println("Your summer cost is "+summerCost);
        System.out.println("Your yearly cost is "+yearlyCost);
    }
}