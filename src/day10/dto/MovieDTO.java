package day10.dto;
//데이터 클래스

public class MovieDTO {
    //영화제목
    String title;
    //개봉일
    int  startDate;
    //주인공
    String actor;
    //장르
    String gener;
    //러닝타임
    String runingTime;
    //등급
    String grade;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getRuningTime() {
        return runingTime;
    }

    public void setRuningTime(String runingTime) {
        this.runingTime = runingTime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void moviePrint(MovieDTO movie){
        System.out.println(this.title);
        System.out.println(this.startDate);
        System.out.println(this.actor);
        System.out.println(this.runingTime);
        System.out.println(this.grade);
    }
}
