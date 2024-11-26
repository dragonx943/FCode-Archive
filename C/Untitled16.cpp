#include <stdio.h>
int main(){
	int tuoi;
	
	printf("Nhap tuoi cua ban: ");
	scanf("%d",&tuoi);
	
	if(tuoi >= 18 && tuoi <= 35){
		printf("Ban du dieu kien tham gia chuong trinh");
	}
	else{
		printf("Ban khong du dieu kien tham gia chuong trinh");
	}
	
	return 0;
}
