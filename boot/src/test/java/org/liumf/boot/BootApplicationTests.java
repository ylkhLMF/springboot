package org.liumf.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class BootApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {

        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection.toString());
        connection.close();
        System.out.println("111");
    }

    @Test
    public void Test() {

         changeNUm();
        //
        //
        // reverse();

        printTriangle();
    }


    public void changeNUm() {
//        int a = 12;
//        int b = 27;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("交换后的值a=" + a + ",b=" + b);

        int a = 10;
        int b = 20;

        a^=b;
        b^=a;
        a^=b;
        System.out.println(a);
    }

    public void reverse(){

        String str= "abcdefg";
        String str2 ="";
        char[] chars = str.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
            str2+=chars[i];
        }
        System.out.println(str2);
    }

    public void printTriangle(){
        for(int i =1;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
