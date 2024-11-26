#include<stdio.h>

int main() {
	int cD, cR, cC;
	
	printf("Nhap chieu dai hinh hop CN: ");
	scanf("%d", &cD);
	printf("Nhap chieu rong hinh hop CN: ");
	scanf("%d", &cR);
	printf("Nhap chieu cao hinh hop CN: ");
	scanf("%d", &cC);
	
	int theTich = cD*cR*cC;
	int SxQ = (cD + cR)*2*cC;
	
	printf("The tich hinh hop CN la: %d", theTich);
	printf("\nDien tich be mat hinh hop CN la: %d", SxQ);
	
	return 0;
}
