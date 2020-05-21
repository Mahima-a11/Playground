#include<iostream>
using namespace std;
struct Employee
{
  int ID;
  char name[50];
    int age;
  char desi[60];
  long Salary;
};

int main()
{  
  Employee E;
  cin>>E.name;
  cout<<"Enter name:";
  cin>>E.ID;
  cout<<"\nEnter ID:";
    cin>>E.age;
  cout<<"\nEnter age:";
    cin>>E.desi;
  cout<<"\nEnter designation:";
    cin>>E.Salary;
  cout<<"\nEnter Salary:";
cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<E.name;
  cout<<"\nID of the Employee : "<<E.ID;
  cout<<"\nAge of the Employee : "<<E.age;
  cout<<"\nDesignation of the Employee : "<<E.desi;
  cout<<"\nSalary of the Employee : "<<E.Salary;
  
return 0;
}
 
 