// Build a java program to print, how many passengers are inside a bus & then you need to print the number of passengers at every stops

public class Bus
{
    public static void main(String[] args)
    {
        int passengers=0;
        passengers=passengers+9;
        System.out.println(passengers);

        passengers=passengers-5;
        System.out.println(passengers);

        passengers=passengers-4;
        System.out.println(passengers);
    }
}

//We can update the program & the updated program will be as below:-

public class Bus
{
    public static void main(String[] args)
    {
        int passengers = 0;
        passengers += 9;
        System.out.println(passengers);
        
        passengers -= 5;
        System.out.println(passengers);

        passengers -= 4;
        System.out.println(passengers);
    }
}
