package day13.Inheritance05;
//산술연산계산기

public class Calculator {

    private int row;
    private int column;

    public Calculator(){}
    public Calculator(int row, int column){
        this.row = row;
        this.column = column;
    }

    public void areaCompute(){
        System.out.println("사각형 면적 계산");
        int result = this.row*this.column;
        System.out.println("계산 끝, 면적은"+result);
    }
}
