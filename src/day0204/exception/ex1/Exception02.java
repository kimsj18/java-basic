package day0204.exception.ex1;

public class Exception02 {
    public static void main(String[] args) {
        String[] stringarray = {"100","1oo",null};
        for(int i=0 ; i<stringarray.length+1 ; i++){
            try {
                int value = Integer.parseInt(stringarray[i]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과되었습니다."+e.getMessage());
            }catch (NullPointerException | NumberFormatException e1){
                System.out.println("숫자로 변환할 수 없는 데이터입니다." + e1.getMessage());
            }
        }
    }
}
