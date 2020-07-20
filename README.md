# wordSearch

Improved Codes before.

1. 1 class, focus to one function. 
    1. Done.
        1. DocumentParser : only for Document Parse use
        2. TotalDocument: only for Document object
        3. InvertedIndex: only for inverted index Map

2. Eliminate repetition 
    1. Question: DocumetParser.java—> I wanted to simplificate code using some function for file path and get Contents list but, I thought the code I made was the best way in that moment, but I hope there is best way and want to learn.

3. Use Document class in Document parcer class, and return Document object
    1. Done: [DocumentParser.java](http://documentparser.java) —> parse() —> Return TotalDocument Object.

4. Modify putHashmap method's name because it's signification is so confusing.
    1. Done: [DocumentParser.java](http://documentparser.java) —> parse() 

5. Commit to git without .Class files and intellij log files.
    1. Done, but I couldn't delete folders before which already existed.

6. Update Readme file in git
    1. Done.
    
7. .gitignore use

9. intellij project name modified.




Inverted Index Map.(Exercise 2)

1. Read all files in the folder and Parse to make Document object for each file
2. Mapping by indexDocument Method: 
    1. Key: keyword / Value: Document object list
3. Search Keyword which you want to find in all files and Return files names in which the keyword you want to search.
    1. whether it's upper case or not, we can search because it change upper --> lower case to search.
