package com.redcompany.red.fileswork.actions.show;

import com.redcompany.red.fileswork.actions.read.IFileRead;
import com.redcompany.red.fileswork.actions.show.console.IFileConsoleShow;
import com.redcompany.red.repository.data.RepoSymbols;

public class ShowDataFromFile  {

    private IFileRead iFileRead;
    private IFileConsoleShow iFileConsoleShow;
    private RepoSymbols repoSymbols;



    public ShowDataFromFile(IFileRead iFileRead, IFileConsoleShow iFileConsoleShow) {
        this.iFileRead = iFileRead;
        this.iFileConsoleShow = iFileConsoleShow;
    }

    public void showDataFromFile(){
    iFileRead.readFromFile();
    repoSymbols = iFileRead.getSymbolList();
    iFileConsoleShow.showDataFromFile(repoSymbols);

    }
}
