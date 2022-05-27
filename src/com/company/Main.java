//package com.company;
//import java.util.Arrays;
//public class Main {
//
//
//    public static void main(String[] args) {
//        int[] array = new int[]{1, 2, 2, 20, 6, 20, 2, 6,2};
//
//        int pairCount = pairSearch(array);
//        System.out.println(pairCount);
//    }
//
//    static int pairSearch(int[] mass){
//        int[] array=mass;
//        int count=0;
//
//        Arrays.sort(array);
//
//        for (int i=1 ;i< array.length;i++){
//            if (array[i-1] == array[i]) {
//                count++;
//                i++;
//            }
//        }
//        return count;
//    }
//}

//package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int first = 4;
//        int last = 17;
//
//        int res = dontGiveMeFive(first, last);
//        System.out.println(res);
//    }
//
//    static int dontGiveMeFive(int first, int last) {
//        int result = 0;
//        for (int i = first; i < last + 1; i++) {
//            if (!String.valueOf(i).contains("5")) {
//                result++;
//            }
//        }
//        return result;
//    }
//}
//
package com.company;

public class Main {
    public static void main(String[] args) {
        int first = 251;
        int last = 153;

        int res = greatestComDiv(first, last);
        System.out.println(res);
    }

    static int greatestComDiv(int x, int y) {
        int result = 0;
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;

            }
        }
        result = x;
        return result;
    }
}



