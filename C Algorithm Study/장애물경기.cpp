#include <stdio.h>

int i, j;
int n, start, finish, check = 0, t=0, min = 999999999;
int input[100000][3], output[100000][2]={0,};

void updown(int xplace, int yplace, int cnt, int movement)
{
    if(cnt==n)
    {
        output[check][0] = movement+(finish-xplace);
        output[check][1] = yplace;
        check++;
        
        return;
    }
    else if(input[cnt][1]<yplace && yplace<input[cnt][2])
    {
        if((yplace-input[cnt][1]) == (input[cnt][2]-yplace))
        {
            updown(input[cnt][0],input[cnt][1],cnt+1,movement+(input[cnt][0]-xplace)+(yplace-input[cnt][1]));
            updown(input[cnt][0],input[cnt][2],cnt+1,movement+(input[cnt][0]-xplace)+(input[cnt][2]-yplace));
        }
        else if((yplace-input[cnt][1]) < (input[cnt][2]-yplace))
        {
            updown(input[cnt][0],input[cnt][1],cnt+1,movement+(input[cnt][0]-xplace)+(yplace-input[cnt][1]));
        }
        else
        {
            updown(input[cnt][0],input[cnt][2],cnt+1,movement+(input[cnt][0]-xplace)+(input[cnt][2]-yplace));
        }
    }
    else
    {
        updown(xplace, yplace, cnt+1, movement);
    }
}

int main(void)
{
    scanf("%d",&n);
    scanf("%d %d",&start,&finish);
    for(i=0;i<n;i++)
    {
        scanf("%d %d %d",&input[i][0],&input[i][1],&input[i][2]);
    }
    
    updown(0,start,0,0);
    
    for(i=0;i<check;i++)
    {
        if(min > output[i][0])
        {
            min = output[i][0];
        }
        
        if(output[i][1] == output[i+1][1])
        {
            for(j=i+1;j<check;j++)
            {
                output[j][1] = output[j+1][1];
                output[j][0] = output[j+1][0];
            }
            check--;
        }
    }
    
    printf("%d\n%d ", min, check);
    for(i=0;i<check;i++)
    {
        if(output[i][0] == min)
        {
            printf("%d ", output[i][1]);
        }
    }
    printf("\n");
    
    return 0;
}