package com.tan.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName: FileInputStreamTest
 * @Description:
 * @Author: TanQuan
 * @Date: 2021/5/11 11:53
 * @Version: 1.0
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("/Users/tanquan/后端/codeDemo/myStoreAdmin/src/webapp/WEB-INF/web.xml");
            try {
                int read = inputStream.read();
                System.out.println(read);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
