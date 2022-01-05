package org.example.hugeinfo_12;

import java.io.FileReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class SymbolsCounterFromEntireFile {

    public static Map<Character, Long> count() {
        long startTime = System.currentTimeMillis();
        Map<Character, Long> letterContainer = new HashMap<>();
        try (FileReader fileReader = new FileReader("listTasks/data.txt");) {
            StreamTokenizer st = new StreamTokenizer(fileReader);
            st.resetSyntax();
            int token = 0;
            while ((token = st.nextToken()) != StreamTokenizer.TT_EOF) {
                if ((char) token == ' ') {
                    continue;
                }
                if (!letterContainer.containsKey((char) token)) {
                    letterContainer.put((char) token, 1L);
                } else {
                    letterContainer.put((char) token, letterContainer.get((char) token) + 1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Map.Entry<Character, Long> pair : letterContainer.entrySet()) {
            Character character = pair.getKey();
            Long amountOfCharacters = pair.getValue();
            System.out.println(character + " " + amountOfCharacters);
        }
        System.out.println( "Execution time: " + (double) (System.currentTimeMillis() - startTime));
        return letterContainer;

    }
}
