package day13.home;

public class BookMgr {
    int sum = 0;
    Book[] booklist;
    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist(){
        for(int a=0; a<booklist.length;a++){
            System.out.println(booklist[a].getTitle());
        }
    }

    public void printTotalPrice(){
        for(int a=0; a<booklist.length;a++){

            sum += booklist[a].getPrice();
        }
        System.out.println("전체 책 가격의 합: "+sum);

    }
}
