package squadra;
import team_compartore.ComparatorSport;
import team_compartore.TeamNameComparator;

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class TournamentManager {
    private ArrayList<Squadra> squadra = new ArrayList<>();

    public TournamentManager() {

    }

    public List<Squadra> getSquadra() {
        return squadra;
    }

    public void setSquadra(ArrayList<Squadra> squadra) {
        this.squadra = squadra;
    }

    public void addTeam(Squadra team) {
        this.squadra.add(team);
    }

    public void updateScore(String teamName, int delta) {
        for (Squadra squadra : this.squadra) {
            if (squadra.getName().equals(teamName)) {
                squadra.setPunteggioTotale(squadra.getPunteggioTotale() + delta);
            }
        }
    }

    public void PrintTeamSortedbyNatural(){
        Collections.sort(squadra);
        System.out.println(squadra);
    }

    public void PrintTeamSortedBySport(){
        Collections.sort(squadra, new ComparatorSport());
        System.out.println(squadra);
    }

    public void PrintTeamsSortedbySchool(){
        Collections.sort(squadra, new TeamNameComparator());
        System.out.println(squadra);
    }

    public void printScore(){
        for (Squadra squadra : this.squadra) {
            System.out.println(squadra.getPunteggioTotale());
        }
    }
}

