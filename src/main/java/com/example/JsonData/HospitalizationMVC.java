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

    /*@GetMapping()
    public List<Hospitalization> displayHospitalization()
    {
        return agent.findAll();
    }

    @PostMapping
    public Hospitalization addHospitalization(@RequestBody Hospitalization hospitalization)
    {
        return agent.addHospitalization(hospitalization);
    }

    @PostMapping
    public List<Hospitalization> addAllHospitalization(@RequestBody List<Hospitalization> list)
    {
        return agent.addAllHospitalization(list);
    }
    /*
    @GetMapping("/{id}")
    public Doctor find_doctor(@PathVariable("id") long id) throws ResourceNotFound
    {
        Doctor d= agent.find_doctor(id).orElseThrow(
                () -> new ResourceNotFound("Doctor not found for id :" +id)
        );
        return d;
    }

    @DeleteMapping("/{id}")
    public Map<String,Boolean> delete_doctor(@PathVariable("id") long id)throws ResourceNotFound
    {
        Doctor d= agent.find_doctor(id).orElseThrow(
                () -> new ResourceNotFound("Doctor not found for id :" +id)
        );

        agent.delete_doctor(id);
        // ce fragment de code c'est pour vérifier que l'enregistrement a été correstement supprimé
        Map<String,Boolean> res = new HashMap<>();
        res.put("deleted", Boolean.TRUE);
        return res;
    }



    @PutMapping("{id}")
    public Doctor update_doctor(@PathVariable("id") long id, @RequestBody Doctor doctor)
    {
        Doctor d = agent.find_doctor(id).get();
        d.setFirstname(doctor.getFirstname());
        d.setLastname(doctor.getLastname());
        d.setAdresse(doctor.getAdresse());
        d.setPhone(doctor.getPhone());
        d.setSpecialite(doctor.getSpecialite());
        return agent.update_doctor(doctor);
    }
    */

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
/*
    @RequestMapping(value ="/doctors/save", method = RequestMethod.POST)
    public ModelAndView save(@Valid @ModelAttribute("Formdoctor") Doctor d,BindingResult result){
        if (result.hasErrors())
        {
            return(new ModelAndView("doctors"));
        }
        else {
            agent.add_doctor(d);
            return new ModelAndView("redirect:/");
        }
    }
*/
    @RequestMapping(value ="/hospitalizations/list", method = RequestMethod.GET)
    public ModelAndView display_doctors(){
        ModelAndView mv = new ModelAndView();
        List<Hospitalization> hospitalizations= agent.findAll();
        mv.addObject("hospitalizations",hospitalizations);
        mv.setViewName("hospitalisations");
        return mv;
    }
/*
    @RequestMapping(value ="/doctors/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete_doctor(@PathVariable("id") long id){
        agent.delete_doctor(id);
        return new ModelAndView("redirect:/doctors/list");
    }

    @RequestMapping(value ="/doctors/update/{id}", method = RequestMethod.GET)
    public ModelAndView display_form_update(@PathVariable("id") long id){
        Doctor doctor = agent.find_doctor(id).get();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editdoctor");
        mv.addObject("Formdoctor", doctor);
        return mv;
    }

    @RequestMapping(value="/doctors/recherche", method = RequestMethod.GET)
    public ModelAndView display_search(){
        ModelAndView mv = new ModelAndView();
        Search search = new Search();
        mv.addObject("search", search);
        mv.setViewName("search");
        return mv;
    }

    @RequestMapping(value = "/doctors/search", method= RequestMethod.POST)
    public ModelAndView search(@ModelAttribute("search") Search search)
    {
        List<Doctor> res = agent.search_specialite(search.getSpecialite());
        search.setDoctors(res);
        ModelAndView mv = new ModelAndView();
        mv.addObject("search", search);
        mv.setViewName("search");
        return mv;
    }

    @RequestMapping(value = "/doctors/avancee", method= RequestMethod.GET)
    public ModelAndView display_advanced_search() {
        ModelAndView mv = new ModelAndView();
        Search search = new Search();
        mv.addObject("search", search);
        mv.setViewName("advancedsearch");
        return mv;
    }

    @RequestMapping(value = "/doctors/advancedsearch", method= RequestMethod.POST)
    public ModelAndView advanced_search(@ModelAttribute("search") Search search)
    {
        List<Doctor> res = agent.advanced_search(search.getSpecialite(), search.getPseudo());
        search.setDoctors(res);
        ModelAndView mv = new ModelAndView();
        mv.addObject("search", search);
        mv.setViewName("advancedsearch");
        return mv;
    }*/
}
