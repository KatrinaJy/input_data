package com.springboot.gradu.controller;



import com.springboot.gradu.data.dataobject.PubMrbsLog;
import com.springboot.gradu.data.dynamicdDatabases.DynamicDataSource;
import com.springboot.gradu.data.vo.TableModel;
import com.springboot.gradu.service.RZGLService;
import com.springboot.gradu.util.DateUtil;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@Controller
public class RZGLController {
	
	@Resource(name = "rzglService")
	private RZGLService rZGLServiceImpl;

	public void setrZGLServiceImpl(RZGLService rZGLServiceImpl) {
		this.rZGLServiceImpl = rZGLServiceImpl;
	}
	
	@RequestMapping(value="/search",method = RequestMethod.POST)
	@ResponseBody
	public TableModel<PubMrbsLog> search(@RequestParam String page,
										 @RequestParam String rows,HttpServletRequest request,
										 HttpServletResponse response) {

		int curPage = Integer.parseInt(page) -1;
		int pageSize = Integer.parseInt(rows);

		String fydm = request.getParameter("fydm");
		String type = request.getParameter("type");
		String endTime = request.getParameter("endTime");
		String startTime = request.getParameter("startTime");
		Date endDate = null;
		Date startDate = null;
		if(!(endTime == null || "".equals(endTime)) ){
			endDate = DateUtil.parse(endTime,DateUtil.webFormat);
		}
		if(!(startTime == null || "".equals(startTime))){
			startDate = DateUtil.parse(startTime,DateUtil.webFormat);
		}
//		ÇÐ»»Êý¾ÝÔ´£º
		DynamicDataSource.router("1");

		List<PubMrbsLog> list = rZGLServiceImpl.findCountBy(fydm);
		if (list != null){
			System.out.print(list.size());
		}

		Page<PubMrbsLog> pag =  rZGLServiceImpl.findByPage(fydm,type,startDate,endDate,curPage,pageSize);

		TableModel<PubMrbsLog> tab = new TableModel<PubMrbsLog>(pag.getTotalElements(),pag.getContent());

		return tab;

	}
	

}
