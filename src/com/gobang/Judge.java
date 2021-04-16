package com.gobang;

/**
 * 判定类 judge
 * @CreateBy coco7
 * @Date 2021/3/29
 * @return boolean
 * github:github.com/chococc
 */
public class Judge {
    /**
     * 横向判断 judge1
     * @param chess
     * @param x
     * @param y
     * @return
     */
    boolean judge1(int[][] chess,int x,int y){
        int count=0;
        int i=0; //循环计数
        while(true){
            if(chess[x-i][y]==-2)
                break;
            if(chess[x][y]==chess[x-i][y])
                count++;
            else
                break;
            i++;
            if(i==5)
                break;
        }
        i=1; //循环计数
        while(true){
            if(chess[x+i][y]==-2)
                break;
            if(chess[x][y]==chess[x+i][y])
                count++;
            else
                break;
            i++;
            if(i==5)
                break;
        }
        if(count>=5){
            return true;
        }
        return false;
    }

    /**
     * 纵向判断 judge2
     * @param chess
     * @param x
     * @param y
     * @return
     */
    boolean judge2(int[][] chess,int x,int y){
        int count=0;
        int i=0;
        while(true){
            if(chess[x][y-i]==-2)
                break;
            if(chess[x][y]==chess[x][y-i])
                count++;
            else
                break;
            i++;
            if(i==5)
                break;
        }
        i=1; //循环计数
        while(true){
            if(chess[x][y+i]==-2)
            if(chess[x][y]==chess[x][y+i])
                count++;
            else
                break;
            i++;
            if(i==5)
                break;
        }
        if(count>=5){
            return true;
        }
        return false;
    }

    /**
     * 斜向判断 judge3主对角 judge4副对角
     * @param chess
     * @param x
     * @param y
     * @return
     */
    boolean judge3(int[][] chess,int x,int y) {
        int count = 0;
        int i = 0; //循环计数
        while (true) {
            if (chess[x - i][y - i] == -2)
                break;
            if (chess[x][y] == chess[x - i][y - i]) {
                count++;
            } else
                break;
            i++;
            if (i == 5)
                break;
        }
        i = 1; //循环计数
        while (true) {
            if (chess[x + i][y + i] == -2)
                break;
            if (chess[x][y] == chess[x + i][y + i]) {
                count++;
            } else
                break;
            i++;
            if (i == 5)
                break;
        }
        if (count >= 5) {
            return true;
        }
        return false;
    }
    boolean judge4(int[][] chess,int x,int y){
        int count=0;
        int i=0; //循环计数
        while(true){
            if(chess[x-i][y+i]==-2)
                break;
            if(chess[x][y]==chess[x-i][y+i]) {
                count++;
            }
            else
                break;
            i++;
            if(i==5)
                break;
        }
        i=1; //循环计数
        while(true){
            if(chess[x+i][y-i]==-2)
                break;
            if(chess[x][y]==chess[x+i][y-i]) {
                count++;
            }
            else
                break;
            i++;
            if(i==5)
                break;
        }
        if(count>=5){
            return true;
        }
        return false;
    }
    boolean Judge(int[][] chess,int x,int y){
        return judge1(chess,x,y)||judge2(chess,x,y)||judge3(chess,x,y)||judge4(chess,x,y);
    }
}