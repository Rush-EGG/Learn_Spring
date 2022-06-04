package com.Egg.spring.autoWire;

public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"dept\":")
                .append(dept);
        sb.append('}');
        return sb.toString();
    }
}
