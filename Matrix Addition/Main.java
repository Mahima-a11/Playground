#include<iostream>
using namespace std;
int main(){
	int n,m,i=0,j=0;
    cin>>n>>m;
    int a[n][m],b[n][m];
    for(i=0;i<n;i++){
    	for(j=0;j<m;j++){
        	cin>>a[i][j];
        }
    }
   for(i=0;i<n;i++){
    	for(j=0;j<m;j++){
        	cin>>b[i][j];
        }
    }
   for(i=0;i<n;i++){
    	for(j=0;j<m;j++){
          cout<<a[i][j]+b[i][j]<<" ";
        }
        cout<<"\n";
    }
}