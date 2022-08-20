package constructor.movieApp;

import java.util.Arrays;

public class Movie {
    private String title;
    private String studio;
    private String[] actors;
    private String producer;
    private String genre;
    private double length;
    private double rating;

    /**
     * This method is returning the value of title.
     * @return
     */
    String getTitle() {
        return title;
    }

    /**
     * This method is used to set the value to title
     * @param title
     */
    void setTitle(String title) {
        this.title = title;
    }

    String getStudio() {
        return studio;
    }

    void setStudio(String studio) {
        this.studio = studio;
    }

    String[] getActors() {
        return actors;
    }

    void setActors(String[] names) {
//        for (int i = 0; i < names.length; i++) {
//            actors[i] = names[i];
//        }
        this.actors=names;
    }

    String getProducer() {
        return producer;
    }

    void setProducer(String producer) {
        this.producer = producer;
    }

    String getGenre() {
        return genre;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    double getLength() {
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getRating() {
        return rating;
    }

    /**
     * This method is used to set new rating.
     * It will override the existing value.
     * @param rating
     */
    void setRating(double rating) {
        if (rating > 5.0) {
            this.rating = 5.0;
        } else if (rating < 0) {
            this.rating = 0;
        } else {
            this.rating = rating;
        }
    }

    void updateRating(double rating){
        if(rating>5.0){
            rating=5.0;
            this.rating=(this.rating+rating)/2;
        }else if (rating<0){
            rating=0.0;
            this.rating=(this.rating+rating)/2;
        }else {
            this.rating=(this.rating+rating)/2;
        }
    }






    Movie(String title, String[] actors, String genre, String studio, String producer, double length, double rating) {
        this.title = title;
        this.actors = actors;
        this.genre = genre;
        this.studio = studio;
        this.producer = producer;
        this.length = length;
        this.setRating(rating);
    }

    static void filterByActor(Movie[] movies,String actor){
        for (int i=0; i<movies.length;i++){
            for (int j=0 ; j<movies[i].actors.length;j++){
                if (movies[i].actors[j].equalsIgnoreCase(actor)){
                    System.out.println(movies[i].title);
                }
            }
        }
    }

    static void filterByGenre(Movie[] movies,String genre){
        for (int i=0; i<movies.length;i++){
            if (movies[i].genre.equalsIgnoreCase(genre)){
                System.out.println(movies[i].title);
            }
        }
    }

    static void filterByStudio(Movie[] movies,String studio){
        for (int i=0; i<movies.length;i++){
            if (movies[i].studio.equalsIgnoreCase(studio)){
                System.out.println(movies[i].title);
            }
        }
    }

    static void filterByProducer(Movie[] movies,String producer){
        for (int i=0; i<movies.length;i++){
            if (movies[i].producer.equalsIgnoreCase(producer)){
                System.out.println(movies[i].title);
            }
        }
    }

    static void filterByRating(Movie[] movies,double ratingMax, double ratingMin){
        if (ratingMax>5.0){
            ratingMax=5.0;
        }
        if (ratingMin<0){
            ratingMin=0;
        }
        for (int i = 0; i<movies.length;i++){
            if (movies[i].rating>=ratingMin && movies[i].rating<=ratingMax){
                System.out.println(movies[i].title);
            }
        }

    }

    static void filterByLength(Movie[] movies,double lengthMax, double lengthMin){
        for (int i = 0; i<movies.length;i++){
            if (movies[i].length>=lengthMin && movies[i].length<=lengthMax){
                System.out.println(movies[i].title);
            }
        }

    }


    public String toString(){
        return "Title: "+title+"\nStudio: "+studio+"\nProducer: "+producer+"\nGenre: "+genre+"\nActors: "+ Arrays.toString(actors)
                +"\nRating: "+rating+"\nLength: "+length;
    }





}
