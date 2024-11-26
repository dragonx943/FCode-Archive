#include<stdio.h>

int main() {
	int i=3;
	int tong=0;
	while(i<=6){
		tong+=i;
		i++;
	}
	printf("Tong la: %d", tong);
}
