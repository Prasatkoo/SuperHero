
public class Publisher {
    private String id;
    private String publisherName;

    private int count;

    public Publisher(String id, String publisherName, int count) {
        this.id = id;
        this.publisherName = publisherName;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
