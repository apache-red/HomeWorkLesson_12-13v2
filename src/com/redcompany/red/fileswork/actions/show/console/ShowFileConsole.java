package com.redcompany.red.fileswork.actions.show.console;

import com.redcompany.red.repository.data.datalist.RepoSymbols;

public class ShowFileConsole implements IFileConsoleShow {



    @Override
    public void showDataFromFile(RepoSymbols symbolArrayList) {

        for (int i = 0; i <symbolArrayList.getSymbolsListRepo().size() ; i++) {
            System.out.print(symbolArrayList.getSymbolsListRepo().get(i).getSymbol());
        }

    }
}
