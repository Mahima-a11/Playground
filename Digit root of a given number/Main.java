#include<iostream>
int digit(int);
int main(){
	int n;
  	std::cin>>n;
  	std::cout<<digit(n);
}
int digit(int n){
  	int sum=0,count=0,rem;
	while(n!=0){
    	rem=n%10;
      	count++;
      	sum=sum+rem;
      	n=n/10;
    }
  	if(count>1){
    	digit(sum);
    }
  	else{
    	return sum;
    }
}