package com.redcompany.red.fileswork.actions.copy.tolist;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.repository.data.datalist.RepoSymbols;

public interface IFileCopyToList {

    void copyDataToList(Symbol symbol);

    RepoSymbols createRepository();
}
