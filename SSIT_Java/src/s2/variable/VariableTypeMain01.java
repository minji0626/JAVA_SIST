package s2.variable;

public class VariableTypeMain01 {

	public static void main(String[] args) {
		
		// 논리값 ( True , False) boolean
		System.out.println("---- 논리형 ----");
		boolean b = true;
		System.out.println("b = " + b);
		
		boolean arial =  false;
		System.out.println("arial = " + arial);
		
		//문자형 (char) 크기 Byte - 2byte = 16bit
		// 다국어 처리를 위하여 유니코드를 사용함
		// 문자코드 => 유니코드 16진수를 사용하여 나타냄 
		// 유니코드 안에 아스키코드가 포함되어 있다.
		// 한글은 유니코드로만 명시할 수 있다.
		// 아스키코드는 10진수를 사용한다.
		
		System.out.println("---- 문자형 ----");
		char c1 = 'A';
		char c2 = 65; // 아스키코드
		char c3 = '\u0041'; // 유니코드
		char c4 = '자';
		char c5 = '\uc790'; //유니코드
	
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		
		//정수형 ( byte, short, int, long)
		// byte -> 1 byte, 8 bit
		// short -> 2 byte, 16 bit
		// int -> 4 byte , 32 bit
		// long -> 8 byte , 64 bit
		System.out.println("---- 정수형 ----");
		
		byte b1 = 127;
		System.out.println("b1 = " + b1);
		short s1 = 32678;
		System.out.println("s1 = " + s1);
		int i1 = 1234;
		System.out.println("i1 = " + i1);
		long lg = 1234L;
		System.out.println("lg = " + lg);
	
		//실수형 ( float, double)
		// float -> 4 byte , 32 bit
		// double -> 8 byte, 64 bit
		System.out.println("---- 실수형 ----");
		float f1 = 9.1f;
		System.out.println("f1 : " + f1);
		double du = 9.8;
		System.out.println("du : " + du);
		
		System.out.println("---- 문자열 ----");
		String str = "Hello World!";
		System.out.println(str);
	
	}

}
