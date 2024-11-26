#include<stdio.h>
#define PI 3.14

int main() {
	int R;
	
	printf("Nhap ban kinh khoi cau R: ");
	scanf("%d", &R);
	
	float theTich = R*R*R*4/3*PI;
	float dienTich = 4*R*R*PI;
	
	printf("The tich be mat khoi cau: %.2f", (float)theTich);
	printf("\nDien tich be mat khoi cau: %.2f", (float)dienTich);
	
	return 0;
}
