#include <stdio.h>
#include <stdlib.h>
int main(){
	int m,i,j,k,n;
	printf("Ingrese el tamaño n del cuadrado");
	scanf("%d",&n);
	for (m = 1; m <= n; m++){
		printf("%2d",m);
	}
	printf("\n");
	for (i = 0; i < n - 1; i++){
		for(j = n - i ; j != 1; j++){
			printf("%2d",j);
			if(j == n){
				break;
			}	
		}for(k = 1; k <= n - (i + 1); k++){
			printf("%2d",k);
		}
		printf("\n");
	}
}
