package s1.basic;

public class PrintMain05 {

	public static void main(String[] args) {
	//System.out.printf(포맷 문자, 데이터)를 이용한 출력
	
		//문자
		System.out.printf("%c", 'A');
		// %c는 문자를 나타내는 포맷 문자
		System.out.printf("%c%n", 'B');
		// %c는 문자, %n은 줄바꿈
		System.out.printf("%6c%n", 'C');
		// 6칸 확보 후 오른쪽 정렬
		System.out.printf("%-6c%n", 'D');
		// 6칸 확보 후 왼쪽 정렬
		
		System.out.println("==============");
		
		//정수
		System.out.printf("%d%n" , 12);
		System.out.printf("%,d%n", 13000);
		// 3자리 단위로 쉼표 표시
		System.out.printf("%5d%n" , 20);
		// 5칸 확보 후 오른쪽 정렬
		System.out.printf("%-5d%n" , 20);
		// 5칸 확보 후 왼쪽 정렬
		
		System.out.println("==============");
		
		//실수
		System.out.printf("%f%n" , 3.14);
		// %f는 실수, 실수는 기본으로 소수 자리 6칸 확보
		System.out.printf("%.2f%n" , 35.896);
		// 소수점 셋째자리에서 반올림하여 둘째자리까지 나타내기
		System.out.printf("%10.2f%n" , 35.896);
		//전체 자리 10칸 확보 후 소수점 셋째 자리에서 반올림하여 둘째 자리까지 나타내고 왼쪽 정렬
		System.out.printf("%5.2f%n" , 35.896);
		//전체 자리 5칸 확보하는데 얘는 전체 자리수가 딱 5칸 필요해서 비어있는 공간이 없음!
		
		System.out.println("==============");
		
		//문자열
		System.out.printf("%s%n" , "우주");
		//%s는 문자열
		System.out.printf("%5s%n" , "바다");
		// 5칸 확보 후 오른쪽 정렬
		System.out.printf("%-5s%n", "바다");
		//5칸 확보 후 왼쪽 정렬
		
		System.out.println("==============");
		
		//논리값
		System.out.printf("%b%n" , true);
		//boolean -> 논리값 , true or false
		
		//데이터 종류가 여러개일 경우
		System.out.printf("%s는 %d점 입니다.%n" , "점수" , 98 );
		// 점수 -> %s (문자열), 98 -> %d (정수) , %n -> 줄바꿈
		System.out.printf("중간고사 성적은 총점 %d, 평균 %d입니다.%n", 284, 95);
		//-> 데이터 종류가 여러개면 순서에 맞게 작성해주면 된다.
		
	}

}
