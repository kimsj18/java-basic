package day0204.exception.throwsEx;

public class ThrowsEx {
    public static void main(String[] args)  {   //main 메소드에서 throws키워드 예외는 JVM이 최종적으로 처리한다.
        try {
            findClass();
        } catch (Throwable e) {
            System.out.println("예외처리" + e.getMessage());    //호출한 곳에서 예외 처리
        }

    }

    public static void findClass() throws Exception{
        Class.forName("java.lang.String1");
    }

}
