package com.longxi.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myDaoSupport")
public class MyDaoSupport extends HibernateDaoSupport {
    /**
     * ˵��:
     * 1.�ڼ�ʹ��ע����ʹ��HibernateDaoSupport�������,ֻ����ôд,
     * ԭ����HibernateDaoSupport�ǳ�����,�ҷ�������final���ε�,
     * �����Ͳ���Ϊ��ע��sessionFactory����hibernateTemplate
     * 2.��ʹ��xml���õĻ�,�Ϳ���ֱ�Ӹ�HibernateDaoSupportע��.
     */
    //��ʹ��HibernateDaosupport,�ֱ���Ϊ��ע��sessionFactory����hibernateTemplate

    //����Ϊ��ע��sessionFactory,���ֻ��Ҫ���Լ���Dao�̳����MyDaoSupport.
    //��ֱ�����Լ���Dao��̳�HibernateDaoSupport��ԭ�����������Լ򻯴���,
    //����ÿ�ζ�Ϊ��ע��sessionFactory����hibernateTemplate��,������ע��һ�ξ͹���.
    @Resource(name="sessionFactory")
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    //	����Ϊ��ע��hibernateTemplate
    //	@Resource(name="hibernateTemplate")
    //	public void setSuperHibernateTemplate(HibernateTemplate hibernateTemplate){
    //		super.setHibernateTemplate(hibernateTemplate);
    //	}

}
