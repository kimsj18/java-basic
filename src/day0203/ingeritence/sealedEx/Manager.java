package day0203.ingeritence.sealedEx;

public non-sealed class Manager extends Person {
    @Override
    public void work() {
        System.out.println("생산 관리직 수행");
    }
}
