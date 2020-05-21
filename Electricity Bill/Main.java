#include<iostream>
using namespace std;
int main()
{
  	int unit,ans;
  	cin>>unit;
  	if(unit<=200){
      	ans=unit*0.5;
    	cout<<"Rs."<<ans;
    }
  	else if(unit>200 && unit<=400){
    	cout<<"Rs."<<(int)(unit*0.65)+100;
    }
  	else if(unit>400 && unit<=600){
    	cout<<"Rs."<<(unit*0.80)+200;
    }
  	else{
    	cout<<"Rs."<<(unit*1.25)+425;
    }
}