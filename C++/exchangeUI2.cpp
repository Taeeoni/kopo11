#include <stdio.h>

void valence(int val, char* nameMoney){
	int nOf1000 = val / 1000;
	int nOf500 = (val % 1000) / 500;
	int nOf100 = (val % 500) / 100;
	int nOf50 = (val % 100) / 50;
	int nOf10 = (val % 50) / 10;
	int nOf1 = (val % 10) / 1;
	if(nameMoney == "0") {
		printf("1000�� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��\n1�� : %d��\n" , 
		nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );		
	} else {
		printf("100%s : %d��, 50%s : %d��, 10%s : %d��, 1%s : %d��\n", nameMoney, nOf100, nameMoney, nOf50, nameMoney,
		nOf10, nameMoney, nOf1);
	}
}

int main() {
	const float DOLLAR_PER_WON = 1232.90; // ����� ���� �빮�ڷ� �ۼ��ϴ°� ��� 
	const float JPY = 9.87;
	const float EUR = 1342.53;
	const float CNY = 193.20;
	const float GBP = 1605.22;
	const float exchange[]= {DOLLAR_PER_WON, JPY, EUR, CNY, GBP};
	char* nameOfMoney[]= {"�޷�", "��", "����", "����", "�Ŀ��"};
	
	int inputWon; 
	printf("ȯ���� ���ϴ� ��ȭ �ݾ��� �Է��ϼ��� : ");
	scanf("%d", &inputWon);
		
	int menuNumber;
	do{
		printf("ȯ���� ��ȭ�� �����ϼ��� (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
		scanf("%d", &menuNumber);
	} while(menuNumber < 1 || menuNumber > 5);
	

	int i = menuNumber - 1;
	float outputMoney = inputWon / (exchange[i]);
	int val = (outputMoney - (int)outputMoney) * exchange[i];
	printf("����ȯ�� : %.2f\n", exchange[i]);
	printf("%d �� -> %d%s, �ܵ� %d��\n", inputWon, (int)outputMoney, nameOfMoney[i], val);
	valence((int)outputMoney, nameOfMoney[i]);	
	valence(val, "0");
	return 0;
} 
