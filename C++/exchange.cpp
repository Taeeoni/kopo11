#include <stdio.h>

void valence(int val){
	int nOf1000 = val / 1000;
	int nOf500 = (val % 1000) / 500;
	int nOf100 = (val % 500) / 100;
	int nOf50 = (val % 100) / 50;
	int nOf10 = (val % 50) / 10;
	int nOf1 = (val % 10) / 1;
	printf("1000원 : %d장\n500원 : %d개\n100원 : %d개\n50원 : %d개\n10원 : %d개\n1원 : %d개\n" , 
	nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );		
}

int main() {
	const float DOLLAR_PER_WON = 1232.90; // 상수는 전부 대문자로 작성하는게 약속 
	const float JPY = 9.87;
	const float EUR = 1342.53;
	const float CNY = 193.20;
	const float GBP = 1605.22;
	const float exchange[]= {DOLLAR_PER_WON, JPY, EUR, CNY, GBP};
	const char * nameOfMoney[]= {"달러", "엔", "유로", "위안", "파운드"};
	
	int inputWon; 
	printf("환전을 원하는 원화 금액을 입력하세요 : ");
	scanf("%d", &inputWon);
		
	for (int i = 0; i < 5; i++){
		float outputDollar = inputWon / (exchange[i]);
		int val = (outputDollar - (int)outputDollar) * exchange[i];
		printf("%d 원 -> %d%s, 잔돈 %d원\n", inputWon, (int)outputDollar, nameOfMoney[i], val);
		valence(val);
	}	
	return 0;
} 
