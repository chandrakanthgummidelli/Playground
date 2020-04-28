#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth=0,present=0;
  cin>>birth>>present;
  if(present==0||present<birth)
  	cout<<100+present-birth;
  else
    cout<<present-birth;
  
}