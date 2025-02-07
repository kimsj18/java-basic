package day0205.FactoryExample;

public class TVFactory extends Factory implements IWorkingTogether {
    public TVFactory(String name, int openhour, int closeHour) {
        super(name, openhour, closeHour);
    }

    int product = 0;


    @Override
    public int workTogerther(IWorkingTogether partner) {
       return makeProducts('C');

    }

    @Override
    public int makeProducts(char skill) {
        switch (skill) {
            case 'A':
                return 8 * getWorkingTime();

            case 'B':
                return 5 * getWorkingTime();

            case 'C':
                return 3 * getWorkingTime();

            case 'D':
                getWorkingTime();
            default:
                return 0;
        }




    }
}


