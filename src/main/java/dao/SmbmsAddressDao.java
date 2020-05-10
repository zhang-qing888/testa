package dao;

import entity.SmbmsAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SmbmsAddress)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-28 00:14:47
 */
public interface SmbmsAddressDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmbmsAddress queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmbmsAddress> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param smbmsAddress 实例对象
     * @return 对象列表
     */
    List<SmbmsAddress> queryAll(SmbmsAddress smbmsAddress);

    /**
     * 新增数据
     *
     * @param smbmsAddress 实例对象
     * @return 影响行数
     */
    int insert(SmbmsAddress smbmsAddress);

    /**
     * 修改数据
     *
     * @param smbmsAddress 实例对象
     * @return 影响行数
     */
    int update(SmbmsAddress smbmsAddress);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}