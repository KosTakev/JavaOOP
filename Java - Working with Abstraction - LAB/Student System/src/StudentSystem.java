import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {
        return this.students;
    }

    public String parseCommand(String[] args) {
        String command = args[0];
        String name = args[1];

        switch (command) {
            case "Create":
                int age = Integer.parseInt(args[2]);
                double grade = Double.parseDouble(args[3]);
                createAndRegisterStudent(name, age, grade);
                return null;
            case "Show":
               return getStudentsInfo(name);
            case "Exit":
                return command;
            default:
                throw new IllegalArgumentException("Unknown command " + command);
        }


//        if (command.equals("Create")) {
//
//            var name = args[1];
//            var age = Integer.parseInt(args[2]);
//            var grade = Double.parseDouble(args[3]);
//            if (!students.containsKey(name)) {
//
//                var student = new Student(name, age, grade);
//                students.put(name, student);
//            }
//        } else if (command.equals("Show")) {
//
//            var name = args[1];
//            if (students.containsKey(name)) {
//                var student = students.get(name);
//                String view = String.format("%s is %s years old.", student.getName(), student.getAge());
//
//                if (student.getGrade() >= 5.00) {
//                    view += " Excellent student.";
//                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
//                    view += " Average student.";
//                } else {
//                    view += " Very nice person.";
//                }
//
//                System.out.println(view);
//            }
//        }
    }

    private String getStudentsInfo(String name) {
        Student student = this.students.get(name);

        if (student == null) {
            throw new IllegalArgumentException("No student with name " + name);
        }
        return StudentInfoFormatter.getFormatted(student);
    }

    private void createAndRegisterStudent(String name, int age, double grade) {
        this.students.putIfAbsent(name, new Student(name, age, grade));
    }
}
