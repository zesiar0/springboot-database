package com.example.expr.dao;

import com.example.expr.query.GradeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentScoreDao {
    // 查询所有学生课程成绩信息
    List<GradeQuery> getAllInfo();

    // 根据学生姓名查询课程成绩信息
    List<GradeQuery> getStudentInfo(String name);
}
