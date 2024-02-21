package s1.basic;

public class PrintMain03 {

	public static void main(String[] args) {
		//문자: 한 문자 ''-> 문자를 의미하는 특수문자, A-> 일반 문자
		System.out.println('A');
		System.out.println('강');
		//System.out.println('도시'); -> 오류 발생, 문자열에는 '' 사용 불가
		
		//문자열: 한 문자 이상의 문자들 ""-> 문자열을 의미하는 특수문자, 바다-> 일반 문자열
		System.out.println("Z");
		System.out.println("city");
		System.out.println("한강");
		
		//정수
		System.out.println(23);
		//System.out.println("23");
		//오류는 없으나 ""포함하여 작성하면 정수가 아닌 문자열로 인식하기 때문에 연산이 불가능하다.
		
		//실수
		System.out.println(3.14);
		//System.out.println("3.14");
		//오류는 없으나 실수가 아닌 문자열로 인식하기 때문에 연산이 불가능하다.
		
		//논리값(boolean)
		System.out.println(true); //참값
		System.out.println(false); //거짓값
		System.out.println("false"); //논리값이 아닌 문자열로 인식한다.

	}

}
