package controller;

import entity.SmbmsProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.SmbmsProviderService;

import javax.annotation.Resource;

/**
 * (SmbmsProvider)表控制层
 *
 * @author makejava
 * @since 2020-04-28 00:17:14
 */
@Controller
@RequestMapping("smbmsProvider")
public class SmbmsProviderController {
    /**
     * 服务对象
     */
    @Resource
    private SmbmsProviderService smbmsProviderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmbmsProvider selectOne(Long id) {
        return this.smbmsProviderService.queryById(id);
    }

}