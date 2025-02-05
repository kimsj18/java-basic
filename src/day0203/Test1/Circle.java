package day0203.Test1;
// # 프로텍트
// - 프라이빗
// + 퍼블릭

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String name){
        super(name);
        this.radius = radius;
        CalculationArea();
    }


    @Override
    public void CalculationArea() {
       double result = this.radius*this.radius*Math.PI;
       this.area = result;



    }

}
