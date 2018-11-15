package com.redcompany.red.fileswork.actions.show.console;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.repository.data.RepoSymbols;

import java.util.ArrayList;

public class ShowFileConsole implements IFileConsoleShow {



    @Override
    public void showDataFromFile(RepoSymbols symbolArrayList) {

        for (int i = 0; i <symbolArrayList.getSymbolsListRepo().size() ; i++) {
            System.out.print(symbolArrayList.getSymbolsListRepo().get(i).getSymbol());
        }

    }
}
