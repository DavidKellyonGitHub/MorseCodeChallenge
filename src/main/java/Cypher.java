import java.util.HashMap;
import java.util.LinkedHashMap;

public class Cypher {
    LinkedHashMap<String,String> regExLetterMap;

    public Cypher() {
        this.regExLetterMap = new LinkedHashMap<>();
    }

    public LinkedHashMap<String,String> populateRegExMLetterMap(String[] ditDahSpace){
        LinkedHashMap<String,String> regExLetterMap = new LinkedHashMap<>();
        String dit = ditDahSpace[0];
        String dah = ditDahSpace[1];
        String intraLetterSpace = ditDahSpace[2];
        String letterSpace = ditDahSpace[2] +ditDahSpace[2] +ditDahSpace[2];
        String wordSpace = letterSpace + letterSpace + ditDahSpace[2];
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "A");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace + dit + intraLetterSpace + dit + intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "B");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace + dit+ intraLetterSpace + dah+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "C");
        regExLetterMap.put(dah + intraLetterSpace + dit + intraLetterSpace + dit, "D");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + "($|" + letterSpace + "|" + wordSpace + ")","E");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit + intraLetterSpace +dah + intraLetterSpace +dit+ "($|" + letterSpace + "|" + wordSpace + ")", "F");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dah + intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "G");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit + intraLetterSpace + dit + intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "H");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit+ "($|" + letterSpace + "|" + wordSpace + ")", "I");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "J");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dit+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "K");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dah+ intraLetterSpace + dit+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "L");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dah+ "($|" + letterSpace + "|" + wordSpace + ")", "M");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dit+ "($|" + letterSpace + "|" + wordSpace + ")","N");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dah+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "O");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "P");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dah+ intraLetterSpace + dit+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "Q");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dah+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "R");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "S");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + "($|" + letterSpace + "|" + wordSpace + ")","T");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")","U");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "V");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dah+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "W");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "X");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace + dit + intraLetterSpace + dah + intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "Y");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dah+ intraLetterSpace + dit+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "Z");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dah+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "1");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit+ intraLetterSpace + dah+ intraLetterSpace + dah+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "2");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dah+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "3");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dit+ intraLetterSpace + dah+ "($|" + letterSpace + "|" + wordSpace + ")", "4");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dit + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dit+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "5");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dit+ intraLetterSpace + dit+ intraLetterSpace + dit+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "6");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dah+ intraLetterSpace + dit+ intraLetterSpace + dit+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "7");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dit+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "8");
//        regExLetterMap.put("(^|"+ letterSpace + "|" + wordSpace + ")" + dah + intraLetterSpace +dah+ intraLetterSpace + dah+ intraLetterSpace + dah+ intraLetterSpace + dit+ "($|" + letterSpace + "|" + wordSpace + ")", "9" );
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
