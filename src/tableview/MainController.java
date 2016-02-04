/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author nemus
 */
public class MainController implements Initializable {

    @FXML private TableView<Student> studentsTable;
   
    @FXML private TableColumn<Student, Integer> idColumn;
    @FXML private TableColumn<Student, String> nameColumn;
    @FXML private TableColumn<Student, String> surnameColumn;
    @FXML private TableColumn<Student, Integer> ageColumn;
    
    public ObservableList<Student> list = FXCollections.observableArrayList(
      new Student(1, "Mark", "Johnson", 19),
      new Student(2, "John", "Johnson", 39),
      new Student(3, "Derek", "Johnson", 22),
      new Student(4, "Robert", "Johnson", 43),
      new Student(5, "Mike", "Johnson", 49),
      new Student(6, "Duke", "Johnson", 55),
      new Student(7, "Joan", "Johnson", 50),
      new Student(8, "Jennifer", "Johnson", 44),
      new Student(9, "Tom", "Johnson", 15),
      new Student(10, "Brad", "Johnson", 66)
    );
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("Surname"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("Age"));
       
        studentsTable.setItems(list);
    }    
    
}
