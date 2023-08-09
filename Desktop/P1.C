#include<stdio.h>
#include<conio.h>
void main()
{
   int i,j,no=0;
   clrscr();
   for(i=0;i<=5;i++)
   {
     for(j=0;j<=i;j++)
     {
     printf("%d",j+1);
     }
     printf("\n");
   }
   getch();
}