package wordSearch;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        // Make document parser object
        DocumentParser documentParser = new DocumentParser();
        List totalDocument = documentParser.parse();
        System.out.println("== Start loading document ==");
        System.out.println("The number of parsed document: " + totalDocument.size());
        System.out.println("== End loading document == ");
        System.out.println();

        System.out.println("== Start indexing document ==");
        System.out.println("The number of document indexed: " + totalDocument.size());
        System.out.println("== End loading document == ");
        System.out.println();

        InvertedIndex invertedIndex = new InvertedIndex();

        for (int i = 0; i < totalDocument.size(); i++) {

            invertedIndex.indexDocument((TotalDocument) totalDocument.get(i));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("== Search ==");
        System.out.print(" - Search keyword: ");
        String inputKeyword = sc.next();
        System.out.println();
        List resultDocumentList = invertedIndex.index.get(inputKeyword);
        System.out.print(" - Searched document IDs: ");
        List<String> resultId = invertedIndex.search(inputKeyword);

        for (int i = 0; i < resultId.size(); i++) {
            System.out.print(resultId.get(i) + " ");
        }

    }
}
