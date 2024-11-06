import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;

public class DashboardFXMLController implements Initializable {

    @FXML
    private GridPane gridGradeLevel1;
    @FXML
    private GridPane gridGradeLevel2;
    @FXML
    private ComboBox<String> gridComboBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gridComboBox.getItems().addAll("Grade 1", "Grade 2");

        gridGradeLevel1.setVisible(true);
        gridGradeLevel2.setVisible(false);

        gridComboBox.setOnAction(event -> switchGrid());
    }    
    
    private void switchGrid() {
        String selectedGrade = gridComboBox.getSelectionModel().getSelectedItem();

        if ("Grade 1".equals(selectedGrade)) {
            gridGradeLevel1.setVisible(true);
            gridGradeLevel2.setVisible(false);
        } else if ("Grade 2".equals(selectedGrade)) {
            gridGradeLevel1.setVisible(false);
            gridGradeLevel2.setVisible(true);
        }
    }
    
}
