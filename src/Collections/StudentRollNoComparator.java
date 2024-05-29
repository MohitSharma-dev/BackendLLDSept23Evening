package Collections;

import java.util.Comparator;

public class StudentRollNoComparator implements Comparator<Student>{
    public int compare(Student o1, Student o2) {
        // o1 to comes first => return negative
        if(o1.rollNo > o2.rollNo){
            return -1;
        } else if(o1.rollNo < o2.rollNo){
            return 1;
        }
        return 0;
    }
}
