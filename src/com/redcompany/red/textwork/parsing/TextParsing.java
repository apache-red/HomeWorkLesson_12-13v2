package com.redcompany.red.textwork.parsing;

import com.redcompany.red.objects.Punctuation;
import com.redcompany.red.objects.Word;
import com.redcompany.red.repository.data.datalist.RepoPunctuation;
import com.redcompany.red.repository.data.datalist.RepoSymbols;
import com.redcompany.red.repository.data.datalist.RepoWord;
import com.redcompany.red.repository.data.dataobjects.RepoWordList;

public class TextParsing {

    String validationWord = "аАбБвВгГдДеЕёЁжЖзЗиИйЙкКлЛмМнНоОпПрРсСтТуУфФхХцЦчЧшШщЩъЪыЫьЬэЭюЮяЯ0123456789";
    String validationPunctuationMarks = " ,-:;.";
    String validationSentence = ".";


    private RepoWordList repoWordList;
    private RepoPunctuation repoPunctuation;
    private RepoWord repoWord;
    private Word word;
    private Punctuation punctuation;
    private RepoSymbols repoSymbols;


    public TextParsing() {
        this.repoWordList = new RepoWordList();

    }


    public void parsing(RepoSymbols repoSymbols) {
        this.repoSymbols = repoSymbols;

        for (int i = 0; i < repoSymbols.getSymbolsListRepo().size(); i++) {
            this.word = new Word();
            if (validationWord.indexOf(repoSymbols.getSymbolsListRepo().get(i).getSymbol()) != -1) {
                parsingToWord(i);
            } else if (validationPunctuationMarks.indexOf(repoSymbols.getSymbolsListRepo().get(i).getSymbol()) != -1) {
                repoWordList.addDataToRepo(repoWord = word.getRepoWord());
                this.word = new Word();
                parsingPunctuationMarks(i);
            } else if (validationSentence.indexOf(repoSymbols.getSymbolsListRepo().get(i).getSymbol()) != -1) {
                parsingToSentence();
            }
        }
        System.out.println("Word count equals= " + repoWordList.getWordsListRepo().size());
        System.out.println("Word count equals= " + repoPunctuation.getPunctuationListRepo().size());
        for (int i = 0; i < repoWordList.getWordsListRepo().size() ; i++) {
            for (int j = 0; j < repoWordList.getWordsListRepo().get(i).getWord().size(); j++) {
                System.out.print(repoWordList.getWordsListRepo().get(i).getWord().get(j).getSymbol());
            }
            System.out.print(" ");
        }

    }


    private void parsingToWord(int i) {
        word.addSymbolToWord(repoSymbols.getSymbolsListRepo().get(i));
    }


    private void parsingToSentence() {


    }

    private void parsingPunctuationMarks(int i) {
        this.punctuation = new Punctuation();
        punctuation.addSymbolToPunctuation(repoSymbols.getSymbolsListRepo().get(i));

    }


}
