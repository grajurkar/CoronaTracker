package com.gaurav.coronavirustracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVisrusData coronaVisrusData;
	
	
	@GetMapping("/")
	public String home(Model model) {
		
		
		List<LocationStats> allStats = coronaVisrusData.getAllStats();
		
		int totalReportedCases= allStats.stream().mapToInt(stat -> stat.getTotlaReportedCases()).sum();
		int tolaNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevoiusDay()).sum();
		
		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalReportedCases", totalReportedCases);
		model.addAttribute("tolaNewCases", tolaNewCases);
		return "home";
	}

}
