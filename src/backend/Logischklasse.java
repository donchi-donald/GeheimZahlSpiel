package backend;

public class Logischklasse implements LogischInterface{
    private int anzahlDerZiffer;

    /**
     *
     * @param Geheimzahlziffer
     */
    public Logischklasse(int Geheimzahlziffer){
        this.anzahlDerZiffer = Geheimzahlziffer;
    }
    @Override
    public int anzahlderprimzahlziffer(int geheimzahl) {
        return 0;
    }

    @Override
    public int anzahldergeradezahlziffer(int geheimzahl) {
        return 0;
    }

    @Override
    public int anzahlderungeradezahlziffer(int geheimzahl) {
        return 0;
    }

    @Override
    public int[] geheimzahltointarray(int geheimzahl) {
        return new int[0];
    }

    @Override
    public int geheimzahlerzeuger(int anzahlderziffer) {
        return 0;
    }

    @Override
    public int summedergeheimzahlziffer(int geheimzahl) {
        return 0;
    }

    @Override
    public int multiplicationdergeheimzahlziffer(int geheimzahl) {
        return 0;
    }

    @Override
    public boolean isprimzahl(int zahl) {
        return false;
    }

    @Override
    public boolean isgeradezahl(int zahl) {
        return false;
    }

    @Override
    public String hilfezeiger() {
        return null;
    }
}
