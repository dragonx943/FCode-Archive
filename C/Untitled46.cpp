#include<stdio.h>

int main() {
	int so = 0;
	do {
		printf("Nhap so: ");
		scanf("%d", &so);
	}
	while (so >=0 && so<=10);
	return 0;
}
