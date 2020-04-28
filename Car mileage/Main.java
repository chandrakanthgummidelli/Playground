#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil,avldis;
  int avl,dis;
  cin>>mil>>avl>>dis;
  avldis=mil*avl;
  if(avldis>=dis)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  
}