package org.liumf.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Copyright: Copyright (c) 2019 AsiaInfo
 *
 * @ClassName: User
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 16:53 2019/12/20
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 16:53       liumf           v1.1.0
 */
@RestController
public class User {

    @GetMapping("/s")
    public String test(){

        return "111";
    }
}
