package com.study.board.repository;

import com.study.board.entity.Board;
import com.study.board.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardDAO {
    public List<Board> selectBoardList(String searchWord, String frontDate, String tailDate) {
        try (SqlSession session = MybatisUtil.getSqlSessionFactory().openSession()) {
            Map<String, Object> param = new HashMap<>();
            param.put("searchWord", searchWord);
            param.put("frontDate", frontDate);
            param.put("tailDate", tailDate);


            return session.selectList("mapper.BoardSQL.selectBoardList", param);
        }
    }

}
