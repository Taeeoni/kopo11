#include <stdio.h>

int main() {
	const float DOLLAR_PER_WON = 1232.90; // ����� ���� �빮�ڷ� �ۼ��ϴ°� ��� 
	const float JPY = 9.87;
	const float EUR = 1342.53;
	const float CNY = 193.20;
	const float GBP = 1605.22;
		
	int inputWon;
	printf("ȯ���� ���ϴ� ��ȭ �ݾ��� �Է��ϼ��� : ");
	scanf("%d", &inputWon);	
	
	int menuNumber;
	char *moneyName;
	do{
		printf("ȯ���� ��ȭ�� �����ϼ��� (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
		scanf("%d", &menuNumber);
	} while(menuNumber < 1 || menuNumber > 5);
	
	int val; int nOf1000; int nOf500; int nOf100; int nOf50; int nOf10; int nOf1;
	float outputMoney; float selectCountry;
	//�޷� 
	if(menuNumber == 1){
		selectCountry = DOLLAR_PER_WON;
		moneyName = "�޷�"; 
	}	
	//��
	if(menuNumber == 2){ 
		selectCountry = JPY;
		moneyName = "��"; 
	}
	//����
	if(menuNumber == 3){
		selectCountry = EUR;
		moneyName = "����"; 
	}
	//����
	if(menuNumber == 4){
		selectCountry = CNY;
		moneyName = "����"; 
	}
	//�Ŀ��
	if(menuNumber == 5){
		selectCountry = GBP;
		moneyName = "�Ŀ��"; 
	}
	
	outputMoney = inputWon / selectCountry;
	val = (int) ((outputMoney - (int)outputMoney) * selectCountry);
	printf("%d �� -> %d %s, �ܵ� %d��\n", inputWon, (int)outputMoney, moneyName, val);
	
	
	nOf1000 = val / 1000;
	nOf500 = (val % 1000) / 500;
	nOf100 = (val % 500) / 100;
	nOf50 = (val % 100) / 50;
	nOf10 = (val % 50) / 10;
	nOf1 = (val % 10) / 1;	
	printf("1000�� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��\n1�� : %d��\n" , 
	nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );
	return 0;
} 
