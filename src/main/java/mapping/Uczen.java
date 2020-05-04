package mapping;

import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.common.reflection.XProperty;

import java.util.HashSet;
import java.util.Set;

public class Uczen implements java.io.Serializable {

    private long pesel;
    private Autoryzacja autoryzacja;
    private Klasa klasa;
    private String imie;
    private String nazwisko;
    private Set rodzics = new HashSet(0);
    private Set ocenas = new HashSet(0);
    private Set obecnoscs = new HashSet(0);
    private Set skladKlasies = new HashSet(0);

    public Uczen() {
    }

    public Uczen(Autoryzacja autoryzacja) {
        this.autoryzacja = autoryzacja;
    }

    public Uczen(Autoryzacja autoryzacja, Klasa klasa, String imie, String nazwisko, Set rodzics, Set ocenas, Set obecnoscs, Set skladKlasies) {
        this.autoryzacja = autoryzacja;
        this.klasa = klasa;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rodzics = rodzics;
        this.ocenas = ocenas;
        this.obecnoscs = obecnoscs;
        this.skladKlasies = skladKlasies;
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

    public Klasa getKlasa() {
        return this.klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Set getRodzics() {
        return this.rodzics;
    }

    public void setRodzics(Set rodzics) {
        this.rodzics = rodzics;
    }

    public Set getOcenas() {
        return this.ocenas;
    }

    public void setOcenas(Set ocenas) {
        this.ocenas = ocenas;
    }

    public Set getObecnoscs() {
        return this.obecnoscs;
    }

    public void setObecnoscs(Set obecnoscs) {
        this.obecnoscs = obecnoscs;
    }

    public Set getSkladKlasies() {
        return this.skladKlasies;
    }

    public void setSkladKlasies(Set skladKlasies) {
        this.skladKlasies = skladKlasies;
    }

    public String getNazwaKlasy() {
        return this.klasa.getNazwaKlasy();
    }

    public void setNazwaKlasy(String nazwa) {
        this.klasa.setNazwaKlasy(nazwa);
    }

}


