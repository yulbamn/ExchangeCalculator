package exchange;

public class ReturnMoney {

	public void returnMoney(int moneyType, int returnMoney, String moneyText) {
		//ȯ���ݾ� ���� ��¸�
		System.out.printf("\nȯ���ݾ� : %d %s \n", returnMoney, moneyText);
		switch(moneyType) {
		case 1:
			System.out.println("\n$100 ���� " + (int) returnMoney / 100 + " ��");
			System.out.println("$50 ���� " + (int) returnMoney % 100 / 50 + " ��");
			System.out.println("$20 ���� " + (int) returnMoney % 100 % 50 / 20 + " ��");
			System.out.println("$10 ���� " + (int) returnMoney % 100 % 50 % 20 / 10 + " ��");
			System.out.println("$5 ���� " + (int) returnMoney % 100 % 50 % 20 % 10 / 5 + " ��");
			System.out.println("$1 ���� " + (int) returnMoney % 100 % 50 % 20 % 10 % 5 / 1 + " ��");
		break;
		case 2:
			System.out.println("\n200���α� " + (int) returnMoney / 200 + " ��");
			System.out.println("100���α� " + (int) returnMoney % 200 / 100 + " ��");
			System.out.println("50���α� " + (int) returnMoney % 200 % 100 / 50 + " ��");
			System.out.println("20���α� " + (int) returnMoney % 200 % 100 % 50 / 20 + " ��");
			System.out.println("10���α� " + (int) returnMoney % 200 % 100 % 50 % 20 / 10 + " ��");
			System.out.println("5���α� " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 / 5 + " ��");
			System.out.println("2���ε��� " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " ��");
			System.out.println("1���ε��� " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " ��");
		break;
		default:
			System.out.println("\n10000���� " + (int) returnMoney / 10000 + " ��");
			System.out.println("5000���� " + (int) returnMoney % 10000 / 5000 + " ��");
			System.out.println("2000���� " + (int) returnMoney % 10000 % 5000 / 2000 + " ��");
			System.out.println("1000���� " + (int) returnMoney % 10000 % 5000 % 2000 / 1000 + " ��");
			System.out.println("500������ " + (int) returnMoney % 10000 % 5000 % 2000 % 1000 / 500 + " ��");
			System.out.println("100������ " + (int) returnMoney % 10000 % 5000 % 2000 % 500 / 100 + " ��");
			System.out.println("50������ " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 / 50 + " ��");
			System.out.println("10������ " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + " ��");
			System.out.println("1������ " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + " ��");
		}
		
	}
	
}
