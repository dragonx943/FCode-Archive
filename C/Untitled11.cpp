#include <stdio.h>

int main() {
	int tongDiem = 0, diem1, diem2, diem3;
	printf("Nhap diem 1 la: ");
	scanf("%d", &diem1);
	printf("Nhap diem 2 la: ");
	scanf("%d", &diem2);
	printf("Nhap diem 3 la: ");
	scanf("%d", &diem3);
	
	tongDiem += diem1;
	tongDiem += diem2;
	tongDiem += diem3;
	
	printf("Tong diem cua 3 bai kiem tra la: %d", tongDiem);
	return 0;
}
