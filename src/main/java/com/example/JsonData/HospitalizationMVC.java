package com.example.JsonData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;
@Controller
public class HospitalizationMVC {
    @Autowired
    HospitalizationService agent;

    
    @RequestMapping(value ="/", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
    @RequestMapping(value ="/dataExtractionProcessing", method = RequestMethod.GET)
    public ModelAndView dataExtraction(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dataExtractionProcessing");
        return mv;
    }
    @RequestMapping(value ="/dataExtractionProcessing/get", method = RequestMethod.GET)
    public ModelAndView dataExtractionProcessing(){
        ModelAndView mv = new ModelAndView();
        JSONData jsonData = new JSONData();
        List<Hospitalization> list = jsonData.dataExtraction();
        list = agent.addAllHospitalization(list);
        mv.addObject("hospitalizations",list);
        mv.setViewName("hospitalizations");
        return mv;
    }

    @RequestMapping(value ="/hospitalizations/list", method = RequestMethod.GET)
    public ModelAndView display_doctors(){
        ModelAndView mv = new ModelAndView();
        List<Hospitalization> hospitalizations= agent.findAll();
        mv.addObject("hospitalizations",hospitalizations);
        mv.setViewName("hospitalisations");
        return mv;
    }

}
