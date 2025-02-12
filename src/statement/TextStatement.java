package statement;

import module.Client;
import module.Location;

public class TextStatement extends Statement {

    @Override
    protected String formatHeader(Client client) {
        return "Situation du client: " + client.getNom() + "\n";
    }

    @Override
    protected String formatLocation(Location location) {
        return "\t" + location.getFilm().getTitre() + "\t" + String.valueOf(location.getMontant()) + "\n";
    }

    @Override
    protected String formatFooter(Client client) {
        double montantTotal = client.getMontantTotal();
        int pointsFidelitesTotal = client.getPointsFidelitesTotal();
        return "Total du " + montantTotal + "\n" + "Vous gagnez " + pointsFidelitesTotal + " points de fidelite\n";
    }
}
