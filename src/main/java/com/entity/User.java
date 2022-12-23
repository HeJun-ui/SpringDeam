package com.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
//@EntityListeners(value = AuditingEntityListener.class)
@Table(name = "mgt_user")
public class User {


    private static final long serialVersionUID = -8609420554145381857L;
    //用户ID  自增主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private Integer uid;

    //用户名
    @NotNull(message = "用户名不能为空")
    @Column(name = "username")
    private String username;

    //MD5盐值加密后密码
    @NotNull(message = "密码不能为空")
    @Column(name = "password")
    private String password;

    @CreatedDate
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "createTime")
    private Date createTime;  //创建时间

    @LastModifiedDate
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "updateTime")
    private Date updatetime;

    @Column(name = "role")
    private String role;

    public User() {

    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

  
}