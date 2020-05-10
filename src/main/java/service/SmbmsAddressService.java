package service;

import entity.SmbmsAddress;

import java.util.List;

/**
 * (SmbmsAddress)表服务接口
 *
 * @author makejava
 * @since 2020-04-28 00:14:47
 */
public interface SmbmsAddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmbmsAddress queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmbmsAddress> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param smbmsAddress 实例对象
     * @return 实例对象
     */
    SmbmsAddress insert(SmbmsAddress smbmsAddress);

    /**
     * 修改数据
     *
     * @param smbmsAddress 实例对象
     * @return 实例对象
     */
    SmbmsAddress update(SmbmsAddress smbmsAddress);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}