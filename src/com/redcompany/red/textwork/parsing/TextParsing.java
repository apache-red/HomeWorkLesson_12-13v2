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

    String validationWord = "аАбБвВгГдДеЕёЁжЖзЗиИйЙкКлЛмМнНоОпПрРсСтТуУфФхХцЦчЧшШщЩъЪыЫьЬэЭюЮяЯ0123456789";
    String validationSentence = ",-:";

    private RepoWord repoWord;
    private Word word;



    public TextParsing() {
        this.repoWord = new RepoWord();

    }




    public void parsingWord(RepoSymbols repoSymbols) {

        this.word = new Word();
        System.out.println();
        for (int i = 0; i < repoSymbols.getSymbolsListRepo().size(); i++) {

            if (validationWord.indexOf(repoSymbols.getSymbolsListRepo().get(i).getSymbol()) != -1) {

            word.constractionWord(repoSymbols.getSymbolsListRepo().get(i));
            } else {
               // if()

                repoWord.addDataToRepo(word);
                this.word = new Word();
                i++;
            }

        }

        for (int i = 0; i < repoWord.getWordsListRepo().size() ; i++) {

            System.out.println(repoWord.getWordsListRepo().get(i).getWord());
        }
    }



}
