package com.company.test;

public class Array2_test {
	
	public static void main(String[] args) {
		
		
		int [][] datas = {{10,10,10,10},{20,20,20,20},{30,30,30,30}}; 
		int [][] result = new int[datas.length+1][datas[0].length+1]; 
		
		for (int ch = 0; ch < datas.length ; ch++){ 
			for (int kan = 0; kan < datas[ch].length; kan++){ 
				result[ch][kan] += datas[ch][kan]; // 각 위치에 출력될 변수 
				result[ch][4] += datas[ch][kan]; // 최종합산 
				result[3][kan] += datas[ch][kan] ;// 세로줄 합산}}
				System.out.print(result[ch][kan] + "\t");
			}
			
			System.out.println(result[ch][4]);
			
		}
		
		
		for (int ch = 0; ch < datas.length-2 ; ch++){ 
			for (int kan = 0; kan < datas[ch].length; kan++) {
				
				System.out.print(result[3][kan] + "\t");
				result[3][4] += result[3][kan];
			}
			System.out.println(result[3][4]);
		}
	}

}
