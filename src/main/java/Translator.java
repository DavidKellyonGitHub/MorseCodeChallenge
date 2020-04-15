import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Translator {
    ArrayList<String> encodedWords;
    String cleanEncodedMessage;
    HashMap<String, String> cypherMap;
    String[] signalSilence;
    String decodedMessage;

    public Translator(String CleanEncodedMessage, HashMap<String, String> cypherMap) {
        this.cleanEncodedMessage = CleanEncodedMessage;
        this.encodedWords = new ArrayList<>();
        this.cypherMap = cypherMap;
        this.signalSilence = new String[2];
        this.decodedMessage = "";
    }

    //group signal and silence characters
    public String[] groupSignalAndSilence() {
        Set<String> letterSet = new HashSet<String>(Arrays.asList(cleanEncodedMessage.split("")));
        String[] letters = new String[2];
        signalSilence =letterSet.toArray(letters);
        return signalSilence;
    }

    //swaps signal and silence
    public String[] swapSignalAndSilence() {
        return new String[]{signalSilence[1], signalSilence[0]};
    }

    //decode message
    public String decode(){

        return null;
    }

    //count pattern matches for first letter in set
    public Integer[] countMatches() {
        Cypher cypher = new Cypher();
        cypher.populateRegExMLetterMap(defineDitDahSpace());
        Integer preSwapMatches = 0;
        Integer postSwapMatches = 0;
        for (String pattern : cypher.getRegExLetterMap().keySet()){
            Pattern morsePattern = Pattern.compile(pattern);
            Matcher matcher = morsePattern.matcher(cleanEncodedMessage);
            while(matcher.find()){
                preSwapMatches++;
            }
        }
        swapSignalAndSilence();
        cypher.populateRegExMLetterMap(defineDitDahSpace());
        for (String pattern : cypher.getRegExLetterMap().keySet()){
            Pattern morsePattern = Pattern.compile(pattern);
            Matcher matcher = morsePattern.matcher(cleanEncodedMessage);
            while(matcher.find()){
                postSwapMatches++;
            }
        }
        return new Integer[]{preSwapMatches,postSwapMatches};
    }


    //define dits dahs and intra letter spacing
    public String[] defineDitDahSpace() {
        String signal = signalSilence[0];
        String silence = signalSilence[1];
        return new String[]{signal, signal + signal + signal, silence};
    }

    //checks selection against _
    public boolean isDah(String checkMeForDah) {
        return false;
    }

    //checks selection against space
    public boolean isSpace(String checkMeForSpace) {
        return false;
    }

    //adds encoded words to field list encodedWords
    public void identifyWords(String encoded) {
        ArrayList<String> parsedWords = new ArrayList<String>();
        this.encodedWords = new ArrayList<String>();
    }

    //consider using pattern matcher
    public String identifyLetter(String patternToMatch) {
        return null;
    }


    //setters and getters


    public ArrayList<String> getEncodedWords() {
        return encodedWords;
    }

    public void setEncodedWords(ArrayList<String> encodedWords) {
        this.encodedWords = encodedWords;
    }

    public String getCleanEncodedMessage() {
        return cleanEncodedMessage;
    }

    public void setCleanEncodedMessage(String cleanEncodedMessage) {
        this.cleanEncodedMessage = cleanEncodedMessage;
    }
}
