#include <stdio.h>
int main(){
	int a,b;
	
	printf("Nhap vao so nguyen a: ");
	scanf("%d",&a);
	printf("Nhap vao so nguyen b: ");
	scanf("%d",&b); 
	
	if(a > b){
		printf("%d la so lon hon", a);
	}	
	
	else if(b > a){
		printf("%d la so lon hon", b);
	}
	
	else if(a == b){
		printf("2 so bang nhau");
	}
	
	return 0;
}
