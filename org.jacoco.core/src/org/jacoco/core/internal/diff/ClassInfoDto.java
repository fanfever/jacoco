/*******************************************************************************
 * Copyright (c) 2009, 2023 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *
 *******************************************************************************/
package org.jacoco.core.internal.diff;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;

import static java.lang.System.out;

public class ClassInfoDto {
	/**
	 * java文件
	 */
	private String classFile;

	private String className;

	private String packages;

	/**
	 * 类中的方法
	 */
	private List<MethodInfoDto> methodInfos;

	/**
	 * 修改类型
	 */
	private String type;

	public String getClassFile() {
		if (Objects.isNull(packages) || Objects.isNull(className)) {
			return null;
		}
		return StringUtils.replace(packages, ".", "/") + "/" + className;
	}

	public void setClassFile(String classFile) {
		this.classFile = classFile;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPackages() {
		return packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}

	public List<MethodInfoDto> getMethodInfos() {
		return methodInfos;
	}

	public void setMethodInfos(List<MethodInfoDto> methodInfos) {
		this.methodInfos = methodInfos;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
