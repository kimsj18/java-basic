package day8;

import java.io.*;

public class Test099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int[] test = new int[5];

        for(int i=0;i<num;i++){
         str = br.readLine();
         int b = Integer.parseInt(str);
         test[i]=b;
        }for(int j =0;j<num;j++){
            System.out.println(test[j]);
        }
    }
}
