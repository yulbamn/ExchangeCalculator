package exchange;


public class Main {
		
	public static void main(String[] args) {
		Input exchangeInput = new Input();
		Process exchangeProcess = new Process();
		Print exchangePrint = new Print();
		ReturnMoney exchangeReturnMoney = new ReturnMoney();
		Change exchangeChange = new Change();
					
		while(true) {
			
			exchangeInput.inputData();
			if(exchangeInput.moneyType == 0) {
				break;		
			}
			exchangeProcess.process(exchangeInput.inputWon, exchangeInput.moneyType);
			exchangePrint.print(exchangeProcess.moneyText, exchangeProcess.exchangeRate, exchangeInput.moneyType, exchangeProcess.returnMoney, exchangeProcess.returnWon);
			exchangeReturnMoney.returnMoney(exchangeInput.moneyType, exchangeProcess.returnMoney, exchangeProcess.moneyText);
			exchangeChange.change(exchangeProcess.returnWon);
			break;
		}	
		
	} 
	
}
