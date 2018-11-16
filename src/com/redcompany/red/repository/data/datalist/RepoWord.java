package com.redcompany.red.repository.data.datalist;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.repository.actions.write.IRepoActionWrite;


import java.util.ArrayList;

public class RepoWord implements IRepoActionWrite {

    private ArrayList<Symbol> word = new ArrayList<Symbol>();


    @Override
    public void addDataToRepo(Symbol symbol) {
        word.add(symbol);
    }

    public ArrayList<Symbol> getWord() {
        return word;
    }

    public void setWord(ArrayList<Symbol> word) {
        this.word = word;
    }


}
