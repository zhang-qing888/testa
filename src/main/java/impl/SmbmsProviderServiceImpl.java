package impl;

import dao.SmbmsProviderDao;
import entity.SmbmsProvider;
import org.springframework.stereotype.Service;
import service.SmbmsProviderService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SmbmsProvider)表服务实现类
 *
 * @author makejava
 * @since 2020-04-28 00:17:14
 */
@Service("smbmsProviderService")
public class SmbmsProviderServiceImpl implements SmbmsProviderService {
    @Resource
    private SmbmsProviderDao smbmsProviderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmbmsProvider queryById(Long id) {
        return this.smbmsProviderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmbmsProvider> queryAllByLimit(int offset, int limit) {
        return this.smbmsProviderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smbmsProvider 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsProvider insert(SmbmsProvider smbmsProvider) {
        this.smbmsProviderDao.insert(smbmsProvider);
        return smbmsProvider;
    }

    /**
     * 修改数据
     *
     * @param smbmsProvider 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsProvider update(SmbmsProvider smbmsProvider) {
        this.smbmsProviderDao.update(smbmsProvider);
        return this.queryById(smbmsProvider.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smbmsProviderDao.deleteById(id) > 0;
    }
}