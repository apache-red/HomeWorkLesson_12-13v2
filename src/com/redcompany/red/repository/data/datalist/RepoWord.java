package com.redcompany.red.repository.data.datalist;

import com.redcompany.red.objects.Symbol;


import java.util.ArrayList;

public class RepoWord {

    private ArrayList<Symbol> word = new ArrayList<Symbol>();

    public void addSymbolToWord(Symbol symbol){
       word.add(symbol);
    }

    public ArrayList<Symbol> getWord() {
        return word;
    }

    public void setWord(ArrayList<Symbol> word) {
        this.word = word;
    }
}
