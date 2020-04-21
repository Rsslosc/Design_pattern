package FacadePattern_News;

public class Facade {
    private String advertisement;

    public Facade(String advertisement) {
        this.advertisement = advertisement;
    }
    int doFacade() {
        CheckWord checkWord = new CheckWord(advertisement);
        checkWord.computerCount();
        Change change = new Change(checkWord);

        TypeSetting typeSetting = new TypeSetting(advertisement);
        typeSetting.doTypeSetting();

        return change.getChange();
    }
}
