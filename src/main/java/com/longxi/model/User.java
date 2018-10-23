package com.longxi.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="user")
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    public User(){}
    public User(String username, String password, Integer age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }
    /*
    * hibernateע������Id���ɲ���
    1. @GeneratedValue��JPAͨ�ò���������:
    ��JPA�ṩ�����ֱ�׼�÷�ΪTABLE,SEQUENCE,IDENTITY,AUTO��
���������� TABLE��ʹ��һ���ض������ݿ���������������
���������� SEQUENCE�����ݵײ����ݿ���������������������������ݿ�֧�����С�
        ��IDENTITY�����������ݿ��Զ����ɣ���Ҫ���Զ������ͣ���
          AUTO�������ɳ�����ơ� ��
    2.@GenericGenerator hibernate�������������� ��
         @GenericGeneratorע�����@GeneratedValueһ��ʹ�ã�@GeneratedValueע���е�"generator"����Ҫ��@GenericGeneratorע����name����һ��,strategy���Ա�ʾhibernate���������ɲ���
        native���� oracle ���� Sequence ��ʽ������MySQL �� SQL Server ����identity�������������ɻ��ƣ���native���ǽ����������ɹ����������ݿ���ɣ�hibernate���ܣ��ܳ��ã���
        uuid������128λ��uuid�㷨����������uuid������Ϊһ��32λ16�������ֵ��ַ�����ռ�ÿռ���ַ������ͣ�
        hilo��ʹ��hilo���ɲ��ԣ�Ҫ�����ݿ��н���һ�Ŷ���ı�Ĭ�ϱ���Ϊhibernate_unique_key,Ĭ���ֶ�Ϊinteger���ͣ�������next_hi���Ƚ����ã���
        assigned���ڲ������ݵ�ʱ�������ɳ������ܳ��ã������� <generator>Ԫ��û��ָ��ʱ��Ĭ�����ɲ��ԡ���ͬ��JPA�е�AUTO��
        identity�� ʹ��SQL Server �� MySQL �������ֶΣ�����������ܷŵ� Oracle �У�Oracle ��֧�������ֶΣ�Ҫ�趨sequence��MySQL �� SQL Server �кܳ��ã�; ��ͬ��JPA�е�INDENTITY��
        sequence�����õײ����ݿ������������������Ҫ�趨����������Ȼhibernate�޷��ҵ���
        increment:�������ݵ�ʱ��hibernate����������һ������������������һ��hibernateʵ����ά��һ���������������ڶ��ʵ�����е�ʱ����ʹ�����������
        guid:�������ݿ�ײ��guid�㷨���ƣ���ӦMYSQL��uuid()������SQL Server��newid()������ORACLE��rawtohex(sys_guid())�����ȡ�
        uuid.hex: ��uuid��������uuid�滻��
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name="identity",strategy = "identity")
    @Column(name = "id",nullable =false,unique = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="username",nullable = false,length = 200)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column(name="password",nullable = false,length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name="age",nullable=false)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
