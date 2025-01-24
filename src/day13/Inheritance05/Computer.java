package day13.Inheritance05;

import day13.inheritance02.Main;

//계산기 기능 + 웹브라이징 + 영화보기 + 원의면적 계산(확장)
public class Computer extends Calculator {

    private double radius;

    public Computer(){}
    public Computer(int row, int column){}

    public Computer(double r){
        this.radius = r;
    }
    //원의 면적 계산 기능 : areaCompute
    public void areaCompute() {
        System.out.println("원의 면적 구하기");
        double result = Math.PI * this.radius*this.radius;
        System.out.printf("계산 끝. 면적은 %.1f", result);
    }

    public static void main(String[] args) {
        // 사각형의 면적 구한다.
        //Computer cp = new Computer(10,20);
        Calculator calculaor = new Calculator(10,20);
        calculaor.areaCompute();
        // 원의 면적 구한다.
        Computer computer = new Computer(5);
        computer.areaCompute();

        Calculator calculator1 = new Computer(10,20);
        calculator1.areaCompute();




    }


}
