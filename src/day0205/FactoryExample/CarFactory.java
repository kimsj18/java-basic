package day0205.FactoryExample;

import day0203.day01.Car;

public class CarFactory extends Factory implements IWorkingTogether {

    public CarFactory(String name, int openhour, int closeHour){
        super(name, openhour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        switch (skill) {
            case 'A':
             return 3*getWorkingTime();

            case 'B':
                return 2*getWorkingTime();

            case 'C':
                return getWorkingTime();

            default:
                return 0;
        }

    }

    @Override
    public int workTogerther(IWorkingTogether partner) {
        return makeProducts('B');


    }
}
