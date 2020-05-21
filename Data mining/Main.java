#include<iostream>
using namespace std;
int main()
{
  	int n,sum=0,sum1=0,rem;
  	cin>>n;
  	while(n!=0){
    	rem=n%10;
      	if(rem%2==0){
        	sum=sum+rem;
          	//cout<<sum<<endl;
        }
      	else{
        	sum1=sum1+rem;
          	//cout<<sum1<<endl;
        }
      	n=n/10;
    }
  	if(sum==sum1){
    	cout<<"Yes";
    }
  	else{
    	cout<<"No";
    }
}