#include<bits/stdc++.h>
using namespace std;
int main()
{
 int pr;
  float longitude,time;
  cin>>pr>>longitude;
  	float period_of_rotation=(float)pr;
    time=(period_of_rotation/360.00)*longitude*60;
    int h=(int)time/60;
    int m=(int)time-(h*60);
    float H=h%12;
    float M=m;
    float angle=(11.0/2.0)*M-(30.0*H);
    angle=(angle<0)?angle+360:angle;
  if(angle>180)
    cout<<fixed<<setprecision(2)<<360-angle;
  else
    cout<<fixed<<setprecision(2)<<angle;
 
  return 0;
}