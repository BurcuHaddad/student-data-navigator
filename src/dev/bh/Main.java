package dev.bh;

import dev.bh.model.BHStudent;
import dev.bh.model.BHStudentComparator;
import dev.bh.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueryList<BHStudent> queryList = new QueryList<>();
        for (int i = 0; i < 25; i++) {
            queryList.add(new BHStudent());
        }
        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        System.out.println("Matches");
        var matches = queryList.getMatches("PercentComplete","50")
                .getMatches("Course","Java");
        matches.sort(new BHStudentComparator());
        printList(matches);

        System.out.println("Ordered");
        matches.sort(null);
        printList(matches);
    }
    public static void printList(List<?> students) {
        for (var student : students) {
            System.out.println(student);
        }
    }
}
