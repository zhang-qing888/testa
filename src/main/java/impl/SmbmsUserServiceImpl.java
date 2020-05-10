package impl;

import dao.SmbmsUserDao;
import entity.SmbmsUser;
import org.springframework.stereotype.Service;
import service.SmbmsUserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SmbmsUser)表服务实现类
 *
 * @author makejava
 *
 */
@Service("smbmsUserService")
public class SmbmsUserServiceImpl implements SmbmsUserService {
    @Resource
    private SmbmsUserDao smbmsUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmbmsUser queryById(Long id) {
        return this.smbmsUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmbmsUser> queryAllByLimit(int offset, int limit) {
        return this.smbmsUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smbmsUser 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsUser insert(SmbmsUser smbmsUser) {
        this.smbmsUserDao.insert(smbmsUser);
        return smbmsUser;
    }

    /**
     * 修改数据
     *
     * @param smbmsUser 实例对象
     * @return 实例对象
     */
    @Override
    public SmbmsUser update(SmbmsUser smbmsUser) {
        this.smbmsUserDao.update(smbmsUser);
        return this.queryById(smbmsUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smbmsUserDao.deleteById(id) > 0;
    }

    /**
     * 登录功能
     * @param userCode
     * @return
     */
    public SmbmsUser queryByUserCode(String userCode){
        /*ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("springconfig.xml");
        Object smbmsUserDao1 = applicationContext.getBean("smbmsUserDao");*/
      /**logger*/

        SmbmsUser smbmsUser=  smbmsUserDao.selectuser(userCode);

        return smbmsUser;
    }
}