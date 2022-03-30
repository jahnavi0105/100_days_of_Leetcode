#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,a[1000],i,mx;
    cin>>n;
    for(i=0;i<n;i++)
      cin>>a[i];
    mx=a[0];
    for(i=1;i<n;i++){
        if(mx<a[i])
          mx=a[i];
          cout<<mx<<endl;
    }
}
