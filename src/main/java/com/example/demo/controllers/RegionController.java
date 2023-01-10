package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.RegionService;

@Controller
@RequestMapping("region")
public class RegionController {
    @Autowired
    private RegionService regionService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("regions", regionService.getAll());
        return "region/index";
    }
}
