package day11;

import java.util.Scanner;

public class BestVOModeling {
    public static void main(String[] args) {
//        MovieVO avatar = new MovieVO("아바타","12세","액션");
//        System.out.println(avatar.toString());
//        avatar.setMovieOpen("2022.12.14");
//        avatar.setActor("제이크 설리");
//        avatar.setRuningTime("192");
//
//        System.out.println("++++++++++++"+avatar.getTitle()+" 영화정보 +++++++++++");
//        System.out.printf("제목 : %s : %n",avatar.getTitle());
//        System.out.printf("배우 : %s : %n",avatar.getActor());
//        System.out.printf("러닝타임 : %s : %n",avatar.getRuningTime());
//        System.out.printf("러닝타임 : %s : %n",avatar.getRuningTime());
//        System.out.printf("러닝타임 : %s : %n",avatar.getRuningTime());
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
//------------------------------------------------------------------------------------------------

        //레벨업 : 5개의 영화를 배열로 관리하고 싶다. movisArray를 만들어 5개의 영화정보를 입력 한 후 해당 전체 영화리스트를 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 영화의 총개수를 입력하세요.");
        int movieTotal = sc.nextInt();
        System.out.println("각 영화당 상세정보의 개수를 입력하세요.");
        int movieInfo = sc.nextInt();

        MovieVO[] movieArray = new MovieVO[movieTotal];

        //3개의 영화의 상세정보 목록의 개수는 3개(title, actor, grade)

        //정보를 입력받고 해당 영화정보의 내용이 자동으로 movieArray에 할당되도록 만들어라.

        //for(int i = 0; i < movieArray[movieTotal].length ; i++){
        for(int i = 0; i < movieTotal ; i++) {

            movieArray[i] = new MovieVO("", "", "");

            System.out.print("제목 : ");
            movieArray[i].setTitle(sc.next());

            System.out.print("배우 : ");
            movieArray[i].setActor(sc.next());

            System.out.print("등급 : ");
            movieArray[i].setGrade(sc.next());

        } for(int j=0;j<movieTotal;j++){
            System.out.println(movieArray[j]);
        }


    }

}
