package com.example.JsonData;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface HospitalizationService {

        // public Hospitalization addHospitalization(Hospitalization h);
        public List<Hospitalization> addAllHospitalization(List<Hospitalization> list);

        // public Optional<Hospitalization> find_hospitalization (long id);
        // public void delete_hospitalization(long id);
        // public Hospitalization update_hospitalization(Hospitalization h);


        public List<Hospitalization> findAll();
        /*
        public List<Hospitalization> searchByDphcategory(String dphcategory);
        public List<Hospitalization> searchByCovidstatus(String covidstatus);
        public List<Hospitalization> searchByPatientcountGraterThan(long patientcount);
        public List<Hospitalization> searchByPatientcountLessThan(long patientcount);
        public List<Hospitalization> searchByPatientcountBetween(long patientcount1, long patientcount2);
        public List<Hospitalization> searchByPeriod(String begin, String end);
        public long countHospitalizationByPeriod(String begin, String end);
        public long countAll();
        public List<String> searchDistinctByDphcategory();
        public List<String> searchDistinctByCovidstatuts();
        public Map<String,Integer> searchPatientcountOrderByDphcategory();
        public Map<String,Integer> searchPatientcountOrderByCovidstatuts();

*/

        }