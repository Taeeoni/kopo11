#include <stdio.h>
 
int leapYear(int year){//���� Ȯ��  
	int day;
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		day = 366;//�����̸� 366�� 
	} else{
		day = 365;//������ �ƴ϶�� 365�� 
	}	
	return day;
}

int main() {
	int year_input; int month_input; 
	printf("�⵵ �Է� : ");
	scanf("%d", &year_input);
	printf("�� �Է� : ");
	scanf("%d", &month_input);
	//1900�� 1�� 1�� ������ 
	int mon_day [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // ���� ���� ��  
	
	int day_sum = 1;
	for(int year1 = 1900; year1 < year_input; year1++){	//�⵵ ���̸�ŭ ���� ���ϱ� 
		day_sum += leapYear(year1);	
	}
	
	for(int month_index = 0; month_index < month_input - 1; month_index++){//�� ���̸�ŭ ���� ���ϱ� 
		day_sum += mon_day[month_index];
	}
	//input �⵵�� �����̰� input ���� 3�� ���Ķ�� 1�� ���ϱ� 
	if(leapYear(year_input) == 366 && month_input > 2){
		day_sum += 1;
	}
	// 1900�⵵���� input �� �������� day_sum ���ϱ� ��
	 
	int day_num = day_sum % 7; // 1���� ������������ �˱� ���� day_num �������� 0:�Ͽ��� ~ 6:����� 
	
	//��º� 
	printf("-------------------------------------------------------\n");
	printf("\t\t%8d��\n", year_input);
	printf("\t\t%6d��\n", month_input);
	printf("-------------------------------------------------------\n");
	printf(" ��\t ��\t ȭ\t ��\t ��\t ��\t ��\n"); 
	int day; 
	for(int i = 0; i < 7; i++){ // ù°�� 
		if(i < day_num){ // day_num (1��) �������� ���� ��� 
			printf(" \t");
		} else{ // i�� 1�Ͽ� �ش��ϴ� �������� �ٴ����� ���� ��� 
			printf(" %d\t", day + 1);
			day++;
		}		
	}
	printf("\n");
	int week = 0;
	for(int days = day + 1; days <= mon_day[month_input - 1]; days++){ // ������ �� , ���� �˸´� �ϱ��� ��� 
		printf(" %d\t", days);
		week++;
		if(week % 7 == 0){ // 7�� ����ߴٸ� ������������  
			printf("\n");
		}
	}	
}
