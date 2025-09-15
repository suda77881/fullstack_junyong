package com.company.java007_ex;


public class Array2Ex008 {
	public static void main(String [] args) {
		
		int [][] datas = {{10,10,10,10},
						  {20,20,20,20},
						  {30,30,30,30}};
		
		int[][] result = new int[datas.length+1][datas[0].length+1];
	
		//입력 result[0][0] = datas[0][0]
		//    새로운 result 아파트 = 기존 datas 아프트
		for(int ch=0; ch<datas.length; ch++) {
			for(int kan=0; kan<datas[ch].length; kan++) {
				result[ch][kan] = datas[ch][kan];
			}
		}
		//처리(1) 가로방향 1010101010 // 00 01 02 03 04

//		ver-1
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][0];
//		
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][0];
//		
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][0];
//		result[0][4] += result[0][0];
		
		// ver-2
//		for(int kan=0; kan<result[0].length; kan++ ) {result[0][4] += result[0][kan];} 
//		for(int kan=0; kan<result[1].length; kan++ ) {result[1][4] += result[1][kan];} 
//		for(int kan=0; kan<result[2].length; kan++ ) {result[2][4] += result[2][kan];} 
		
		// ver-3
//		for(int kan=0; kan<result[0].length-1; kan++)
//		{for (int kan = 0; kan < result[ch].length - 1; kan++) {
//			
//			result[ch][4] += result[ch][kan];
//		}
//			
//		}
		// ver-4
		for (int ch = 0; ch <result.length - 1; ch++) {
			for (int kan = 0; kan < result[ch].length - 1; kan++) {
				result[ch][result[kan].length-1] += result[ch][kan];
				result[3][kan] += result[ch][0];
				result[3][4] += result[ch][kan];
			}
		}
		
//		for (int ch = 0; ch < result.length - 1; ch++) {
//			for (int kan = 0; kan < result[ch].length; kan++) {
//				result[3][4] += result[ch][kan];
//			}
//		}
//		
		
		for (int ch = 0; ch <result.length - 1; ch++) {
			for (int kan = 0; kan < result[ch].length - 1; kan++) 
			{result[ch][4] += result[ch][kan];}
		}
			
		for (int ch=0; ch<result.length; ch++) {///아파트의 층
			for(int kan=0; kan<result[ch].length; kan++) {
				System.out.print(result[ch][kan] + "\t");
			}
			System.out.println();	//한층이 끝남녀
			}
		
//		for(int ch=0; ch<result.length-1; ch++) {result[3][0] += result[ch][0];}
//		for(int ch=0; ch<result.length-1; ch++) {result[3][1] += result[ch][0];}
//		for(int ch=0; ch<result.length-1; ch++) {result[3][2] += result[ch][0];}
//		for(int ch=0; ch<result.length-1; ch++) {result[3][3] += result[ch][0];}
			
			
	
	
	
	
	
	
	}
			
			


		

	}
	
	
