package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class DocumentParser {


    private File fileDir = new File("/Users/David/IdeaProjects/wordSearch/src/files");
    private String path = "/Users/David/IdeaProjects/wordSearch/src/files";


    public List<String> getFilesinFolder(final File fileDir) {

        List<String> fileName = new ArrayList<String>();

        for (final File fileEntry : fileDir.listFiles()) {
            if (fileEntry.isDirectory()) {
                getFilesinFolder(fileEntry);
            } else {
                fileName.add(fileEntry.getName());
            }
        }
        return fileName;
    }

    public List<String> getFile(String id) throws IOException {

        String pathTotal = path + "/" + id;
        List<String> contentsList = Files.readAllLines(Paths.get(pathTotal));

        return contentsList;
    }

    public List<TotalDocument> parse() throws IOException {

        List<String> fileNameList = getFilesinFolder(fileDir);
        List<String> contentsList = new ArrayList<String>();
        List<TotalDocument> totalDocumentList = new ArrayList<TotalDocument>();

        for (int i = 0; i < fileNameList.size(); i++) {
            String id = fileNameList.get(i);
            contentsList = getFile(id);

            String docTitle = contentsList.get(0);
            List<String> docContents = new ArrayList<String>();
            for (int j = 1; j < contentsList.size(); j++) {
                docContents.add(contentsList.get(j));
            }

            totalDocumentList.add(new TotalDocument(id, docTitle, docContents));

        }
        return totalDocumentList;
    }
}

//
//    //Get Document
//    public TotalDocument getDocument(fileDir) {
//
//        for (Path fileEntry : path.getFileName()) {
//            if () {
//                getFilesinFolder(fileEntry);
//            } else {
//                getFile(foler, )
//            }
//        }
//
//        // Creat Title
//        getFile(idInput);
//        String docTitle = contentsList.get(0);
//        String docContents = null;
//        for (int i = 1; i < contentsList.size(); i++) {
//            docContents = contentsList.get(i);
//        }
//        return new TotalDocument(idInput, docTitle, docContents);
//
//    }


//

//


//
//    //Get Document
//    public TotalDocument getDocument(String idInput) throws IOException {
//        // Creat Title
//        getFile(idInput);
//        String docTitle = contentsList.get(0);
//        String docContents = null;
//        for (int i = 1; i < contentsList.size(); i++){
//            docContents = contentsList.get(i);
//        }
//        return new TotalDocument(idInput, docTitle, docContents);
//
//    }




