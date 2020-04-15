import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class NoiseRemover {
    HashMap<String,Integer> signalSpaceNoiseOccurrencesMap;
    String CleanEncodedMessage = "";
    String encodedMessage;

    public NoiseRemover(String encoded){
        this.encodedMessage = encoded;
        this.CleanEncodedMessage = "";
        this. signalSpaceNoiseOccurrencesMap = new HashMap<>();
    }

    public void removeNoise() {
        String clean = this.encodedMessage;
        if (hasNoise()) {
            for (String letter :identifyNoiseLetters()){
                clean = clean.replaceAll(letter, "");
            }
        }
        this.CleanEncodedMessage = clean;
    }

        //populates field map with the raw letters and number of occurrences
        public void getEncodedOccurrences (){
            HashMap<String, Integer> encodedMap = new HashMap<>();
            for (char letter : encodedMessage.toCharArray()) {
                String currentLetter = Character.toString(letter);
                if (encodedMap.containsKey(currentLetter)) {
                    Integer occurrences = encodedMap.get(currentLetter);
                    occurrences++;
                    encodedMap.put(currentLetter, occurrences);
                } else {
                    encodedMap.put(currentLetter, 1);
                }
                this.signalSpaceNoiseOccurrencesMap = encodedMap;
            }
        }

        //checks if message contains noise
        public boolean hasNoise() {
        getEncodedOccurrences();
            if (this.signalSpaceNoiseOccurrencesMap.keySet().size() > 2) {
                return true;
            }
            return false;
        }

        //converts field map to descending ArrayList<Integer>
        public ArrayList<Integer> fieldMapToDescendingList () {
            ArrayList<Integer> occurrenceList = new ArrayList<>(signalSpaceNoiseOccurrencesMap.values());
            Collections.sort(occurrenceList);
            Collections.reverse(occurrenceList);
            return occurrenceList;
        }

        //identifies noise letters
        public HashSet<String> identifyNoiseLetters (){
            ArrayList<Integer> descendingOccurrenceList = fieldMapToDescendingList();
            HashSet<String> noiseLetters = new HashSet<>();
            for (int i = 2; i < descendingOccurrenceList.size(); i++) {
                for (String letter : signalSpaceNoiseOccurrencesMap.keySet()){
                    if (descendingOccurrenceList.get(i) >= signalSpaceNoiseOccurrencesMap.get(letter)){
                        noiseLetters.add(letter);
                    }
                }
            }
            return noiseLetters;
        }









    public HashMap<String, Integer> getSignalSpaceNoiseOccurrencesMap() {
        return signalSpaceNoiseOccurrencesMap;
    }

    public void setSignalSpaceNoiseOccurrencesMap(HashMap<String, Integer> signalSpaceNoiseOccurrencesMap) {
        this.signalSpaceNoiseOccurrencesMap = signalSpaceNoiseOccurrencesMap;
    }

    public String getCleanEncodedMessage() {
        return CleanEncodedMessage;
    }

    public void setCleanEncodedMessage(String CleanEncodedMessage) {
        this.CleanEncodedMessage = CleanEncodedMessage;
    }

    public String getEncodedMessage() {
        return encodedMessage;
    }

    public void setEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
    }


}
