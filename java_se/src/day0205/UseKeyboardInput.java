package day0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드의 입력 값 받기.<br>
 */
public class UseKeyboardInput {

	public UseKeyboardInput() throws IOException {

		System.out.println("아무키나 누르고 엔터");

//		int readData = System.in.read();
//		System.out.println("입력 값 : " + readData);
//		int readData = 0;

//	while((readData = System.in.read())!=13) {
//		
//		System.out.println("입력 값 : " + readData);
//		

//	}//end while

//	//입력한 문자열이 그대로 출력되는 코드를 작성해보세요.(한글을 출력할 수 없다.)
//	while((readData = System.in.read())!=13) {
//	
//	System.out.print((char)readData);
//	
//	
//}//end while

		// 한글을 줄 단위로 읽어서 보여줄 수 있는 16bit stream의 사용.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String readData;
		try {
			readData = br.readLine();
			System.out.println("입력 값 : " + readData);

		} finally {

			if (br != null) {

				br.close();// 연결이 끊어지지 않으면 메모리 누수가 발생한
			}

			// try에서 예외 발생될 시 예외처리 되기전에 finally를 실행한 후 예외처리시작ㄹ

		}

	}// UseKeyboardInput

	public static void main(String[] args) {

		try {
			new UseKeyboardInput();
		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}// main

}// class
