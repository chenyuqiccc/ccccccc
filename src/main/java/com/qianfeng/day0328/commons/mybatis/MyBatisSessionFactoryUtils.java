package com.qianfeng.day0328.commons.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisSessionFactoryUtils {

    public static SqlSessionFactory sqlSessionFactory;

    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    static {
         initSessionFactory();
    }

    private static void initSessionFactory(){
            try {
                InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
//                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        if(sqlSessionFactory == null){
            initSessionFactory();
        }
        return sqlSessionFactory;
    }

    public static SqlSession getSession(){
        System.out.println(Thread.currentThread());
        SqlSession session = threadLocal.get();
        if(session == null){
            session = sqlSessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }
}
