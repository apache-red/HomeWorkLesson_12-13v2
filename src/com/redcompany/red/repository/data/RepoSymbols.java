package com.redcompany.red.repository.data;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.repository.actions.write.IRepoActionWrite;

import java.util.ArrayList;
import java.util.List;

public class RepoSymbols  implements IRepoActionWrite {

    private ArrayList<Symbol> symbolsListRepo = new ArrayList<Symbol>();

    @Override
    public void addDataToRepo(Symbol symbol) {
        symbolsListRepo.add(symbol);
    }
    //gets and sets
    public ArrayList<Symbol> getSymbolsListRepo() {
        return symbolsListRepo;
    }

    public void setSymbolsListRepo(ArrayList<Symbol> symbolsListRepo) {
        this.symbolsListRepo = symbolsListRepo;
    }


}
