/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esira;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author FE-SI1
 */
@Controller
public class HomeController {
 
    @RequestMapping("/")
    public String index(){
        return "index.zul";
    }
}
