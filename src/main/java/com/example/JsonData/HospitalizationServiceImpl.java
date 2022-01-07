package com.example.JsonData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class HospitalizationServiceImpl implements HospitalizationService {

    @Autowired
    HospitalizationRepository agent;


    /*@Override
    public Hospitalization addHospitalization(Hospitalization h) {

        return agent.save(h);
    }
    */

    @Override
    public List<Hospitalization> addAllHospitalization(List<Hospitalization> list) {

        return agent.saveAllAndFlush(list);
    }


    @Override
    public List<Hospitalization> findAll() {
        return (List<Hospitalization>)agent.findAll();
    }

    /*
    @Override
    public List<Hospitalization> searchByDphcategory(String dphcategory) {
        return null;
    }

    @Override
    public List<Hospitalization> searchByCovidstatus(String covidstatus) {
        return null;
    }

    @Override
    public List<Hospitalization> searchByPatientcountGraterThan(long patientcount) {
        return null;
    }

    @Override
    public List<Hospitalization> searchByPatientcountLessThan(long patientcount) {
        return null;
    }

    @Override
    public List<Hospitalization> searchByPatientcountBetween(long patientcount1, long patientcount2) {
        return null;
    }

    @Override
    public List<Hospitalization> searchByPeriod(String begin, String end) {
        return null;
    }

    @Override
    public long countHospitalizationByPeriod(String begin, String end) {
        return 0;
    }

    @Override
    public long countAll() {
        return 0;
    }

    @Override
    public List<String> searchDistinctByDphcategory() {
        return null;
    }

    @Override
    public List<String> searchDistinctByCovidstatuts() {
        return null;
    }

    @Override
    public Map<String, Integer> searchPatientcountOrderByDphcategory() {
        return null;
    }

    @Override
    public Map<String, Integer> searchPatientcountOrderByCovidstatuts() {
        return null;
    }
    */
}
