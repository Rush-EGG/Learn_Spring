package com.Egg.spring;

public class Book {

    private String bName;
    private String bAuthor;
    private String bAddress;
    private String bID;

    public void setbID(String bID) {
        this.bID = bID;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                ", bAddress='" + bAddress + '\'' +
                ", bID='" + bID + '\'' +
                '}';
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    //set方法注入
    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

}
