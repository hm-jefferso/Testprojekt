package edu.hm.cs.katz.swe2.breaker;

/**
 * Anwendung zum Ermitteln eines Geheimnisses zu einem Hash.
 * 
 * @author katz.bastian
 */
public class HashBreakerApplication {

    /**
     * Gibt zu einem gegebenen Hash das Passwort aus, sofern es einfach genug.
     * 
     * @param args Hash (erstes Argument), sonst wird b8e059cb1023985fb7a93cc3e233114b5c088bea
     *             als default verwendet
     */
    public static void main(String... args) {

        // Verwende den Hash aus der Aufgabenstellung, falls kein
        // Parameter uebergeben wird.
        String sha1Hash = "b8e059cb1023985fb7a93cc3e233114b5c088bea";

        if (args.length > 0) {
            sha1Hash = args[0];
        }

        // Erzeuge ein Objekt der Klasse BruteForceSha1Breaker und
        // frage es nach dem Passwort zum Hash.
        BruteForceSha1Breaker breaker = new BruteForceSha1Breaker();
        String password = breaker.findPassword(sha1Hash);

        // Gib das gefundene Passwort aus
        if (password != null) {
            System.out.println("Passwort ist " + password);
        } else {
            System.out.println("Passwort konnte nicht ermittelt werden.");
        }

    }
}
