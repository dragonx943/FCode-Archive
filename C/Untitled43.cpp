#include<stdio.h>

int main() {
	int messi = 7;
	int i = 1;
	while (i<11) {
		int bang = messi*i;
		printf("%d * %d = %d\n", messi, i, bang);
		i++;
	}
	return 0;
}
