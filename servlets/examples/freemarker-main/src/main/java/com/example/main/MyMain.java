package com.example.main;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.example.domain.Person;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;
import freemarker.template.Version;

public class MyMain {
	public static void main(String[] args) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {

		//freemarker setup
        Configuration cfg = new Configuration(new Version("2.3.25-incubating"));
        cfg.setClassForTemplateLoading(MyMain.class, "/");
        
        //data model
        Map<String, Object> dataModel = new HashMap<>();
        Person john = new Person("john", 28);
        dataModel.put("user", john);
        
        //template
        Template template = cfg.getTemplate("test.ftl");
        
        //combine template and data model
        try(StringWriter out = new StringWriter()) {
        	template.process(dataModel, out);
            System.out.println(out.getBuffer().toString());
        }

		
	}
}
