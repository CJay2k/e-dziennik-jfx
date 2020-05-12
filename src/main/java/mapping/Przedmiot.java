package mapping;

import java.util.HashSet;
import java.util.Set;

public class Przedmiot implements java.io.Serializable {


    private String nazwaPrzedmiotu;
    private Set obecnoscs = new HashSet(0);
    private Set ocenas = new HashSet(0);
    private Set zajecias = new HashSet(0);

    public Przedmiot() {
    }

    public Przedmiot(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public Przedmiot(String nazwaPrzedmiotu, Set obecnoscs, Set ocenas, Set zajecias) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        this.obecnoscs = obecnoscs;
        this.ocenas = ocenas;
        this.zajecias = zajecias;
    }

    public String getNazwaPrzedmiotu() {
        return this.nazwaPrzedmiotu;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public Set getObecnoscs() {
        return this.obecnoscs;
    }

    public void setObecnoscs(Set obecnoscs) {
        this.obecnoscs = obecnoscs;
    }

    public Set getOcenas() {
        return this.ocenas;
    }

    public void setOcenas(Set ocenas) {
        this.ocenas = ocenas;
    }

    public Set getZajecias() {
        return this.zajecias;
    }

    public void setZajecias(Set zajecias) {
        this.zajecias = zajecias;
    }


}

