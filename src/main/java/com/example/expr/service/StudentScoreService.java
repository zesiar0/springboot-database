package com.example.expr.service;

import com.example.expr.query.GradeQuery;

import java.util.List;

public interface StudentScoreService {
    //得到所有学生课程成绩信息
    List<GradeQuery> getAllInfo();

    // 根据学生姓名查询课程成绩信息
    List<GradeQuery> getStudentInfo(String name);
}
