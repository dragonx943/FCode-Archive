#include<stdio.h>

int main() {
	int so, giaiThua = 1;
	printf("Nhap so can tinh giai thua: ");
	scanf("%d", &so);
	int soFirst = so;
	
	do {
		giaiThua *= so;
		so--;
	}
	while (so > 0);
	
	printf("Giai thua cua %d la: %d", soFirst, giaiThua);
	return 0;
}
