#include<stdio.h>

int main() {
	int so, giaiThua = 1;
	printf("Nhap so can tinh giai thua: ");
	scanf("%d", &so);
	int soFirst = so;
	
	while (so > 0) {
		giaiThua *= so;
		so--;
	}
	
	printf("Giai thua cua %d la: %d", soFirst, giaiThua);
	return 0;
}
