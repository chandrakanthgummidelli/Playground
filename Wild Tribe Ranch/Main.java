#include<iostream>
using namespace std;
int main(){
	int max_weight,weight_florence;
  	cin>>max_weight>>weight_florence;
  	if(weight_florence>max_weight)
      cout<<"Sorry, you can't enter";
  	else if(weight_florence==max_weight)
      cout<<"Yes, you can enter. Kindly use a rope.";
    else{
      cout<<"Yes, you can enter.";
    }
}
