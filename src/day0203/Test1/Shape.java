package day0203.Test1;

public abstract class Shape {

    protected double area;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void CalculationArea();


    public Shape(){}
    public Shape(String name){
        this.name = name;
    }

    public void print(){
        System.out.printf("%s의 면적은 %f",name,area);
    }



}
