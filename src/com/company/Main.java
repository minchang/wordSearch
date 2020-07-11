package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        // Input id (== filename)
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Filename(1~10) : ");
        String idInput = sc.next();

        // Make document parser object
        DocumentParse documentParse = new DocumentParse();
        System.out.println();

        String title = documentParse.getDocTitle(idInput);
        List contents = documentParse.getContentsList(idInput);
        HashMap wordmap = documentParse.putHashmap(idInput);

        // Make document result object
        TotalDocument totalDocument = new TotalDocument(idInput, title, contents);
        System.out.println(totalDocument.toString());
    }
}
