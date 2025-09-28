package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain4 {

    public static void main(String[] args) throws IOException {
        // byte[]에 원하는 데이터를 담고 write()에 전달하면 해당 데이터를 한 번에 출력할 수 있다.
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = {65, 66, 67};
        fos.write(input);
        fos.close();

        // 한 번의 호출로 모든 데이터를 읽을 수 있다. (전체 읽기)
        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] readAllBytes = fis.readAllBytes();
        System.out.println(Arrays.toString(readAllBytes));
        fis.close();
    }
}
