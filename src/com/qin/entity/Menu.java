package com.qin.entity;

public class Menu {
	private Integer menuid;
	
	private String menuNo;
	
	private String menuParentNo;
	
	private Integer menuOrder;
	
	private String menuName;
	
	private String menuUrl;
	
	private Integer isVisible;

	public Integer getMenuid() {
		return menuid;
	}

	public void setMenuid(Integer menuid) {
		this.menuid = menuid;
	}

	public String getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}

	public String getMenuParentNo() {
		return menuParentNo;
	}

	public void setMenuParentNo(String menuParentNo) {
		this.menuParentNo = menuParentNo;
	}

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public Integer getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(Integer isVisible) {
		this.isVisible = isVisible;
	}
	
}
