package com.beautyparlour.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.beautyparlour.beans.Parlour;
import com.beautyparlour.service.ParlourService;

@Controller
public class ParlourController {
	private static Logger log = LoggerFactory.getLogger(ParlourController.class);
	@Autowired
	private ParlourService parlourService;

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView parlourServic() {
		return new ModelAndView("home");

	}

	@RequestMapping(path = "/beauty", method = RequestMethod.GET)
	public ModelAndView createparlour() {
//		Map<String, Object> map = new HashMap<>();
//		map.put("headerName", "beauty");
//		map.put("mod", new Parlour());
		return new ModelAndView("beauty","mod",new Parlour());

	}

	@RequestMapping(path = "/beauty", method = RequestMethod.POST)
	public ModelAndView createStandard(@ModelAttribute(name = "mod") Parlour parlour) {
//		map.addAttribute("headerName", "View Records");
		// map.addAttribute("standard", standard);
		

		parlourService.save(parlour);
		log.info(parlour.toString());
		return new ModelAndView("home");

	}
}