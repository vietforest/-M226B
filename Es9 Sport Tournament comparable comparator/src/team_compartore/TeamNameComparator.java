package team_compartore;

import squadra.Squadra;

import java.util.Comparator;

public class TeamNameComparator implements
        Comparator<Squadra> {
    @Override
    public int compare(Squadra t1, Squadra t2) {
        return t1.getName().compareTo(t2.getName());
    }
}
