#include <stdio.h>
int main(){
	
	int a,b;
	
	printf("nhap vao so a: ");
	scanf("%d",&a);
	printf("nhap vao so b: ");
	scanf("%d",&b);
	
	int tong=a+b;
	int hieu=a-b;
	int tich=a*b;
	
	printf("Tong la: %d", tong);
	printf("\nHieu la: %d", hieu);
	printf("\nTich la: %d",tich);
	
	float thuong = (float)a/b;
	
	if(b!=0){
		printf("\nThuong la: %.2f",thuong);
	}
	
	else{
		printf("\nKhong the chia");
	}
	
	return 0;
}
