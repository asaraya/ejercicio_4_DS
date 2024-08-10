package patternized;

public class Photo {
    private String id;
    private String description;
    private String url;
    private int rating;
    private int resolution;

    public Photo(String id, String description, String url, int rating, int resolution) {
        this.id = id;
        this.description = description;
        this.url = url;
        this.rating = rating;
        this.resolution = resolution;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public int getRating() {
        return rating;
    }

    public int getResolution() {
        return resolution;
    }
}
