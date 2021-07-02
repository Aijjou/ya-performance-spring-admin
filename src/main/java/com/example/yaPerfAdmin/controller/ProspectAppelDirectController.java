package com.example.yaPerfAdmin.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.yaPerfAdmin.model.ProspectAppelDirect;
import com.example.yaPerfAdmin.service.ProspectAppelDirectService;

@Controller
public class ProspectAppelDirectController {

	@Autowired
	ProspectAppelDirectService prospectAppelDirectService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/admin/liste-prospect-appel", method = RequestMethod.GET)
	String getAllProspectAppel(Model model) {

		double totalInteger = (int) prospectAppelDirectService.findAll().stream().count();

		System.out.println("total " + totalInteger);

		double nbreAppelInteger = (int) prospectAppelDirectService.findAll().stream()
				.filter(p -> p.getIsAppel() != null && p.getIsAppel() == true).count();
		double nbreRdvInteger = (int) prospectAppelDirectService.findAll().stream()
				.filter(p -> p.getIsRdv() != null && p.getIsRdv() == true).count();
		double nbreTransfInteger = (int) prospectAppelDirectService.findAll().stream()
				.filter(p -> p.getIsPasInteresse() != null && p.getIsPasInteresse() == true).count();
		
		
		double tauxAppel = (nbreAppelInteger / totalInteger) * 100;
		double tauxRdv = (nbreRdvInteger/totalInteger)*100;
		double tauxTransfo = (nbreTransfInteger/totalInteger)*100;
		

		model.addAttribute("nbreRdvInteger", nbreRdvInteger);
		model.addAttribute("nbreTransfInteger", nbreTransfInteger);
		model.addAttribute("nbreAppelInteger", nbreAppelInteger);
		model.addAttribute("totalInteger", totalInteger);
		model.addAttribute("txTransfo", tauxTransfo);
		model.addAttribute("txRdv", tauxRdv);
		model.addAttribute("txAppel", tauxAppel);
		model.addAttribute("prospect", new ProspectAppelDirect());
		model.addAttribute("liste", prospectAppelDirectService.findAll());

		return "/admin/liste-prospect-appel";
	}

	@RequestMapping(value = "/admin/edit-prospect-direct", method = RequestMethod.POST)
	String editProspectDirect(Model model, @ModelAttribute("prospect") ProspectAppelDirect prospectAppelDirect) {

		Date date = prospectAppelDirectService.finProspectAppelDirectById(prospectAppelDirect.getId()).getDemandeDate();

		System.err.println("prospectDirect : " + prospectAppelDirect);

		prospectAppelDirect.setDemandeDate(date);

		prospectAppelDirectService.create(prospectAppelDirect);

		return "redirect:/admin/liste-prospect-appel";
	}

}
