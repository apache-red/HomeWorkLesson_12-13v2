package com.redcompany.red.fileswork.actions.read;


import com.redcompany.red.objects.Symbol;
import com.redcompany.red.repository.data.RepoSymbols;

import java.util.ArrayList;

public interface IFileRead {

    void readFromFile();

    RepoSymbols getSymbolList();

}
