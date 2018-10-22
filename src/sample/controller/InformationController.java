package controller;

import javafx.scene.input.MouseEvent;

public class InformationController implements INTER {



    private static InformationController informationControllerInstance;

    private InformationController() {
    }

    public static InformationController getInstance() {
        if (informationControllerInstance == null) {
            informationControllerInstance = new InformationController();
        }
        return informationControllerInstance;
    }

    public void rightRadioCourse(MouseEvent mouseEvent) {
    }

    public void leftRadioCourse(MouseEvent mouseEvent) {
    }

}
