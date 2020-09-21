




package Integration.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	
	@RequestMapping("/homee")  
    public String returnhelloWorld() {  
        
        return "home";   
    }  
      
	@RequestMapping("/Detailsfill")
	public ModelAndView returnGetdetails()
	{	
	
	
	return new ModelAndView("GetDatails");
}

	@RequestMapping("/setdetails")
	public ModelAndView setDetails(@ModelAttribute("user") UserDto user1)
	{
		
		return new ModelAndView("show","msg",user1);
	}
	

}