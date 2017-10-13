/*
* Copyright (C) 2017 ChenFei, All Rights Reserved
*
* This program is free software; you can redistribute it and/or modify it 
* under the terms of the GNU General Public License as published by the Free 
* Software Foundation; either version 3 of the License, or (at your option) 
* any later version.
*
* This program is distributed in the hope that it will be useful, but 
* WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
* or FITNESS FOR A PARTICULAR PURPOSE. 
* See the GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License along with
* this program; if not, see <http://www.gnu.org/licenses>.
*
* This code is available under licenses for commercial use. Please contact
* ChenFei for more information.
*
* http://www.gplgpu.com
* http://www.chenfei.me
*
* Title       :  Spring DDAL
* Author      :  Chen Fei
* Email       :  cn.fei.chen@qq.com
*
*/
package io.isharing.springddal.route.rule.conf;

import java.util.List;

public class DataSourceNode {
	
	private List<String> writeNodesNameList;
	private List<String> readNodesNameList;
	
//	private List<DataSource> writeNodes;
//	private List<DataSource> readNodes;

	public DataSourceNode(List<String> writeNodesNameList, List<String> readNodesNameList) {
		this.writeNodesNameList = writeNodesNameList;
		this.readNodesNameList = readNodesNameList;
	}
	
//	public DataSourceNode(List<DataSource> writeNodes, List<DataSource> readNodes) {
//		this.writeNodes = writeNodes;
//		this.readNodes = readNodes;
//	}

	public List<String> getWriteNodesNameList() {
		return writeNodesNameList;
	}

	public List<String> getReadNodesNameList() {
		return readNodesNameList;
	}

//	public List<DataSource> getWriteNodes() {
//		return writeNodes;
//	}
//
//	public List<DataSource> getReadNodes() {
//		return readNodes;
//	}
}
