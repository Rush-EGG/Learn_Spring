package com.Egg.spring.bean;

import java.util.StringJoiner;

public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"dname\":\"")
                .append(dname).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
