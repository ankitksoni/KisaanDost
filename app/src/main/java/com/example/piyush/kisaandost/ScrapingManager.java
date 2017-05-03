package com.example.piyush.kisaandost;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Piyush on 03-05-2017.
 */

public class ScrapingManager {
        String dis="";
        String web_u;

public String scrapData(String web_url){
     web_u=web_url;
        new doit().execute();
        return dis;
}

       public class doit extends AsyncTask<Void,Void,Void> {
                String dis=null;
                @Override
                protected Void doInBackground(Void... params) {
                        try{

                                Document doc= Jsoup.connect("https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/bucket-scrapper").get();
//                                for(Element p : para)
                                    //    dis = p.text();
                                dis=doc.text();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }


                        return null;
                }

                @Override
                protected void onPostExecute(Void aVoid) {
                        super.onPostExecute(aVoid);

                }
        }
}


