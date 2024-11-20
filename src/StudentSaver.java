import java.io.*;

public class StudentSaver {

    public static void saveStudentToDesktop(Student student) {
        try {
            // output stream -> binary
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/chews/Desktop/" + student.getName() + ".shoe");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(student);
            outputStream.flush(); // clears temporary memory space (cache)
            outputStream.close(); // close connection
        } catch (Exception e) {
            System.out.println("Saving failed :(");
        }

    }

    public static Student loadStudent(String studentName) {
        Student s = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/chews/Desktop/" + studentName + ".shoe");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            s = (Student)objectInputStream.readObject();

        } catch (Exception e) {
            System.out.println("Loading failed :(");
        }

        return s;

    }


}
