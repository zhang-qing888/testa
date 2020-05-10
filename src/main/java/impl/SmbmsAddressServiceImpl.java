package impl;

import dao.SmbmsAddressDao;
import entity.SmbmsAddress;
import org.springframework.stereotype.Service;
import service.SmbmsAddressService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SmbmsAddress)表服务实现类
 *
 * @author makejava
 * @since 2020-04-28 00:14:48
 */
@Service("smbmsAddressService")
public class SmbmsAddressServiceImpl implements SmbmsAddressService {
    @Resource
    private SmbmsAddressDao smbmsAddressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmbmsAddress queryById(Long id) {
        return this.smbmsAddressDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmbmsAddress> queryAllByLimit(int offset, int limit) {
        return this.smbmsAddressDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smbmsAddress 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsAddress insert(SmbmsAddress smbmsAddress) {
        this.smbmsAddressDao.insert(smbmsAddress);
        return smbmsAddress;
    }

    /**
     * 修改数据
     *
     * @param smbmsAddress 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsAddress update(SmbmsAddress smbmsAddress) {
        this.smbmsAddressDao.update(smbmsAddress);
        return this.queryById(smbmsAddress.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smbmsAddressDao.deleteById(id) > 0;
    }
}