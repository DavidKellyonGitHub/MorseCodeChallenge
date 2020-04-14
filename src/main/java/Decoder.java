import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Decoder {
    ArrayList<String> encodedWords = new ArrayList<>();
    HashMap<String,Integer> signalSpaceNoiseOccurrencesMap = new HashMap<>();
    ArrayList<String> noiseLetters = new ArrayList<>();
    boolean hasNoise = false;

    public static String decode(String encoded) {
        return null;
    }

    //populates field map with the raw letters and number of occurrences
    public void getEncodedOccurrences(String encoded) {
        HashMap<String, Integer> encodedMap = new HashMap<>();
        for (char letter : encoded.toCharArray()) {
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
    public boolean hasNoise(){
        if (signalSpaceNoiseOccurrencesMap.keySet().size()>2){
            return true;
        }
        return false;
    }

    //checks selection against .
    public Boolean isDit(String checkMeForDit) {
        return true;
    }

    //checks selection against _
    public boolean isDah(String checkMeForDah) {
        return false;
    }

    //checks selection against space
    public boolean isSpace(String checkMeForSpace){
        return false;
    }

    //returns inversion of field hashmap
    public HashMap<Integer, String> invertFieldMap(){
        HashMap<Integer, String> inverted = new HashMap<>();
        for (String str: signalSpaceNoiseOccurrencesMap.keySet()){
            inverted.put(signalSpaceNoiseOccurrencesMap.get(str), str);
        }
        return inverted;
    }

    //converts field map to descending ArrayList<Integer>
    public ArrayList<Integer> fieldMapToDescendingList(){
        ArrayList<Integer> occurrenceList = new ArrayList<>();
        HashMap<Integer,String> inverted = invertFieldMap();
        occurrenceList.addAll(inverted.keySet());
        Collections.sort(occurrenceList);
        Collections.reverse(occurrenceList);
        return occurrenceList;
    }

    //identifies noise letters
    public ArrayList<String> identifyNoiseLetters(String encoded){
        ArrayList<Integer> descendingOccurrenceList = fieldMapToDescendingList();
        ArrayList<String> noiseLetters = new ArrayList<>();
        for (int i = 2;i<descendingOccurrenceList.size();i++){
            noiseLetters.add(invertFieldMap().get(descendingOccurrenceList.get(i)));
        }

        Collections.sort(noiseLetters);
        return noiseLetters;
    }

    //checks if selection is noise
    public boolean isNoise(String checkMeForNoise){
        if (!isDit(checkMeForNoise) && !isDah(checkMeForNoise) && !isSpace(checkMeForNoise)){
            return true;
        }
        return false;
    }

    //adds encoded words to field list encodedWords
    public void identifyWords(String encoded){
        ArrayList<String> parsedWords = new ArrayList<String>();
            this.encodedWords = new ArrayList<String>();
    }

    //consider using pattern matcher
    public String identifyLetter(String patternToMatch){
        return null;
    }





}
