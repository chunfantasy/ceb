package com.ceb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 public class SessionManager
  {
   //只有静态变量才能做为单例模式
   private static SessionFactory sessionFactory=null;
   private static ThreadLocal threadLocal=null;
   private static SessionManager sessionManager=null; //单例模式
   static //静态变量初始器，该初始器只会在类加载时执行一次
   {    
    AnnotationConfiguration cfg=new AnnotationConfiguration();//创建一个Configuration实例
    cfg.configure();//加载hibernate.cfg.xml文件
    sessionFactory=cfg.buildSessionFactory();
    threadLocal=new ThreadLocal();  
    sessionManager=new SessionManager();
   }
  
  public void closeSession() //关闭session
  {
   Session session=(Session)threadLocal.get();//从线程局部变量中获取session
   if (session!=null)
   {
    session.close();
   }
   threadLocal.set(null);//删除线程局变量中的session,释放资源
  }
 
  public static SessionManager newInstance() //单例模式
  {
   return sessionManager;
  }
 
  public Session getSession()
  {
   Session session=(Session)threadLocal.get();//从线程局部变量中获取session
   if (session==null)
   {
    session =sessionFactory.openSession();
    threadLocal.set(session);
   }
   return session;
  }

     }

