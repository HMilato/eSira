/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editorr.
 */
package esira;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */

@Controller
public class TesteController {
    
    @RequestMapping("/teste")
    public String index(){
        return "zul/timeout.zul";
    }
    
}
