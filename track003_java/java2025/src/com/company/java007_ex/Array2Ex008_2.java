package com.company.java007_ex;


public class Array2Ex008_2 {
	public static void main(String [] args) {
		
		int [][] datas = {{10,10,10,10},
						  {20,20,20,20},
						  {30,30,30,30}};
		
		int[][] result = new int[datas.length+1][datas[0].length+1];
	
	for (int ch = 0; ch < datas.length; ch++) {
		for (int kan = 0; kan < 
				datas[ch].length; kan++) {
			
			
			
			result[ch][datas.length+1] += datas[ch][kan];
			result[ch][kan] += datas[ch][kan];
			
			
			System.out.print(result[ch][kan] + "\t");
			
					
			}
			
			
		System.out.print(result[ch][4] + "\n");
			
		}
	
	
	
	

//	result[3][0] += result[0][0];
//	result[3][0] += result[1][0];
//	result[3][0] += result[2][0];
	

//	result[3][1] += result[0][1];
//	result[3][1] += result[1][1];
//	result[3][1] += result[2][1];
	
//	result[3][2] += result[0][2];
//	result[3][2] += result[1][2];
//	result[3][2] += result[2][2];
	for (int ch = 0; ch < result.length - 1; ch++) {
	for (int kan = 0; kan < result[ch].length; kan++)
	{
		result[ch][4] += result[ch][kan];	//	4zks
		result[3][kan] += result[0][kan];	//	3cmd
		result[3][4] += result[ch][kan];	// 3cmd 4zks
	}
		
	}
	for (int ch=0; ch<result.length; ch++) {
		for(int kan=0; kan<result[ch].length; kan++) {
			System.out.print(result[ch][kan] + "\t");
		}
	}
	System.out.println();	//	끝나면

	

//		int hei0 = 0; hei0 += datas[0][kan];break;
//		int hei1 = 0; hei1 += datas[1][kan];break;
//		int hei2 = 0; hei2 += datas[2][kan];break;
//		int hei3 = 0; hei3 += datas[3][kan];break;
		
//		
//		result[datas.length+1][datas[0].length+1] += result[ch][datas[0].length];

		

	}
	
	}
