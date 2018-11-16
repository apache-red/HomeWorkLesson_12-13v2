package com.redcompany.red.show.console;

import com.redcompany.red.fileswork.actions.read.IFileRead;
import com.redcompany.red.fileswork.actions.read.ReadFile;
import com.redcompany.red.fileswork.actions.show.ShowDataFromFile;
import com.redcompany.red.fileswork.actions.show.console.IFileConsoleShow;
import com.redcompany.red.fileswork.actions.show.console.ShowFileConsole;
import com.redcompany.red.repository.data.dataobjects.RepoList;
import com.redcompany.red.repository.data.datalist.RepoSymbols;
import com.redcompany.red.textwork.parsing.TextParsing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private TextParsing textParsing;
    private RepoSymbols repoSymbols;
    private RepoList repoList;


    public Menu() {
        this.textParsing = new TextParsing();
        this.repoList = new RepoList();
    }

    public void start() {
        showMainMenu();
        choseActionMainMenu(writeAction());


    }

    private void showMainMenu() {
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Initialize the input file (Mandatory initial action) (WORKS!!!)");
        System.out.println("2. Split input file into parts (WORKS!!!)");
//        System.out.println("4. Change speed unit KM/H & MILES/H (WORKS!!!)");
//        System.out.println("5. Sort vehicle lists. (WORKS!!!)");
//        System.out.println("6. Show All Array. (WORKS!!!)");
        System.out.println("0. Stop program. (WORKS!!!)");
        System.out.println("------------------------------");
    }

    private void choseActionMainMenu(int number) {
        switch (number) {
            case 1:
                initFile();
                break;
            case 2:
        textParsing.parsingWord((RepoSymbols) repoList.getRepoList().get(0));

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;

            case 0:
                System.out.println("Program was stopped");
                System.exit(0);
        }
        start();
    }

    private int writeAction() {
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        int number = 5;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("!Exeption! Enter a number");
            writeAction();
        }
        return number;
    }


    private void initFile() {
        System.out.println("Initial file initialization and data display");
        IFileRead iFileRead = new ReadFile();
        IFileConsoleShow iFileConsoleShow = new ShowFileConsole();
        ShowDataFromFile showDataFromFile = new ShowDataFromFile(iFileRead, iFileConsoleShow);
        showDataFromFile.showDataFromFile();
        repoList.addDataToRepo(iFileRead.getSymbolList());


    }





}
