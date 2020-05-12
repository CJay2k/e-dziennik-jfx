package mapping;

public class Autoryzacja implements java.io.Serializable {

    private long pesel;
    private String login;
    private String haslo;
    private int rola;

    private Nauczyciel nauczyciel;
    private Uczen uczen;
    private Rodzic rodzic;

    public Autoryzacja() {
    }

    public Autoryzacja(Nauczyciel nauczyciel, String login, String haslo, int rola) {
        this.nauczyciel = nauczyciel;
    }

    public Autoryzacja(long pesel, String login, String haslo, int rola) {
        this.pesel = pesel;
        this.login = login;
        this.haslo = haslo;
        this.rola = rola;
    }

    public Autoryzacja(long pesel, String login, String haslo, int rola, Nauczyciel nauczyciel, Uczen uczen, Rodzic rodzic) {
        this.pesel = pesel;

        this.login = login;
        this.haslo = haslo;
        this.rola = rola;
        this.nauczyciel = nauczyciel;
        this.uczen = uczen;
        this.rodzic = rodzic;
    }

    public long getPesel() {
        return this.pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public Nauczyciel getNauczyciel() {
        return this.nauczyciel;
    }

    public void setNauczyciel(Nauczyciel nauczyciel) {
        this.nauczyciel = nauczyciel;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return this.haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public int getRola() {
        return this.rola;
    }

    public void setRola(int kto) {
        this.rola = kto;
    }

    public Uczen getUczen() {
        return this.uczen;
    }

    public void setUczen(Uczen uczen) {
        this.uczen = uczen;
    }

    public Rodzic getRodzic() {
        return this.rodzic;
    }

    public void setRodzic(Rodzic rodzic) {
        this.rodzic = rodzic;
    }


}

