package day0203.Test1;

public class Rectangular extends Shape {
    private double width;
    private double hight;

    public Rectangular(double width, double hight , String name){
        super(name);
        this.hight = hight;
        this.width = width;
        CalculationArea();
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public void CalculationArea() {
        double result = this.width*this.hight;
        this.area = result;
    }
}
