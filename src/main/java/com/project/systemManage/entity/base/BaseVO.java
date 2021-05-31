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
public abstract  class BaseVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	//所属机构
	private String belongOrganId;
	
	//机构名称
    private String belongOrganName;	

	//创建时间
	private Date createTime;
	
	//修改时间
	private Date updateTime;
	
	//是否可用N表示不可用，Y表示可用
	private String enable="Y";
	
	/**是否为系统标志
	 * Y表示系统，用户不可以删除系统数据
	 * N表示非系统数据
    */
	private String systemSign ="Y";
    
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getSystemSign() {
		return systemSign;
	}

	public void setSystemSign(String systemSign) {
		this.systemSign = systemSign;
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