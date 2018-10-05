int euclid_gcd(int a, int b){
	int divident = a>=b? a:b;
	int divisor = a<=b? a:b;
	while(divisor !=0 ){
		int remainder= divident % divisor;
		divident= divisor;
		divisor= remainder;
	}
	return divident;
} 