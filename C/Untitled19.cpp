#include<stdio.h>

int main() {
	int tongDiem = 0;
	int baiKT1, baiKT2, baiKT3;
	
	printf("Nhap diem bai kiem tra 1: ");
	scanf("%d", &baiKT1);
	printf("Nhap diem bai kiem tra 2: ");
	scanf("%d", &baiKT2);
	printf("Nhap diem bai kiem tra 3: ");
	scanf("%d", &baiKT3);
	
	tongDiem += baiKT1;
	tongDiem += baiKT2;
	tongDiem += baiKT3;
	
	printf("Tong diem 3 bai kiem tra: %d", tongDiem);
	
	return 0;
}
