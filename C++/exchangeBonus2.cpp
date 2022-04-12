#include <stdio.h>

int main() {
	const float DOLLAR_PER_WON = 1232.90; // 상수는 전부 대문자로 작성하는게 약속 
	const float JPY = 9.87;
	const float EUR = 1342.53;
	const float CNY = 193.20;
	const float GBP = 1605.22;
		
	int inputWon;
	printf("환전을 원하는 원화 금액을 입력하세요 : ");
	scanf("%d", &inputWon);	
	
	int menuNumber;
	char *moneyName;
	do{
		printf("환전할 외화를 선택하세요 (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
		scanf("%d", &menuNumber);
	} while(menuNumber < 1 || menuNumber > 5);
	
	int val; int nOf1000; int nOf500; int nOf100; int nOf50; int nOf10; int nOf1;
	float outputMoney; float selectCountry;
	//달러 
	if(menuNumber == 1){
		selectCountry = DOLLAR_PER_WON;
		moneyName = "달러"; 
	}	
	//엔
	if(menuNumber == 2){ 
		selectCountry = JPY;
		moneyName = "엔"; 
	}
	//유로
	if(menuNumber == 3){
		selectCountry = EUR;
		moneyName = "유로"; 
	}
	//위안
	if(menuNumber == 4){
		selectCountry = CNY;
		moneyName = "위안"; 
	}
	//파운드
	if(menuNumber == 5){
		selectCountry = GBP;
		moneyName = "파운드"; 
	}
	
	outputMoney = inputWon / selectCountry;
	val = (int) ((outputMoney - (int)outputMoney) * selectCountry);
	printf("%d 원 -> %d %s, 잔돈 %d원\n", inputWon, (int)outputMoney, moneyName, val);
	
	
	nOf1000 = val / 1000;
	nOf500 = (val % 1000) / 500;
	nOf100 = (val % 500) / 100;
	nOf50 = (val % 100) / 50;
	nOf10 = (val % 50) / 10;
	nOf1 = (val % 10) / 1;	
	printf("1000원 : %d장\n500원 : %d개\n100원 : %d개\n50원 : %d개\n10원 : %d개\n1원 : %d개\n" , 
	nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );
	return 0;
} 
