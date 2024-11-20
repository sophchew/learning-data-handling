public class Main {
    public static void main(String[] args) {
        Student me = new Student("Sophie");
        StudentSaver.saveStudentToDesktop(me);

        Student clone = StudentSaver.loadStudent("Sophie");
        System.out.println("Hello, " + clone.getName());
    }
}