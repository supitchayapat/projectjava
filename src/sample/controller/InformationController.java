package controller;

import com.sun.xml.internal.bind.v2.TODO;
import controller.subject.SemesterCourse;
import controller.subject.StudentGrade;
import io.CourseEnrollment;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

public class InformationController {

    static String USER_ID;
    private static String STU_NAME;
    private static String STU_ID;
    private static String STU_FAC;
    private static String STU_EMAIL;
    private static String ADV_NAME;
    private static String ADV_ID;
    private static String ADV_EMAIL;
    private static String CUR_GPA;
    private static String SEM_GPA;
    @FXML
    private Label studentName;
    @FXML
    private Label studentId;
    @FXML
    private Label studentFaculty;
    @FXML
    private Label studentEmail;
    @FXML
    private GridPane gradeView;
    @FXML
    private Label semesterLabel;
    @FXML
    private FlowPane selectSemisterPane;
    @FXML
    private Label advisorName;
    @FXML
    private Label advisorId;
    @FXML
    private Label advisorEmail;
    @FXML
    private Label curGPA;
    @FXML
    private Label semGPA;
    private ToggleGroup radioButtGroup;
    private int gradeViewCount;
    //TODO เพิ่มได้นะ  เมทธอดฟิวบลาๆ

    static void setGPA(String cur, String sem) {
        CUR_GPA = cur;
        SEM_GPA = sem;
    }

    static void setStudent(String name, String id, String faculty, String email) {
        STU_NAME = name;
        STU_ID = id;
        STU_FAC = faculty;
        STU_EMAIL = email;
    }

    static void setAdvisor(String name, String id, String email) {
        ADV_NAME = name;
        ADV_ID = id;
        ADV_EMAIL = email;
    }

    public static void setUserId(String userId) {
        USER_ID = userId;
    }

    public static void setCourseEnrollmentList(List<CourseEnrollment> courseEnrollmentList) {
        // TODO;       jam

    }

    public void rightRadioCourse(MouseEvent mouseEvent) {
        if (radioButtGroup != null) {
            if (radioButtGroup.getSelectedToggle().equals(radioButtGroup.getToggles()
                    .get(radioButtGroup.getToggles().size() - 1))) return;
            for (int i = 0; i < radioButtGroup.getToggles().size(); i++) {
                if (radioButtGroup.getSelectedToggle().equals(radioButtGroup.getToggles().get(i))) {
                    ((RadioButton) radioButtGroup.getToggles().get(i + 1)).fire();
                    ((RadioButton) radioButtGroup.getToggles().get(i + 1)).requestFocus();
                    return;
                }
            }
        }
    }

    public void leftRadioCourse(MouseEvent mouseEvent) {

        if (radioButtGroup != null) {
            if (radioButtGroup.getSelectedToggle().equals(radioButtGroup.getToggles().get(0))) return;
            for (int i = 0; i < radioButtGroup.getToggles().size(); i++) {
                if (radioButtGroup.getSelectedToggle().equals(radioButtGroup.getToggles().get(i))) {
                    ((RadioButton) radioButtGroup.getToggles().get(i - 1)).fire();
                    ((RadioButton) radioButtGroup.getToggles().get(i - 1)).requestFocus();
                    return;
                }
            }
        }
    }

    @FXML
    void initialize() {
        radioButtGroup = new ToggleGroup();
        setGPA();
        setStudentGrade();
        setStudentInformation();
        setAdvisorInformation();
    }

    private void setGPA() {
        // TODO;       jam     set GPA to show

    }

    private void setStudentInformation() {
        MainPageController mainPageController = new MainPageController();
        // TODO;       jam         set student information

    }

    private void setAdvisorInformation() {
        MainPageController mainPageController = new MainPageController();
        if (ADV_NAME == null) return;
        // TODO;       jam         set advisor information

    }

    private void setStudentGrade() {
        // TODO;       jam    set student grad

    }

    private void setSelectSemisterPane(List<SemesterCourse> semesterCourseList) {
        // TODO;       jam      set radio for select semester

    }

    private void addGradeTable(String courseId, String name, int credits, String grade) {
        // TODO;       jam   add method gradtotable


    }
}

