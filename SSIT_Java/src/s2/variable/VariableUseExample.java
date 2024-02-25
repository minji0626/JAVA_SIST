package s2.variable;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3; //hour 변수 선언 후 3으로 초기화
		int minute = 5; //minute 변수 선언 후 5로 초기화
		System.out.println(hour + "시간 " + minute + "분");
		// 정수 + 정수 는 연산, 문자열 + 정수는 연결
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분");
	}

}
