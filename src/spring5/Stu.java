package spring5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] strs;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;

    private List<Course> courses;

    public String[] getStrs() {
        return strs;
    }

    public List<String> getList() {
        return list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Set<String> getSet() {
        return set;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "strs=" + Arrays.toString(strs) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", courses=" + courses +
                '}';
    }
}
