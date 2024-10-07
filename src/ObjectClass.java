class Car{
    String color;
    String name;
    int speed;

    public void speedUp(){
        speed++;
    }

    public void speedDown(){
        speed--;
    }

}
class Person{
    String name;
    int age;
    //기본 생성자 얘네는 걍 init
    Person(){
        this("Unknown",0);
    }
    //매개변수가 있는 생성자
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Time{
    int hour;
    int minute;
    int second;
}
//        int hour1, hour2, hour3;
//        int minute1, minute2, minute3;
//        int second1, second2, second3; 이렇게 변수를 각각 만들 필요 없이
//        Time time1=new Time();
//        Time time2=new Time();
//        Time time3=new Time(); class라는 설계도를 만들면 이런 식으로 접근이 가능

public class ObjectClass {




    public static void main(String[] args){
        Car car = new Car();

        Person person = new Person("chang", 19);
        System.out.println("Name: " + person.name + ", Age: "+person.age);
    }

}

