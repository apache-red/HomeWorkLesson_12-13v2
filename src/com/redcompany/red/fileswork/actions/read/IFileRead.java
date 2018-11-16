package com.redcompany.red.fileswork.actions.read;


import com.redcompany.red.repository.data.datalist.RepoSymbols;

public interface IFileRead {

    void readFromFile();

    RepoSymbols getSymbolList();

}
