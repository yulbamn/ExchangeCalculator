package exchange;

import java.util.Scanner;

public class Input {

	public double inputWon = 0;
	public int moneyType = 0;
	
	public void inputData() {
		//input�޴ºκи�
		Scanner myInput = new Scanner(System.in);
		System.out.print("���� ��ȭ �Է� : ");
		inputWon = myInput.nextDouble();
		System.out.print("\nȯ���� ȭ�� ������ �����Ͻʽÿ�(1:USD 2:EUR 3:JPY 0:����) : ");
		moneyType = myInput.nextInt();
		
		myInput.close();
	}
	
}
