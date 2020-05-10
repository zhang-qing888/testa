package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (SmbmsRole)实体类
 *
 * @author makejava
 * @since 2020-04-28 00:17:21
 */
public class SmbmsRole implements Serializable {
    private static final long serialVersionUID = 882020666507634700L;
    /**
    * 主键ID
    */
    private Long id;
    /**
    * 角色编码
    */
    private String rolecode;
    /**
    * 角色名称
    */
    private String rolename;
    /**
    * 创建者
    */
    private Long createdby;
    /**
    * 创建时间
    */
    private Date creationdate;
    /**
    * 修改者
    */
    private Long modifyby;
    /**
    * 修改时间
    */
    private Date modifydate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
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