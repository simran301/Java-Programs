// Type casting or type conversion- Type casting will cast values from one type to another  

public class TypeConversion 
{
    public static void main(String[] args) 
    {
        int ants = 2000;
        int purchaseBlockOfCheese = 1;

        System.out.println("There are " + ants + " and " + purchaseBlockOfCheese + " block of Cheese");
        System.out.println("Each ant carried " + ((double)purchaseBlockOfCheese/ants) + " from total cheese amount");
    }
}

// Here in this program the real answer of purchaseBlockOfCheese/ants will print as a result because we have changed/convert this operation from integer(int) data type to double data type.