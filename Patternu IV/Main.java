#include <iostream>
using namespace std;
int main() {
   
   int num;
  cin>>num;
  for(int i=1;i<=num;i++){
    for(int j=1;j<=num;j++){
      if(i%2==0){
        if(j==1)
          cout<<i+1;
        else
          cout<<i;
      }
      if(i%2!=0){
        if(j==num)
          cout<<i+1;
        else
          cout<<i;
      }
    }cout<<"\n";
  }
  return 0;
}