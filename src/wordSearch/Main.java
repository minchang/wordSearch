package wordSearch;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        // Make document parser object
        DocumentParser documentParser = new DocumentParser();
        List totalDocument = documentParser.parse();
        InvertedIndex invertedIndex = new InvertedIndex();

        for (int i = 0; i < totalDocument.size(); i++) {

            invertedIndex.indexDocument((TotalDocument) totalDocument.get(i));
        }

        System.out.println("== Start loading document ==");
        System.out.println("The number of parsed document: " + totalDocument.size());
        System.out.println("== End loading document == ");
        System.out.println();

        System.out.println("== Start indexing document ==");
        System.out.println("The number of document indexed: " + invertedIndex.index.size());
        System.out.println("== End loading document == ");
        System.out.println();

        // Input keyword and return file names in which the keyword is and unlimites loop.
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("== Search ==");
            System.out.print(" - Search keyword: ");
            String inputKeyword = sc.next();

            List resultDocumentList = invertedIndex.index.get(inputKeyword.toLowerCase());
            System.out.print(" - Searched document IDs: ");
            List<String> resultId = invertedIndex.search(inputKeyword);

            for (int i = 0; i < resultId.size(); i++) {
                System.out.print(getWithoutExtension(resultId.get(i)) + " ");
            }
            System.out.println();
            System.out.println();
        }

    }

    // get file names without extension.
    public static String getWithoutExtension(String str) {
        String result = str.substring(0, str.length() - 4);
        return result;
    }
}
