package IterableandIterators;

public class Student implements Cloneable {
    private String name;
    private int age;
    private Exam exam;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.exam = new Exam(1);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        s.exam = new Exam(s.exam.exam_id);
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        // this , obj is compared
        if(this == obj) return true;

        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;

        Student s = (Student) obj;
        if(age != s.age) return false;

        return true;

    }
}
