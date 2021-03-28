import java.util.Arrays;
import java.util.Scanner;

public class Study_Ch5_Array {
    public static void main(String[] args) {
//        Ex5_01 instance501 = new Ex5_01();
//        instance501.sue();
//        Ex5_02 instance502 = new Ex5_02();
//        instance502.sue();
//        Ex5_03 instance503 = new Ex5_03();
//        instance503.sue();
//        Ex5_04 instance504 = new Ex5_04();
//        instance504.sue();
//        Ex5_05 instance505 = new Ex5_05();
//        instance505.sue();
//        Ex5_06 instance506 = new Ex5_06();
//        instance506.sue();
//        (Ex5_07은 main 으로 했음)
//        Ex5_08 instance508 = new Ex5_08();
//        instance508.sue();
//        Ex5_09 instance509 = new Ex5_09();
//        instance509.sue();
        Ex5_10 instance510 = new Ex5_10();
        instance510.sue();
//        Dear_Me instanceDearMe = new Dear_Me();
//        instanceDearMe.sue();
    }
}

class Ex5_01 {
    void sue(){
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i=0; i < iArr1.length ; i++){
            iArr1[i] = i + 1;
        }

        for (int i=0; i < iArr2.length ; i++) {
            iArr2[i] = (int)(Math.random()*10)+1;
        }

        for(int i=0; i< iArr1.length; i++){
            System.out.print(iArr1[i]+ ",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}

class Ex5_02 {
    void sue(){
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i<score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;

        System.out.println("총합: "+ sum);
        System.out.println("평균: "+ average);
    }
}

class Ex5_03 {
    void sue(){
     int[] score = {79, 88, 91, 33, 100, 55, 95};

     int max = score[0];
     int min = score[0];

     for(int i=1; i <score.length; i++){
         if(score[i] > max) {
             max = score [i];
         } else if(score[i] < min){
             min = score[i];
         }
     }

     System.out.println("최대값: " + max);
     System.out.println("최소값: " + min);
    }
}

class Ex5_04 {
    void sue(){
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i=0; i<100; i++) {
            int n = (int)(Math.random()*10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}

class Ex5_05 {
    void sue(){
        int[] ball = new int[45];

        for(int i=0; i < ball.length; i++)
            ball[i] = i+1;

        int tmp =0;
        int j=0;

        for (int i=0; i <6; i++) {
            j = (int) (Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        for(int i=0; i<6; i++)
                System.out.printf("ball[%d]=%d%n", i, ball[i]);
    }
}

class Ex5_06 {
    void sue(){
        String[] names = {"Kim", "Park", "Lee"};

        for (int i=0; i<names.length; i++)
            System.out.println("names["+i+"]:"+names[i]);

        String tmp = names[2];
        System.out.println("tmp:"+tmp);
        names[0] = "Yang";

        for (int i=0; i < names.length; i++)
            System.out.println(names[i]);
    }
}

//class Ex5_07 {
//    // C:\jdk1.8\work\Ch5>java Ex5_07 abc 123 "hello world" --- 커맨드라인? 주소=? ㅠㅠ...
//    public static void main(String[] args){
//        System.out.println("매개변수의 개수:"+ args.length);
//        for (int i=0; i<args.length; i++){
//            System.out.println("args["+i+"] = \""+ args[i]+"\"");
//        }
//    }
//}

class Ex5_08 {
    void sue(){
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int sum = 0;

        for (int i=0; i<score.length;i++) {
            for (int j=0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

                sum += score[i][j];
            }
        }

        System.out.println("sum="+sum);
    }
}

class Ex5_09 {
    void sue(){
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };
        int korTotal = 0, engTotal =0, mathTotal =0;
            System.out.println("번호  국어  영어  수학  총점  평균 ");
            System.out.println("===================================");
        for (int i=0; i<score.length;i++){
            int sum = 0;
            float avg = 0.0f;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i+1);

            for(int j=0; j<score[i].length;j++){
                sum += score[i][j];
                System.out.printf("%6d", score[i][j]);
            }
            avg = sum / (float)score[i].length;
            System.out.printf("%6d %6.1f%n", sum, avg);
        }
        System.out.println("===================================");
        System.out.printf("총점:%5d %5d %5d%n", korTotal, engTotal, mathTotal);
    }
}

class Ex5_10 {
    void sue() {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

            String tmp = scanner.nextLine();

            if (tmp.equals(words[i][1])) {
                System.out.printf("정답입니다. %n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
            }
        }
    }
}

class Dear_Me {
    void sue(){
// 멘탈 강한 사람들이 하지 않는 13가지 행동
        System.out.println("1. 자기 연민에 시간을 낭비하지 않는다.");
        System.out.println("2. 정신력을 낭비하지 않는다.");
        System.out.println("3. 변화를 두려워하지 않는다.");
        System.out.println("4. 자신이 컨트롤 할 수 없는 일에 에너지를 낭비하지 않는다.");
        System.out.println("5. 모든 사람을 기쁘게 하려 하지 않는다.");
        System.out.println("6. 예상한 리스크를 피하지 않는다.");
        System.out.println("7. 과거에 머무르지 않는다.");
        System.out.println("8. 같은 실수를 반복하지 않는다.");
        System.out.println("9. 다른 사람의 성공을 시기하지 않는다.");
        System.out.println("10. 한번의 실패로 포기하지 않는다.");
        System.out.println("11. 홀로 있는 시간을 두려워하지 않는다.");
        System.out.println("12. 세상이 자신에게 빚졌다고 생각하지 않는다.");
        System.out.println("13. 즉각적인 결과를 기대하지 않는다");
    }
}