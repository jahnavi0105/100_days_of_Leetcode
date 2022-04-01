#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,i,a[100000];
    cin>>n;
    for(i=0;i<n;i++)
     cin>>a[i];
    const int N=1e6+2;
    int idx[N];
    for(i=0;i<N;i++){
        idx[i]=-1;
    }
    int minidx=10000000;
    for(i=0;i<n;i++){
        if(idx[a[i]]!=-1)
         minidx=min(minidx,idx[a[i]]);
        else 
         idx[a[i]]=i;
    }
    if(minidx==10000000)
     cout<<"-1";
    else 
     cout<<minidx+1;
}
