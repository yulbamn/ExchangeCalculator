package exchange;

import java.util.Scanner;

public class Input {

	public double inputWon = 0;
	public int moneyType = 0;
	
	public void inputData() {
		//input받는부분만
		Scanner myInput = new Scanner(System.in);
		System.out.print("받은 원화 입력 : ");
		inputWon = myInput.nextDouble();
		System.out.print("\n환전할 화폐 종류를 선택하십시오(1:USD 2:EUR 3:JPY 0:종료) : ");
		moneyType = myInput.nextInt();
		
		myInput.close();
	}
	
}
