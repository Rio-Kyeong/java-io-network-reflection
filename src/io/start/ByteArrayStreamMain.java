package io.start;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayStreamMain {

    // 주로 파일/네트워크 대신 메모리에서 빠르게 처리하고 싶을 때 씀
    // [EX]
    // - 디스크에 쓰는 대신, 메모리에서 바로 API 전송 가능
    // - 디스크에 임시 파일 없이 리포트/문서 작성
    // - 네트워크에서 받은 응답을 임시 저장
    public static void main(String[] args) throws IOException {
        byte[] input = {1, 2, 3};

        // 메모리에 누적 (쓰기)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(input);

        // 메모리 데이터를 다시 스트림처럼 사용 (읽기)
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        byte[] bytes = bais.readAllBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
