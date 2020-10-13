package benchmark.model;

import java.util.ArrayList;
import java.util.List;

public class Pojo {

    public String name;
    public Integer level;
    public List<Pojo> children;

    public Pojo() {
    }

    public Pojo(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public static Pojo parentPojo() {
        return new Pojo("parent", 0);
    }

    public static Pojo fullPojoWithNChildren(int n) {
        Pojo pojo = parentPojo();
        pojo.children = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pojo.children.add(new Pojo("child-" + i, 1));
        }
        return pojo;
    }
}
