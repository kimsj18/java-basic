package day5;

public class LoopEx01 {
    public static void main(String[] args) {

      /*  for(int i = 65; i<=90 ; i++ ){
            System.out.print((char)i + "");*/


        for(int i = 1; i<=15 ; i++ ) {
            System.out.print(i + " ");
        }
        System.out.println();  //줄바꿈 newLine
        int start = 0;
        while(start <= 4 ) {
            System.out.print(start + " ");
            start++;
        }

    }
}
