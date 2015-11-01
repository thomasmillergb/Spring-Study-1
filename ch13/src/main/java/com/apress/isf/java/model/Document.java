/**
 * 
 */
package com.apress.isf.java.model;

import java.util.Date;

/**
 * @author Felipe Gutierrez
 *
 */
public class Document {
	private String documentId;
	private String name;
	private Type type;
	private String location;
	private String description;
	private Date created;
	private Date modified;
	
	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String toString(){
		StringBuilder builder = new StringBuilder("Document(");
		builder.append("id: ");
		builder.append(documentId);
		builder.append(", name: ");
		builder.append(name);
		builder.append(", type: ");
		builder.append(type);
		builder.append(", location: ");
		builder.append(location);
		builder.append(")");
		return builder.toString();
	}
}
