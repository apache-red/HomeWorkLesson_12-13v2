package com.redcompany.red.repository.data.dataobjects;

import com.redcompany.red.repository.data.datalist.RepoPunctuation;
import com.redcompany.red.repository.data.datalist.RepoWord;

import java.util.ArrayList;

public class RepoPunctuationList {


    private ArrayList<RepoPunctuation> punctuationListRepo = new ArrayList<RepoPunctuation>();

    public void addDataToRepo(RepoPunctuation repoPunctuation){
        punctuationListRepo.add(repoPunctuation);
    }


    public ArrayList<RepoPunctuation> getPunctuationListRepo() {
        return punctuationListRepo;
    }

    public void setPunctuationListRepo(ArrayList<RepoPunctuation> punctuationListRepo) {
        this.punctuationListRepo = punctuationListRepo;
    }
}
