package exchange;

public class Change {
	
	public void change(int returnWon) {		
		//�Ž����� ���� ��¸�
		System.out.println("\n�Ž����� : " + returnWon + "��");
		System.out.println("\n5������ " + (int) returnWon / 50000 + " ��");
		System.out.println("1������ " + (int) returnWon % 50000 / 10000 + " ��");
		System.out.println("5õ���� " + (int) returnWon % 50000 % 10000 / 5000 + " ��");
		System.out.println("1õ���� " + (int) returnWon % 50000 % 10000 % 5000 / 1000 + " ��");
		System.out.println("500�� " + (int) returnWon % 50000 % 10000 % 5000 % 1000 / 500 + " ��");
		System.out.println("100�� " + (int) returnWon % 50000 % 10000 % 5000 % 1000 % 500 / 100 + " ��");
		System.out.println("50�� " + (int) returnWon % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50 + " ��");
		System.out.println("10�� " + (int) returnWon % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + " ��");
	}
	
}
