package ch15_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) {
		// 자바에서 파일에 내용 쓰기
		String filePath = "/home/pc08/today/test.txt";
		
		File test = new File(filePath);
		
		// new FileOutPutStream(text) -> 기존 파일 내용을 덮어씀
		// new FileOutPutStream(text, true) -> 기존 파일 내용에 이어씀
		try (FileOutputStream fos = new FileOutputStream(test, true)) {
			
			String temp = "\n모래는 일요일~~~";
			
			// String 에 .getByte() 하면 byte[] 를 리턴
			byte[] tempByte = temp.getBytes();
			
			fos.write(tempByte);
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
