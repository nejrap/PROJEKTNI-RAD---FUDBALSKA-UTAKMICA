public class Rezultat {
    private int ID_rezultata;
    private String Rezultat;

    public Rezultat() {//konstruktor bez parametara sa defaultnim vrijednostima
        this.ID_rezultata = 0;
        this.Rezultat = "-";
    }

    public Rezultat(int ID_rezultata, String rezultat) { //konstruktor koji prima sve parametre postavljajuci vrijednost atributa
        this.ID_rezultata = ID_rezultata;
        Rezultat = rezultat;
    }
    //getteri i setteri
    public int getID_rezultata() {
        return ID_rezultata;
    }

    public void setID_rezultata(int ID_rezultata) {
        this.ID_rezultata = ID_rezultata;
    }

    public String getRezultat() {
        return Rezultat;
    }

    public void setRezultat(String rezultat) {
        Rezultat = rezultat;
    }
    @Override //metoda za ispis toString
    public String toString(){
        String rezultat = "";
        rezultat = "ID_rezultata: " + ID_rezultata + "Rezultat: "  +Rezultat;
        return rezultat;
    }
}
