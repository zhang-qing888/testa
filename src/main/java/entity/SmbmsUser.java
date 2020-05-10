package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (SmbmsUser)实体类
 *
 * @author makejava
 * @since 2020-04-28 00:17:28
 */
public class SmbmsUser implements Serializable {
    private static final long serialVersionUID = -36167907717322415L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 用户编码
    */
    private String usercode;
    /**
    * 用户名称
    */
    private String username;
    /**
    * 用户密码
    */
    private String userpassword;
    /**
    * 性别（1:女、 2:男）
    */
    private Integer gender;
    /**
    * 出生日期
    */
    private Object birthday;
    /**
    * 手机
    */
    private String phone;
    /**
    * 地址
    */
    private String address;
    /**
    * 用户角色（取自角色表-角色id）
    */
    private Long userrole;
    /**
    * 创建者（userId）
    */
    private Long createdby;
    /**
    * 创建时间
    */
    private Date creationdate;
    /**
    * 更新者（userId）
    */
    private Long modifyby;
    /**
    * 更新时间
    */
    private Date modifydate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUserrole() {
        return userrole;
    }

    public void setUserrole(Long userrole) {
        this.userrole = userrole;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

}