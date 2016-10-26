package com.java.pojo;

import java.util.Date;

/**
 * 瀛樺偍琛� 璁板綍鍟嗗搧鍜岃揣鏋跺彿瀵瑰簲鍏崇郴
 *
 */
public class Store {

	private Long id;// 涓婚敭

	private String productLabel;// 鍟嗗搧鏍囩

	private String shelfNum;// 瀵瑰簲璐ф灦鍙凤紙A-06-02-02 A鍖�6鎺�2灞�2鍙凤紝浠�-鍙峰垎鍓诧級

	private Integer status;// 鐘舵�� 搴撳瓨涓� 宸插嚭搴�

	private Long warehouseId;// 浠撳簱id

	private Date addTime;// 娣诲姞鏃堕棿

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductLabel() {
		return productLabel;
	}

	public void setProductLabel(String productLabel) {
		this.productLabel = productLabel;
	}

	public String getShelfNum() {
		return shelfNum;
	}

	public void setShelfNum(String shelfNum) {
		this.shelfNum = shelfNum;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}


}
