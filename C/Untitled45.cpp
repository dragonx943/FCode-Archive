#include<stdio.h>
int main() {
	int min, max;
	int tong = 0;
	printf("Nhap min = ");
	scanf("%d", &min);
	printf("Nhap max = ");
	scanf("%d", &max);
	
	if (min > max){
		printf("Gia tri ban nhap vao min phai nho hon max!");
		return 1;
	}
	
	int i = min;
	while (i <= max) {
		tong+=i;
		i++;
	}
	printf("Tong cua cac so tu %d den %d la: %d", min, max, tong);
	return 0;
}
