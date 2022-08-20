package constructor.movieApp;

public class MovieTest {

    public static void main(String[] args) {
        Movie movie=new Movie("Happy",new String[]{"Jonny","Jessica Alba"},"comedy","Warner Bros",
                "Steven Spielberg",3.35,5);
        Movie movie3=new Movie("Pirates",new String[]{"Jonny Depp","Tim Robbins"},"comedy","Warner Bros",
                "Steven Spielberg",3.35,2);
        Movie movie4=new Movie("Friends",new String[]{"Jonny Depp","Jessica Alba"},"comedy","Warner Bros",
                "Steven Spielberg",3.35,3.3);
        Movie movie5=new Movie("Terminator",new String[]{"Arnold Schwarzenegger","Linda Hamilton","Normad Friedman"},"Action","Studio Canal",
                "James Cameron",1.45,4.5);
        Movie movie6=new Movie("The Shawshank Redemption",new String[]{"Tim Robins","Morgan Freeman","Bob Gunton"},"Drama","Universal",
                "James Cameron",2.22,3.5);
        Movie movie7=new Movie("The Dark Knight",new String[]{"Christian Bale","Heath Ledger","Aaron Eckhart"},"Action","Warner Brothers",
                "Christopher Nolan",2.45,1.5);
        Movie movie8=new Movie("The Godfather",new String[]{"Marlon Brando","Al Pacino","James Caan"},"Drama","Sony",
                "Franciis Ford Coppola",1.45,4.75);


        Movie[] movies={movie,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
                movie8};
       // Movie.filterByActor(movies,"Jonny Depp");
        //Movie.filterByRating(movies,6,4);
      //  Movie.filterByLength(movies,2,1);
        Movie.filterByProducer(movies,"Franciis Ford Coppola");
        System.out.println(movie8);//constructor.movieApp.Movie@35bbe5e8
        movie8.updateRating(-1);
        System.out.println("=================");
        System.out.println(movie8.getRating());
        movie8.updateRating(100);
        System.out.println(movie8.getRating());
        movie8.updateRating(4.75);
        System.out.println(movie8.getRating());
        System.out.println(movie8);


    }
}
