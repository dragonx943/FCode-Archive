#include<stdio.h>

int main() {
	float Diem;
	printf("Nhap diem cua sinh vien: ");
	scanf("%f", &Diem);
	
	if (Diem >= 9.0) {
		printf("Xuat sac!");
	} else if (Diem >= 8.0 && Diem < 9.0) {
		printf("Gioi!");
	} else if (Diem >= 7.0 && Diem < 8.0) {
		printf("Kha!");
	} else if (Diem >= 5.0 && Diem < 7.0) {
		printf("Trung binh!");
	} else {
		printf("Yeu!");
	}
	
	return 0;
}
