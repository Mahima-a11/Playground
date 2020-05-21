 struct Distance{
	int inch;
  	float feet;
};

#include<iostream>
using namespace std;
int main()
{
  	Distance d1,d2,sum;
  	cin>>d1.inch;
  	cin>>d1.feet;
  	cin>>d2.inch;
  	cin>>d2.feet;
  
  	sum.inch=d1.inch+d2.inch;
  	sum.feet=d1.feet+d2.feet;
  
  	if(sum.feet>12.0){
    	sum.feet=sum.feet-12.0;
      	++sum.inch;
    }
  
  	cout<<sum.inch<<"\'"<<"-"<<sum.feet<<"\"";
  	
}