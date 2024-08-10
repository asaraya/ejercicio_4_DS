package naive;

public class Photo {
    private String id;
    private String url;
    private double score; 

    public Photo(String id, String url, double score) {
        this.id = id;
        this.url = url;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public double getScore() {
        return score;
    }
}
