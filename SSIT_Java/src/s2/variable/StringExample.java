package s2.variable;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name); // println은 자동 줄바꿈
		System.out.println(job);
	
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str); // \" -> " 문자 포함
		
		str = "번호 \t 이름 \t 직업";
		System.out.println(str); // 출력시 탭만큼 띄움
		
		System.out.print("나는\n"); // 줄바꿈
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
	}
}
