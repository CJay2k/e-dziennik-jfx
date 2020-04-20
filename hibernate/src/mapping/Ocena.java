package mapping;

import java.util.Date;

public class Ocena implements java.io.Serializable {

    private Integer id;
    private Przedmiot przedmiot;
    private RodzajOceny rodzajOceny;
    private Uczen uczen;
    private Integer stopien;
    private Date data;

    public Ocena() {
    }


    public Ocena(Uczen uczen) {
        this.uczen = uczen;
    }

    public Ocena(Przedmiot przedmiot, RodzajOceny rodzajOceny, Uczen uczen, Integer stopien, Date data) {
        this.przedmiot = przedmiot;
        this.rodzajOceny = rodzajOceny;
        this.uczen = uczen;
        this.stopien = stopien;
        this.data = data;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Przedmiot getPrzedmiot() {
        return this.przedmiot;
    }

    public void setPrzedmiot(Przedmiot przedmiot) {
        this.przedmiot = przedmiot;
    }

    public RodzajOceny getRodzajOceny() {
        return this.rodzajOceny;
    }

    public void setRodzajOceny(RodzajOceny rodzajOceny) {
        this.rodzajOceny = rodzajOceny;
    }

    public Uczen getUczen() {
        return this.uczen;
    }

    public void setUczen(Uczen uczen) {
        this.uczen = uczen;
    }

    public Integer getStopien() {
        return this.stopien;
    }

    public void setStopien(Integer stopien) {
        this.stopien = stopien;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }


}

