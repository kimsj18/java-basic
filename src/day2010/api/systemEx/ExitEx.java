package day2010.api.systemEx;

public class ExitEx {
    public static void main(String[] args) {
        for(int i = 0; i<10;i++){
            System.out.print(i+" ");
            if(i == 8){
                System.out.println("프로세스 강제 종료");
                System.exit(0); //바로 종료(끝까지 안함)
//                break;
            }
            System.out.println("for문 끝");
        }
        System.out.println("프로그램 끝");
    }
}
