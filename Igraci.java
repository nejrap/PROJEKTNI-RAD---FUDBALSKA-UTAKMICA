import java.util.Date;


public class Igraci {
    private int ID_igraca;
    private String Ime;
    private String Prezime;
    private Date Datum_rodjenja;
    private int Godina;
    private String Pozicija;
    private Tim ID_tima;

    public Igraci() { //konstruktor bez parametara sa defaultnim vrijednostima
        this.ID_igraca = 0;
        this.Ime = "";
        this.Prezime = "";
        this.Datum_rodjenja = new Date();
        this.Godina = 0;
        this.Pozicija = "";
        this.ID_tima = 0;
    }

}
