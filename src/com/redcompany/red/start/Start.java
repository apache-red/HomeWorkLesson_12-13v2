package com.redcompany.red.start;

import com.redcompany.red.fileswork.actions.show.ShowDataFromFile;
import com.redcompany.red.fileswork.actions.show.console.ShowFileConsole;
import com.redcompany.red.fileswork.actions.show.console.IFileConsoleShow;
import com.redcompany.red.show.console.Menu;
import com.redcompany.red.fileswork.actions.read.IFileRead;
import com.redcompany.red.fileswork.actions.read.ReadFile;

public class Start {

    public static void main(String[] args) {
	// write your code here

        Menu menu = new Menu();


        IFileRead iFileRead = new ReadFile();
        IFileConsoleShow iFileConsoleShow = new ShowFileConsole();
        ShowDataFromFile showDataFromFile = new ShowDataFromFile(iFileRead,iFileConsoleShow);
        showDataFromFile.showDataFromFile();

    }
}
