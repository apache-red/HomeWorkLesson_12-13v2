package com.redcompany.red.repository.data.datalist;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.repository.actions.write.IRepoActionWrite;

import java.util.ArrayList;

public class RepoPunctuation implements IRepoActionWrite {

    private ArrayList<Symbol> punctuation = new ArrayList<Symbol>();


    public void addDataToRepo(Symbol symbol) {
        punctuation.add(symbol);
    }

    public ArrayList<Symbol> getPunctuationListRepo() {
        return punctuation;
    }

    public void setPunctuationListRepo(ArrayList<Symbol> punctuationListRepo) {
        this.punctuation = punctuationListRepo;
    }
}
