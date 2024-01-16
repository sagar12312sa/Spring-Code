package com.coupling;

public class ReportService {
    ReportGenerator generator;
    
    public void setGenerator(ReportGenerator generator) {
    	this.generator = generator;
    }
    
    public void printReport() 
    {
    	generator.display();
    }
}
