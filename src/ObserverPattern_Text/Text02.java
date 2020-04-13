package ObserverPattern_Text;

import javafx.scene.control.TextArea;

public class Text02 extends TextArea implements Observer {
    public Text02() {
        this.setEditable(false);
    }
    @Override
    public void showMassage(String massage) {

        this.setText("输入数据的长度为：" + massage.length());
    }
}
