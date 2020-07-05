package com.dqpi.struts2.download.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.corba.se.spi.orbutil.fsm.Input;

public class DownloadAction extends ActionSupport {
	private String outputPath;

	
	
	public String getOutputPath() {
		return outputPath;
	}



	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}


//以下几乎为固定写法
	public InputStream  getDownloadFile() throws Exception{
		InputStream in = ServletActionContext.getServletContext().getResourceAsStream(getOutputPath());
		return in;
	}
	
}
