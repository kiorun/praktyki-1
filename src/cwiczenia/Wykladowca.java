package cwiczenia;

public class Wykladowca extends Human {

    protected String email;
    boolean czy_ma_wylane = true;

    String[] przedmioty;

    public Wykladowca(double wzrost, char plec, double rozmiar_buta, boolean czy_lysy, String color_wlosow, int wiek, Human[] rodzice, String email, boolean czy_ma_wylane, String[] przedmioty) {
        super(wzrost, plec, rozmiar_buta, czy_lysy, color_wlosow, wiek, rodzice);
        this.email = email;
        this.czy_ma_wylane = czy_ma_wylane;
        this.przedmioty = przedmioty;
    }



}