package day4;

public class Homework5 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = (lengthTop+lengthBottom)*height/2.0;
        System.out.println(area);

        int lengthTop1 = 5;
        int lengthBottom1 = 10;
        int height1 = 7;
        double area1 = (lengthTop1+lengthBottom1)*height1*1.0/2;
        System.out.println(area1);

        int lengthTop2 = 5;
        int lengthBottom2 = 10;
        int height2 = 7;
        double area2 = (double) (lengthTop2+lengthBottom2)*height2/2;
        System.out.println(area2);

        int lengthTop3 = 5;
        int lengthBottom3 = 10;
        int height3 = 7;
        double area3 = (double) ((lengthTop3+lengthBottom3)*height3/2);
        System.out.println(area3);

    }
}
