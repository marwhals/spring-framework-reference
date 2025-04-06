package spring6restmvc.services;

import spring6restmvc.model.BeerCSVRecord;

import java.io.File;
import java.util.List;


public interface BeerCsvService {
    List<BeerCSVRecord> convertCSV(File csvFile);
}
