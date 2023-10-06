package kr.ed.haebeop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/calender")
public class CalenderController {
//    private static final Logger logger = LoggerFactory.getLogger(LocaleController.class);

    @GetMapping("/home")
    public String callHome(Model model){
        return "/calender/home";
    }

    @GetMapping("/call")
    public String callHoliday(@RequestParam("yyyy") String yyyy, Model model){
        DatePicker datePicker = new DatePicker();
        List<Days365> daysList  = datePicker.generatorHoliday(yyyy);
        List<String> holiday  = new ArrayList<>();
        for(Days365 day:daysList){
            Calendar cal = day.getCal();
            String wk = datePicker.generateWeekDay2(cal);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int date = cal.get(Calendar.DAY_OF_MONTH);
        }

        return
    }

}
