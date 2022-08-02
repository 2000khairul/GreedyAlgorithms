import java.util.ArrayList;
import java.util.Scanner;

public class CoinChange {

    // All denomination of Bangladesh currency

    static int[] currency = {1,2,5,10,20,50,100,200,500,1000};

    static int n = currency.length;



    static void findMin(int V)
    {
        int number = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = n -1; i>=0 ; i--)
        {
            while(V>= currency[i])
            {
                V -= currency[i];
                ans.add(currency[i]);
                number++;
            }
        }

        for(int i = 0; i<ans.size(); i++)
        {
            System.out.println(ans.get(i)+" TAKA");
        }
        System.out.println("The minimum number of Note which want to change the amount is : "+number);
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount you want to change: ");
        int amount = scan.nextInt();

        System.out.println("The currency which use for change :");
        findMin(amount);



    }
}
