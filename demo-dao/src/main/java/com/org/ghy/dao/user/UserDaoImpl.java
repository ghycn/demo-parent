package com.org.ghy.dao.user;

import com.org.ghy.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.orm.hibernate5.HibernateTemplate;
import java.util.List;

/**
 * Created by Administrator on 2017-7-17.
 */
@Service
public class UserDaoImpl implements UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<UserEntity> queryUserList() {
        DetachedCriteria criteria= DetachedCriteria.forClass(UserEntity.class);
        List<UserEntity> list = (List<UserEntity>) hibernateTemplate.findByCriteria(criteria);
        System.out.println(list.size());

        String sql = " select * from user  ";
        Session session = this.hibernateTemplate.getSessionFactory().openSession();
        List userList = session.createSQLQuery(sql).list();
        System.out.println(userList.size());
        session.close();
        return userList;
    }
}
