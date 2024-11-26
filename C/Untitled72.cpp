#include<stdio.h>

int main() {
	int n, temp;
	int arr[n];
	printf("Nhap vao so luong phan tu cua mang: ");
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		printf("Nhap vao gia tri thu %d cua a: ", i);
		scanf("%d", &arr[i]);
	}
	
	printf("Mang vua nhap la: \n");
	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	
	// So sanh
	for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-1-i; j++) {
			if (arr[j] > arr[j+1]) {
				arr[j] = temp;
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	printf("Mang da sap xep la: \n");
	for (i)
	return 0;
}
