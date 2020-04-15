import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Decoder {


    public static String decode(String encoded) {
        NoiseRemover noiseRemover = new NoiseRemover(encoded);
        Translator translator = new Translator(noiseRemover.removeNoise());
        return null;
    }
}
