package frontend;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;




/**
 *
 * Diese Klasse kummert sich um Die GeheimzahlGui
 * @author  donchi donald
 */
public class GeheimzahlGui extends Application implements SeiteMaker{
    private MenuItem exit, restart, ueber_das_spiel, autor;
    private BorderPane root;
    private Button start;


    /**
     * Main-Methode
     * @param args
     */
    public static void main(String[] args) {
        Thread la = new Thread(()->{
            launch(args);
        }, "Launch-Thread");
       la.start();

    }

    /**
     * Startpunkt des Gui
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {

        root = new BorderPane();
        root.setTop(menuSetting()); //Damit das Menu immer ganz oben steht
        root.setCenter(willkommenseite());
        root.getCenter().setId("center");


        Scene scene = new Scene(root, 900, 400);
        stage.setScene(scene);
        displaySetting(stage, scene);
        stage.show();
    }

    /**
     * DisplaySetting
     * @param stage
     * @param scene
     */
    private void displaySetting(Stage stage, Scene scene) {
        //set the Properties of the Stage
        stage.setTitle("Multiplayer_Geheimzahl");
        scene.getStylesheets().add(getClass().getResource("../common/application.css").toExternalForm());
        stage.setX(500);
        stage.setY(200);
        stage.setMinHeight(300);

    }

    /**
     * Diese Methode kümmert sich um Menu
     * @return ein Vbox Component: Fuer das Vertikal zuordnung
     */
    private VBox menuSetting() {
        MenuBar mbar = new MenuBar();
        Menu file = new Menu("File");
        Menu info = new Menu("Info");
        restart = new MenuItem("restart");
        exit = new MenuItem("exit");
        ueber_das_spiel = new MenuItem("über das Spiel");
        autor = new MenuItem("autor");


        file.getItems().addAll(exit, restart); //MenuItem für das Menu file
        info.getItems().addAll(ueber_das_spiel, autor); //MenuItem für das Menu info

        mbar.getMenus().addAll(file, info); //alle Menu in MenuBar hinzufuegen
        //hier fehlt die event des MenuItem
        return new VBox(mbar);
    }


    /**
     * willkomenSeite
     *
     * @return
     */
    @Override
    public GridPane willkommenseite() {

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(20));
        gp.setHgap(25);
        gp.setVgap(15);


        Label willkommen = new Label("Willkommen bei Geheimzahlspiel mit Multiplayer");
        gp.add(willkommen, 0, 0);


        start = new Button("Start");
        gp.add(start, 1, 2);
        return gp;
    }

    /**
     * Diese methode kümmert sich um die Anzahl der Spielers
     *
     * @return
     */
    @Override
    public GridPane anzahl_spilerseite() {
        return null;
    }

    /**
     * Diese methode kümmert sich um den Nameneintrag
     *
     * @return
     */
    @Override
    public GridPane spielname_seite() {
        return null;
    }

    /**
     * Diese methode kümmert sich um die SpielMethode
     *
     * @return
     */
    @Override
    public GridPane spielmethode_seite() {
        return null;
    }

    /**
     * Diese methode kümmert sich um das SpielInformation, die zu beachten ist
     *
     * @return
     */
    @Override
    public GridPane spielhinweis_seite() {
        return null;
    }

    /**
     * Diese methode kümmert sich um das Spiel-Seite
     *
     * @return
     */
    @Override
    public BorderPane spiel_seite() {
        return null;
    }

    /**
     * Diese methode kümmert sich um das GameOver
     *
     * @return
     */
    @Override
    public GridPane gameover_seite() {
        return null;
    }

    /**
     * Diese methode kümmert sich um das Ergebnis
     *
     * @return
     */
    @Override
    public BorderPane resultat_seite() {
        return null;
    }
}




