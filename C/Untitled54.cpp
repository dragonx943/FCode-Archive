#include<stdio.h>

int main() {
	int so = 1;
	int soCuoi;
	int tong = 0;
	printf("Nhap so: ");
	scanf("%d", &soCuoi);
	do {
		tong += so;
		so++;
	}
	while (so <= soCuoi);
	printf("Tong la: %d", tong);
	return 0;
}
