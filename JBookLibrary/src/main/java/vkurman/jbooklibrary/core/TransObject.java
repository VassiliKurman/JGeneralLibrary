/*
 * Copyright 2018 Vassili Kurman
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vkurman.jbooklibrary.core;

/**
 * Primary use of TransObject class is to exchange references
 * for different class instances between different graphical user
 * interfaces.
 * 
 * <p>Date created: 2013.07.28
 * 
 * @author Vassili Kurman
 * @version 0.1
 */
public class TransObject {
	
	/**
	 * Object declaration.
	 */
	private Object object;
	
	/**
	 * Getter for object
	 * 
	 * @return Object
	 */
	public Object getObject() {
		return this.object;
	}
	
	/**
	 * Setter for object
	 * 
	 * @param object
	 */
	public void setObject(Object object) {
		this.object = object;
	}
}