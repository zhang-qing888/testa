package service;

import entity.SmbmsUser;

import java.util.List;

/**
 * (SmbmsUser)表服务接口
 *
 * @author makejava
 * @since 2020-04-28 00:17:28
 */
public interface SmbmsUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmbmsUser queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmbmsUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param smbmsUser 实例对象
     * @return 实例对象
     */
    SmbmsUser insert(SmbmsUser smbmsUser);

    /**
     * 修改数据
     *
     * @param smbmsUser 实例对象
     * @return 实例对象
     */
    SmbmsUser update(SmbmsUser smbmsUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    SmbmsUser queryByUserCode(String userCode);
}