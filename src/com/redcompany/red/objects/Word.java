package com.redcompany.red.objects;

import com.redcompany.red.repository.data.datalist.RepoWord;

import java.util.ArrayList;

public class Word {


    private Symbol symbol;
    private RepoWord repoWord;

    public Word() {
        this.repoWord = new RepoWord();
    }

    public void addSymbolToWord(Symbol symbol) {
        repoWord.addSymbolToWord(symbol);
    }

    public RepoWord getRepoWord() {
        return repoWord;
    }

    public void setRepoWord(RepoWord repoWord) {
        this.repoWord = repoWord;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
