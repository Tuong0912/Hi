package com.example.minitest.controller;

import com.example.minitest.model.Category;
import com.example.minitest.model.Picture;
import com.example.minitest.service.ICategoryService;
import com.example.minitest.service.IPictureService;
import com.example.minitest.service.impl.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private IPictureService iPictureService;
    @Autowired
    ICategoryService iCategoryService;

    @ModelAttribute("category")
    public List<Category> showAllCategory() {
        return iCategoryService.findAll();
    }

    @GetMapping
    public String showAllPicture(Model model) {
        List<Picture> pictures = this.iPictureService.findAll();
        model.addAttribute("pictures", pictures);
        return "/list";
    }

    @GetMapping("createForm")
    public String createForm(Model model) {
        model.addAttribute("picture", new Picture());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Picture picture) {
        this.iPictureService.save(picture);
        return "redirect:/picture";
    }
}
