package ObserverPattern_Text;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Pane  implements Initializable {
    public AnchorPane A03;
    public AnchorPane A02;
    public AnchorPane A01;
    public HBox hbox;

    private TextArea textArea01 = new Text01();
    private TextArea textArea02 = new Text02();
    private TextArea textArea03 = new Text03();

    private Controller controller = new TextController();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        A01.getChildren().add(textArea01);
        A02.getChildren().add(textArea02);
        A03.getChildren().add(textArea03);
        AnchorPane.setBottomAnchor(textArea01, 0.);
        AnchorPane.setLeftAnchor(textArea01, 0.);
        AnchorPane.setRightAnchor(textArea01, 0.);
        AnchorPane.setTopAnchor(textArea01, 0.);
        AnchorPane.setBottomAnchor(textArea02, 0.);
        AnchorPane.setLeftAnchor(textArea02, 0.);
        AnchorPane.setRightAnchor(textArea02, 0.);
        AnchorPane.setTopAnchor(textArea02, 0.);
        AnchorPane.setBottomAnchor(textArea03, 0.);
        AnchorPane.setLeftAnchor(textArea03, 0.);
        AnchorPane.setRightAnchor(textArea03, 0.);
        AnchorPane.setTopAnchor(textArea03, 0.);

        controller.addObserver((Observer)textArea01);
        controller.addObserver((Observer)textArea02);
        controller.addObserver((Observer)textArea03);
    }

    public void textChange01() {
        ((TextController)(controller)).seedMassage(textArea01.getText());
    }
}
