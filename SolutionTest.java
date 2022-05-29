package com.JavaLessons.Forbooks.Deeplay;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.JavaLessons.Forbooks.Deeplay.Solution.getResult;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void TestGetResult_TestTable_Human() {
        getResult("STWSWTPPTPTTPWPP" , "Human");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                assertTrue(Solution.table[i][j] >= 0);
            }
        }
    }
    @Test
    void TestGetResult_TestTableCost_Human() {
        getResult("STWSWTPPTPTTPWPP" , "Human");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                assertTrue(Solution.table_cost[i][j] >= 0);
            }
        }
    }
    @Test
    void TestGetResult_TestResult_Human(){
        getResult("STWSWTPPTPTTPWPP" , "Human");
        assertTrue(Solution.table_cost[3][3] > 0);
    }

    @Test
    void TestGetResult_TestTable_Swamper() {
        getResult("STWSWTPPTPTTPWPP" , "Swamper");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                assertTrue(Solution.table[i][j] >= 0);
            }
        }
    }
    @Test
    void TestGetResult_TestTableCost_Swamper() {
        getResult("STWSWTPPTPTTPWPP" , "Swamper");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                assertTrue(Solution.table_cost[i][j] >= 0);
            }
        }
    }
    @Test
    void TestGetResult_TestResult_Swamper(){
        getResult("STWSWTPPTPTTPWPP" , "Swamper");
        assertTrue(Solution.table_cost[3][3] > 0);
    }

    @Test
    void TestGetResult_TestTable_Woodman() {
        getResult("STWSWTPPTPTTPWPP" , "Woodman");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                assertTrue(Solution.table[i][j] >= 0);
            }
        }
    }
    @Test
    void TestGetResult_TestTableCost_Woodman() {
        getResult("STWSWTPPTPTTPWPP" , "Woodman");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                assertTrue(Solution.table_cost[i][j] >= 0);
            }
        }
    }
    @Test
    void TestGetResult_TestResult_Woodman(){
        getResult("STWSWTPPTPTTPWPP" , "Woodman");
        assertTrue(Solution.table_cost[3][3] > 0);
    }


}