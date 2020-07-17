package wordSearch;

import java.io.IOException;
import java.util.*;


public class InvertedIndex {

    HashMap<String, List<TotalDocument>> index = new HashMap<String, List<TotalDocument>>();
    List<TotalDocument> resultDocumentList = new ArrayList<TotalDocument>();
    List<TotalDocument> value = new ArrayList<TotalDocument>();

    public void indexDocument(TotalDocument doc) throws IOException {

        Map<String, Integer> DocWordCount = doc.getWordCounts();
        Iterator<Map.Entry<String, Integer>> iterator = DocWordCount.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String keyWord = (String) entry.getKey();

            if (index.containsKey(keyWord)) {
                value = index.get(keyWord);
                value.add(doc);
                index.put(keyWord, value);
            } else {
                List<TotalDocument> value = new ArrayList<TotalDocument>();
                value.add(doc);
                index.put(keyWord, value);
            }
        }

    }

    public List<String> search(String keyword) {

        resultDocumentList = index.get(keyword);
        List<String> resultIdList = new ArrayList<String>();
        if (resultDocumentList == null) {
            System.out.println("No search result!");
        } else {


            for (int i = 0; i < resultDocumentList.size(); i++) {

                TotalDocument resultDocument = resultDocumentList.get(i);

                resultIdList.add(resultDocument.getDocId());
            }
        }
        return resultIdList;

    }

}
