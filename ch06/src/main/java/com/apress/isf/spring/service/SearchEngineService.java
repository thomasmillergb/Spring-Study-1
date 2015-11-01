/**
 * 
 */
package com.apress.isf.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;
import com.apress.isf.spring.data.DocumentDAO;

/**
 * @author Felipe Gutierrez
 *
 */
public class SearchEngineService implements SearchEngine {
	private static final Logger log = LoggerFactory.getLogger(SearchEngineService.class);
	private DocumentDAO documentDAO;

	
	public SearchEngineService(){
		if(log.isDebugEnabled())
			log.debug("SearchEngineService created: " + this);
	}
	
	public DocumentDAO getDocumentDAO() {
		return documentDAO;
	}

	public void setDocumentDAO(DocumentDAO documentDAO) {
		if(log.isDebugEnabled())
			log.debug("Document DAO set: " + documentDAO);
		
		this.documentDAO = documentDAO;
	}

	public List<Document> findByType(Type documentType) {
		if(log.isDebugEnabled())
			log.debug("Start <findByType> Params: " + documentType);
		
		List<Document>  result = new ArrayList<Document>();
		for(Document doc : listAll()){
			if(doc.getType().getName().equals(documentType.getName()))
				result.add(doc);
		}
		
		if(log.isDebugEnabled())
			log.debug("End <findByType> Result: " + result);
		return result;
	}
	
	public List<Document> listAll() {
		if(log.isDebugEnabled())
			log.debug("Start <listAll> Params: ");
		List<Document> result = Arrays.asList(documentDAO.getAll());
		if(log.isDebugEnabled())
			log.debug("End <listAll> Result: " + result);
		return result;
	}

}
