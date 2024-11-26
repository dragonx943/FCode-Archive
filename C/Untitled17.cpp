#include <stdio.h>
int main(){
	float dTB;
	
	printf("Nhap diem trung binh: ");
	scanf("%f", &dTB);
	
	if(dTB >= 8.5){
		printf("Xuat sac");
	}
	
	else if(dTB >= 7.0 && dTB < 8.5){
		printf("Gioi");
	}
	
	else if(dTB >= 5.0 && dTB < 7.0){
		printf("Trung binh");
	}
	
	else if(dTB < 5.0){
		printf("Yeu");
    }
    
	return 0;
}
