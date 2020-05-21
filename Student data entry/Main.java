#include <iostream>
#include<string.h>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main()
{
  struct student s;
  std::cin.get(s.name, 50);
  std::cin>>s.roll;
  std::cin>>s.marks;
  std::cout<<"\n";
  std::cout<<"Student Details"<< std::endl;
  std::cout<<"Name: "<<s.name<<std::endl;
  std::cout<<"Roll: "<<s.roll<<std::endl;
  std::cout<<"Marks: "<<s.marks<<std::endl;
  return 0;
}