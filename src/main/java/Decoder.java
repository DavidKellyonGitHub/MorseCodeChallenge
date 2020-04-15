import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Decoder {
    ArrayList<String> encodedWords = new ArrayList<>();


    public static String decode(String encoded) {
        NoiseRemover remover = new NoiseRemover(encoded);
        remover.removeNoise();
        String cleanEncodedMessage = remover.getCleanEncodedMessage();
        return null;
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
