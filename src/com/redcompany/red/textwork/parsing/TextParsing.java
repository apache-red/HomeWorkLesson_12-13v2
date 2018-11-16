package com.redcompany.red.textwork.parsing;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.objects.Word;
import com.redcompany.red.repository.actions.write.IRepoActionWrite;
import com.redcompany.red.repository.data.RepoSymbols;
import com.redcompany.red.repository.data.RepoWord;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParsing  {

    private RepoWord repoWord;
    private Word word;



    public TextParsing() {
        this.repoWord = new RepoWord();

    }




    public void parsingWord(RepoSymbols repoSymbols) {
        this.word = new Word();
        System.out.println();
        for (int i = 0; i < repoSymbols.getSymbolsListRepo().size(); i++) {
            char ch = repoSymbols.getSymbolsListRepo().get(i).getSymbol();
            if (ch != ' ' || ch != '\t' || ch != '\r' || ch != '\n') {
            word.constractionWord(repoSymbols.getSymbolsListRepo().get(i));
            } else {
                repoWord.addDataToRepo(word);
                this.word = new Word();
                i++;
            }

        }
    }



}
