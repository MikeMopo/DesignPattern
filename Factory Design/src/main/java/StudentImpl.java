public class StudentImpl {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student m = studentService.getStudent("Male");
        Student f = studentService.getStudent("FemaLe");

        // print attributes
        System.out.println(" Male students:");
        m.sport();
        m.uniform();
        System.out.println(" Female students:");
        f.sport();
        f.uniform();
    }
}
