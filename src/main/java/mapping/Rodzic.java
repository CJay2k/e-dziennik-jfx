package mapping;

public class Rodzic implements java.io.Serializable {

    private long pesel;
    private Autoryzacja autoryzacja;
    private Uczen uczen;
    private String imieOjca;
    private String nazwiskoOjca;
    private String imieMatki;
    private String nazwiskoMatki;

    public Rodzic() {
    }

    public Rodzic(Autoryzacja autoryzacja) {
        this.autoryzacja = autoryzacja;
    }

    public Rodzic(Autoryzacja autoryzacja, Uczen uczen, String imieOjca, String nazwiskoOjca, String imieMatki, String nazwiskoMatki) {
        this.autoryzacja = autoryzacja;
        this.uczen = uczen;
        this.imieOjca = imieOjca;
        this.nazwiskoOjca = nazwiskoOjca;
        this.imieMatki = imieMatki;
        this.nazwiskoMatki = nazwiskoMatki;
    }

    public long getPesel() {
        return this.pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public Autoryzacja getAutoryzacja() {
        return this.autoryzacja;
    }

    public void setAutoryzacja(Autoryzacja autoryzacja) {
        this.autoryzacja = autoryzacja;
    }

    public Uczen getUczen() {
        return this.uczen;
    }

    public void setUczen(Uczen uczen) {
        this.uczen = uczen;
    }

    public String getImieOjca() {
        return this.imieOjca;
    }

    public void setImieOjca(String imieOjca) {
        this.imieOjca = imieOjca;
    }

    public String getNazwiskoOjca() {
        return this.nazwiskoOjca;
    }

    public void setNazwiskoOjca(String nazwiskoOjca) {
        this.nazwiskoOjca = nazwiskoOjca;
    }

    public String getImieMatki() {
        return this.imieMatki;
    }

    public void setImieMatki(String imieMatki) {
        this.imieMatki = imieMatki;
    }

    public String getNazwiskoMatki() {
        return this.nazwiskoMatki;
    }

    public void setNazwiskoMatki(String nazwiskoMatki) {
        this.nazwiskoMatki = nazwiskoMatki;
    }


}

