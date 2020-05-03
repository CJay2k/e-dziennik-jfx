package mapping;

import java.util.Date;

public class Zajecia implements java.io.Serializable {

    private Integer id;
    private Klasa klasa;
    private Nauczyciel nauczyciel;
    private Przedmiot przedmiot;
    private Date godzina;
    private String dzien;

    public Zajecia() {
    }

    public Zajecia(Klasa klasa, Nauczyciel nauczyciel, Przedmiot przedmiot, Date godzina, String dzien) {
        this.klasa = klasa;
        this.nauczyciel = nauczyciel;
        this.przedmiot = przedmiot;
        this.godzina = godzina;
        this.dzien = dzien;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Klasa getKlasa() {
        return this.klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    public Nauczyciel getNauczyciel() {
        return this.nauczyciel;
    }

    public void setNauczyciel(Nauczyciel nauczyciel) {
        this.nauczyciel = nauczyciel;
    }

    public Przedmiot getPrzedmiot() {
        return this.przedmiot;
    }

    public void setPrzedmiot(Przedmiot przedmiot) {
        this.przedmiot = przedmiot;
    }

    public Date getGodzina() {
        return this.godzina;
    }

    public void setGodzina(Date godzina) {
        this.godzina = godzina;
    }

    public String getDzien() {
        return this.dzien;
    }

    public void setDzien(String dzien) {
        this.dzien = dzien;
    }

    public String getNazwaPrzedmiotu() {
        return this.przedmiot.getNazwaPrzedmiotu();
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.przedmiot.setNazwaPrzedmiotu(nazwaPrzedmiotu);
    }
    public String getNazwaKlasy() {
        return this.przedmiot.getNazwaPrzedmiotu();
    }

    public void setNazwaKlasy(String nazwaKlasy) {
        this.klasa.setNazwaKlasy(nazwaKlasy);
    }

}


