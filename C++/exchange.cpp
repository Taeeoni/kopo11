#include <stdio.h>

void valence(int val){
	int nOf1000 = val / 1000;
	int nOf500 = (val % 1000) / 500;
	int nOf100 = (val % 500) / 100;
	int nOf50 = (val % 100) / 50;
	int nOf10 = (val % 50) / 10;
	int nOf1 = (val % 10) / 1;
	printf("1000�� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��\n1�� : %d��\n" , 
	nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );		
}

int main() {
	const float DOLLAR_PER_WON = 1232.90; // ����� ���� �빮�ڷ� �ۼ��ϴ°� ��� 
	const float JPY = 9.87;
	const float EUR = 1342.53;
	const float CNY = 193.20;
	const float GBP = 1605.22;
	const float exchange[]= {DOLLAR_PER_WON, JPY, EUR, CNY, GBP};
	const char * nameOfMoney[]= {"�޷�", "��", "����", "����", "�Ŀ��"};
	
	int inputWon; 
	printf("ȯ���� ���ϴ� ��ȭ �ݾ��� �Է��ϼ��� : ");
	scanf("%d", &inputWon);
		
	for (int i = 0; i < 5; i++){
		float outputDollar = inputWon / (exchange[i]);
		int val = (outputDollar - (int)outputDollar) * exchange[i];
		printf("%d �� -> %d%s, �ܵ� %d��\n", inputWon, (int)outputDollar, nameOfMoney[i], val);
		valence(val);
	}	
	return 0;
} 
