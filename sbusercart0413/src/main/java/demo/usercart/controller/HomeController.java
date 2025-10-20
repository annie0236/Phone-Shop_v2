package demo.usercart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // ✅ 首頁（對應 templates/home.html）
    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    // ✅ 商店頁（對應 templates/usercart.html）
    @GetMapping("/shop")
    public String shop() {
        return "usercart";
 }
}