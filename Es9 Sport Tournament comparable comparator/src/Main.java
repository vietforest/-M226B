import squadra.Squadra;
import squadra.TournamentManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TournamentManager manager =  new TournamentManager();
        Squadra lupiVerdi = new Squadra("Lupi Verdi", "Scuola Alfa", "Calcio", 12);
        Squadra tigriBlu = new Squadra("Tigri Blu", "Scuola Beta", "Pallavolo", 15);
        Squadra falchiRossi = new Squadra("Falchi Rossi", "Scuola Alfa", "Calcio", 12);
        Squadra pantereNere = new Squadra("Pantere Nere", "Scuola Gamma", "Basket", 9);

        manager.addTeam(lupiVerdi);
        manager.addTeam(tigriBlu);
        manager.addTeam(falchiRossi);
        manager.addTeam(pantereNere);

        manager.PrintTeamSortedbyNatural();
        manager.PrintTeamsSortedbySchool();
        manager.PrintTeamSortedBySport();




    }
}