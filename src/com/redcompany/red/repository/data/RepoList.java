package com.redcompany.red.repository.data;

import java.util.ArrayList;

public class RepoList {
    ArrayList<Repo> repoList = new ArrayList<Repo>();




    public void addDataToRepo(Repo repo) {
        repoList.add(repo);
    }


    public ArrayList<Repo> getRepoList() {
        return repoList;
    }

    public void setRepoList(ArrayList<Repo> repoList) {
        this.repoList = repoList;
    }
}
