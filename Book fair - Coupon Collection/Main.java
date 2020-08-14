#include<bits/stdc++.h>
using namespace std;
# define MAX_STALL 50

int coupon(int coupons[],int N,int K,int curr_stall,int result_cache[])
{
  if(curr_stall>=N)
  {
    return(0);
  }
  if(result_cache[curr_stall]!=-1)
  {
    return result_cache[curr_stall];
  }
  int prize1=coupons[curr_stall]+coupon(coupons,N,K,curr_stall+1+K,result_cache);
  int prize2=coupon(coupons,N,K,curr_stall+1,result_cache);
  
  result_cache[curr_stall]=max(prize1,prize2);
  return(result_cache[curr_stall]);
}

int coupon_wrapper(int coupons[],int N,int K)
{
  int result_cache[N];
  int i;
  for(i=0;i<N;i++)
  {
    result_cache[i]=-1;
  }
  
  return coupon(coupons,N,K,0,result_cache);
}
  
int main() 
{
  string str;
  cin>>str;
  int N,K,i;
  int coupons[MAX_STALL];
  for(i=0;i<N;i++)
  {
    cin>>coupons[i];
  }
    stringstream ss(str);// taken input n and k
    vector <int> v;
    for(int i;ss>>i;)
    {
       v.push_back(i);
        if(ss.peek()==',')
          ss.ignore();
    }
  N=v[0];
  K=v[1];
  
  cout<<coupon_wrapper(coupons,N,K);
    return 0;
}