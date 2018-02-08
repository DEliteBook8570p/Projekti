package com.timeframe.JustPlaying;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.timeframe.JustPlaying.Pjesemarresit;




@Controller
public class PjesemarresitController {

	 @GetMapping("/pjesemarresit")
	    public String pjesemarresitForm(Model model) {
	        model.addAttribute("pjesemarresit", new Pjesemarresit());
	        System.out.println("okejjj");
	        return "pjesemarresit";
	    }
	
	 @PostMapping("/pjesemarresit")
	    public String pjesemarresitSubmit(@ModelAttribute Pjesemarresit pjesemarresit) {
		  //  Pjesemarresit p =new Pjesemarresit();
		    
	        return "pjesemarresitTabela";
	    }

    
}
