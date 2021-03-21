import java.awt.*;
import java.util.Scanner;

public class Study_Ch4 {
    public static void main(String[] args) {
        //Ex4_00 instance00 = new Ex4_00();
        Ex4_01 instance401 = new Ex4_01();
        Ex4_02 instance402 = new Ex4_02();
        Ex4_03 instance403 = new Ex4_03();
        Ex4_04 instance404 = new Ex4_04();
        Ex4_05 instance405 = new Ex4_05();


        //instance00.haha();
        instance401.haha();
        instance402.haha();
        instance403.haha();
        instance404.haha();
        instance405.haha();


    }
}

class Ex4_01 {
    void haha() {
        int score = 80;

        if (score > 60) {
            System.out.println("합격입니다");
        }
    }
}

class Ex4_02 {
    void haha() {
        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은%n", x);

        if (x == 0) System.out.println("x==0");
        if (x != 0) System.out.println("x!=0");
        if (!(x == 0)) System.out.println("!(x==0)");
        if (!(x != 0)) System.out.println("!(x!=0)");

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은%n", x);

        if (x == 0) System.out.println("x==0");
        if (x != 0) System.out.println("x!=0");
        if (!(x == 0)) System.out.println("!(x==0)");
        if (!(x != 0)) System.out.println("!(x!=0)");

    }
}

class Ex4_03 {
    void haha() {
        System.out.print("숫자를 하나 입력하세요. >");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
    }
}

class Ex4_04 {
    void haha() {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}

class Ex4_05 {
    void haha() {
        int score = 0;
        char grade = ' ', opt = ' ';
        System.out.print("점수를 입력해주세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if (score == 100) {
            grade = 'A';
            opt = '+';
        } else if (score >= 90) {
            grade = 'A';
            opt = addSign(score);
        } else if (score >= 80) {
            grade = 'B';
            opt = addSign(score);
        } else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }

    char addSign(int score) {
        if (score % 10 >= 8) {
            return '+';
        } else if (score % 10 < 4) {
            return '-';
        } else {
            return '0';
        }
    }
}

