package exam_prep;

import lesson10.Labs.prob1.GroupUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group<T> {
    private T specialElement;
    private List<T> elements = new ArrayList<>();
    public Group(T special, List<T> elements) {
        this.specialElement = special;
        this.elements = elements;
    }

    public List<T> getElements(){
        return elements;
    }

    public T getSpecialElement(){
        return specialElement;
    }

    @Override
    public String toString() {
        return "Group{" +
                "specialElement=" + specialElement +
                ", elements=" + elements +
                '}';
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4);
        Group<Integer> group = new Group<>(0, list);
        System.out.println(group);
        //System.out.println(GroupUtil.copy(group));
    }
    public static <T> Group<?> copy(Group<T> group) {
        List<T> elements = group.getElements();
        Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
        System.out.println(grp);
        return grp;
    }


}
