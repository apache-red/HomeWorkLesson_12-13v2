package com.redcompany.red.fileswork.actions.read;

import com.redcompany.red.fileswork.actions.copy.tolist.IFileCopyToList;
import com.redcompany.red.objects.Symbol;
import com.redcompany.red.repository.data.datalist.RepoSymbols;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile implements IFileRead, IFileCopyToList {

    private RepoSymbols repoSymbols;


    public ReadFile() {
        repoSymbols = createRepository();
    }

    @Override
    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(("./src/com/redcompany/red/fileswork/files/inputfiles/text.txt"))))
        {
            int c;
            while((c=reader.read())!=-1){
                copyDataToList(new Symbol((char)c));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was no found!");
        } catch (IOException e) {
            System.out.println("Problems with the file");
        }
    }

    @Override
    public RepoSymbols getSymbolList() {
        return repoSymbols;
    }

    @Override
    public void copyDataToList(Symbol symbol) {
        repoSymbols.addDataToRepo(symbol);
    }

    @Override
    public RepoSymbols createRepository() {
        return new RepoSymbols();
    }


    public RepoSymbols getRepoSymbols() {
        return repoSymbols;
    }
}
