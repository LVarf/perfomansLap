package task1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = scanner.nextInt();
        System.out.println("Enter the interval:");
        int m = scanner.nextInt();
        if ((n == 0) || (m == 0)){
            System.out.println("Written incorrect dates");
            System.exit(0);
        }

        Integer[] path = getPath(n, m);
        System.out.println("The path of the array with length " + n + " with the interval " + m + ": ");
        for (int i = 0; i < path.length; i++) {
            System.out.print(path[i]);
        }

    }

    public static Integer[] getPath(int n, int m) {
        List<Integer> path = new ArrayList<>(5);
        int[] pathArray = new int[m];
        int ni = 1;

        while (true) {
            for (int i = 0; i < m; i++) {
                pathArray[i] = ni;
                if (ni == n) {
                    if (i +1 == m) {
                    } else {
                        ni = 1;
                    }
                } else {
                    if (i + 1 == m) {
                    } else {
                        ni++;
                    }
                }
            }
            path.add(pathArray[0]);
            for (int i = 0; i < m; i++) {
//                System.out.print(pathArray[i]); //uncomment for check
            }
//            System.out.println(); //uncomment for check

            if (pathArray[m-1] == 1)
                break;
        }
        Integer[] getArray = path.toArray(new Integer[]{});
        return getArray;
    }

}
