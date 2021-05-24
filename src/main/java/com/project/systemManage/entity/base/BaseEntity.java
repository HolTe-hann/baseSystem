package com.project.systemManage.entity.base;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @ClassName: BaseEntity  
 * @Description: TODO(实体类的基类)  
 * @author hebinbin  
 * @date 2018年1月28日  
 *
 */
public abstract  class BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	//所属机构
	private String belongOrganId;
	
	//机构名称
    private String belongOrganName;	

	//创建时间
	private Date createT;
	
	//修改时间
	private Date updateT;
	
	//是否可用N表示不可用，Y表示可用
	private String enable="Y";
	
	/**是否为系统标志
	 * Y表示系统，用户不可以删除系统数据
	 * N表示非系统数据
    */
	private String systemData="Y";
    
    //创建人
	private String creatorId;
    
    //创建人名称
    private String creatorName;
    
    //修改人
	private String updaterId;
    
    //修改人名称
    private String updatorName;
		
	// 备注
	private String remark;
	

	public String getBelongOrganId() {
		return belongOrganId;
	}

	public void setBelongOrganId(String belongOrganId) {
		this.belongOrganId = belongOrganId;
	}

	public String getBelongOrganName() {
		return belongOrganName;
	}

	public void setBelongOrganName(String belongOrganName) {
		this.belongOrganName = belongOrganName;
	}

	public Date getCreateT() {
		return createT;
	}

	public void setCreateT(Date createT) {
		this.createT = createT;
	}

	public Date getUpdateT() {
		return updateT;
	}

	public void setUpdateT(Date updateT) {
		this.updateT = updateT;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getSystemData() {
		return systemData;
	}

	public void setSystemData(String systemData) {
		this.systemData = systemData;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getUpdaterId() {
		return updaterId;
	}

	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}

	public String getUpdatorName() {
		return updatorName;
	}

	public void setUpdatorName(String updatorName) {
		this.updatorName = updatorName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
	
	

	
	
	
}