package com.example.yaPerfAdmin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.yaPerfAdmin.model.Prospect;
import com.example.yaPerfAdmin.service.ProspectService;

@Controller
public class ProspectController {

	@Autowired
	ProspectService prospectService;

	@RequestMapping(value = "/admin/prospects", method = RequestMethod.GET)
	public String getAllProspect(Model model) {

		List<Prospect> listesList = (List<Prospect>) prospectService.getAllProspects();

		model.addAttribute("listePropsect", listesList);

		return "/admin/prospects";

	}

}
