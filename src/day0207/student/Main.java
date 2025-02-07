package day0207.student;

public class Main {
    public static void main(String[] args) {
        Students 라떼 = new Students.StudentsBuilder("id","이름","전공")
                .addgrade().addaddress().addphoneNumber().builder();
        System.out.println(라떼);
    }
}
