package unit1Package;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private final static fileInput stuffData = new fileInput("stuff.csv");
    private final static fileInput indata = new fileInput("places.csv");
    private final static Map<String, locationStuff> map = new HashMap();
    private final static fileOutput output = new fileOutput("output.txt");
    public static void main(String[] args) {

        String line;
        String[] words;
        Object wordFound;

        // cities File
        while ((line = indata.fileReadLine()) != null) {
            words = line.split(",");

        // System.out.println(line);
            wordFound = map.get(words[0]);
            if (wordFound == null) {
                map.put(words[0], new locationStuff(1));
            } else {
                locationStuff locationStuff = ((locationStuff) map.get(words[0]));
                locationStuff.incrementCity();
                map.put(words[0], locationStuff);

            }

        }

        // Stuff file
        while ((line = stuffData.fileReadLine()) != null) {
            words = line.split(",");
            wordFound = map.get(words[0]);
            if (wordFound == null) {
                map.put(words[0], new locationStuff(1));
            } else {

                locationStuff locationStuff = ((locationStuff) map.get(words[0]));
                locationStuff.incrementStuff();
                map.put(words[0], locationStuff);
            }
        }

        System.out.println("Country                 Cities                  Stuff");
        System.out.println("========                =======                 ========\n");
        for (Map.Entry<String, locationStuff> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "     " + entry.getValue());
        }

    }
}
