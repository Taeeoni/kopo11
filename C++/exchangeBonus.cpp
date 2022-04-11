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
	
	//�޷� 
	float outputDollar = inputWon / DOLLAR_PER_WON;
	int val = (int) ((outputDollar - (int)outputDollar) * DOLLAR_PER_WON);
	printf("%d �� -> %d �޷�, �ܵ� %d��\n", inputWon, (int)outputDollar, val);
	int nOf1000 = val / 1000;
	int nOf500 = (val % 1000) / 500;
	int nOf100 = (val % 500) / 100;
	int nOf50 = (val % 100) / 50;
	int nOf10 = (val % 50) / 10;
	int nOf1 = (val % 10) / 1;	
	printf("1000�� : %d��\n500�� : %d��\n100�� : %d��\n50�� : %d��\n10�� : %d��\n1�� : %d��\n" , 
	nOf1000, nOf500, nOf100, nOf50, nOf10, nOf1 );
	
	//�� 
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
	
	//���� 
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
	
	//����
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
	
	//�Ŀ��
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
	
	return 0;
} 
