package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public DigitalVideoDisc(String title) {
        this.title = title;
        this.nbDigitalVideoDiscs += 1;
        this.id = this.nbDigitalVideoDiscs;
    }


    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.nbDigitalVideoDiscs += 1;
        this.id = this.nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.nbDigitalVideoDiscs += 1;
        this.id = this.nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.nbDigitalVideoDiscs += 1;
        this.id = this.nbDigitalVideoDiscs;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public boolean isMatch(String keywords) {
        String[] keywordArray = keywords.toLowerCase().split(" ");
        String lowerCaseTitle = title.toLowerCase();
        for (String keyword : keywordArray) {
            if (lowerCaseTitle.contains(keyword)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }

}
