#include<stdio.h>

int main() {
	int a[100];
	int c[5] = {2, 3};
	// Duyet mang xuoi va nguoc
	int n = 5;
	int b[5] = {1, 5, 7, 9, 20};
	
	printf("Duyet mang xuoi:\n");
	for (int i = 0; i<n; i++) {
		printf("%d ", b[i]);
	}
	
	printf("\n");
	printf("Duyet mang nguoc: \n");
	for (int i = n-1; i>=0; i--) {
		printf("%d ", b[i]);
	}
	
	printf("\n");
	b[0] = 7;
	b[1] = 8;
	b[2] += 10;
	b[3] *= 5;
	b[4] = 20;
	
	printf("Mang vua thay doi la: \n");
	for (int i = 0; i<n; i++) {
		printf("%d ", b[i]);
	}
	
	printf("\n============== Nhap mang =================\n");
	int m;
	printf("Nhap vao so luong phan tu cua mang m: ");
	scanf("%d", &m);
	for (int i = 0; i < m; i++) {
		printf("Nhap vao gia tri thu %d cua a: ", i);
		scanf("%d", &a[i]);
	}
	
	printf("Mang vua nhap la: \n");
	for (int i = 0; i < m; i++) {
		printf("%d ", a[i]);
	}
	
	printf("\n========== So sanh / Sap xep ============\n");
	int d[7] = {8,2,6,2,9,1,5};
	int i, j, temp;
	for (i=0; i<6; i++) {
		for (j=i+1; j<7; j++) {
			if (d[i] > d[j]) {
				temp = d[i];
				d[i] = d[j];
				d[j] = temp;
			}
		}
	}
	printf("Gia tri tang dan la: ");
	for (i=0; i<=6; i++) {
		printf("%d ", d[i]);
	}
	return 0;
}
