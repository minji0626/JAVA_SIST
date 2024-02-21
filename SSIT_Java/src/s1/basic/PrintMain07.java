package s1.basic;

public class PrintMain07 {

	public static void main(String[] args) {
		/*
		 	유재석은 은행 계좌를 가지고 있다. 계좌에 1,000원이 예금되어 있는데
			오늘 325원을 송금받아서 잔고가 1,325원이 되었다.
			특별이자율은 0.3이 적용되어 내일 이자 397.5원을 받는다.
			예금자, 송금되기전 잔금, 송금된 금액, 송금이후 잔금, 내일 입금될 이자를 출력하시오.
		 */
		System.out.printf("예금자는 %s이다.%n" , "유재석");
		System.out.printf("송금되기 전 잔금은 %,d원이다.%n" , 1000);
		System.out.printf("송금된 금액은 %d원이다.%n송금 이후의 잔금은 %,d원이다. %n내일 입금될 이자는 %.1f원이다.%n" , 325, 1325, 397.5);
	}

}
