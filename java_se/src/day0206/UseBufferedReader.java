package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReader를 사용한 줄단위 읽기
 */
public class UseBufferedReader {

	public UseBufferedReader() throws FileNotFoundException,IOException {
		//1.File 생성
		File readFile = new File("C:/dev/temp/java_read.txt");
		if(!readFile.exists()) {
			
			System.out.println(readFile.getAbsolutePath()+"는 존재하지 않습니다.");
			return;
		}
//		//2.스트림 생성
//		FileInputStream fis = new FileInputStream(readFile);//파일과 연결
//
//		InputStreamReader isr = new InputStreamReader(fis); // 8bit stream + 16bit stream연결
//		BufferedReader br = new BufferedReader(isr);

		
		BufferedReader br = null;
				try {
					br = new BufferedReader(new InputStreamReader(new FileInputStream(readFile)));
				
				
		
		//3. 스트림에 연결된 파일의 내용읽기
		String str ="";
		while((str=br.readLine())!=null) {
			System.out.println(str);
			
			
		}//end while
		
				} finally {
					if(br != null) {
						
						br.close();
					}
					
					
					
				}
		
	}//UseBufferedReader
	
	

	
	
	
	public static void main(String[] args) {
		
		try {
			new UseBufferedReader();
		} catch (FileNotFoundException fnfe) {
			System.err.println("파일 경로를 확인해보세요.");
			fnfe.printStackTrace();
			
		} catch (IOException ioe) {
			
			System.err.println("파일을 읽어들이는 동안 문제가 발생하였습니다..");
			ioe.printStackTrace();
		}

	}//main

}//class