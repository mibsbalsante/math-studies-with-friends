#include <stdio.h>
#include <math.h>

int checkpn(long long int N);

int main()
{
	int z;
	for(z=0;z<1;z++){	
		printf("Choose A or B\nA. To check if N is perfect number\nB. To check how many perfect numbers are there till N\n");
		char check;
		scanf("%c", &check);
		printf("Enter number\n");
		long long int N, i;
		scanf("%lld", &N);
		if(check=='A'){
			if(checkpn(N)==1)
				printf("%lld is a perfect number\n", N);
			else
				printf("%lld is not a perfect number\n", N);
		}
		else if(check=='B'){
			for(i=4;i<=N;i++){
				if(checkpn(i)==1)
					printf("%lld ", i);
			}
			printf("\n");
		}
		else{
			printf("Please choose 'A' or 'B'\n");
			z=-1;
		}
	}
	return 0;
}

int checkpn(long long int N){
	long long int i, count=1, sq, temp;
	sq=sqrt(N);
	for(i=2;i<=sq;i++){
		if(N%i==0){
			temp=N/i;
			if(temp!=i)
				count+=i+temp;
			else
				count+=i;
		}
	}
	if(count==N)
		return(1);
	else
		return(0);
}