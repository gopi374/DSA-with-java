#include<iostream>
using namespace std;

int main(){
    int n= 7;
    int mid =n/2;
    for(int row=0;row<mid;row++){
        for(int col=0;col<mid-row;col++){
            cout<<" * ";
        }
        for(int col=0;col<2*row+1;col++){
            cout<<"   ";
        }
        for(int col=0;col<mid-row;col++){
            cout<<" * ";
        }
        cout<<endl; 
    }
    cout<<endl;
    for(int row=mid-1;row>=0;row--){
        for(int col=0;col<mid-row;col++){
            cout<<" * ";
        }
        for(int col=0;col<2*row+1;col++){
            cout<<"   ";
        }
        for(int col=0;col<mid-row;col++){
            cout<<" * ";
        }
        cout<<endl; 
    }
    return 0;
}