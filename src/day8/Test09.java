//package day8;
//
//import day8.ioEx.BufferdReaderWriter;
//
//import java.io.*;
//
//public class Test09 {
//    public static void main(String[] args) throws IOException {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        System.out.print("""
//                ================================================
//                1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
//                ================================================
//                """);
//        while (true){
//          int a = br.readLine();
//
//            if(a==1){
//                System.out.println("선택> 1 ");
//                System.out.print("학생수> ");
//                String c = br.readLine();
//
//                continue;
//            }if(a==2){
//                System.out.println("선택> 2");
//
//            }for(int i=0;i<3;i++){
//                System.out.printf("scores[%d]> ",i);
//               String c=br.readLine();
//                System.out.println();
//                }
//
//    }
//}}
