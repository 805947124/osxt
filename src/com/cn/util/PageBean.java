package com.cn.util;

import java.util.List;

public class PageBean<T> {
	
	private Integer currPage;		//��ǰҳ��
	private Integer limit;			//ÿҳ����
	private Integer totalCount;  	// ������
	private Integer totalPage;  	//��ҳ��
	private List<T> list;  			//��ǰҳ��¼
	
	public PageBean(int totalCount,Integer currPage,Integer limit){
		this.totalCount = totalCount;
		
		//ÿҳ����
		if(limit ==null||limit<1){
			limit=10;
		}
		//����ҳ��
		totalPage = this.totalCount/limit;
		if(this.totalCount/limit!=0)
			totalPage ++;
		
		//��ǰҳ��
		if(currPage ==null||currPage<1){
			currPage = 1;
		}
		
		if(currPage>totalPage){
			currPage=totalPage;
		}
		
		this.currPage = currPage;
		this.limit = limit;
	}

	public Integer getCurrPage() {
		return currPage;
	}

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
