package com.company;

public class TotalDocument {

    private String docId;
    private String docTitle;
    private String[] docContents;

    public TotalDocument(String docId, String docTitle, String[] docContents) {
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

    public String[] getDocContents() {
        return docContents;
    }

    public void setDocContents(String[] docContents) {
        this.docContents = docContents;
    }

    @Override
    public String toString() {
        return "TotalDocument{" +
                "docId='" + docId + '\'' +
                ", docTitle='" + docTitle + '\'' +
                ", docContents='" + docContents + '\'' +
                '}';
    }
}
