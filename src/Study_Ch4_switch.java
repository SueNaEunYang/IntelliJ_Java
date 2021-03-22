import java.util.Scanner;

public class Study_Ch4_switch {
    public static void main(String[] args) {
        //Ex4_00 instance00 = new Ex4_00();
        //instance00.sue();
        Ex4_06 instance406 = new Ex4_06();
        instance406.sue();

        Ex4_07 instance407= new Ex4_07();
        instance407.sue();
    }
}

class Ex4_06 {
    void sue() {
        System.out.print("현재 월을 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
        }
    }
}

class Ex4_07 {
    void sue() {
        int num = 0;
        for (int i = 1; i <= 5; i++){
            num = (int) (Math.random()*6)+1;
            System.out.println(num);
        }
    }
}