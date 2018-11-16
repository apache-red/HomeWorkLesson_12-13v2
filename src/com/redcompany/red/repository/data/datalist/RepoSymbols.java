package com.redcompany.red.repository.data.datalist;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.repository.actions.write.IRepoActionWrite;
import com.redcompany.red.repository.data.Repo;

import java.util.ArrayList;

public class RepoSymbols extends Repo implements IRepoActionWrite {

    private ArrayList<Symbol> symbolsListRepo = new ArrayList<Symbol>();


    public RepoSymbols() {

    }

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
