package com.redcompany.red.repository.data;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.objects.Word;

import java.util.ArrayList;

public class RepoWord extends Repo {



    private ArrayList<Word> wordsListRepo = new ArrayList<Word>();



    public void addDataToRepo(Word word){
        wordsListRepo.add(word);
    }



    //get set


    public ArrayList<Word> getWordsListRepo() {
        return wordsListRepo;
    }

    public void setWordsListRepo(ArrayList<Word> wordsListRepo) {
        this.wordsListRepo = wordsListRepo;
    }


}
