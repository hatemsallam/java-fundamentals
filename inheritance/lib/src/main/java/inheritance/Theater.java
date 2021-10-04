package inheritance;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater implements Reviewable{
    private String name;
    private List<String> movies = new ArrayList<>();
    private Map<String , Review> reviews = new HashMap<>();

    public Map<String, Review> getReviews() {
        return reviews;
    }

    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void addMovie(String name) {
        this.movies.add(name);
    }

    public void removeMovie(String name) {
        this.movies.remove(name);
    }

    @Override
    public Review addReview(String body, String author, int stars) {
        Review movieRev = new Review(body , author , stars);
        return movieRev;
    }
    public void addReview(Review r ,String movieName) {
        if(movies.contains(movieName)) {
            reviews.put(movieName , r);
            System.out.println("Thanks for your review");
        }

        else{
            System.out.println("Movie doesn't exist");
        }
    }

    public void addReview(Review r) {

        reviews.put("No name" , r);
        System.out.println("Thanks for your review");

    }
    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
