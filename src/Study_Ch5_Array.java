import java.util.Arrays;

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
        Ex5_05 instance505 = new Ex5_05();
        instance505.sue();
//        Ex5_06 instance506 = new Ex5_06();
//        instance506.sue();
//        Ex5_07 instance507 = new Ex5_07();
//        instance507.sue();
//        Ex5_08 instance508 = new Ex5_08();
//        instance508.sue();
//        Ex5_09 instance509 = new Ex5_09();
//        instance509.sue();
//        Ex5_10 instance510 = new Ex5_10();
//        instance510.sue();
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

    }
}

class Ex5_06 {
    void sue(){

    }
}

class Ex5_07 {
    void sue(){

    }
}

class Ex5_08 {
    void sue(){

    }
}

class Ex5_09 {
    void sue(){

    }
}

class Ex5_10 {
    void sue(){

    }
}