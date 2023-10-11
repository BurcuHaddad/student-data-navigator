package dev.bh.model;

import java.util.Comparator;

public class BHStudentComparator implements Comparator<BHStudent> {

    @Override
    public int compare(BHStudent o1, BHStudent o2) {
        return (int) (o1.getPercentComplete() - o2.getPercentComplete());
    }
}
