package com.ceb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
 public class SessionManager
  {
   //ֻ�о�̬����������Ϊ����ģʽ
   private static SessionFactory sessionFactory=null;
   private static ThreadLocal threadLocal=null;
   private static SessionManager sessionManager=null; //����ģʽ
   static //��̬������ʼ�����ó�ʼ��ֻ���������ʱִ��һ��
   {    
    AnnotationConfiguration cfg=new AnnotationConfiguration();//����һ��Configurationʵ��
    cfg.configure();//����hibernate.cfg.xml�ļ�
    sessionFactory=cfg.buildSessionFactory();
    threadLocal=new ThreadLocal();  
    sessionManager=new SessionManager();
   }
  
  public void closeSession() //�ر�session
  {
   Session session=(Session)threadLocal.get();//���ֲ߳̾������л�ȡsession
   if (session!=null)
   {
    session.close();
   }
   threadLocal.set(null);//ɾ���ֱ߳̾����е�session,�ͷ���Դ
  }
 
  public static SessionManager newInstance() //����ģʽ
  {
   return sessionManager;
  }
 
  public Session getSession()
  {
   Session session=(Session)threadLocal.get();//���ֲ߳̾������л�ȡsession
   if (session==null)
   {
    session =sessionFactory.openSession();
    threadLocal.set(session);
   }
   return session;
  }

     }

