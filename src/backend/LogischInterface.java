package backend;

public interface LogischInterface {

    public int anzahlderprimzahlziffer(int geheimzahl);

    public int anzahldergeradezahlziffer(int geheimzahl);

    public int anzahlderungeradezahlziffer(int geheimzahl);

    public int[] geheimzahltointarray(int geheimzahl);

    public int geheimzahlerzeuger(int anzahlderziffer);

    public int summedergeheimzahlziffer(int geheimzahl);

    public int multiplicationdergeheimzahlziffer(int geheimzahl);

    public boolean isprimzahl(int zahl);

    public boolean isgeradezahl(int zahl);

    public String hilfezeiger();


}
