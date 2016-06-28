/**
 * 
 */
package com.gome.main;

import java.util.Date;

/**
 * @author zhangzhaoyang
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	java.util.Date utilDate=new Date();
		
		java.sql.Timestamp stp=new java.sql.Timestamp(utilDate.getTime());
		
		System.out.println(stp);*/
		
		int[] arr = new int[]{8,2,1,0,3};
		int[] index = new int[] {2,0,3,2,4,0,1,3,2,3,3};
		String tel="";
		for(int i : index){
			tel+=arr[i];
		}
		
		System.out.println("联系方式:"+tel);
		System.out.println("联系方式:"+tel);
		System.out.println("联系方式:"+tel);
		
	}

}
