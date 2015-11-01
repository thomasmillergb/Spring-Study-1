/**
 * 
 */
package com.apress.isf.spring.data;

import java.util.List;

import com.apress.isf.java.model.Document;

/**
 * @author Felipe Gutierrez
 *
 */
public interface DocumentDAO {
	public List<Document> getAll();
	public void save(Document document);
	public Document findById(String id);
}
