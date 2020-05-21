#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  	int vowel=0,cons=0,whites=0,digit=0,symbol=0;
  	string str;
  	int n,i;
  	getline(cin,str);
  	//cout<<str;
  	n=str.length();
  	for(i=0;i<n;i++){
    	if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || 
           str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'){
        	vowel++;
        }
      	else if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z')){
        	cons++;
        }
      	else if(str[i]>='0' && str[i]<='9'){
        	digit++;
        }
      	else if(str[i]==' '){
        	whites++;
        }
      	else{
        	symbol++;
        }
    }
  
  	//print
  	cout<<"Vowels:"<<vowel<<endl;
  	cout<<"Consonants:"<<cons<<endl;
  	cout<<"White Spaces:"<<whites<<endl;
  	cout<<"Digits:"<<digit<<endl;
  	cout<<"Symbols:"<<symbol;
}