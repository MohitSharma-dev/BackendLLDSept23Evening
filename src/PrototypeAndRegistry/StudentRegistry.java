package PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private static Map<String, Student> students = new HashMap<>();

    public static void register(String key , Student student){
        students.put(key, student);
    }

    public static Student get(String key){
        return students.get(key).copy();
    }

    public static void fillRegistry(){
        Student academyStudent = new Student();
        academyStudent.type = "Academy";

        Student SSTStudent = new Student();
        SSTStudent.type = "SST";

        Student SSBStudent = new Student();
        SSBStudent.type = "SSB";

        register(academyStudent.type, academyStudent);
        register(SSTStudent.type, SSTStudent);
        register(SSBStudent.type, SSBStudent);
    }
}
