package CommandPattern_Book;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

class Light extends ImageView{
    private Image image1 = new Image("/CommandPattern_Book/ex_01.png");
    private Image image2 = new Image("/CommandPattern_Book/ex_02.png");

    void on() {
        this.setImage(image1);
        this.setSmooth(true);
        this.setCache(true);
        this.setFitHeight(200);
        this.setFitWidth(200);
    }

    void off() {
        this.setImage(image2);
        this.setSmooth(true);
        this.setCache(true);
        this.setFitHeight(200);
        this.setFitWidth(200);
    }

}
