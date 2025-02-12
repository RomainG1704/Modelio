package statement;

import module.Client;
import module.Location;

public abstract class Statement {

    public String getClientSummary(Client client) {
        StringBuilder result = new StringBuilder();

        // 1. Mise en forme de l'en-tête du client
        result.append(formatHeader(client));

        // 2. Mise en forme des locations du client
        for (Location location : client.getLocations()) {
            result.append(formatLocation(location));
        }

        // 3. Mise en forme du récapitulatif client
        result.append(formatFooter(client));

        return result.toString();
    }

    // Partie de l'algorithme, à implémenter par les sous-classes
    protected abstract String formatHeader(Client client);

    protected abstract String formatLocation(Location location);

    protected abstract String formatFooter(Client client);
}
