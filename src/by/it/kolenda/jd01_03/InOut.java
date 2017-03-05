package by.it.kolenda.jd01_03;


import java.util.Scanner;

public class InOut {

    static String consoleReadLine() {
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        return res;

    }

    static double[] readDoubleArrayFormLine(String line) {
        line = line.trim();
        String[] strValues = line.split(" ");
        double[] res = new double[strValues.length];
        for (int i = 0; i < strValues.length; i++) {
            res[i] = Double.parseDouble(strValues[i]);

        }
        return res;
    }


    static void printDoubleArray(double[] arr, String name, int countCols) {
        System.out.println("Array " + name);
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("%s[% -3d]=%-10.3f", name, i, arr[i]);
            if ((i + 1) % countCols == 0)
                System.out.println();
        }
    }
}