import java.util.HashMap;
import java.util.LinkedHashMap;

public class Cypher {
    LinkedHashMap<String,String> regExLetterMap;

    public Cypher() {
        this.regExLetterMap = new LinkedHashMap<>();
    }

    public HashMap<String,String> populateRegExMLetterMap(String[] ditDahSpace){
        LinkedHashMap<String,String> regExLetterMap = new LinkedHashMap<>();
        String dit = ditDahSpace[0];
        String dah = ditDahSpace[1];
        String intraLetterSpace = ditDahSpace[2];
        regExLetterMap.put(dit + intraLetterSpace + dah, "A");
        regExLetterMap.put(dah + intraLetterSpace + dit + intraLetterSpace + dit + intraLetterSpace + dit, "B");
        regExLetterMap.put(dah + intraLetterSpace + dit+ intraLetterSpace + dah+ intraLetterSpace + dit, "C");
        regExLetterMap.put(dah + intraLetterSpace +dit + intraLetterSpace +dit, "D");
        regExLetterMap.put(dit, "E");
        regExLetterMap.put(dit + intraLetterSpace +dit + intraLetterSpace +dah + intraLetterSpace +dit, "F");
        regExLetterMap.put(dah + intraLetterSpace +dah + intraLetterSpace + dit, "G");
        regExLetterMap.put(dit + intraLetterSpace +dit + intraLetterSpace + dit + intraLetterSpace + dit, "H");
        regExLetterMap.put(dit + intraLetterSpace +dit, "I");
        regExLetterMap.put(dit + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dah, "J");
        regExLetterMap.put(dah + intraLetterSpace +dit+ intraLetterSpace + dah, "K");
        regExLetterMap.put(dit + intraLetterSpace +dah+ intraLetterSpace + dit+ intraLetterSpace + dit, "L");
        regExLetterMap.put(dah + intraLetterSpace +dah, "M");
        regExLetterMap.put(dah + intraLetterSpace +dit,"N");
        regExLetterMap.put(dah + intraLetterSpace +dah+ intraLetterSpace + dah, "O");
        regExLetterMap.put(dit + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dit, "P");
        regExLetterMap.put(dah + intraLetterSpace +dah+ intraLetterSpace + dit+ intraLetterSpace + dah, "Q");
        regExLetterMap.put(dit + intraLetterSpace +dah+ intraLetterSpace + dit, "R");
        regExLetterMap.put(dit + intraLetterSpace +dit+ intraLetterSpace + dit, "S");
        regExLetterMap.put(dah,"T");
        regExLetterMap.put(dit + intraLetterSpace +dit+ intraLetterSpace + dah,"U");
        regExLetterMap.put(dit + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dah, "V");
        regExLetterMap.put(dit + intraLetterSpace +dah+ intraLetterSpace + dah, "W");
        regExLetterMap.put(dah + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dah, "X");
        regExLetterMap.put(dah + intraLetterSpace + dit + intraLetterSpace + dah + intraLetterSpace + dah, "Y");
        regExLetterMap.put(dah + intraLetterSpace +dah+ intraLetterSpace + dit+ intraLetterSpace + dit, "Z");
        regExLetterMap.put(dit + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dah+ intraLetterSpace + dah, "1");
        regExLetterMap.put(dit + intraLetterSpace +dit+ intraLetterSpace + dah+ intraLetterSpace + dah+ intraLetterSpace + dah, "2");
        regExLetterMap.put(dit + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dah+ intraLetterSpace + dah, "3");
        regExLetterMap.put(dit + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dit+ intraLetterSpace + dah, "4");
        regExLetterMap.put(dit + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dit+ intraLetterSpace + dit, "5");
        regExLetterMap.put(dah + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dit+ intraLetterSpace + dit, "6");
        regExLetterMap.put(dah + intraLetterSpace +dah+ intraLetterSpace + dit+ intraLetterSpace + dit+ intraLetterSpace + dit, "7");
        regExLetterMap.put(dah + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dit+ intraLetterSpace + dit, "8");
        regExLetterMap.put(dah + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dah+ intraLetterSpace + dit, "9" );
        this.regExLetterMap = regExLetterMap;
        return regExLetterMap;
    }


    public HashMap<String, String> getRegExLetterMap() {
        return regExLetterMap;
    }

    public void setRegExLetterMap(LinkedHashMap<String, String> regExLetterMap) {
        this.regExLetterMap = regExLetterMap;
    }
}
