package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TotalDocument {


    private String docId;
    private String docTitle;
    private List docContents;
    private String path = "/Users/David/IdeaProjects/wordSearch/src/files";
    private String pathTotal;
    private List<String> contentsList = new ArrayList<String>();
    private HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();

    public TotalDocument(String docId, String docTitle, List docContents) {
        this.docId = docId;
        this.docTitle = docTitle;
        this.docContents = docContents;
    }


    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle;
    }

    public List getDocContents() {
        return docContents;
    }

    public void setDocContents(List docContents) {
        this.docContents = docContents;
    }

//    public List<String> getFile(String idInput) throws IOException {
//        pathTotal = path + "/" + idInput + ".txt";
//        contentsList = Files.readAllLines(Paths.get(pathTotal));
//        return contentsList;
//    }
//
//    // Put contents list to hashmap and Return hashmap<word, count>
//    public HashMap<String, Integer> getWordCounts(String idInput) throws IOException {
//
//        getFile(idInput);
//
//        // Creat contents Array
//        List<String> contentsTotalList = new ArrayList<String>();
//        for (int i = 0; i < contentsList.size(); i++) {
//
//            String[] contentsArray = contentsList.get(i).split("\\s+");
//            for (int j = 0; j < contentsArray.length; j++) {
//                contentsTotalList.add(contentsArray[j]);
//
//            }
//        }
//        String[] contentsArray = contentsTotalList.toArray(new String[0]);
//
//        // HashMap Words
//        for (int i = 0; i < contentsArray.length; i++) {
//
//            if (wordsMap.containsKey(contentsArray[i])) {
//                wordsMap.put(contentsArray[i], wordsMap.get(contentsArray[i]) + 1);
//            } else {
//
//                wordsMap.put(contentsArray[i], 1);
//            }
//        }
//
//        return wordsMap;
//    }
//
//
//    // Print hashmap
//    public void printHashmap() {
//
//        Set keyAndValue = wordsMap.entrySet();
//        Iterator iterator = keyAndValue.iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = (Map.Entry) iterator.next();
//            String key = (String) entry.getKey();
//            int value = (Integer) entry.getValue();
//            System.out.println(key + ": " + value);
//        }
//    }
//

    @Override
    public String toString() {
        return "TotalDocument{" +
                "docId: '" + docId + '\'' +
                ", docTitle: '" + docTitle + '\'' +
                ", docContents: " + docContents +
                '}';
    }
}
