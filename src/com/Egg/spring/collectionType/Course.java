package com.Egg.spring.collectionType;

public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"cname\":\"")
                .append(cname).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
