package com.Egg.spring.collectionType;

import java.util.List;

public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("{");
//        sb.append("\"list\":")
//                .append(list);
//        sb.append('}');
//        return sb.toString();
//    }
}
