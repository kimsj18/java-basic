package day0207.student;

import lombok.ToString;

@ToString

public class Students {

    private String id;
    private String name;
    private String major;

    private String grade;
    private String phoneNumber;
    private String address;

    private Students(StudentsBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
        this.grade = builder.grade;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public static class StudentsBuilder{
        private String id;
        private String name;
        private String major;

        //선택 멤버
        private String grade;
        private String phoneNumber;
        private String address;


        public StudentsBuilder(String id, String name, String major){
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public StudentsBuilder addgrade(){
            this.grade = grade;
            return this;
        }

        public StudentsBuilder addphoneNumber(){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentsBuilder addaddress(){
            this.address = address;
            return this;
        }

        public Students builder(){
            return new Students(this);
        }

    }




}
