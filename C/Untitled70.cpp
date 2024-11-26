#include<stdio.h>

int main() {
	int a[10],x;
	for(int i = 0; i < 10;i++){
		printf("Nhap a[%d]: ", i);
		scanf("%d", &a[i]);
	}
	
	for (int i = 0; i < 10; i++) {
		printf("%d", a[i]);
	}

	printf("Nhap phan tu can tim x = ");
	scanf("%d", &x);
	for(int i = 0; i < 10; i++) {
		if(x == a[i]) {
			printf("%d co trong mang", x);
			break;
		}
	}
	
	return 0;
}
