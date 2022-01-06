package org.example.pascal_14;

public class TrianglePascal {

    public static void getTriangle(int n) {
        int[][] p = new int[n][];
        p[0] = new int[1];
        p[1] = new int[2];
        p[1][0] = p[1][1] = 1;
        System.out.println(p[0][0] = 1);
        System.out.println(p[1][0] + " " + p[1][1]);
        for (int i = 2; i < n; i++) {
            p[i] = new int[i + 1];
            System.out.print((p[i][0] = 1) + " ");
            for (int j = 1; j < i; j++) {
                System.out.print((p[i][j] = p[i - 1][j - 1] + p[i - 1][j]) + " ");
            }
            System.out.println(p[i][i] = 1);
        }
        System.out.println();
        getString(10, p);
    }

    public static StringBuilder getString(int n, int[][] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n == 1) {
            if (arr[n - 1] != null) {
                stringBuilder.append(arr[n - 1][0]);
            }
        } else if (n == arr.length) {
            for (int i = 0; i < arr[n - 1][i]; i++) {
                if (arr[n - 1] != null) {
                    stringBuilder.append(arr[n - 1][i] + " ");
                }
            }
        } else {
            for (int i = 0; i < arr[n][i]; i++) {
                if (arr[n - 1] != null) {
                    stringBuilder.append(arr[n - 1][i] + " ");
                }
            }
        }
        System.out.println("String with number: " + n);
        System.out.println(stringBuilder);
        return stringBuilder;
    }
}
