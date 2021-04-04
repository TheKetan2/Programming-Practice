#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	float k1,k2,k3,v;
	cin>>t;
	for(int i = 0; i<t;i++){
		cin>>k1>>k2>>k3>>v;
		float sol = 100/(k1*k2*k3*v) +0.005;
		// cout<<sol;
		if(sol <9.58){
			cout<<"YES\n";
		}else{
			cout<<"NO\n";
		}
	}
	return 0;
}