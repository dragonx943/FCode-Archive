#include<stdio.h>

int main() {
	int toan,ly,hoa;
	
	printf("Nhap diem mon toan: ");
	scanf("%d", &toan);
	printf("Nhap diem mon ly: ");
	scanf("%d", &ly);
	printf("Nhap diem mon hoa: ");
	scanf("%d", &hoa);
	
	toan *= 3;
	ly *= 2;
	
	int DiemTB = (toan + ly + hoa) / 3;
	printf("Diem trung binh 3 mon: %d", DiemTB);
	
	return 0;
}
