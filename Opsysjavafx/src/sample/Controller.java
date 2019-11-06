package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    RadioButton esimeneRadio;
    @FXML
    RadioButton teineRadio;
    @FXML
    RadioButton kolmasRadio;
    @FXML
    RadioButton endaRadio;
    @FXML
    ToggleGroup right;
    @FXML
    private TableView<Abiklass> displayTable;
    /*@FXML
    public TableColumn<Abiklass, String> rida1,rida2,rida3,rida4,rida5,rida6,rida7,rida8,rida9,rida10,rida11,rida12,rida13,rida14,
            rida15,rida16,rida17,rida18,rida19,rida20,rida21,rida22,rida23,rida24,rida25,rida26,rida27,rida28,rida29,rida30,
            rida31,rida32,rida33,rida34,rida35,rida36,rida37,rida38,rida39,rida40,rida41,rida42,rida43,rida44,rida45,
            rida46,rida47,rida48,rida49,rida50;*/


    /*@FXML
    private void initialize(){
        ToggleGroup muster = new ToggleGroup();
        esimeneRadio.setToggleGroup(muster);
        teineRadio.setToggleGroup(muster);
        kolmasRadio.setToggleGroup(muster);
        endaRadio.setToggleGroup(muster);
    }*/
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        ToggleGroup muster = new ToggleGroup();
        esimeneRadio.setToggleGroup(muster);
        teineRadio.setToggleGroup(muster);
        kolmasRadio.setToggleGroup(muster);
        endaRadio.setToggleGroup(muster);

        //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
        /*rida1.setCellValueFactory(new PropertyValueFactory<>("Rida1"));
        rida2.setCellValueFactory(new PropertyValueFactory<>("Rida2"));
        rida3.setCellValueFactory(new PropertyValueFactory<>("Rida3"));
        rida4.setCellValueFactory(new PropertyValueFactory<>("Rida4"));
        rida5.setCellValueFactory(new PropertyValueFactory<>("Rida5"));
        rida6.setCellValueFactory(new PropertyValueFactory<>("Rida6"));
        rida7.setCellValueFactory(new PropertyValueFactory<>("Rida7"));
        rida8.setCellValueFactory(new PropertyValueFactory<>("Rida8"));
        rida9.setCellValueFactory(new PropertyValueFactory<>("Rida9"));
        rida10.setCellValueFactory(new PropertyValueFactory<>("Rida10"));
        rida11.setCellValueFactory(new PropertyValueFactory<>("Rida11"));
        rida12.setCellValueFactory(new PropertyValueFactory<>("Rida12"));
        rida13.setCellValueFactory(new PropertyValueFactory<>("Rida13"));
        rida14.setCellValueFactory(new PropertyValueFactory<>("Rida14"));
        rida15.setCellValueFactory(new PropertyValueFactory<>("Rida15"));
        rida16.setCellValueFactory(new PropertyValueFactory<>("Rida16"));
        rida17.setCellValueFactory(new PropertyValueFactory<>("Rida17"));
        rida18.setCellValueFactory(new PropertyValueFactory<>("Rida18"));
        rida19.setCellValueFactory(new PropertyValueFactory<>("Rida19"));
        rida20.setCellValueFactory(new PropertyValueFactory<>("Rida20"));
        rida21.setCellValueFactory(new PropertyValueFactory<>("Rida21"));
        rida22.setCellValueFactory(new PropertyValueFactory<>("Rida22"));
        rida23.setCellValueFactory(new PropertyValueFactory<>("Rida23"));
        rida24.setCellValueFactory(new PropertyValueFactory<>("Rida24"));
        rida25.setCellValueFactory(new PropertyValueFactory<>("Rida25"));
        rida26.setCellValueFactory(new PropertyValueFactory<>("Rida26"));
        rida27.setCellValueFactory(new PropertyValueFactory<>("Rida27"));
        rida28.setCellValueFactory(new PropertyValueFactory<>("Rida28"));
        rida29.setCellValueFactory(new PropertyValueFactory<>("Rida29"));
        rida30.setCellValueFactory(new PropertyValueFactory<>("Rida30"));
        rida31.setCellValueFactory(new PropertyValueFactory<>("Rida31"));
        rida32.setCellValueFactory(new PropertyValueFactory<>("Rida32"));
        rida33.setCellValueFactory(new PropertyValueFactory<>("Rida33"));
        rida34.setCellValueFactory(new PropertyValueFactory<>("Rida34"));
        rida35.setCellValueFactory(new PropertyValueFactory<>("Rida35"));
        rida36.setCellValueFactory(new PropertyValueFactory<>("Rida36"));
        rida37.setCellValueFactory(new PropertyValueFactory<>("Rida37"));
        rida38.setCellValueFactory(new PropertyValueFactory<>("Rida38"));
        rida39.setCellValueFactory(new PropertyValueFactory<>("Rida39"));
        rida39.setCellValueFactory(new PropertyValueFactory<>("Rida39"));
        rida41.setCellValueFactory(new PropertyValueFactory<>("Rida41"));
        rida42.setCellValueFactory(new PropertyValueFactory<>("Rida42"));
        rida43.setCellValueFactory(new PropertyValueFactory<>("Rida43"));
        rida44.setCellValueFactory(new PropertyValueFactory<>("Rida44"));
        rida45.setCellValueFactory(new PropertyValueFactory<>("Rida45"));
        rida46.setCellValueFactory(new PropertyValueFactory<>("Rida46"));
        rida47.setCellValueFactory(new PropertyValueFactory<>("Rida47"));
        rida48.setCellValueFactory(new PropertyValueFactory<>("Rida48"));
        rida49.setCellValueFactory(new PropertyValueFactory<>("Rida49"));
        rida50.setCellValueFactory(new PropertyValueFactory<>("Rida50"));*/



        //add your data to the table here.
        //displayTable.setItems(tabelIse);
    }
    private ObservableList<Abiklass> tabelIse = FXCollections.observableArrayList(
            new Abiklass("1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1"
                    ,"1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1")

            );
}
