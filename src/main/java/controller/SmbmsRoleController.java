package controller;

import entity.SmbmsRole;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.SmbmsRoleService;

import javax.annotation.Resource;

/**
 * (SmbmsRole)表控制层
 *
 * @author makejava
 * @since 2020-04-28 00:17:21
 */
@Controller
@RequestMapping("smbmsRole")
public class SmbmsRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SmbmsRoleService smbmsRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmbmsRole selectOne(Long id) {
        return this.smbmsRoleService.queryById(id);
    }

}