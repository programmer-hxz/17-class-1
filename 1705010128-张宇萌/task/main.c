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
    printf("������洢����������=%lf\n",M);
    if(zichang==16.0)
    {
        double P = 0.048*pow(0.72,(Y-1974));
        printf("�ֳ�16λʱ�洢���۸�=%lf\n",P);
        double money = (M*monthmoney)/(zhiling*30)+P;
        printf("װ�����������õĳɱ�=%lf\n",money);
    }

    if(zichang!=16)
    {
        double P = 0.3*pow(0.72,(Y-1974));
        printf("�洢���۸�=%lf\n",P);
        double money = (M*monthmoney)/(zhiling*30)+P;
        printf("װ�����������õĳɱ�=%lf\n",money);
    }

    return 0;
}
