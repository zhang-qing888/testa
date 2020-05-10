package dao;

import entity.SmbmsProvider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SmbmsProvider)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-28 00:17:14
 */
public interface SmbmsProviderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmbmsProvider queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmbmsProvider> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param smbmsProvider 实例对象
     * @return 对象列表
     */
    List<SmbmsProvider> queryAll(SmbmsProvider smbmsProvider);

    /**
     * 新增数据
     *
     * @param smbmsProvider 实例对象
     * @return 影响行数
     */
    int insert(SmbmsProvider smbmsProvider);

    /**
     * 修改数据
     *
     * @param smbmsProvider 实例对象
     * @return 影响行数
     */
    int update(SmbmsProvider smbmsProvider);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}