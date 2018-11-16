package com.redcompany.red.objects;

public class Word {

    private String word="";

    private Symbol symbol;



    public void constractionWord(Symbol symbol){
        this.word = word+ symbol.getSymbol();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        word = word;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
