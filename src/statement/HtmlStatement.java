package statement;

import module.Client;
import module.Location;

public class HtmlStatement extends Statement {

    @Override
    protected String formatHeader(Client client) {
        return "<h1>Situation du client: " + client.getNom() + "</h1>";
    }

    @Override
    protected String formatLocation(Location location) {
        return "<p>" + location.getFilm().getTitre() + ": " + String.valueOf(location.getMontant()) + "</p>";
    }

    @Override
    protected String formatFooter(Client client) {
        double montantTotal = client.getMontantTotal();
        int pointsFidelitesTotal = client.getPointsFidelitesTotal();
        return "<p>Total: " + montantTotal + "</p>" + "<p>Vous gagnez " + pointsFidelitesTotal + " points de fidelite</p>";
    }
}
