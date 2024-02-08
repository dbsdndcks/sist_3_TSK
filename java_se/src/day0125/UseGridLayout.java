package day0125;

import java.awt.GridLayout;

import javax.swing.*;



//1. 윈도우 컴포넌트 상속
@SuppressWarnings("serial")
public class UseGridLayout extends JFrame {

	public UseGridLayout() {
		super("격자 레이아웃");

		// 2 컴포넌트를 생성
		// true를 붙이면 시작시 체크상태로 표시됨
		JRadioButton jrbPublic = new JRadioButton("public");
		JRadioButton jrbProtected = new JRadioButton("protected");
		JRadioButton jrbPackage = new JRadioButton("package");
		JRadioButton jrbPrivate = new JRadioButton("private",true);
		
		
		
		JCheckBox jrbNone = new JCheckBox("none",true);
		JCheckBox jrbSealed = new JCheckBox("sealed");
		JCheckBox jrbNonSealed = new JCheckBox("non-sealed");
		JCheckBox jrbFinal = new JCheckBox("final");

		// 버튼 그룹으로 라디오 버튼을 묶어야 여러개 중 하나만 선택 가능.
		ButtonGroup bg = new ButtonGroup();
		
		


		bg.add(jrbPublic);
		bg.add(jrbProtected);
		bg.add(jrbPackage);
		bg.add(jrbPrivate);
		
		
		//체크박스는 여러개가 선택되어야하기 때문에 그룹으로 묶지 않는다.

//		ButtonGroup bg2 = new ButtonGroup();
//		bg2.add(jrbNone);
//		bg2.add(jrbSealed);
//		bg2.add(jrbNonSealed);
//		bg2.add(jrbFinal);
//		
		
		// 3. 배치관리자 생성 설정.
		setLayout(new GridLayout(2, 4));

		// 4. 컴포넌트 배치

		add(jrbPublic);
		add(jrbProtected);
		add(jrbPackage);
		add(jrbPrivate);
		add(jrbNone);
		add(jrbSealed);
		add(jrbNonSealed);
		add(jrbFinal);

		// 5. 윈도우 크기 설정
		setSize(400, 200);

		// 6. 가시화
		setVisible(true);

		// 7. 윈도우 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new UseGridLayout();

	}

}
