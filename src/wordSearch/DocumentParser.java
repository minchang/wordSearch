package wordSearch;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DocumentParser {


    private File fileDir = new File("/Users/David/IdeaProjects/wordSearch/src/files");
    private String path = "/Users/David/IdeaProjects/wordSearch/src/files";

    // Read and Get all files in the folder
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

    // Get contents List (including title line in contents list)
    public List<String> getContentsList(String id) throws IOException {

        String pathTotal = path + "/" + id;
        List<String> contentsList = Files.readAllLines(Paths.get(pathTotal));

        return contentsList;
    }

    // Read files in the folder and return document object
    public List<TotalDocument> parse() throws IOException {

        List<String> fileNameList = getFilesinFolder(fileDir);
        Collections.sort(fileNameList);
        List<String> contentsList = new ArrayList<String>();
        List<TotalDocument> totalDocumentList = new ArrayList<TotalDocument>();

        for (int i = 0; i < fileNameList.size(); i++) {
            String id = fileNameList.get(i);
            contentsList = getContentsList(id);

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



