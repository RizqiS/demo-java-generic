package model;

public class Movie {
    private String title;
    private String description;
    private Integer popularity;
    private Boolean isAdult;

    public Movie(String title, String description, Integer popularity, Boolean isAdult) {
        this.title = title;
        this.description = description;
        this.popularity = popularity;
        this.isAdult = isAdult;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public Boolean getAdult() {
        return isAdult;
    }
}
