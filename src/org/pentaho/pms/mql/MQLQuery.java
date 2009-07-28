/*
 * Copyright 2006 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 */
package org.pentaho.pms.mql;

import java.util.List;

import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.pms.core.exception.PentahoMetadataException;
import org.pentaho.pms.schema.BusinessModel;
import org.pentaho.pms.schema.SchemaMeta;

/**
 * @deprecated as of metadata 3.0.  Please use org.pentaho.metadata.query.model.Query
 */
public interface MQLQuery {

  public MappedQuery getQuery() throws PentahoMetadataException;
  
  public DatabaseMeta getDatabaseMeta();

  public SchemaMeta getSchemaMeta();

  public void setSchemaMeta(SchemaMeta schemaMeta);
  
  public BusinessModel getModel();

  public void setModel(BusinessModel model);
  
  public boolean getDisableDistinct();
 
  public void setDisableDistinct(boolean value);
  
  public List<Selection> getSelections();
  
  public void setSelections(List<Selection> list);
 
  public List<WhereCondition> getConstraints();
  
  public void setConstraints(List<WhereCondition> list);
  
  public List<OrderBy> getOrder();
  
  public void setOrder(List<OrderBy> list);

  public String getXML();

}