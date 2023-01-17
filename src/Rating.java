public class Rating {

    // The sum of all ratings
    private double sumOfRatings;

    // The number of people who have rated an item
    private int raters;

    // Initialize both fields to zero
    public Rating(){
        this.sumOfRatings = 0;
        this.raters = 0;
    }

    // Initialize the fields to the parameter values
    public Rating(double sumOfRatings, int raters){
        this.sumOfRatings = sumOfRatings;
        this.raters = raters;
    }

    // Increase the sumOfRatings by newRating and increase the number of raters by one
    public void addRating(double newRating){
        Integer increase_rating = 1;

        this.sumOfRatings += newRating;
        this.raters += increase_rating;
    }

    // Return the average rating
    public double getAverageRating(){
        return (this.sumOfRatings/this.raters);
    }

    // Display the average rating and how many reviews it is based on
    public String toString(){
        return (this.sumOfRatings + " based on " + this.raters + " reviews");
    }

    public int compareTo()

    // makes sure to make getters and setters AND toString method

}
