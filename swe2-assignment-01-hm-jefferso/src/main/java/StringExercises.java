import java.util.Arrays;

/**
 * Übungen zu Strings.
 * 
 * @author Lenz Karbaumer
 *
 */
public class StringExercises {

    /**
     * Demo der methoden.
     * 
     */
    public static void main(String... args) {
        /*
         * In der main-Methode NICHTS ÄNDERN! Diese enthällt für jede Aufgabe bzw. Methode die Sie
         * schreiben sollen einige Beispiele.
         * 
         * Nutzen Sie nur die vordefinierten String-Methoden indexOf, substring, length und charAt!
         * Natürlich können Sie auch die anderen Methoden in dieser Klasse verwenden! Außerdem
         * werden Sie die Methode Double.parseDouble() brauchen.
         */

        // Aufgabe 1
        System.out.println("---------- Aufgabe 1 ----------");
        print("isNumber('4')", isNumber('4'), "true");
        print("isNumber('a')", isNumber('a'), "false");
        print("isNumber('0')", isNumber('0'), "true");
        print("isNumber('9')", isNumber('9'), "true");
        print("isNumber('T')", isNumber('T'), "false");
        

        // Aufgabe 2
        System.out.println("---------- Aufgabe 2 ----------");
        print("replaceAll('c', 'a', \"cbrckcdcbrc\")", replaceAll('c', 'a', "cbrckcdcbrc"),
                "abrakadabra");
        print("replaceAll('f', 'i', \"simsalabim\")", replaceAll('f', 'i', "simsalabim"),
                "simsalabim");
        print("replaceAll('i', 'i', \"simsalabim\")", replaceAll('i', 'i', "simsalabim"),
                "simsalabim");

        // Aufgabe 3
        System.out.println("---------- Aufgabe 3 ----------");
        print("occurancesOf('m', \"simsalabim\")", occurancesOf('m', "simsalabim"), "2");
        print("occurancesOf('l', \"simsalabim\")", occurancesOf('l', "simsalabim"), "1");
        print("occurancesOf('f', \"simsalabim\")", occurancesOf('f', "simsalabim"), "0");
        print("occurancesOf('a', \"abrakadabra simsalabim\")",
                occurancesOf('a', "abrakadabra simsalabim"), "7");

        // Aufgabe 4
        System.out.println("---------- Aufgabe 4 ----------");
        print("trim(\" abbccc     \")", trim(" abbccc     "), "abbccc");
        print("trim(\"abb ccc\")", trim("abb ccc"), "abb ccc");

        // Aufgabe 5
        System.out.println("---------- Aufgabe 5 ----------");
        print("lastIndexOf('b', \"abcabc\", 1)", lastIndexOf('b', "abcabc", 1), "1");
        print("lastIndexOf('a', \"abcabc\", 2)", lastIndexOf('a', "abcabc", 2), "0");
        print("lastIndexOf('f', \"abcabcd\", 4)", lastIndexOf('f', "abcabcd", 4), "-1");

        // Aufgabe 6
        System.out.println("---------- Aufgabe 6 ----------");
        print("split(\"tik tok tik tak\", ' ')", Arrays.toString(split("tik tok tik tak", ' ')),
                "[tik, tok, tik, tak]");
        print("split(\".tik...tok.tik.tak.\", '.')",
                Arrays.toString(split(".tik...tok.tik.tak.", '.')), "[, tik, , , tok, tik, tak, ]");
        print("split(\"tik tok tik tak\", '.')", Arrays.toString(split("tik tok tik tak", '.')),
                "[tik tok tik tak]");

        // Aufgabe 7
        System.out.println("---------- Aufgabe 7 ----------");

        final String testText1 = "Salary Job 3 1451.00$ Salary4 435.23$ fuel -237.99$ "
                + "Contract1-done-4.5 484.70$ restaurant -342.78$";
        final String testText2 = "Post-ironic tacos vegan helvetica, 8.70 bag messenger kicks";
        final String testText3 = "Interactively 68234.00$procrastinate high-payoff 7634.50$ "
                + "content without -695634.00$backward-compatible data.";

        print("calculateSum(\"" + testText1 + "\")", calculateSum(testText1), "1790.16");
        print("calculateSum(\"" + testText2 + "\")", calculateSum(testText2), "0.0");
        print("calculateSum(\"" + testText3 + "\")", calculateSum(testText3), "-619765.5");

        // Aufgabe 8
        System.out.println("---------- Aufgabe 8 ----------");

        final String testText4 = "Mueller 27389,34EUR\nSchmitt 5479,23EUR\nWhite 689234,63EUR\n"
                + "King 630774,20EUR\nDelorean 9520087,45EUR\nThomasson 243242,37EUR";

        print("preprocessData(\"" + testText4 + "\")",
                Arrays.deepToString(preprocessData(testText4)),
                "[[Mueller, 27389.34], [Schmitt, 5479.23], [White, 689234.63], [King, 630774.20], "
                        + "[Delorean, 9520087.45], [Thomasson, 243242.37]]");

        // Aufgabe 9
        System.out.println("---------- Aufgabe 9 ----------");
        print("formatNumber(1111111)", formatNumber(1111111), "1_111_111");
        print("formatNumber(2222)", formatNumber(2222), "2_222");
        print("formatNumber(3)", formatNumber(3), "3");
        print("formatNumber(444444)", formatNumber(444444), "444_444");
        print("formatNumber(777)", formatNumber(777), "777");
        print("formatNumber(99999999999)", formatNumber(99999999999L), "99_999_999_999");

    }

