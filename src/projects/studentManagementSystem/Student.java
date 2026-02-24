package projects.studentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
        private String id;
        private String name;
        private List<Double> grades = new ArrayList<>();
    
        public Student(String id, String name) {
            this.id = id;
            this.name = name;
        }
    
        public String getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
        public void addGrade(double grade) {
            grades.add(grade);
        }

        public double calculateGPA() {
            if (grades.isEmpty()) return 0.0;

            double sum = 0;
            for (double g : grades) {
                sum += g;
            }
            return sum / grades.size();
        }

        @Override
        public String toString() {
            return "Student : id=" + id + ", name=" + name + " grades=" + grades + "";
        }
}
