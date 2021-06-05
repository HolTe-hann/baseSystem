package com.project.systemManage.entity.page;

public class PageVO {
	   private int   intPageSize=15; //一页显示的记录数    
	   private int   intRowCount=0;   //记录总数       
	   private int   intPageCount=0;  //总页数       
	   private int   intCurrentPage=1;  //当前显示页码
	   private int   startNum=0;    //每页的起始记录(mysql的limit n,m的起始位置是从0开始的)
	   private int   endNum=1;      //每页的结束记录
	   private boolean ajaxPage=false;    //是否是ajax分页

	   	//初始化方法三个参数分别是：记录总数，一页显示的记录数，待显示页码(不带查询条件的调用此方法初始化)
	    public void init(int rcount,int psize,int cPage){
	        intRowCount = rcount;
	        intPageSize = psize;
	        intCurrentPage=cPage;
	        intPageCount=(intRowCount+intPageSize-1)/intPageSize;//计算出总页数
	 
	        //如果要显示的页码大于总页数，则为显示最后一页
	        if(intCurrentPage > intPageCount){
	            intCurrentPage = intPageCount;
	        }
	        //如果要显示的页码小于总页数，则为显示第一页
	        if(intPageCount < 1){
	            intCurrentPage = 1;
	        }

	        //计算每页的起始记录和结尾记录
	        startNum=(intCurrentPage-1)*intPageSize;
	        endNum=startNum+intPageSize;
	        if(endNum>intRowCount)
	        	endNum=intRowCount;
	         
	    }
	    
	    public void init(int rcount){
	        intRowCount = rcount;

	        intPageCount=(intRowCount+intPageSize-1)/intPageSize;//计算出总页数
	 
	        //如果要显示的页码大于总页数，则为显示最后一页
	        if(intCurrentPage > intPageCount){
	            intCurrentPage = intPageCount;
	        }
	        //如果要显示的页码小于总页数，则为显示第一页
	        if(intPageCount < 1){
	            intCurrentPage = 1;
	        }

	        //计算每页的起始记录和结尾记录
	        startNum=(intCurrentPage-1)*intPageSize;
	        endNum=startNum+intPageSize;
	        if(endNum>intRowCount)
	        	endNum=intRowCount;
	         
	    }

	
	    
	    public boolean getAjaxPage() {
			return ajaxPage;
		}

		public void setAjaxPage(boolean ajaxPage) {
			this.ajaxPage = ajaxPage;
		}

		//返回起始记录
	    public int getStartNum()
	    {
	        return startNum;
	    }

	    //返回结尾记录
	    public int getEndNum()
	    {
	        return endNum;
	    }

	    //返回起始页    
	    public int getIntCurrentPage()
	    {
	        return intCurrentPage;
	    }
	    //设置起始页
	    public void setIntCurrentPage(int intCurrentPage)
	    {
	        this.intCurrentPage = intCurrentPage;
	    }
	    //返回总页数
	    public int getIntPageCount()
	    {
	        return intPageCount;
	    }
	    //返回总记录数
		public int getIntRowCount() {
			return intRowCount;
		}

		public int getIntPageSize() {
			return intPageSize;
		}

		public void setIntPageSize(int intPageSize) {
			this.intPageSize = intPageSize;
		}

		public void setIntRowCount(int intRowCount) {
			this.intRowCount = intRowCount;
		}

		public void setIntPageCount(int intPageCount) {
			this.intPageCount = intPageCount;
		}

		public void setStartNum(int startNum) {
			this.startNum = startNum;
		}

		public void setEndNum(int endNum) {
			this.endNum = endNum;
		}

	}