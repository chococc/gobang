package com.gobang;

import java.util.Scanner;

/**
 * 五子棋_主类
 * @CreateBy coco7
 * @Date 2021/3/29
 * github:github.com/chococc
 */
public class Gobang_main {
    /**
     * 初始化 25*25 棋盘
     * @param chess
     * @flag -1:空格 -2：棋盘边界
     */
    void Chessstage(int[][] chess){
        int i=0;
        while(i<27){
            int j=0;
            while(j<27){
                if(i==0||i==26)
                    chess[i][j]=-2;
                if(j==26||j==0)
                    chess[i][j]=-2;
                else
                chess[i][j]=-1;
                j++;
            }
            i++;
            }
        }
    /**
     * 五子棋程序入口
     * @input x,y
     * @output judge
     */
    public static void main(String[] args){
        Gobang_main gobang_main=new Gobang_main();
        String str=new String();
        String[] strArray=null;
        Judge judge=new Judge();
        Scanner sc=new Scanner(System.in);
        int chess[][]=new int [27][27];
        int x;
        int y;
        gobang_main.Chessstage(chess);
        while(true){
            int count=1;
            System.out.println("black`s "+count+" turn");
            str=sc.next();
            strArray=str.split(",");
            x=Integer.parseInt(strArray[0]);
            y=Integer.parseInt(strArray[1]);
            chess[x][y]=0;
            if(judge.Judge(chess,x,y))
            {
                System.out.println("black win!");
                return;
            }
            System.out.println("white`s "+count+" turn");
            str=sc.next();
            strArray=str.split(",");
            x=Integer.parseInt(strArray[0]);
            y=Integer.parseInt(strArray[1]);
            chess[x][y]=1;
            if(judge.Judge(chess,x,y)){
                System.out.println("white win!");
                return;
            }
            count++;
            if(count==26){
                break;
            }
        }
        System.out.println("tie");
        return;
    }
}
