package FacadePattern_News;

public class Change {
    private int basicCharge = 10;
    private CheckWord checkWord;

    public Change(CheckWord checkWord) {
        this.checkWord = checkWord;
    }
    public Change(CheckWord checkWord, int basicCharge) {
        this.checkWord = checkWord;
        this.basicCharge = basicCharge;
    }

    int getChange() {
        return checkWord.count * basicCharge;
    }
}
