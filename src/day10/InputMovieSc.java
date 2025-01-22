package day10;

import day10.dto.MovieDTO;

import java.util.Scanner;

public class InputMovieSc {
    static final Scanner input = new Scanner(System.in);

    public MovieDTO inputObject(MovieDTO movie){
        System.out.print("영화 제목 입력 : ");
//        movie.title = input.nextLine();
//        System.out.print("영화 개봉일 입력 : ");
//        movie.startDate = input.nextInt();
//        System.out.print("주연배우 입력 : ");
//        movie.actor = input.nextLine();
//        System.out.print("러닝타임 입력 : ");
//        movie.runingTime = input.nextLine();
//        System.out.print("상영등급 입력 : ");
//        movie.grade = input.nextLine();

        return movie;
    }

}
