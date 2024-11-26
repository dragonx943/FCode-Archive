#include <stdio.h>
#define PI 3.14

double tinhCV (double bKinh) {
	double CV;
	CV = 2*PI*bKinh;
	return CV;
}

double tinhDt (double bKinh) {
	double DT;
	DT = PI*bKinh*bKinh;
	return DT;
}

int main() {
	double bKinh;
	printf("Nhap ban kinh hinh tron: ");
	scanf("%lf", &bKinh);
	
	if (bKinh < 0) {
		printf("Ban kinh khong hop le!");
	} else {
		double chuVi;
		double dienTich;
		chuVi = tinhCV(bKinh);
		dienTich = tinhDt(bKinh);
		printf("Chu vi hinh tron la: %.2lf\n", chuVi);
		printf("Dien tich hinh tron la: %.2lf\n", dienTich);
	}
	return 0;
}

