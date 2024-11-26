#include <stdio.h>
int main(){
	int tuoi,ve;
	
	printf("Nhap tuoi cua ban: ");
	scanf("%d",&tuoi);
	printf("Nhap so ve: ");
	scanf("%d",&ve);
	
	if(tuoi >= 18 && tuoi <= 25 || ve >= 3){
		printf("Ban du dieu kien duoc giam gia");
	}
	
	else{
		printf("Ban khong du dieu kien");
	}
	
	return 0;
}
