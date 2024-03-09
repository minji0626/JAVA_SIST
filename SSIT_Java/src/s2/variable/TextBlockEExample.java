package s2.variable;

public class TextBlockEExample {
	public static void main(String[] args) {
		// 텍스트 블록 문법이다. 큰따옴표 3개로 감싸면 이스케이프하거나 라인피드를 할 필요가 없다.
		String str1 = "" +
						"{\n" +
						"\t\"id\":\"winter\",\n" +
						"\t\"name\":\"눈송이\"\n" +
						"}";
		String str2 = """
				{
					"id" : "winter",
					"name" : "눈송이"
				}
				""";
		
		System.out.println(str1);
		System.out.println("---------------------------");
		System.out.println(str2);
		System.out.println("---------------------------");
		
		// 줄바꿈을 하지 않고 다음 줄에 이어서 작성하고 싶으면 끝에 \ 붙이기
		String str = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겂니다.
				""";
		System.out.println(str);
	}

}
