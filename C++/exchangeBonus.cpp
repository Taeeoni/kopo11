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
	do{
		printf("ȯ���� ��ȭ�� �����ϼ��� (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
		scanf("%d", &menuNumber);
	} while(menuNumber < 1 || menuNumber > 5);
	
	int val; int nOf1000; int nOf500; int nOf100; int nOf50; int nOf10; int nOf1;
	//�޷� 
	if(menuNumber == 1){
		float outputDollar = inputWon / DOLLAR_PER_WON;
		val = (int) ((outputDollar - (int)outputDollar) * DOLLAR_PER_WON);
		printf("%d �� -> %d �޷�, �ܵ� %d��\n", inputWon, (int)outputDollar, val);
		nOf1000 = val / 1000;
		nOf500 = (val % 1000) / 500;
		nOf100 = (val % 500) / 100;
		nOf50 = (val % 100) / 50;
		nOf10 = (val % 50) / 10;
		nOf1 = (val % 10) / 1;	
		printf("1000�� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��\n1�� : %d��\n" , 
		nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );
	}	
	//��
	if(menuNumber == 2){ 
		float outputJPY = inputWon / JPY;
		val = (int) ((outputJPY - (int)outputJPY) * JPY);
		printf("%d �� -> %d ��, �ܵ� %d��\n", inputWon, (int)outputJPY, val);
		nOf1000 = val / 1000;
		nOf500 = (val % 1000) / 500;
		nOf100 = (val % 500) / 100;
		nOf50 = (val % 100) / 50;
		nOf10 = (val % 50) / 10;
		nOf1 = (val % 10) / 1;
		printf("1000�� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��\n1�� : %d��\n" , 
		nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );	
	}
	//����
	if(menuNumber == 3){
	float outputEUR = inputWon / EUR;
	val = (int) ((outputEUR - (int)outputEUR) * EUR);
	printf("%d �� -> %d ����, �ܵ� %d��\n", inputWon, (int)outputEUR, val);
	nOf1000 = val / 1000;
	nOf500 = (val % 1000) / 500;
	nOf100 = (val % 500) / 100;
	nOf50 = (val % 100) / 50;
	nOf10 = (val % 50) / 10;
	nOf1 = (val % 10) / 1;	
	printf("1000�� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��\n1�� : %d��\n" , 
	nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );
	}
	//����
	if(menuNumber == 4){
		float outputCNY = inputWon / CNY;
		val = (int) ((outputCNY - (int)outputCNY) * CNY);
		printf("%d �� -> %d ����, �ܵ� %d��\n", inputWon, (int)outputCNY, val);
		nOf1000 = val / 1000;
		nOf500 = (val % 1000) / 500;
		nOf100 = (val % 500) / 100;
		nOf50 = (val % 100) / 50;
		nOf10 = (val % 50) / 10;
		nOf1 = (val % 10) / 1;
		printf("1000�� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��\n1�� : %d��\n" , 
		nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );	
	}
	//�Ŀ��
	if(menuNumber == 5){
		float outputGBP = inputWon / GBP;
		val = (int) ((outputGBP - (int)outputGBP) * GBP);
		printf("%d �� -> %d �Ŀ��, �ܵ� %d��\n", inputWon, (int)outputGBP, val);
		nOf1000 = val / 1000;
		nOf500 = (val % 1000) / 500;
		nOf100 = (val % 500) / 100;
		nOf50 = (val % 100) / 50;
		nOf10 = (val % 50) / 10;
		nOf1 = (val % 10) / 1;
		printf("1000�� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��\n1�� : %d��\n" , 
		nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );	
	}
	return 0;
} 
