package day0203.package1;

class AA{}
class BB extends AA{}
class DD extends BB{ }
class CC  extends AA{}
class EE extends CC{}

public class PromotionMain1 {

    BB b = new BB();
    CC c = new CC();
    DD d = new DD();
    EE e = new EE();

    AA a1 = b;
    AA a2 = c;
    AA a3 = d;
    AA a4 = e;

    BB b1 = d;




}
