package projects.studentManagementSystem;

public class Student {
        private String name;
    
        public Student(String id, String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student : " + name;
        }
}