    /**
     * Aufgabe 1.
     * 
     * Überprüft ob ein Buchstabe eine Ziffer(0-9) ist.
     * 
     * @param character Buchstabe der überpruft werden soll.
     * @return
     */
    public static boolean isNumber(char character) {
        if(character.contains("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Aufgabe 2.
     * 
     * Ersetzt alle Vorkomnisse eines Buchstaben in einem Wort mit einem anderen Buchstaben.
     * 
     * @param oldChar Der Buchstabe der ersetzt werden soll
     * @param newChar Der Buchstabe der eingesetzt werden soll
     * @param word    Das Wort das verändert werden soll
     * @return Das Wort mit den ersetzten Buchstaben
     */
    public static String replaceAll(char oldChar, char newChar, String word) {
        return "";
    }

    /**
     * Aufgabe 3.
     * 
     * Zählt wie oft ein Buchstabe in einem Wort vorkommt.
     * 
     * @param character Der Buchstabe der gezählt werden soll
     * @param word      Das Wort in dem gezählt wird
     * @return Die Anzahl des Buchstaben im Wort
     */
    public static int occurancesOf(char character, String word) {
        return 0;
    }

    /**
     * Aufgabe 4.
     * 
     * Entfernt alle Leerzeichen am Anfang und Ende eines Wortes bzw. Textes.
     * 
     * @param word Das Wort das getrimmt werden soll
     * @return Das Wort ohne führende und folgende Leerzeichen
     */
    public static String trim(String word) {
        return "";
    }

    /**
     * Aufgabe 5.
     * 
     * Gibt den letzten Index eines gesuchten Buchstaben in einem Wort, bis zu einem bestimmten
     * Index, zurück. Kommt bis zu dem bestimmten Index der gesuchte Buchstabe nicht vor, wird -1
     * zurückgegeben. (Beispiele siehe main-Methode)
     * 
     * @param character Der gesuchte Buchstabe
     * @param word      Das Wort in dem gesucht wird
     * @param lastIndex der index vor
     * @return
     */
    public static int lastIndexOf(char character, String word, int lastIndex) {
        return 0;
    }

    /**
     * Aufgabe 6.
     * 
     * Zerteilt einen Text bei jedem Vorkommen eines Buchstaben. Folgt der Buchstabe an dem getrennt
     * wird zwei mal aufeinander, so wird an dieser Stelle ein Leerer String in das Array
     * geschrieben.
     * 
     * Beispiel: split("tik.tok.tak", '.') gibt ["tik", "tok", "tak"] zurück und der Aufruf
     * split("tik..tok", '.') gibt ["tik", "", "tok"] zurück
     * 
     * @param text Der Text der zerteilt werden soll
     * @param with Der Buchstabe an dem der Text zerteilt werden soll
     * @return Die Wörter in einem Array
     */
    public static String[] split(String text, char with) {
        return new String[0];
    }

    /**
     * Aufgabe 7.
     * 
     * Berechnet die Summe aller Dollar-Beträge in einem Text. Dabei wird davon ausgegangen, dass
     * ein solcher Dollar-Betrag zwischen einer Leerstelle und einem '$'-Zeichen steht. Die Beträge
     * können auch negativ sein.
     * 
     * Beispiel: calculateSum("text 23.00$ text -2.00$ text") gibt 21.0 zurück
     * 
     * @param text Der Text der verarbeitet werden soll
     * @return Die berechnete Summe
     */
    public static double calculateSum(String text) {
        return 0;
    }

    /**
     * Aufgabe 8.
     * 
     * Verarbeitet einen Text der in jeder Zeile einen Namen und einen Euro-Betrag enthält. Der
     * Euro-Betrag wird in "double-Schreibweise" umgeschrieben. Das char '\n' stellt einen
     * Zeilenumbruch dar.
     * 
     * Beispiel: preprocessData("King 3,32EUR\nKini 2,34EUR\nLudwig 5,30EUR") gibt das String Array
     * [[King, 3.32], [Kini, 2.34], [Ludwig, 5.30]] zurück
     * 
     * @param text Der Text der verarbeitet werden soll
     * @return Ein zweidimensionales Array vom Typ String, das die Namen-Euro-Paare in Arrays
     *         enthält.
     */
    public static String[][] preprocessData(String text) {
        return new String[0][];
    }

    /**
     * Aufgabe 9.
     * 
     * Konvertiert eine Zahl zu einem String und formatiert diesen für leichtere lesbarkeit. Das
     * heißt es wird alle drei Ziffern (von rechts gezählt) ein underscore eingefügt.
     * 
     * Beispiel: formatNumber(1111111) gibt "1_111_111" zurück
     * 
     * @param number Die zu formatierende Zahl
     * @return Die Zahl als formatierter String
     */
    public static String formatNumber(long number) {
        return "";
    }

    /**
     * Keine Aufgabe!
     * 
     * Hilfsmethode für die Ausgabe
     */
    public static void print(String method, Object result, String expected) {
        System.out.println("  " + method + ":");
        System.out.println("           was: " + result);
        System.out.println("      expected: " + expected);
        System.out.println();
    }
}
