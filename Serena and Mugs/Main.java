#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
  	cin>>a[i];
  int sum = 0,flag = 0 ;
  for(int i=0;i<n;i++)
    if(n*a[i]<=s)
  		sum++;
  	else{
    	flag = 1;
      	break;
    }
  if(flag == 0 && sum == n)
    cout<<"YES";
  else
    cout<<"NO";
}