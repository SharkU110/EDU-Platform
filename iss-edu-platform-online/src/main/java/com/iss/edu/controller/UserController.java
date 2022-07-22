package com.iss.edu.controller;

import com.iss.edu.common.Pagination;
import com.iss.edu.common.ResultModel;
import com.iss.edu.dao.UserDao;
import com.iss.edu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/getPage")
    public Pagination<User> getPage(Pagination page) {
        int start = (page.getPageNum() - 1) * page.getPageSize();
        List<User> rows = this.userDao.getPage(start, page.getPageSize(), page.getQueryValue());
        int total = this.userDao.getCount(page.getQueryValue());
        page.setRows(rows);
        page.setTotal(total);
        return page;
    }

    @GetMapping("/getTeachers")
    public List<Map<String, Object>> getUsers() {
        return this.userDao.getTeachers();
    }



}
