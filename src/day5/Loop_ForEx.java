package day5;
//2행2열을 만들어봐라
public class Loop_ForEx {
    public static void main(String[] args) {
        for(int i = 1;i<=2;i++){         //행
            for(int j = 1;j <=2;j++){    //해당 행에 대한 열
                System.out.print("("+ i+"," + j+")");
            }
         }
        for(int dan = 2; dan <=9; dan++){
            System.out.printf("=======%d단 출력==========%n",dan);
            for(int i = 1;i<=9;i++){
                System.out.printf("%d X %d = %d%n",dan,i,dan*i);
           }
        }
    }
}
