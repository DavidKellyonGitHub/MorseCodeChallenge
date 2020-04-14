public enum MorseLetter {
    ditdah ("A"),
    dahditditdit("B"),
    dahditdahdit("C"),
    dahditdit("D"),
    dit("E"),
    ditditdahdit("F"),
    dahdahdit("G"),
    ditditditdit("H"),
    ditdit("I"),
    ditdahdahdah("J"),
    dahditdah("K"),
    ditdahditdit("L"),
    dahdah("M"),
    dahdit("N"),
    dahdahdah("O"),
    ditdahdahdit("P"),
    dahdahditdah("Q"),
    ditdahdit("R"),
    ditditdit("S"),
    dah("T"),
    ditditdah("U"),
    ditditditdah("V"),
    ditdahdah("W"),
    dahditditdah("X"),
    dahditdahdah("Y"),
    dahdahditdit("Z"),
    ditdahdahdahdah("1"),
    ditditdahdahdah("2"),
    ditditditdahdah("3"),
    ditditditditdah("4"),
    ditditditditdit("5"),
    dahditditditdit("6"),
    dahdahditditdit("7"),
    dahdahdahditdit("8"),
    dahdahdahdahdit("9");

    String translation;
    MorseLetter(String translation){
        this.translation = translation;
    }
}
