
public class Tim {
    private int ID_tima;
    private String Naziv;
    private Liga ID_lige;
    private Utakmica ID_utakmice;

    public Tim() { //konstruktor bez parametara sa defaultnim vrijednostima
        this.ID_tima = 0;
        this.Naziv = "";
        this.ID_lige = 0;
        this.ID_utakmice = 0;
    }

    public Tim(int ID_tima, String naziv, Liga ID_lige, Utakmica ID_utakmice) { //konsturktor koji prima sve parametre postavljajuci vrijednost atributa
        this.ID_tima = ID_tima;
        Naziv = naziv;
        this.ID_lige = ID_lige;
        this.ID_utakmice = ID_utakmice;
    }
    //getteri i setteri

    public int getID_tima() {
        return ID_tima;
    }

    public void setID_tima(int ID_tima) {
        this.ID_tima = ID_tima;
    }

    public String getNaziv() {
        return Naziv;
    }

    public void setNaziv(String naziv) {
        Naziv = naziv;
    }

    public Liga getID_lige() {
        return ID_lige;
    }

    public void setID_lige(Liga ID_lige) {
        this.ID_lige = ID_lige;
    }

    public Utakmica getID_utakmice() {
        return ID_utakmice;
    }

    public void setID_utakmice(Utakmica ID_utakmice) {
        this.ID_utakmice = ID_utakmice;
    }
    @Override //metoda za ispis toString
    public String toString(){
        String rezultat = "";
        rezultat = "ID_tima: " + ID_tima + "Naziv: " + Naziv + "ID_lige: " + ID_lige + "ID_utakmice: " + ID_utakmice;
        return rezultat;
    }
}
