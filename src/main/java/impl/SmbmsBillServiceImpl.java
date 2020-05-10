package impl;

import dao.SmbmsBillDao;
import entity.SmbmsBill;
import org.springframework.stereotype.Service;
import service.SmbmsBillService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SmbmsBill)表服务实现类
 *
 * @author makejava
 * @since 2020-04-28 00:17:05
 */
@Service("smbmsBillService")
public class SmbmsBillServiceImpl implements SmbmsBillService {
    @Resource
    private SmbmsBillDao smbmsBillDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmbmsBill queryById(Long id) {
        return this.smbmsBillDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmbmsBill> queryAllByLimit(int offset, int limit) {
        return this.smbmsBillDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smbmsBill 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsBill insert(SmbmsBill smbmsBill) {
        this.smbmsBillDao.insert(smbmsBill);
        return smbmsBill;
    }

    /**
     * 修改数据
     *
     * @param smbmsBill 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsBill update(SmbmsBill smbmsBill) {
        this.smbmsBillDao.update(smbmsBill);
        return this.queryById(smbmsBill.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smbmsBillDao.deleteById(id) > 0;
    }
}