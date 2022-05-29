package com.JavaLessons.Forbooks.Deeplay;

import org.jetbrains.annotations.NotNull;

public class Solution {
    static int[][] table = new int[4][4];
    static int[][] table_cost = new int[4][4];
    static int Check;
    static int getResult(@NotNull String field_string,@NotNull String species){
        if(!(species.equals("Human") || species.equals("Swamper") || species.equals("Woodman"))){
            System.out.println("Ошибка входных данных!");
            return 0;
        }
        if(field_string.length() != 16){
            System.out.println("Ошибка входных данных!");
            return 0;
        }

        char[] field = field_string.toCharArray();
        int counter = 0;
        Check = 3 ;
        if(species.equals("Human")){
            for(int i = 0; i< 4 ; i++){
                for(int j=0; j<4; j++){
                    if(field[counter] == 'S')table[i][j] = 5;
                    else if(field[counter] == 'W')table[i][j] = 2;
                    else if(field[counter] == 'T')table[i][j] = 3;
                    else table[i][j] = 1;
                    counter++ ;
                }
            }
        }
        else if(species.equals("Swamper")){
            for(int i = 0; i< 4 ; i++){
                for(int j=0; j<4; j++){
                    if(field[counter] == 'S')table[i][j] = 2;
                    else if(field[counter] == 'W')table[i][j] = 2;
                    else if(field[counter] == 'T')table[i][j] = 5;
                    else table[i][j] = 2;
                    counter++ ;
                }
            }
        }
        else{
            for(int i = 0; i< 4 ; i++){
                for(int j=0; j<4; j++){
                    if(field[counter] == 'S')table[i][j] = 3;
                    else if(field[counter] == 'W')table[i][j] = 3;
                    else if(field[counter] == 'T')table[i][j] = 2;
                    else table[i][j] = 2;
                    counter++ ;
                }
            }
        }

        ////// Заполнение таблицы стоимости прохода
        ////// Сначала крайние строку и столбец
        table_cost[0][0] = 0;
        table[0][0] = 0 ;
        for(int i = 1; i<4; i++){
            table_cost[0][i] = table_cost[0][i-1] + table[0][i];
        }
        for(int j = 1; j<4; j++){
            table_cost[j][0] = table_cost[j-1][0] + table[j][0];
        }
        ///// Заполняем оставшуюся часть таблицы стоимости
        for(int i=1; i<4 ; i++){
            for(int j=1; j<4 ; j++){
                table_cost[i][j] = Math.min(table_cost[i-1][j] , table_cost[i][j-1]) + table[i][j];
            }
        }

        return table_cost[3][3] ;
    }
}
