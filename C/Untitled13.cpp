#include <stdio.h>
int main(){
	int cD,cR;
	
	printf("Nhap vao chieu dai HCN: ");
	scanf("%d",&cD);
	printf("Nhap vao chieu rong HCN: ");
	scanf("%d",&cR);
	
	int cV= (cD+cR)*2;
	int dT= cD*cR;
	
	printf("chu vi HCN la: %d", cV);
	printf("\ndien tich HCn la: %d", dT);
	
	return 0;
}
