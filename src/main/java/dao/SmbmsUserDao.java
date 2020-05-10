package dao;

import entity.SmbmsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SmbmsUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-28 00:17:28
 */
public interface SmbmsUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmbmsUser queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmbmsUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param smbmsUser 实例对象
     * @return 对象列表
     */
    List<SmbmsUser> queryAll(SmbmsUser smbmsUser);

    /**
     * 新增数据
     *
     * @param smbmsUser 实例对象
     * @return 影响行数
     */
    int insert(SmbmsUser smbmsUser);

    /**
     * 修改数据
     *
     * @param smbmsUser 实例对象
     * @return 影响行数
     */
    int update(SmbmsUser smbmsUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);
    /**
     * 通过用户userCode属性
     * 查询用户
     * */
    SmbmsUser selectuser(String userCode);
}