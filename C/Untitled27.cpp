#include<stdio.h>

int main() {
	int nhietdo1;
	
	printf("Nhap do C: ");
	scanf("%d", &nhietdo1);
	
	float nhietdoFake = (float)nhietdo1;
	float nhietdo2 = nhietdoFake * 9 / 5 + 32;
	printf("Do F: %.1f", nhietdo2);
	
	return 0;
}
