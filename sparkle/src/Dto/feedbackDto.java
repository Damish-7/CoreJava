package Dto;

public class feedbackDto {
    private String feedback;
    private String rating;
    private String suggestion;
    private String gender;

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getRating() {
        return rating;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "feedbackDto{" +
                "feedback='" + feedback + '\'' +
                ", rating='" + rating + '\'' +
                ", suggestion='" + suggestion + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}



