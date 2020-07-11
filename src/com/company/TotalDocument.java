package com.company;

import java.util.List;

public class TotalDocument {


    private String docId;
    private String docTitle;
    private List docContents;

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

    @Override
    public String toString() {
        return "TotalDocument{" +
                "docId: '" + docId + '\'' +
                ", docTitle: '" + docTitle + '\'' +
                ", docContents: " + docContents +
                '}';
    }
}
