package s1.basic;

public class PrintMain06 {

	public static void main(String[] args) {
		//성적표 만들기
		/* printf 사용하여 만들기.
		성적표
		국어 : 98점
		영어 : 97점
		총점 : 195점
		평균 : 97.5점
		 */
		
		System.out.printf("성적표%n");
		System.out.printf("%s : %d점%n" , "국어", 98);
		System.out.printf("%s : %d점%n", "영어", 97);
		System.out.printf("%s : %d점%n", "총점" , 195);
		System.out.printf("%s : %.1f점%n", "평균" , 97.5);
		//97.5 ->실수이기 때문에 %f를 사용해야한다.
		
	}

}
