#include<iostream>
int fibo(int n);
int main()
{
  	int n,i=0,n1,sum=0;
  	std::cin>>n;
 	 std::cout<<"The term "<<n <<" in the fibonacci series is ";
  	while(i<n){
    	fibo(i);
      	i++;
    }
  	std::cout<<fibo(n-1);
}
int fibo(int n){
  	//int sum=0;
	if((n==1) || (n==0)){
    	return n;
    }
  	else{
    	return (fibo(n-1)+fibo(n-2));
    }
}