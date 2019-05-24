package com.ezsoft.test;

import org.json.JSONObject;

public class TestMain {

	public static void main(String[] args) {
		int days = 8;
		int zblbNum = 2; //zblb上下午共2个
		Boolean[][] isHasDoc = new Boolean[zblbNum][days];
		for(int i = 0; i < zblbNum; i++){
			for(int j = 0; j < days; j++){
				isHasDoc[i][j] = false;
			}
		}
		for(int i = 0; i < zblbNum; i++){
			for(int j = 0; j < days; j++){
				isHasDoc[i][j] = false;
				System.out.print(isHasDoc[i][j]);
			}
			System.out.println();
		}
	}

}
