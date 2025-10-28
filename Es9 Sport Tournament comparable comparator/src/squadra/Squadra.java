package squadra;

import java.util.Objects;

public class Squadra implements Comparable<Squadra> {
    private String name;
    private String schoolName;
    private String sportPraticato;
    private int punteggioTotale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSportPraticato() {
        return sportPraticato;
    }

    public void setSportPraticato(String sportPraticato) {
        this.sportPraticato = sportPraticato;
    }

    public int getPunteggioTotale() {
        return punteggioTotale;
    }

    public void setPunteggioTotale(int punteggioTotale) {
        this.punteggioTotale = punteggioTotale;
    }

    public Squadra(String name, String schoolName, String sportPraticato, int punteggioTotale) {
        this.name = name;
        this.schoolName = schoolName;
        this.sportPraticato = sportPraticato;
        this.punteggioTotale = punteggioTotale;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Squadra squadra = (Squadra) o;
        return Objects.equals(name, squadra.name) && Objects.equals(schoolName, squadra.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }

    @Override
    public int compareTo(Squadra o) {
        return this.name.compareTo(o.name);
    }
}
