#include<stdio.h>

int main() {
	int cD, cR;
	printf("Nhap chieu dai: ");
	scanf("%d", &cD);
	printf("Nhap chieu rong: ");
	scanf("%d", &cR);
	
	int cV = (cD + cR)*2;
	int dT = cD * cR;
	
	printf("Chu vi: %d", cV);
	printf("\nDien tich: %d", dT);
	return 0;
}
