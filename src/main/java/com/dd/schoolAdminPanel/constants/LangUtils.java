package com.dd.schoolAdminPanel.constants;

import java.io.Serializable;
import java.util.Hashtable;


/**
 * This class contains several methods for working with Date and Timestamp
 * values.
 * 
 * @author 
 */
@SuppressWarnings("serial")
public class LangUtils implements Serializable
{ 
	//Assign String method to validate the String is not null and return the value.
	public String assignString(Object paramString){ 
		if(paramString != null  && !paramString.equals(MasterConstants.STRING_NULL_VALUE) ) {
           if(paramString.toString().trim().length() == 0){ 
        	   paramString =MasterConstants.STRING_EMPTY_VALUE;
           } 
	    }else{
	    	 paramString =MasterConstants.STRING_EMPTY_VALUE;
	    }
		return paramString.toString().trim();
	}
	
	//Method to validate the number values and return the number.
	public int assignNumber(Object paramString){ 
 		if(paramString != null  && !paramString.equals(MasterConstants.STRING_NULL_VALUE)) {
           if(paramString.toString().trim().length() > 0){ 
        	  try{
       	 		  return Integer.parseInt(paramString.toString().trim());
        	  }catch(Exception e){
       	 		  return MasterConstants.NUMBER_ZERO;
        	  }
           }else{
        	  return MasterConstants.NUMBER_ZERO;
           }
	    }else{ 
	 		return MasterConstants.NUMBER_ZERO;
	    }
	}
	
	//To check the String is null or empty to return the Boolean result
	public Boolean validateIsNotEmpty(Object paramString){ 
		if(paramString != null ) {// reference purpose rowNo != null && !rowNo.equals("")
           if(paramString.toString().trim().length() > 0 ){ 
   	 		  return MasterConstants.BOOLEAN_TRUE;
           }else{
        	  return MasterConstants.BOOLEAN_FALSE;
           }
	    }else{ 
	 		return MasterConstants.BOOLEAN_FALSE;
	    }
	}
	
	//To check the Hashtable list is null or empty to return  result
	public Hashtable<String, Object> validateIsHashtable(Hashtable<String, Object> paramString){ 
		if(paramString != null  && !paramString.equals("null") ) {
	           if(paramString.size()==0){ 
	        	   paramString =null;
	           } 
	    }else{
	    	 paramString =null;
	    }
	  return paramString;
	}
	
	//Method to validate the number values and return the number.
	public Double assignDoubleValue(String paramString){ 
		if(paramString != null  && !paramString.equals(MasterConstants.STRING_EMPTY_VALUE)) {
	       if(paramString.trim().length() > 0){ 
	    	  try{
	   	 		  return Double.parseDouble(paramString.trim());
	    	  }catch(Exception e){
	   	 		  return MasterConstants.NUMBER_DOUBLE;
	    	  }
	       }else{
	    	  return MasterConstants.NUMBER_DOUBLE;
	       }
	    }else{ 
	 		return MasterConstants.NUMBER_DOUBLE;
	    }
	}
	
	//Method to validate the number values and return the number.
	public int assignValueOf(Object paramString){ 
 		if(paramString != null  && !paramString.equals(MasterConstants.STRING_NULL_VALUE)) {
           if(paramString.toString().trim().length() > 0){ 
        	  try{
       	 		  return Integer.valueOf(paramString.toString().trim());
        	  }catch(Exception e){
       	 		  return MasterConstants.NUMBER_ZERO;
        	  }
           }else{
        	  return MasterConstants.NUMBER_ZERO;
           }
	    }else{ 
	 		return MasterConstants.NUMBER_ZERO;
	    }
	}


public int assignNumberThrowError(Object paramString) throws Exception{ 
		if(paramString != null  && !paramString.equals(MasterConstants.STRING_NULL_VALUE)) {
       if(paramString.toString().trim().length() > 0){ 
    	  try{
   	 		  return Integer.parseInt(paramString.toString().trim());
    	  }catch(Exception e){
   	 		 throw e;
    	  }
       }else{
    	  return MasterConstants.NUMBER_ZERO;
       }
    }else{ 
 		return MasterConstants.NUMBER_ZERO;
    }
}


public Double assignDoubleValueThrowError(String paramString) throws Exception{ 
	if(paramString != null  && !paramString.equals(MasterConstants.STRING_EMPTY_VALUE)) {
       if(paramString.trim().length() > 0){ 
    	  try{
   	 		  return Double.parseDouble(paramString.trim());
    	  }catch(Exception e){
    		  throw e;
    	  }
       }else{
    	  return MasterConstants.NUMBER_DOUBLE;
       }
    }else{ 
 		return MasterConstants.NUMBER_DOUBLE;
    }
}

}
