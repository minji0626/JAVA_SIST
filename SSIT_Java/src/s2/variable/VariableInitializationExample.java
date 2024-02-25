package s2.variable;

public class VariableInitializationExample {

	public static void main(String[] args) {
		//변수 value 선언
		int value;
		//변수 result 선언, 오류가 나는 이유 : value 선언 후 초기화가 안 되어 오류 발생
		value = 20;
		int result = value + 10;
		// result 출력
		System.out.println(result);
	}

}
