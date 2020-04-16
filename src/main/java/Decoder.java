import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Decoder {

// left to do:
// account for time dilation
// correct regEx for space at end of string
// fix signal vs silence logic, should decide based on # of regex matches which is which

    public static String decode(String encoded) {
        NoiseRemover noiseRemover = new NoiseRemover(encoded);
        Translator translator = new Translator(noiseRemover.removeNoise());
        return translator.decode();
    }
}
