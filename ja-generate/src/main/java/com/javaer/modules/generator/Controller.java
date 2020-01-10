package com.javaer.modules.generator;

import com.javaer.modules.generator.service.IGenTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: yanhaizhen
 * @Date: 2020-01-07 23:38
 */
@RestController
@RequestMapping("/sys")
@Slf4j
public class Controller {

    @Autowired
    private IGenTableService genTableService;


}
