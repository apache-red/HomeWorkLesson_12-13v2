package com.redcompany.red.objects;

import com.redcompany.red.repository.data.datalist.RepoPunctuation;
import com.redcompany.red.repository.data.datalist.RepoWord;

public class Punctuation {

    private RepoPunctuation repoPunctuation;
    private char symbol;



    public Punctuation() {
        this.repoPunctuation = new RepoPunctuation();
    }

    public void addSymbolToPunctuation(Symbol symbol) {
        repoPunctuation.addDataToRepo(symbol);
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
