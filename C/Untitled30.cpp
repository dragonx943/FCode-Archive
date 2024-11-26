#include <stdio.h>

int main() {
	char dapAn;
	
	printf("Cau hoi: Viet Nam co bao nhieu dan toc?");
	printf("\nA. 51");
	printf("\nB. 52");
	printf("\nC. 53");
	printf("\nD. 54");
	printf("\nDap an cua ban la (A, B, C, D): ");
	scanf("%s", &dapAn);
	
	switch(dapAn) {
		case 'A':
			printf("Dap an sai, tro choi ket thuc!");
			break;
		case 'B':
			printf("Dap an sai, tro choi ket thuc!");
			break;
		case 'C':
			printf("Dap an sai, tro choi ket thuc!");
			break;
		case 'D':
			printf("Dap an dung, xin chuc mung!");
			break;
		default:
			printf("Lua chon khong hop le!");
	}
	
	return 0;
}
