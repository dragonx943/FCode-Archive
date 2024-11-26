#include <stdio.h>

int main() {
	int a, b, c, tong;
	
	printf("Nhap so nguyen a: ");
	scanf("%d", &a);
	printf("Nhap so nguyen b: ");
	scanf("%d", &b);
	printf("Nhap so nguyen c: ");
	scanf("%d", &c);
	
	tong = a + b + c;
	printf("Tong cua ba so a, b, c: %d", tong);
	
	return 0;
}
