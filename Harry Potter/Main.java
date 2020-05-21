#include<iostream>
using namespace std;
int main()
{
  int n[4],num,i=0;
  cin>>num;
  while(num!=0){
    n[i]=0;
  	n[i]=num%10;
    num=num/10;
    i++;
  }
  cout<<n[0]+n[3];
  return 0;
  //Type your code here.
}