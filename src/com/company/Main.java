package com.company;

import java.io.IOException;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

//        // Input id (== filename)
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Input Filename(1~10) : ");
//        String idInput = sc.next();



        // Make document parser object
        DocumentParser documentParser = new DocumentParser();
        List totalDocument = documentParser.parse();
        System.out.println("== Start loading document ==");
        System.out.println("The number of parsed document: " + totalDocument.size());
        System.out.println("== End loading document == ");





        TotalDocument totalDocument1 = documentParser.parse().get(1);
        System.out.println(totalDocument1.toString());


    }
}
