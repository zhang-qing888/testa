package service;

import entity.SmbmsProvider;

import java.util.List;

/**
 * (SmbmsProvider)表服务接口
 *
 * @author makejava
 * @since 2020-04-28 00:17:14
 */
public interface SmbmsProviderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmbmsProvider queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmbmsProvider> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param smbmsProvider 实例对象
     * @return 实例对象
     */
    SmbmsProvider insert(SmbmsProvider smbmsProvider);

    /**
     * 修改数据
     *
     * @param smbmsProvider 实例对象
     * @return 实例对象
     */
    SmbmsProvider update(SmbmsProvider smbmsProvider);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}