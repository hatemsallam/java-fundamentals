package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Reviewable{
    private String name;
    private String description;
    private String priceCategory;
    private List<Review> reviews = new ArrayList<>();

    public List<Review> getReviews() {
        return reviews;
    }

    public Shop(String name, String description, String priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceCategory='" + priceCategory + '\'' +
                '}';
    }

    @Override
    public Review addReview(String body, String author, int stars) {
        Review newReview = new Review(body , author , stars);
        reviews.add(newReview);
        return newReview;
    }

}
