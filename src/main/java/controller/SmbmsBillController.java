package controller;

import entity.SmbmsBill;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.SmbmsBillService;

import javax.annotation.Resource;

/**
 * (SmbmsBill)表控制层
 *
 * @author makejava
 * @since 2020-04-28 00:17:05
 */
@Controller
@RequestMapping("smbmsBill")
public class SmbmsBillController {
    /**
     * 服务对象
     */
    @Resource
    private SmbmsBillService smbmsBillService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmbmsBill selectOne(Long id) {
        return this.smbmsBillService.queryById(id);
    }

}