package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public enum Classroom {

    INSTANCE;

    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getInstance();


    public void hostLecture(Teacher teacher, double numberOfHours){
        Student[] studentArray = students.toArray();
        teacher.lecture(studentArray, numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours){
        Teacher teacher = Instructors.getInstance().findByID(id);
        hostLecture(teacher, numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> map = new HashMap<>();
        for(Student student : Students.getINSTANCE().toArray()){
            double numberOfHours = student.getTotalStudyTime();
            map.put(student, numberOfHours);
        }
        return map;
    }

}
