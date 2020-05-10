package dao;

import entity.SmbmsBill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SmbmsBill)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-28 00:17:05
 */
public interface SmbmsBillDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmbmsBill queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmbmsBill> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param smbmsBill 实例对象
     * @return 对象列表
     */
    List<SmbmsBill> queryAll(SmbmsBill smbmsBill);

    /**
     * 新增数据
     *
     * @param smbmsBill 实例对象
     * @return 影响行数
     */
    int insert(SmbmsBill smbmsBill);

    /**
     * 修改数据
     *
     * @param smbmsBill 实例对象
     * @return 影响行数
     */
    int update(SmbmsBill smbmsBill);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}