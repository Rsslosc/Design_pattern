package CommandPattern_Book;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Pane implements Initializable {
    public AnchorPane LightView;
    public AnchorPane CameraView;
    public AnchorPane Undo;

    private ArrayList<Operation> arrayList = new ArrayList<>();
    private Operation LightStatus = Operation.OffLight;
    private Operation CameraStatus = Operation.OffCamera;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CameraView.getChildren().add(camera);
        LightView.getChildren().add(light);

        ImageView imageView = new ImageView(new Image("/CommandPattern_Book/myUndo.png"));
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setSmooth(true);
        imageView.setCache(true);
        Undo.getChildren().add(imageView);
        isShow();
    }

    private void isShow(){
        if (arrayList == null){
            Undo.setVisible(false);
            return;
        }
        if (arrayList.size() == 0) {
            Undo.setVisible(false);
            return;
        }
        if (!Undo.isVisible()) {
            Undo.setVisible(true);
        }
    }

    private Light light = new Light();
    private Camera camera = new Camera();

    private Order onLightOrder = new OnLightOrder(light);
    private Order offLightOrder = new OffLightOrder(light);
    private Order onCameraOrder = new OnCameraOrder(camera);
    private Order offCameraOrder = new OffCameraOrder(camera);

    public void CameraOn(ActionEvent actionEvent) {
        if (CameraStatus == Operation.OnCamera) {
            return;
        }
        onCameraOrder.doExecute();
        arrayList.add(Operation.OnCamera);
        CameraStatus = Operation.OnCamera;
        isShow();
    }

    public void CameraOff(ActionEvent actionEvent) {
        if (CameraStatus == Operation.OffCamera) {
            return;
        }
        offCameraOrder.doExecute();
        arrayList.add(Operation.OffCamera);
        CameraStatus = Operation.OffCamera;
        isShow();
    }

    public void LightOn(ActionEvent actionEvent) {

        if (LightStatus == Operation.OnLight) {
            return;
        }
        onLightOrder.doExecute();
        arrayList.add(Operation.OnLight);
        LightStatus = Operation.OnLight;
        isShow();
    }

    public void LightOff(ActionEvent actionEvent) {
        if (LightStatus == Operation.OffLight) {
            return;
        }
        offLightOrder.doExecute();
        arrayList.add(Operation.OffLight);
        LightStatus = Operation.OffLight;
        isShow();
    }

    public void UndoClicked(MouseEvent mouseEvent) {
        Operation operation = arrayList.get(arrayList.size() - 1);
        switch (operation){
            case OnLight: onLightOrder.undoExecute(); LightStatus = Operation.OffLight; break;
            case OffLight: offLightOrder.undoExecute(); LightStatus = Operation.OnLight; break;
            case OnCamera: onCameraOrder.undoExecute(); CameraStatus = Operation.OffCamera; break;
            case OffCamera: offCameraOrder.undoExecute(); CameraStatus = Operation.OnCamera; break;
        }
        arrayList.remove(arrayList.size() - 1);
        isShow();
    }

}
