package com.company.java007_ex;

public class Bank002_Array_3 {
    public static void main(String[] args) {
        int[][] datas = {
            {10, 10, 10, 10},
            {20, 20, 20, 20},
            {30, 30, 30, 30}
        };

        int[][] result = new int[datas.length + 1][datas[0].length + 1];

        for (int ch = 0; ch < datas.length; ch++) {
            for (int kan = 0; kan < datas[ch].length; kan++) {
                result[ch][kan] = datas[ch][kan];

                result[ch][result[ch].length - 1] += datas[ch][kan];               // Row sum
                result[result.length - 1][kan] += datas[ch][kan];                 // Column sum
                result[result.length - 1][result[ch].length - 1] += datas[ch][kan]; // Grand total
            }
        }

        // 출력
        for (int ch = 0; ch < result.length; ch++) {
            for (int kan = 0; kan < result[ch].length; kan++) {
                System.out.print(result[ch][kan] + "\t");
            }
            System.out.println();
        }
    }
}