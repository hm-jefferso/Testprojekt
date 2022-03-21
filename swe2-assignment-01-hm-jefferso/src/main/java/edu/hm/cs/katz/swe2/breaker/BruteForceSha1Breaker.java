package edu.hm.cs.katz.swe2.breaker;

public class BruteForceSha1Breaker {

    public String findPassword(String sha1Hash) {

        // TODO: Bisher werden nur Passwoerter mit drei Buchstaben getestet!
        for (char letter1 = 'a'; letter1 <= 'z'; letter1++) {
            for (char letter2 = 'a'; letter2 <= 'z'; letter2++) {
                for (char letter3 = 'a'; letter3 <= 'z'; letter3++) {
                    String password = "" + letter1 + letter2 + letter3;

                    // TODO: Ueberpruefen, ob Passwort den gegebenen SHA1-Hash hat!
                    // Im Erfolgsfall das Passwort zurueckgeben

                }

            }

        }

        // Wurde kein passendes Passwort gefunden, gib null zurueck.
        return null;
    }

}
