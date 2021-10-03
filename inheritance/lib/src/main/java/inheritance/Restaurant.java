package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Reviewable{
    public String name ;
    private int rate ;
    private String priceCategory;
    private List<Review> reviews = new ArrayList<>();

    public Restaurant(String name, String priceCategory) {
        this.name = name;
        this.rate = 0;
        this.priceCategory = priceCategory;
    }


    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public String getPriceCategory() {
        return priceCategory;
    }


    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public Review addReview(String body, String author, int stars) {
        Review newReview = new Review(body , author , stars);
        reviews.add(newReview);
        updateRate(reviews);
        return newReview;
    }


    public void updateRate(List<Review> reviews) {
        int sum = 0;
        for (Review r : reviews) {
            sum += r.starNo;
        }

        this.rate = sum / reviews.size();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", priceCategory='" + priceCategory + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
