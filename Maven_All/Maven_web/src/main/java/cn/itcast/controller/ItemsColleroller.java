package cn.itcast.controller;


import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/liuyang")
public class ItemsColleroller {

    @Autowired
    private ItemsDao itemsDao;

    @RequestMapping("/findAll")
    public String findAll(Model model){


        Items items = itemsDao.findAll(1);
        model.addAttribute("items",items);

        return "success";


    }
}
