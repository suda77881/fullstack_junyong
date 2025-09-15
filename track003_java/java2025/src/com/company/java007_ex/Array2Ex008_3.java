public class Array2Ex008_3 {
    public static void main(String[] args) {
        int[][] datas = {
            {10, 10, 10, 10},
            {20, 20, 20, 20},
            {30, 30, 30, 30}
        };

        int[][] result = new int[datas.length + 1][datas[0].length + 1];

        
        
        // 00 01 02 03  
        // 10 11 12 13
        // 20 21 22 23
        // 30 31 32 33
       
        for (int ch = 0; ch < datas.length; ch++) {
            for (int kan = 0; kan < datas[ch].length+1; kan++) {
                result[ch][kan] = datas[ch][kan]; 
          
                result[ch][result[ch].length - 1] += datas[ch][kan];              
                result[result.length - 1][kan] += datas[ch][kan];
                result[result.length - 1][result[ch].length - 1] += datas[ch][kan];
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