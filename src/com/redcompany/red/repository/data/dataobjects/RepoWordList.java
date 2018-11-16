package com.redcompany.red.repository.data.dataobjects;

import com.redcompany.red.objects.Symbol;
import com.redcompany.red.objects.Word;
import com.redcompany.red.repository.data.Repo;
import com.redcompany.red.repository.data.datalist.RepoWord;

import java.util.ArrayList;

public class RepoWordList extends Repo {



    private ArrayList<RepoWord> wordsListRepo = new ArrayList<RepoWord>();

    public void addDataToRepo(RepoWord RepoWord){
        wordsListRepo.add(RepoWord);
    }

    //get set


    public ArrayList<RepoWord> getWordsListRepo() {
        return wordsListRepo;
    }

    public void setWordsListRepo(ArrayList<RepoWord> wordsListRepo) {
        this.wordsListRepo = wordsListRepo;
    }
}
