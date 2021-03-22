import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Study_Ch4_for_while {
    public static void main(String[] args) {
        //Ex4_00 instance00 = new Ex4_00();
        //instance00.sue();
//        Ex4_08 instance408 = new Ex4_08();
//        instance408.sue();
//        Ex4_09 instance409 = new Ex4_09();
//        instance409.sue();
//        Ex4_10 instance410 = new Ex4_10();
//        instance410.sue();
//        Ex4_11 instance411 = new Ex4_11();
//        instance411.sue();
//        Ex4_12 instance412 = new Ex4_12();
//        instance412.sue();
//        Ex4_13 instance413 = new Ex4_13();
//        instance413.sue();
//        Ex4_14 instance414 = new Ex4_14();
//        instance414.sue();
//        Ex4_15 instance415 = new Ex4_15();
//        instance415.sue();
//        Ex4_16 instance416 = new Ex4_16();
//        instance416.sue();
//        Ex4_17 instance417 = new Ex4_17();
//        instance417.sue();
//        Ex4_18 instance418 = new Ex4_18();
//        instance418.sue();
        Ex4_19 instance419 = new Ex4_19();
        instance419.sue();


    }
}

class Ex4_08 {
    void sue() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello");
        }
    }
}

class Ex4_09 {
    void sue(){
        for (int i=1; i<=5; i++)
            System.out.println(i);
        for(int i=1; i<=5; i++)
            System.out.print(i);
        System.out.println();
    }
}

class Ex4_10 {
    void sue() {
        int sum = 0;
        for (int i=1; i<=5; i++){
            sum += i ;
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    }
}

class Ex4_11{
    void sue(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Ex4_12{
    void sue(){
        int i = 5;
        while(i--!=0) {
            System.out.println(i+"-I can do it.");
        }
    }
}

class Ex4_13{
    void sue(){
        int sum = 0;
        int i = 0;
        while (sum<=100){
            System.out.printf("%d - %d%n", i, sum);
            sum += ++i;
        }
    }
}

class Ex4_14{
    void sue(){
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요 (예: 12345) >");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);
        while(num!=0){
            sum+= num%10;
            System.out.printf("sum=%3d num=%d%n", sum, num);
            num /= 10;
        }
        System.out.println("각자리수의 합:"+ sum);
    }
}

class Ex4_15 {
    void sue() {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100 사이의 정수를 입력하세요.>");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while (input != answer);

        System.out.println("정답입니다.");
    }
}

//break문 : 몇까지 더하면 100이 넘는지 알아내는 예제
class Ex4_16{
    void sue(){
        int sum = 0;
        int i = 0;

        while(true) {
            if(sum >100)
                break;
            ++i;
            sum += i;
        }
        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }
}

class Ex4_17{
    void sue(){
        for(int i=0; i <= 10; i++) {
            if (i%3==0)
                continue;
            System.out.println(i);
        }
    }
}

class Ex4_18{
    void sue(){
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0) >");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (!(1<=menu && menu<=3)){
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;
            }
            System.out.println("선택하신 메뉴는 "+ menu + "번입니다.");
        }
    }
}

//이름 붙은 반복문
class Ex4_19{
    void sue(){
        Loop1 : for(int i=2; i<=9; i++) {
            for(int j=1; j<=9; j++){
                if(j==5)
//                    break Loop1;
//                    break;
                    continue Loop1;
//                    continue;
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }

    }
}
