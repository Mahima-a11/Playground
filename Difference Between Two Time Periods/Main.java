#include<iostream>
using namespace std;
int main()
{
  	int starthrs, startmin, startsec,diffsec,diffmin,diffhrs;
  	int endhrs,endmin,endsec;
  	cin>>starthrs>>startmin>>startsec;
  	cin>>endhrs>>endmin>>endsec;
  
  	if(endsec>startsec){
    	--startmin;
      	startsec=startsec+60;
    }
  	diffsec=startsec-endsec;
  //	cout<<diffsec;
  	if(endmin>startmin){
    	--starthrs;
      	startmin=startmin+60;
    }
  	diffmin=startmin-endmin;
  	diffhrs=starthrs-endhrs;
  	cout<<diffhrs<<":"<<diffmin<<":"<<diffsec;
}