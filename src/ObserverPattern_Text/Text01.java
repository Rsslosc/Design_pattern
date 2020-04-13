package ObserverPattern_Text;

import javafx.scene.Cursor;
import javafx.scene.DepthTest;
import javafx.scene.control.TextArea;

public class Text01 extends TextArea implements Observer {

    @Override
    public void showMassage(String massage) {
    }
}
