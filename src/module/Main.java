package module;

import prix.PrixNormal;
import prix.PrixNouveaute;
import statement.HtmlStatement;
import statement.TextStatement;

public class Main {
    public static void main(String[] args) {
        // Création des films avec leur type de prix
        Film film1 = new Film("module.Film 1");
        film1.setPrix(new PrixNormal(film1));  // module.Film avec prix normal

        Film film2 = new Film("module.Film 2");
        film2.setPrix(new PrixNouveaute(film2));  // module.Film avec prix nouveauté

        // Création des locations
        Location location1 = new Location(film1, 3);  // module.Location de 3 jours
        Location location2 = new Location(film2, 5);  // module.Location de 5 jours

        // Création du client avec la stratégie de texte
        Client client = new Client("Jean Dupont", new TextStatement());
        client.addLocation(location1);
        client.addLocation(location2);

        // Afficher la situation du client en format texte
        System.out.println(client.getStatement());

        // Changer de stratégie pour HTML
        client = new Client("Jean Dupont", new HtmlStatement());
        client.addLocation(location1);  // Re-ajouter les locations après le changement de stratégie
        client.addLocation(location2);

        // Afficher la situation du client en format HTML
        System.out.println(client.getStatement());
    }
}
