/*
 * Copyright (c) 20.12.2019, 11:29
 * Autor: Cherepakhin Vasily
 * Email: vasi.che@gmail.com
 */

package ru.perm.v.jenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-demo")
public class DemoController {

    @GetMapping(name = "")
    public String getSimple() {
        return "Ok19";
    }
}
