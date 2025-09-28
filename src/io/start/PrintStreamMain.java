package io.start;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamMain {

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;

        byte[] bytes = "Hello!\n".getBytes(StandardCharsets.UTF_8);
        // write(byte[]) : OutputStream 부모 클래스가 제공
        printStream.write(bytes);
        // println(String) : PrintStream이 자체적으로 제공
        printStream.println("Print!");
    }
}
