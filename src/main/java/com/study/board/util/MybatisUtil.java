package com.study.board.util;

import lombok.Getter;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    /*  싱글톤으로 관리
    *   모든 DAO가 커넥션풀 공유
    *   자원 낭비 방지, 일관성 유지 등
    * */

    @Getter
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            String resource = "/mybatis-config.xml";

            // mybatis가 inputStream으로 설정 파일을 바이트씩 읽을 수 있게 함
            // class path를 쉽게 찾기 위해 쓰는 Resources 클래스 사용
            InputStream inputStream = Resources.getResourceAsStream(resource);

            // 빌드하여 설정파일의 설정값을 기반으로 설정 객체 생성
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
