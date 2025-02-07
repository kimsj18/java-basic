
class Car

{

    private int num;

    private double gas;



    public Car()
    {

        num = 0;

        gas = 0.0;

        System.out.println("자동차가 만들어짐");

    }

    public void setCar(int n, double g)

    {

        num = n;

        gas = g;

        System.out.println("차량번호 " + num + "로, 연료랑 " + gas + "로 바꿈.");
    }

    public void show()
    {
        System.out.println("차량번호 " + num + "이다");

        System.out.println("연료 " + gas + "이다");

    }

}



class Sample7

{

    public static void main(String[] args)

    {

        Car car1;

        System.out.println("car1 생성.");

        car1 = new Car();

        car1.setCar(1234, 20.5);


        Car car2;

        System.out.println("car2생성.");


        car2 = car1;

        System.out.println("car2에 car1대입");


        System.out.print("car1이 가르키는 ");

        car1.show();

        System.out.print ("car2가 가르키는");

        car2.show();



        System.out.println("car1이 가르키는 차량 변경");

        car1.setCar(2345, 30.5);



        System.out.print ("car1이 가르키는 ");

        car1.show();

        System.out.print("car2가 가르키는 ");

        car2.show();

    }

}
