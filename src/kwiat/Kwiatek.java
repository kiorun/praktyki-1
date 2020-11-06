package kwiat;

public class Kwiatek {
    String nazwa;
    String nazwałacińska;
    String kolorpłatków;
    String kolorliści = "zielony";

    boolean czytrujący;
    String rzadkośćwystępowania;

    void setNazwa(String nazwa) {
        this.nazwa = nazwa;

    }

    void setKolorpłatków(String kolorpłatków) {
        this.kolorpłatków = kolorpłatków;


    }

    void setNazwałacińska(String nazwałacińska) {
        this.nazwałacińska = nazwałacińska;


    }

    void setKolorliści(String kolorliści) {
        this.kolorliści = kolorliści;


    }

    void setCzytrujący(boolean czytrujący) {
        this.czytrujący = czytrujący;


    }

    void setRzadkość(String rzadkośćwystępowania) {
        this.rzadkośćwystępowania = rzadkośćwystępowania;

    }


        String getNazwa(){
            return this.nazwa;
            }

        String getRzadkość(){
             return this.rzadkośćwystępowania;
             }


}
