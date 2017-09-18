package me.iys123.VideoShow.controller;

/**
 * Created by YS on 2017/9/14.
 */

import me.iys123.VideoShow.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

//    @RequestMapping(path = {"/test"})
//    @ResponseBody
//    public String test() {
//        return "hello";
//    }
//
//    @RequestMapping(path = {"/", "/index"}, method = {RequestMethod.GET})
//    public String index(Model model) {
//        model.addAttribute("value1", "https://media.html5media.info/video.mp4");
//        return "videoshow";
//    }

    //    @Autowired
//    @RequestMapping("/")
//    public List<Video> getAllVideo(){
//        return videoDao.findAll();
//    }
    @Autowired
    private VideoService videoService;

    @RequestMapping(path = {"/", "/index"}, method = {RequestMethod.GET})
    public String all(Model model) {
        model.addAttribute("videos",  videoService.selectAll());
        return "videoshow";
    }
}
