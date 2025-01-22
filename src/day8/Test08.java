package day8.ioEx;

public class Test08 {
    public static void main(String[] args) {
        int[][] a = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int sum=0;
        int count = 0;
        for(int b : a[0]){
            sum += b;
            count++;
        }for(int b : a[1]){
            sum += b;
            count++;
        }for(int b : a[2]){
            sum += b;
            count++;
    }System.out.println(sum);
        System.out.println((double) sum/count);
}
}
