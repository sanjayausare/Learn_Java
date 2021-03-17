class Movie{

    //instance variables
    String name;
    String genre;
    int rating;

    //method
    void movieDetails()
    {
        System.out.println("Movie Name - "+name);
        System.out.println("Movie Genre - "+genre);
        System.out.println("Movie Rating - "+rating);
        System.out.println();
    }
}

public class MovieTestDrive{
    public static void main(String args[])
    {
        //instance an object
        Movie m1 = new Movie();

        //setting values
        m1.name = "Dabangg";
        m1.genre = "Comedy";
        m1.rating = 8;

        Movie m2 = new Movie();

        m2.name = "Phir Hera Pheri";
        m2.genre = "Comedy";
        m2.rating = 9;

        Movie m3 = new Movie();

        m3.name = "Welcome";
        m3.genre = "Comedy";
        m3.rating = 10;

        //call the method
        m1.movieDetails();
        m2.movieDetails();
        m3.movieDetails();
    }
}