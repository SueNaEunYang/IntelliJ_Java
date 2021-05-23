
public class Study_Ch6_OOP {
    public static void main(String[] args) {
//        Ex6_01 instance601 = new Ex6_01();
//        instance601.sue();
//        Ex6_02 instance602 = new Ex6_02();
//        instance602.sue();
        Ex6_03 instance603 = new Ex6_03();
        instance603.sue();
        //Monitor monitor = new Monitor(); 모니터 희망조사 컨텐츠 만든다고 넣어놓은 줄 주석처리

    }
}

class Ex6_01 {
    void sue() {
        Tv t; // Tv인스턴스를 참조하기 위한 변수 t 선언
        t = new Tv(); // Tv 인스턴스 생성
        t.channel = 7; // 티비인스턴스의 멤버변수 채널의 값을 7로 함
        t.channelDown(); // 티비인스턴스의 메서드 채널다운을 호출함
        System.out.println("현재채널은 "+t.channel + "입니다.");
    }
}

class Tv {
    String color;
    boolean power;
    int channel;
    void power() {power = !power;}
    void channel() { ++channel;}
    void channelDown() {--channel;}
}

// 인스턴스(Tv)는 참조변수(t)를 통해서만 다룰 수 있으며,
// 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.

class Ex6_02 {
    void sue() {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 채널 값은 "+ t1.channel +"입니다.");
        System.out.println("t2의 채널 값은 "+ t2.channel +"입니다.");

        t1.channel = 7;
        System.out.println("t1의 채널값을 7로 변경하였습니다");
        System.out.println("t1의 채널 값은 "+ t1.channel +"입니다.");
        System.out.println("t2의 채널 값은 "+ t2.channel +"입니다.");
    }
}

//객체배열

    //Tv[] tvArr = new Tv[5];
    //for(int i=0; i<tvArr.length; i++){
    //    tvArr[i] = new T();
    //}

// 인스턴스변수, 클래스변수, 지역변수

class Ex6_03 {
    void sue() {
        System.out.println("Card.width= "+ Card.width);
        System.out.println("Card.height= "+ Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 "+ c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", "+c1.height + ")");
        System.out.println("c2은 "+ c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", "+c2.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 "+ c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", "+c1.height + ")");
        System.out.println("c2은 "+ c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", "+c2.height + ")");
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

//method
