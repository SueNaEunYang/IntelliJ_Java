//210320 study file : installed intellij , Java의 정석  Chapter3
//special thanks to PETE.JEONG

//command+B = trace back
//command+option+L = auto align
//command+shift+A > action > GitHub > share~


import java.util.Scanner;

public class Study_210320_Ch3_and_intellij {
    public static void main(String[] args) {
        Ex3_00 instance00 = new Ex3_00();
        Ex3_12 instance12 = new Ex3_12();
        Ex3_14 instance14 = new Ex3_14();
        Ex3_15 instance15 = new Ex3_15();
        Ex3_16 instance16 = new Ex3_16();
        Ex3_17 instance17 = new Ex3_17();


        //System.out.println("Hello, World");
        instance00.naeun();
        instance12.haha();
        instance14.haha();
        instance15.haha();
        instance16.haha();
        instance17.haha();


        //System.out.println(instance.naeun());
    }
}
//
//class Ex3_00 {
//    int naeun(){
//        System.out.println("Hello, World2");
//        return 1;
//    }
//}

class Ex3_00 {
    void naeun(){
        System.out.println("Hello, World3");
    }
}

//Java의 정석
class Ex3_12 {
    int x = 10;
    int y = 8;

    void haha(){
        System.out.printf("%d을 %d로 나누면, %n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n",x/y, x%y);
    }
}

class Ex3_14 {
    void haha(){
        String str1 = "abc";
        String str2 = new String("abc");
        pete(1);

        System.out.printf("\"abc\"==\"abc\" ? %b%n","abc"=="abc");
        System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
        System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
        System.out.printf("str1.equals(\"abc\")? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\")? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"'ABC'\")? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"'ABC'\")? %b%n", str2.equalsIgnoreCase("ABC"));
    }

     int pete(int babonaeun){
        return babonaeun * 2;
     }
}

class Ex3_15 {
    void haha(){
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.print("문자를 하나 입력하세요.>");
        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9'){
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }
        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')){
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }
    }
}

class Ex3_16 {
    void haha(){
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n" ,!b);
        System.out.printf("!!b=%b%n" ,!!b);
        System.out.printf("!!!b=%b%n" ,!!!b);
        System.out.println();

        System.out.printf("ch=%c%n", ch);
        System.out.printf("ch < 'a' || ch > 'z' =%b%n", ch<'a'||ch>'z');
        System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<=ch && ch <= 'z'));
        System.out.printf("('a'<=ch && ch<='z')=%b%n", ('a'<=ch && ch <= 'z'));
    }
}

class Ex3_17 {
    void haha(){
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x=10;
        y=-5;
        z=0;

        absX = x >= 0 ? x : -x ;
        absY = y >= 0 ? y : -y ;
        absZ = z >= 0 ? z : -z ;
        signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
        signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');

        System.out.printf("x=%c%d%n", signX, absX);
        System.out.printf("y=%c%d%n", signY, absY);
        System.out.printf("z=%c%d%n", signZ, absZ);

    }
}