struct College
{
char name[100];
char city[100];
int establishmentYear;
float passPercentage;
};

#include<iostream>
using namespace std;
int main()
{ 
/*struct College
{
char name[100];
char city[100];
int establishmentYear;
float passPercentage;
}; */
	int n,i,j;		
	cout<<"Enter the number of colleges"<<endl;
  	cin>>n;
	struct College stud[n];
	j=1;
	for(i=0;i<n;i++)
	{    
		cout<<"Enter the details of college "<<j<<endl;
		cout<<"Enter name"<<endl;
		cin>>stud[i].name;
		cout<<"Enter city"<<endl;
		cin>>stud[i].city;
		cout<<"Enter year of establishment"<<endl;
		cin>>stud[i].establishmentYear;
		cout<<"Enter pass percentage"<<endl;
		cin>>stud[i].passPercentage;
		j++; 
	}
	j=1;
	cout<<"Details of colleges"<<endl;
	for(i=0;i<n;i++)
	{   
		cout<<"College:"<<j<<endl;
		cout<<"Name:"<<stud[i].name<<endl;
		cout<<"City:"<<stud[i].city<<endl;
		cout<<"Year of establishment:"<<stud[i].establishmentYear<<endl;
		cout<<"Pass percentage:"<<stud[i].passPercentage<<endl;
		j++;
	}

	return 0;
}