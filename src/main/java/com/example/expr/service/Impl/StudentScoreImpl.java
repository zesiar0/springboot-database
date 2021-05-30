package com.example.expr.service.Impl;

import com.example.expr.dao.StudentScoreDao;
import com.example.expr.query.GradeQuery;
import com.example.expr.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScoreImpl implements StudentScoreService {
    @Autowired
    private StudentScoreDao studentScoreDao;

    @Override
    public List<GradeQuery> getAllInfo() {
        return studentScoreDao.getAllInfo();
    }

    @Override
    public List<GradeQuery> getStudentInfo(String name) {
        return studentScoreDao.getStudentInfo(name);
    }
}
