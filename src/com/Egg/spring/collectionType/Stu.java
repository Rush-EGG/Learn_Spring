package com.Egg.spring.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //1 数组类型
    private String[] courses;
    //2 list类型
    private List<String> list;
    //3 map类型
    private Map<String, String> maps;
    //4 set类型
    private Set<String> sets;

    //学生选的课
    private List<Course> courseList;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"courses\":")
                .append(Arrays.toString(courses));
        sb.append(",\"list\":")
                .append(list);
        sb.append(",\"maps\":")
                .append(maps);
        sb.append(",\"sets\":")
                .append(sets);
        sb.append(",\"courseList\":")
                .append(courseList);
        sb.append('}');
        return sb.toString();
    }
}
