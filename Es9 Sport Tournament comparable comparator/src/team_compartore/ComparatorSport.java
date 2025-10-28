package team_compartore;

import squadra.Squadra;

import java.util.Comparator;

public class ComparatorSport implements Comparator<Squadra> {
    @Override
    public int compare(Squadra o1, Squadra o2) {
        return Integer.compare(o1.getPunteggioTotale(), o2.getPunteggioTotale());
    }
}
