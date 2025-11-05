package HW5_11;

import java.util.*;

public class KLTN<T extends Person, V extends Supervisor> implements Comparable<KLTN<T, V>> {
    private T student;
    private V supervisor;
    private String thesisName;

    public KLTN(T student, V supervisor, String thesisName) {
        this.student = student;
        this.supervisor = supervisor;
        this.thesisName = thesisName;
    }

    public T getStudent() { return student; }
    public V getSupervisor() { return supervisor; }
    public String getThesisName() { return thesisName; }

    @Override
    public int compareTo(KLTN<T, V> other) {
        char firstCharThis = Character.toUpperCase(this.thesisName.charAt(0));
        char firstCharOther = Character.toUpperCase(other.thesisName.charAt(0));
        return firstCharThis - firstCharOther;
    }

    @Override
    public String toString() {
        return "Thesis: \"" + thesisName + "\"\n" +
                "  Student: " + student + "\n" +
                "  Supervisor: " + supervisor + "\n";
    }
}
