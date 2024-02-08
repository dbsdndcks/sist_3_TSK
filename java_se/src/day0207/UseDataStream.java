package day0207;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseDataStream {

	
	public void writeData() throws IOException{
		
		int i = 2024;
		
		DataOutputStream dos =null;
		try {
			//기본형 데이터형을 기록할 스트림을 파일에 연결
			dos=new DataOutputStream(new FileOutputStream("c:/dev/temp/data.txt"));

			//스트림에 쓰기
//			dos.writeInt(i);
//			dos.writeDouble(i);
			dos.writeUTF("오늘은 수요일입니다.");
			//분출
			dos.flush();
			
		}finally {
			if(dos != null) {dos.close();}//end if
		}//end finally
		
		
	}//writeData
	
	public void readData() throws IOException{
		
		DataInputStream dis = null ;
		
		try {
			dis = new DataInputStream(new FileInputStream("c:/dev/temp/data.txt"));
//			int readData = dis.readInt();
//			System.out.println(readData);
//			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
		} finally {
			if(dis!=null) {dis.close();}
		}
		
		
		
		
	}//writeData
	
	
	public static void main(String[] args) {
		
		UseDataStream ud = new UseDataStream();
		
		try {
			ud.writeData();
			System.out.println("쓰기완료");
			ud.readData();
			System.out.println("읽기완료");
		} catch (IOException ie) {
			ie.printStackTrace();
		}//end catch
		
	}//main

}//class
