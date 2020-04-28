#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string door;
  string door1="front";
  string door2="rear";
  int rail;
  cin>>door>>rail;
  if(door==door1){
    if(rail==1)
    	cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else if(door==door2){
  	if(rail==1)
      cout<<"Right Handed";
   	else
      cout<<"Left Handed";
  }
  
}