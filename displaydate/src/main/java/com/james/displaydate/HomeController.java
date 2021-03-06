package com.james.displaydate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import org.springframework.ui.Model;
import java.text.SimpleDateFormat;
import java.util.Locale;


@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/date")
    public String date(Model model) {
    	Date currentDate = new Date();
    	SimpleDateFormat dateForm = new SimpleDateFormat("EEEE, 'the' d 'of' MMMM, YYYY", Locale.ENGLISH);
    	String formatted_date = dateForm.format(currentDate);
    	model.addAttribute("currentDate", formatted_date);
        return "date.jsp";
   }
    @RequestMapping("/time")
    public String time(Model model) {
    	Date currentDate = new Date();
    	SimpleDateFormat dateForm = new SimpleDateFormat("hh:hh a", Locale.ENGLISH);
    	String formatted_date = dateForm.format(currentDate);
    	model.addAttribute("currentDate", formatted_date);
        return "time.jsp";
   }
}