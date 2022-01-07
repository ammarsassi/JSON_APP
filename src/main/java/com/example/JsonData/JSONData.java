package com.example.JsonData;



import com.fasterxml.jackson.core.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class JSONData {

    public List<Hospitalization> dataExtraction() {
        List<Hospitalization> listH = new ArrayList<Hospitalization>();

        try {



            URL url = new URL("https://data.sfgov.org/resource/nxjg-bhem.json");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();

            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200)
                throw new RuntimeException("HttpResponseCode:" + responseCode);
            else {
                JsonParser jParser = new JsonFactory().createParser(url);

               loop : while (jParser.nextToken() != JsonToken.END_ARRAY) {
                    Hospitalization h = new Hospitalization();

                    for (int i = 1; i <= 12; i++) {
                        String fieldname = jParser.getCurrentName();

                        if(fieldname==null)
                            continue loop;
                        if (fieldname == "reportdate") {

                            h.setReportdate(jParser.getText());

                        }

                        if (fieldname == "hospital") {

                            h.setHospital(jParser.getText());
                        }

                        if (fieldname == "dphcategory") {

                            h.setDphcategory(jParser.getText());
                        }

                        if (fieldname == "covidstatus") {

                            h.setCovidstatus(jParser.getText());

                        }

                        if (fieldname == "patientcount") {

                            h.setPatientcount(jParser.getText());

                        }
                        if (fieldname == "data_loaded_at") {

                            h.setData_loaded_at(jParser.getText());
                        }
                        jParser.nextToken();
                    }

                    listH.add(h);
                    System.out.println(h.toString());
                }
            }
        return listH;
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
     return listH;
    }

}