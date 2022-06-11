package com.Egg.spring.JDBCTemplate.dao;

import com.Egg.spring.JDBCTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into t_user values(?,?,?)";
        //传递参数，调用方法
        Object[] args = {user.getUserId(), user.getUserName(), user.getUserState()};
        int update = jdbcTemplate.update(sql, args);

        System.out.println(update);
    }

    @Override
    public void update(User user) {
        String sql = "update t_user set user_name=? where user_id=?";

        Object[] args = {user.getUserName(), user.getUserId()};
        int ret = jdbcTemplate.update(sql, args);

        System.out.println(ret);
    }

    @Override
    public void delete(int id) {
        String sql = "delete from t_user where user_id=?";

        int ret = jdbcTemplate.update(sql, id);

        System.out.println(ret);
    }
}
