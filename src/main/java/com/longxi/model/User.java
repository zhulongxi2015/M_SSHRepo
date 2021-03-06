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
    * hibernate注解主键Id生成策略
    1. @GeneratedValue，JPA通用策略生成器:
    　JPA提供的四种标准用法为TABLE,SEQUENCE,IDENTITY,AUTO：
　　　　　 TABLE：使用一个特定的数据库表格来保存主键。
　　　　　 SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
        　IDENTITY：主键由数据库自动生成（主要是自动增长型）。
          AUTO：主键由程序控制。 　
    2.@GenericGenerator hibernate主键策略生成器 ：
         @GenericGenerator注解配合@GeneratedValue一起使用，@GeneratedValue注解中的"generator"属性要与@GenericGenerator注解中name属性一致,strategy属性表示hibernate的主键生成策略
        native：于 oracle 采用 Sequence 方式，对于MySQL 和 SQL Server 采用identity（自增主键生成机制），native就是将主键的生成工作交由数据库完成，hibernate不管（很常用）。
        uuid：采用128位的uuid算法生成主键，uuid被编码为一个32位16进制数字的字符串。占用空间大（字符串类型）
        hilo：使用hilo生成策略，要在数据库中建立一张额外的表，默认表名为hibernate_unique_key,默认字段为integer类型，名称是next_hi（比较少用）。
        assigned：在插入数据的时候主键由程序处理（很常用），这是 <generator>元素没有指定时的默认生成策略。等同于JPA中的AUTO。
        identity： 使用SQL Server 和 MySQL 的自增字段，这个方法不能放到 Oracle 中，Oracle 不支持自增字段，要设定sequence（MySQL 和 SQL Server 中很常用）; 等同于JPA中的INDENTITY。
        sequence：调用底层数据库的序列来生成主键，要设定序列名，不然hibernate无法找到。
        increment:插入数据的时候hibernate会给主键添加一个自增的主键，但是一个hibernate实例就维护一个计数器，所以在多个实例运行的时候不能使用这个方法。
        guid:采用数据库底层的guid算法机制，对应MYSQL的uuid()函数，SQL Server的newid()函数，ORACLE的rawtohex(sys_guid())函数等。
        uuid.hex: 看uuid，建议用uuid替换。
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
