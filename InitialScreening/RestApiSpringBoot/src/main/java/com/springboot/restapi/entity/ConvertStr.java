package com.springboot.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ConvertStr { 
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "STRID") 
        private int strId;
        
        @Column(name="SUBSTRING")  
        private String subStr;
		public int getStrId() {
			return strId;
		}
		public void setStrId(int strId) {
			this.strId = strId;
		}
		public String getSubStr() {
			return subStr;
		}
		public void setSubStr(String subStr) {
			this.subStr = subStr;
		}
		
		public ConvertStr() {
			super();
			 
		}
		
		public ConvertStr(String subStr) {
			super();
			this.subStr = subStr;
		}
        
      
}
