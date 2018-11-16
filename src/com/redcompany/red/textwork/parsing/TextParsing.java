package com.redcompany.red.textwork.parsing;

import com.redcompany.red.objects.Word;
import com.redcompany.red.repository.data.datalist.RepoSymbols;
import com.redcompany.red.repository.data.datalist.RepoWord;
import com.redcompany.red.repository.data.dataobjects.RepoWordList;

public class TextParsing  {

    String validationWord = "аАбБвВгГдДеЕёЁжЖзЗиИйЙкКлЛмМнНоОпПрРсСтТуУфФхХцЦчЧшШщЩъЪыЫьЬэЭюЮяЯ0123456789";
    String validationSentence = ",-:";

    private RepoWordList repoWordList;
    private RepoWord repoWord;
    private Word word;



    public TextParsing() {
        this.repoWordList = new RepoWordList();

    }




    public void parsingWord(RepoSymbols repoSymbols) {

        this.word = new Word();
        for (int i = 0; i < repoSymbols.getSymbolsListRepo().size(); i++) {

            if (validationWord.indexOf(repoSymbols.getSymbolsListRepo().get(i).getSymbol()) != -1) {

            word.addSymbolToWord(repoSymbols.getSymbolsListRepo().get(i));
            } else {
               // if()

                repoWordList.addDataToRepo(repoWord = word.getRepoWord());

                this.word = new Word();
                      }

        }
        System.out.println("Word count equals= "+repoWordList.getWordsListRepo().size());
        for (int i = 0; i < repoWordList.getWordsListRepo().size() ; i++) {


            for (int j = 0; j < repoWordList.getWordsListRepo().get(i).getWord().size(); j++) {
                System.out.print(repoWordList.getWordsListRepo().get(i).getWord().get(j).getSymbol());
            }
            System.out.print(" ");
        }
    }



}
