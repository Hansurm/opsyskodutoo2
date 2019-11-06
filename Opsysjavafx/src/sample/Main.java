package sample;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

public class Main extends Application implements EventHandler<ActionEvent> {
    private Button firstFit;
    private Button lastFit;
    private Button worstFit;
    private Button randomFit;
    private Button clearWindow;
    private RadioButton esimene,teine,kolmas,endaOma;
    private String[][] tabel;
    private TableView<ObservableList<String>> tableView;

    @Override
    /*public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Visual.fxml"));
        primaryStage.setTitle("Kodutöö nr. 2");
        primaryStage.setScene(new Scene(root));
        String[][] tabel = Logic.firstFit("1,8;35,4;3,6;4,2;1,4;3,3;1,2;5,1;50,1");
        //tabel[][1] = "A";
        //System.out.println(Arrays.deepToString(tabel));
        //System.out.println(tabel.length);
        //System.out.println(tabel[0].length);
        //System.out.println(Arrays.toString(Logic.leiaAuk(tabel,6,5,15)));
        for(String[] rida:tabel){
            System.out.println(Arrays.toString(rida));
        }
        //System.out.println(Arrays.deepToString(Logic.firstFit("1,8;35,4")));
        primaryStage.show();
    }*/
    public void start(Stage stage) throws Exception {
        /*AnchorPane root = FXMLLoader.load(getClass().getResource("Visual.fxml"));
        Scene scene = new Scene(root,1000,600);
        String[][] tabel = Logic.firstFit("1,8;35,4;3,6;4,2;1,4;3,3;1,2;5,1;50,1");
        TableView<ObservableList<String>> tableView = createTableView(tabel);
        //stage.setScene(new Scene(root,800,800));
        root.getChildren().add(tableView);
        stage.setScene(scene);
        stage.show();*/
        stage.setTitle("Operatsiooni süsteemide kodutöö nr.2");
        firstFit = new Button("First-fit");
        firstFit.setOnAction(this);
        lastFit = new Button("Last-fit");
        worstFit = new Button("Worst-fit");
        randomFit = new Button("Random-fit");
        clearWindow = new Button("Puhasta väljund");
        esimene = new RadioButton("Esimene");
        teine = new RadioButton("Teine");
        kolmas = new RadioButton("Kolmas");
        endaOma = new RadioButton("Enda oma");
        ToggleGroup right = new ToggleGroup();
        esimene.setToggleGroup(right);
        teine.setToggleGroup(right);
        kolmas.setToggleGroup(right);
        endaOma.setToggleGroup(right);
        FlowPane flow = new FlowPane();
        Text tekstEsimene = new Text("4,5;2,7;9,2;4,6;7,1;6,4;8,8;3,6;1,10;9,2");
        Text tekstTeine = new Text("1,10;6,6;3,9;2,4;1,6;5,2;1,4;5,2;2,1;2,7");
        Text tekstKolmas = new Text("5,10;6,6;3,9;8,4;3,6;5,12;1,4;15,3;3,4;9,7");
        TextField tekstEndaOma = new TextField();
        flow.getChildren().addAll(esimene,tekstEsimene,teine,tekstTeine,kolmas,tekstKolmas,endaOma,tekstEndaOma);
        //String[][] tabel = Logic.firstFit("1,8;35,4;3,6;4,2;1,4;3,3;1,2;5,1;50,1");
        tabel = Logic.tabeliLoomine();
        tableView = createTableView(tabel);
        flow.getChildren().add(tableView);
        BorderPane border = new BorderPane();
        /*border.setLeft(esimene);
        border.setCenter(teine);
        border.setRight(kolmas);
        border.setTop(endaOma);*/
        HBox hbox = new HBox();
        hbox.getChildren().addAll(firstFit,lastFit,worstFit,randomFit,clearWindow);
        border.setBottom(hbox);
        flow.getChildren().add(border);
        Scene scene = new Scene(flow,1600,600);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource()==firstFit){
            System.out.println("jou");
            tabel = Logic.firstFit("1,8;35,4;3,6;4,2;1,4;3,3;1,2;5,1;50,1");
            tableView = createTableView(tabel);
            //tableView = createTableView(tabel);
            tableView.refresh();
        }

    }


    private ObservableList<ObservableList<String>> buildData(String[][] dataArray) {
        ObservableList<ObservableList<String>> data = FXCollections.observableArrayList();

        for (String[] row : dataArray) {
            data.add(FXCollections.observableArrayList(row));
        }

        return data;
    }
    private TableView<ObservableList<String>> createTableView(String[][] dataArray) {
        TableView<ObservableList<String>> tableView = new TableView<>();
        tableView.setItems(buildData(dataArray));

        for (int i = 0; i < dataArray[0].length; i++) {
            final int curCol = i;
            final TableColumn<ObservableList<String>, String> column = new TableColumn<>(Integer.toString(curCol + 1)
            );
            column.setCellValueFactory(
                    param -> new ReadOnlyObjectWrapper<>(param.getValue().get(curCol))
            );
            tableView.getColumns().add(column);
        }

        return tableView;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
