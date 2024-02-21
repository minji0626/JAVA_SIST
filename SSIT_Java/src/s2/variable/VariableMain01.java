package s2.variable;

public class VariableMain01 {

	public static void main(String[] args) {
		// variable (변수)는 값을 저장할 수 있는 공간
		
		//변수 선언
		int num;
		// int -> 정수형이라는 뜻 num -> 변수 이름
		// 변수의 초기화 -> num의 메모리 공간에 17을 저장한다
		num = 17;
		//변수의 값을 출력해보자
		System.out.println(num);
		System.out.println("==============");
		
		//변수 선언과 초기화
		int number = 20;
		
		// 데이터 변경
		number = 40;
		
		//데이터 출력
		System.out.println(number);
		
		//int number = 30;
		// 같은 변수명을 갖고 있으면 선언을 할 수 없다.
		
		System.out.println("------------------------");
		
		//int a = 10;
		//int b = 20;
		//=> 동일한 자료형을 사용하면 두 번째는 생략이 가능하다.
		int a = 10 ,b = 20;
		int result = a + b; //여기서 쓰이는 +는 연산
		System.out.println("result = " + result); // 여기서 쓰이는 + 연결
		// 숫자 + 숫자 => 연산
		// 숫자 + 문자열 => 연결
		// 문자열 + 숫자 => 연결
		// 문자열 + 문자열 => 연결
		
		//주의사항
		System.out.println("결과 = " + ( a + b)); // (a + b) -> 연산
		System.out.println("결과 = " + a + b); //  + a + b ->연결
		
		//변수 선언
		//int no;
		// 출력하기 전에 변수 초기화는 필수로 해야한다.
		//System.out.println(no);
	}

}
