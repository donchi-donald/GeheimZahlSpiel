package frontend;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public interface SeiteMaker {
    /**
     *willkomenSeite
     * @return
     */
    GridPane willkommenseite();

    /**
     *Diese methode kümmert sich um die Anzahl der Spielers
     * @return
     */
    GridPane anzahl_spilerseite();

    /**
     *Diese methode kümmert sich um den Nameneintrag
     * @return
     */
    GridPane spielname_seite();

    /**
     *Diese methode kümmert sich um die SpielMethode
     * @return
     */
    GridPane spielmethode_seite();

    /**
     *Diese methode kümmert sich um das SpielInformation, die zu beachten ist
     * @return
     */
    GridPane spielhinweis_seite();

    /**
     *Diese methode kümmert sich um das Spiel-Seite
     * @return
     */
    BorderPane spiel_seite();

    /**
     *Diese methode kümmert sich um das GameOver
     * @return
     */
    GridPane gameover_seite();

    /**
     *Diese methode kümmert sich um das Ergebnis
     * @return
     */
    BorderPane resultat_seite();
}
