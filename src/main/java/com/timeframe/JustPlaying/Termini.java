package com.timeframe.JustPlaying;

import java.sql.Date;
import java.util.ArrayList;

public class Termini {
	private int id;
	private String java;
	private String data;
	private int numriLojtarve;
	//private ArrayList<Integer> pjesmarresit;
	private String stadiumi;
	public Termini(int id, String java, String data, int numriLojtarve, ArrayList<Integer> pjesmarresit,
			String stadiumi) {
		this.id = id;
		this.java = java;
		this.data = data;
		this.numriLojtarve = numriLojtarve;
		//this.pjesmarresit = pjesmarresit;
		this.stadiumi = stadiumi;
	}
	public Termini() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJava() {
		return java;
	}
	public void setJava(String java) {
		this.java = java;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getNumriLojtarve() {
		return numriLojtarve;
	}
	public void setNumriLojtarve(int numriLojtarve) {
		this.numriLojtarve = numriLojtarve;
	}
//	public ArrayList<Integer> getPjesmarresit() {
//		return pjesmarresit;
//	}
//	public void setPjesmarresit(ArrayList<Integer> pjesmarresit) {
//		this.pjesmarresit = pjesmarresit;
//	}
	public String getStadiumi() {
		return stadiumi;
	}
	public void setStadiumi(String stadiumi) {
		this.stadiumi = stadiumi;
	}
	@Override
	public String toString() {
		return "Termini [id=" + id + ", java=" + java + ", data=" + data + ", numriLojtarve=" + numriLojtarve
				 + ", stadiumi=" + stadiumi + "]";
	}
}
