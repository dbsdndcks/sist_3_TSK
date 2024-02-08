package day0205;

import java.io.File;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
*  JOptionPane.showInputDialog를 사용하여<br>
*  1.삭제할 파일의 경로와 파일명을 받는다.<br>
*  2.해당 파일이 존재한다면 ConfirmDialog를 사용하여 "정말 삭제하시겠습니까?"를 물어본 후 <br>
*  "예"가 눌리면 삭제하는 프로그램을 작성.<br>
*
*
 */
public class practice {

	
	
	
	
	public static void main(String[] args) {

		//   c:/dev/temp/java_read2.txt
		String filePath = JOptionPane.showInputDialog("삭제할 파일의 경로와 파일명을 입력해주세요.");
		//System.out.println(filePath);
		File file = new File(filePath);
		if(!file.exists()) {
			
			JOptionPane.showMessageDialog(null, file + "은 존재하지 않습니다. 파일 경로나 파일명을 확인 해주세요.");
			return;
		}//end if
		
		

				
		int option = JOptionPane.showConfirmDialog(null,file.getName() + "파일을 정말 삭제하시겠습니까?");
				
				if (option == JOptionPane.OK_OPTION) {
					
					file.delete();
					JOptionPane.showMessageDialog(null, file + "파일이 삭제되었습니다.");
				}
				
				
				

				
				
		
				
				
				
		
		
	}//main

}//class