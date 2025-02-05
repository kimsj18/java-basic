package day0204.exception.ex2;

import java.io.*;

//try-with-resources 문의 괄호 () 안에 객체를 생성하는 문장을 넣으면
//따로 close() 호출하지 않아도 try 블럭을 벗어나는 순간 자동적으로 close()가 호출된다.
//다음에 catch 블럭 또는 finally 블럭이 수행된다.
public class FileTryWithResourceEx  {
    public static void main(String[] args) {

        try(FileWriter file = new FileWriter("data2.txt")){
            file.write("Java Programming");
            file.write("Java Programming");
        } catch(IOException e){
            e.printStackTrace();
        }
        try(
        FileInputStream fis = new FileInputStream("data.text");
        DataInputStream dis = new DataInputStream(fis);
        ){
            int sum = 0;
            while(true) {
                int value = dis.readInt();

                System.out.println(value);
                sum += value;
            }
            }catch (EOFException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
        }

    }
}
