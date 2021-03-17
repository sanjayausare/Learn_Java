class NinetyNineBottlesOfBeer {

    public static void main(String[] args)
    {
        int n = 99;
        while(n > 0)
        {
            if(n==1)
            {
                System.out.println(n + " bottle of beer on the wall, " + n + " bottle of beer.");
            }
            else
            {
                System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer.");
            }
            if(n == 2)
            {
                System.out.println("Take one down and pass it around, " + --n +  " bottle of beer.");
            }
            else
            {
                System.out.println("Take one down and pass it around, " + --n +  " bottles of beer.");
            }
        }
    }  
}
