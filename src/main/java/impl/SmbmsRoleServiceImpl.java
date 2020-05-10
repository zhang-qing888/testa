package impl;

import dao.SmbmsRoleDao;
import entity.SmbmsRole;
import org.springframework.stereotype.Service;
import service.SmbmsRoleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SmbmsRole)表服务实现类
 *
 * @author makejava
 * @since 2020-04-28 00:17:21
 */
@Service("smbmsRoleService")
public class SmbmsRoleServiceImpl implements SmbmsRoleService {
    @Resource
    private SmbmsRoleDao smbmsRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmbmsRole queryById(Long id) {
        return this.smbmsRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmbmsRole> queryAllByLimit(int offset, int limit) {
        return this.smbmsRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smbmsRole 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsRole insert(SmbmsRole smbmsRole) {
        this.smbmsRoleDao.insert(smbmsRole);
        return smbmsRole;
    }

    /**
     * 修改数据
     *
     * @param smbmsRole 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsRole update(SmbmsRole smbmsRole) {
        this.smbmsRoleDao.update(smbmsRole);
        return this.queryById(smbmsRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smbmsRoleDao.deleteById(id) > 0;
    }
}