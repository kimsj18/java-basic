package day0207.ex06.basic;

public class HamburgerLotteria {
    public static void main(String[] args) {

        Hamburger 라떼 = new Hamburger(2, 1, 2, 4, 2, 3);
        Hamburger 동동 = new Hamburger(2, 1, 1);
        Hamburger 뽀나 = new Hamburger(2, 5, 1, 2, 4);

    }
}

// 생성자 만으로는 필드를 선택적으로 생략할 수 없는 방식
// 타입이 다양할수록 생성자 메서드 수가 늘어나기 때문에 가독성이나 유지보수 측면에서 좋지 않다.

