#include <stdio.h>
#include <stdlib.h>

int main()
{
    double Y,zichang,zhiling,monthmoney;
    scanf("%lf",&Y);
    scanf("%lf",&zichang);
    scanf("%lf",&zhiling);
    scanf("%lf",&monthmoney);
    double M = 4080*exp(0.28*(Y-1960));
    printf("计算机存储容量的需求=%lf\n",M);
    if(zichang==16.0)
    {
        double P = 0.048*pow(0.72,(Y-1974));
        printf("字长16位时存储器价格=%lf\n",P);
        double money = (M*monthmoney)/(zhiling*30)+P;
        printf("装满程序所需用的成本=%lf\n",money);
    }

    if(zichang!=16)
    {
        double P = 0.3*pow(0.72,(Y-1974));
        printf("存储器价格=%lf\n",P);
        double money = (M*monthmoney)/(zhiling*30)+P;
        printf("装满程序所需用的成本=%lf\n",money);
    }

    return 0;
}
