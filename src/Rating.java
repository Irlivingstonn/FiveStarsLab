public class Rating implements Comparable<Rating>{

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
        if (this.sumOfRatings/this.raters != this.sumOfRatings/this.raters){
            return 0;
        }
        else{
            return (this.sumOfRatings/this.raters);
        }
    }

    // Display the average rating and how many reviews it is based on
    public String toString(){

        return (this.getAverageRating() + " based on " + this.raters + " reviews");
    }

    // CompareTo Method to Sort Ratings
    public int compareTo(Rating object1){

        if (object1.getAverageRating() == this.getAverageRating()){
            if (object1.raters > this.raters){
                return 1;
            }

            else if (this.raters > object1.raters){
                return -1;
            }

            // if they have the same amount of ratings then the 1st object returns
            return 0;
        }

        else if (object1.getAverageRating() > this.getAverageRating()){
            return 1;
        }

        else {
            return -1;
        }
    }

    // Getters
    public double getSumOfRatings(){
        return this.sumOfRatings;
    }

    public int getRaters(){
        return this.raters;
    }

    // Setters
    public void setSumOfRatings(double sumOfRatings){
        this.sumOfRatings = sumOfRatings;
    }

    public void setRaters(int raters){
        this.raters = raters;
    }
}
