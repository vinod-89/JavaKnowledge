package com.executorservice;

public class FetchDataFromFile implements Runnable{
	 
	 private final String fileName;
	 
	 public FetchDataFromFile(String fileName) {
	 // super();
	  this.fileName = fileName;
	 }
	 
	 @Override
	 public void run() {
	  try {
	   System.out.println("Fetching data from   "+fileName+" by "+Thread.currentThread().getName());
	   Thread.sleep(1); // Reading file
	   System.out.println("Read file successfully: "+fileName+" by "+Thread.currentThread().getName());
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	 }
	 public String getFileName() {
	  return fileName;
	 }
	}