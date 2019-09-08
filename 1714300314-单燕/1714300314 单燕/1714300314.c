#include <stdio.h>
#include <math.h>
int main()
{
    int M;
    int Y;
    int x;
    int y;
    double P;
    double a;
    double b;
    scanf("%d",&Y);
    b = 0.28*(Y-1960);
    a = exp(b);
    M = 4080*a;

    double c = pow(0.72, Y-1974);
    P = 0.048*c*M;

    x = M/300;
    y = 400*x;
    printf("M=%d\n",M);
    printf("P=%d\n",P);
    printf("x=%d\n",x);
    printf("y=%d\n",y);

    return 0;
}


