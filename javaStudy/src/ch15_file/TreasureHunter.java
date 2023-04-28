package ch15_file;

import java.io.File;

public class TreasureHunter {

	public static void main(String[] args) {
		String path = "/home/pc08/today/treasure";

		// treasure 풀더 내 파일을 먼저 찾기!!
		System.out.println(path);
//		File coffee = new File(path + i + "/" + j + "/" + k + "");
			for (int a = 0; a < 20; a++) {
				for (int k = 0; k < 20; k++) {
					for (int i = 0; i < 20; i++) {
						File src = new File(path + "/" + i + "/" + k +"/"+ a);
						File[] srcArray = src.listFiles();
						for (int j = 0; j < srcArray.length; j++) {
							// 파일명만 출력
							System.out.println(srcArray[j]);
						}
					}
				}
			}
		
	}
}
