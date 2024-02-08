package day0202_HomeWork;

import java.util.Iterator;
import java.util.Random;

import day0202.TabaccoException;

/**
 * 숙제 
 * - 입력받은 단을 사용하여 구구단을 출력하는 method를 작성합니다.
 * - 구구단을 출력하는 위의 method를 호출하는 method를 작성합니다. (main method호출)
 *  유효성 : 
 *  구구단은 2~9단까지이며, 입력된 단이 해당범위가 아닐 때에는 예외를 발생시켜 처리합니다.
 * 
 *  구구단 예외는 Java Api에서는 제공되지 않으니 사용자 정의 예외처리 클래스로 작성해보세요 ( Compile Exceptiom으로 작성할 것)
 */
public class HomeWork0202 {
	int num ;
	
	
	public void gugudan(String num) throws GugudanException{// 일 => 구현해야할 업무
		
	
		
		this.num = Integer.parseInt(num);
		
		
		if (this.num>= 2 && this.num <=9) {

			for (int i = 1; i <=9 ; i++) {
				System.out.println(num + " * " + i + " = " + (this.num*i));
				
			}


		} else {
			throw new GugudanException(this.num);
			
		}


		
	}
	
	
	
	
	

	public static void main(String[] args) {

		HomeWork0202 hw = new HomeWork0202();
		
		
		
		
		try {
//			String msg = my.walk();//내부에서 try~catch를하면 밖에서 봤을 때 method내부에서 어떤 문제가 발생할지 모른다.
			
			
			
			
			
			hw.gugudan(args[0]);
			
			
			

			
		}catch(GugudanException e) {
		//	e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
		
	}//main

}//class