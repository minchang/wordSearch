package wordSearchPJ;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DocumentParse {

    private String path = "/Users/David/IdeaProjects/wordSearch/src/files";
    private String pathTotal;
    private String docTitle;
    private List<String> contentsList = new ArrayList<String>();
    private HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();


    //Get Title
    public String getDocTitle(String idInput) throws IOException {
        // Creat Title
        pathTotal = path + "/" + idInput + ".txt";
        contentsList = Files.readAllLines(Paths.get(pathTotal));

        String docTitle = contentsList.get(0);

        return docTitle;
    }


    // Get contents list
    public List<String> getContentsList(String idInput) throws IOException {
        // Creat contensList
        pathTotal = path + "/" + idInput + ".txt";
        contentsList = Files.readAllLines(Paths.get(pathTotal));

        return contentsList;
    }


    // Put contents list to hashmap and Return hashmap<word, count>
    public HashMap<String, Integer> putHashmap(String idInput) throws IOException {

        pathTotal = path + "/" + idInput + ".txt";
        contentsList = Files.readAllLines(Paths.get(pathTotal));

        // Creat contents Array
        List<String> contentsTotalList = new ArrayList<String>();
        for (int i = 0; i < contentsList.size(); i++) {

            String[] contentsArray = contentsList.get(i).split("\\s+");
            for (int j = 0; j < contentsArray.length; j++) {
                contentsTotalList.add(contentsArray[j]);

            }
        }
        String[] contentsArray = contentsTotalList.toArray(new String[0]);

        // HashMap Words
        for (int i = 0; i < contentsArray.length; i++) {

            if (wordsMap.containsKey(contentsArray[i])) {
                wordsMap.put(contentsArray[i], wordsMap.get(contentsArray[i]) + 1);
            } else {

                wordsMap.put(contentsArray[i], 1);
            }
        }

        return wordsMap;
    }


    // Print hashmap
    public void printHashmap() {

        Set keyAndValue = wordsMap.entrySet();
        Iterator iterator = keyAndValue.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry) iterator.next();
            String key = (String) entry.getKey();
            int value = (Integer) entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

}


