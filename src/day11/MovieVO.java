package day11;

public class MovieVO {

    private String title;
    private String movieOpen;
    private String actor;
    private String gener;
    private String runingTime;
    private String grade;

    //초기화
    public MovieVO(){}
    public MovieVO(String title, String actor, String grade){
        this.title = title;
        this.actor = actor;
        this.grade = grade;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieOpen() {
        return movieOpen;
    }

    public void setMovieOpen(String movieOpen) {
        this.movieOpen = movieOpen;
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

    @Override
    public String toString() {
        return "BestVOModeling{" +
                "title='" + title + '\'' +
                ", movieOpen=" + movieOpen +
                ", actor='" + actor + '\'' +
                ", gener='" + gener + '\'' +
                ", runingTime='" + runingTime + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
