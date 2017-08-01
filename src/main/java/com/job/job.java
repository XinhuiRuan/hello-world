package com.job;

import com.problem.problem;
import com.user.user;

public class job {
	private int job_id;
	private String job_name;
	private String job_type;
	private String job_priority;
	private String job_strategy;
	private String job_status;
	private String attempts;
	private user u;
	private problem p;
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	public String getJob_priority() {
		return job_priority;
	}
	public void setJob_priority(String job_priority) {
		this.job_priority = job_priority;
	}
	public String getJob_status() {
		return job_status;
	}
	public void setJob_status(String job_status) {
		this.job_status = job_status;
	}
	public String getAttempts() {
		return attempts;
	}
	public void setAttempts(String attempts) {
		this.attempts = attempts;
	}
	public user getU() {
		return u;
	}
	public void setU(user u) {
		this.u = u;
	}
	public problem getP() {
		return p;
	}
	public void setP(problem p) {
		this.p = p;
	}
	public String getJob_strategy() {
		return job_strategy;
	}
	public void setJob_strategy(String job_strategy) {
		this.job_strategy = job_strategy;
	}
	
}
