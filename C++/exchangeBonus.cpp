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
	do{
		printf("환전할 외화를 선택하세요 (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
		scanf("%d", &menuNumber);
	} while(menuNumber < 1 || menuNumber > 5);
	
	int val; int nOf1000; int nOf500; int nOf100; int nOf50; int nOf10; int nOf1;
	//달러 
	if(menuNumber == 1){
		float outputDollar = inputWon / DOLLAR_PER_WON;
		val = (int) ((outputDollar - (int)outputDollar) * DOLLAR_PER_WON);
		printf("%d 원 -> %d 달러, 잔돈 %d원\n", inputWon, (int)outputDollar, val);
		nOf1000 = val / 1000;
		nOf500 = (val % 1000) / 500;
		nOf100 = (val % 500) / 100;
		nOf50 = (val % 100) / 50;
		nOf10 = (val % 50) / 10;
		nOf1 = (val % 10) / 1;	
		printf("1000원 : %d장\n500원 : %d개\n100원 : %d개\n50원 : %d개\n10원 : %d개\n1원 : %d개\n" , 
		nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );
	}	
	//엔
	if(menuNumber == 2){ 
		float outputJPY = inputWon / JPY;
		val = (int) ((outputJPY - (int)outputJPY) * JPY);
		printf("%d 원 -> %d 엔, 잔돈 %d원\n", inputWon, (int)outputJPY, val);
		nOf1000 = val / 1000;
		nOf500 = (val % 1000) / 500;
		nOf100 = (val % 500) / 100;
		nOf50 = (val % 100) / 50;
		nOf10 = (val % 50) / 10;
		nOf1 = (val % 10) / 1;
		printf("1000원 : %d장\n500원 : %d개\n100원 : %d개\n50원 : %d개\n10원 : %d개\n1원 : %d개\n" , 
		nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );	
	}
	//유로
	if(menuNumber == 3){
	float outputEUR = inputWon / EUR;
	val = (int) ((outputEUR - (int)outputEUR) * EUR);
	printf("%d 원 -> %d 유로, 잔돈 %d원\n", inputWon, (int)outputEUR, val);
	nOf1000 = val / 1000;
	nOf500 = (val % 1000) / 500;
	nOf100 = (val % 500) / 100;
	nOf50 = (val % 100) / 50;
	nOf10 = (val % 50) / 10;
	nOf1 = (val % 10) / 1;	
	printf("1000원 : %d장\n500원 : %d개\n100원 : %d개\n50원 : %d개\n10원 : %d개\n1원 : %d개\n" , 
	nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );
	}
	//위안
	if(menuNumber == 4){
		float outputCNY = inputWon / CNY;
		val = (int) ((outputCNY - (int)outputCNY) * CNY);
		printf("%d 원 -> %d 위안, 잔돈 %d원\n", inputWon, (int)outputCNY, val);
		nOf1000 = val / 1000;
		nOf500 = (val % 1000) / 500;
		nOf100 = (val % 500) / 100;
		nOf50 = (val % 100) / 50;
		nOf10 = (val % 50) / 10;
		nOf1 = (val % 10) / 1;
		printf("1000원 : %d장\n500원 : %d개\n100원 : %d개\n50원 : %d개\n10원 : %d개\n1원 : %d개\n" , 
		nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );	
	}
	//파운드
	if(menuNumber == 5){
		float outputGBP = inputWon / GBP;
		val = (int) ((outputGBP - (int)outputGBP) * GBP);
		printf("%d 원 -> %d 파운드, 잔돈 %d원\n", inputWon, (int)outputGBP, val);
		nOf1000 = val / 1000;
		nOf500 = (val % 1000) / 500;
		nOf100 = (val % 500) / 100;
		nOf50 = (val % 100) / 50;
		nOf10 = (val % 50) / 10;
		nOf1 = (val % 10) / 1;
		printf("1000원 : %d장\n500원 : %d개\n100원 : %d개\n50원 : %d개\n10원 : %d개\n1원 : %d개\n" , 
		nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );	
	}
	return 0;
} 
