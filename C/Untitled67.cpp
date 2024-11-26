#include<stdio.h>
typedef int Mang1Chieu[10];

int main() {
	Mang1Chieu m1, m2, m3;
	
	for (int i=0; i<10; i++) {
		m1[i] = i + 1;
	}
	printf("Cac phan tu cua m1 la: \n");
	for (int i = 0; i<10; i++) {
		printf("%d\n", m1[i]);
	}
	return 0;
}
