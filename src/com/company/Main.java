package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {


        // Creat id
        System.out.println();
        System.out.println("Happy Birthday Min Chang");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Filename(1~10) : ");
        String idInput = sc.next();
        System.out.println("ID: " + idInput);

        String path = "/Users/David/IdeaProjects/wordSearch/src/files";

        // Create a file object
        List<String> contentsList = new ArrayList<String>();
        contentsList = Files.readAllLines(Paths.get(path + "/" + idInput + ".txt"));


        // Creat Title
        String title = contentsList.get(0);
        System.out.println("Title: " + title);
        System.out.println();

        // Creat contents Array
//        String[] contentsArray = contentsList.toString().split("\\s+");
        List<String> contentsTotalList = new ArrayList<String>();
        for (int i = 0; i < contentsList.size(); i++) {

            String[] contentsArray = contentsList.get(i).split("\\s+");
            for (int j = 0; j < contentsArray.length; j++) {
                contentsTotalList.add(contentsArray[j]);
            }

        }
        String[] contentsArray = contentsTotalList.toArray(new String[0]);

        // HashMap Words
        HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();

        for (int i = 0; i < contentsArray.length; i++) {

            if (wordsMap.containsKey(contentsArray[i])) {
                wordsMap.put(contentsArray[i], wordsMap.get(contentsArray[i]) + 1);
            } else {

                wordsMap.put(contentsArray[i], 1);
            }
        }

        Set keyAndValue = wordsMap.entrySet();
        Iterator iterator = keyAndValue.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            int value = (Integer) entry.getValue();
//            System.out.println(key + ": " + value);

        }

        // Creat Document
        TotalDocument totalDocument = new TotalDocument(idInput, title, contentsArray);
        System.out.println(totalDocument);


    }

}
