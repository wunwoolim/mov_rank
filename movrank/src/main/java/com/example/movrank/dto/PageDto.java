package com.example.movrank.dto;

import lombok.Data;

@Data
public class PageDto {

    private int startCount;
    private int endCount;
    private int dbCount;
    private int pageSize;
    private int reqPage;
    private int pageCount;
	
    private String page;
    private String serviceName;

    // 생성자
    public PageDto(String page, String serviceName) {
        this.page = page;
        this.serviceName = serviceName;
    }

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getStartCount() {
		return startCount;
	}

	public void setStartCount(int startCount) {
		this.startCount = startCount;
	}

	public int getEndCount() {
		return endCount;
	}

	public void setEndCount(int endCount) {
		this.endCount = endCount;
	}

	public int getDbCount() {
		return dbCount;
	}

	public void setDbCount(int dbCount) {
		this.dbCount = dbCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getReqPage() {
		return reqPage;
	}

	public void setReqPage(int reqPage) {
		this.reqPage = reqPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
    
	
}
