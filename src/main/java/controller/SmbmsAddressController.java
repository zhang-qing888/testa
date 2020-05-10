package controller;

import entity.SmbmsAddress;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.SmbmsAddressService;

import javax.annotation.Resource;

/**
 * (SmbmsAddress)表控制层
 *
 * @author makejava
 * @since 2020-04-28 00:14:48
 */
@Controller
@RequestMapping("smbmsAddress")
public class SmbmsAddressController {
    /**
     * 服务对象
     */
    @Resource
    private SmbmsAddressService smbmsAddressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmbmsAddress selectOne(Long id) {
        return this.smbmsAddressService.queryById(id);
    }

}