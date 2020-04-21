package FacadePattern_News;

public class CheckWord {
    private String advertisement;
    int count;

    public CheckWord(String advertisement) {
        this.advertisement = advertisement;
    }

    void computerCount(){
        this.count = advertisement.length();
    }
    public int getCount() {
        return count;
    }
}
