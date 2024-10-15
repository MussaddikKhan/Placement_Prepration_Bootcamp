
#include<bits/stdc++.h>
using namespace std;
int32_t main()
{

    // int a = 5;
    // int b = 6;
    // int c = 7;
    // cout<<&a<<" "<<&b<<" "<<&c<<endl;
    // cout<<0x61ff0c<<" "<< 0x61ff08 << " " <<0x61ff04
    // <<endl;

    int arr[] = {1, 2, 3, 4, 5};
    cout<<&arr<<endl ;

    cout<<sizeof(arr)/sizeof(char)<<endl;

    // for(int i =0; i < 5; i++){
    //     cout<<&arr[i]<<" ";
    //     cout<<(int)&arr[i]<<" ";
    // }
    return 0;
}
