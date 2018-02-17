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

package vkurman.jbooklibrary.gui.components;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * General panel with close button that disposes parent window.
 * 
 * <p>Date created: 2013.07.28
 * 
 * @author Vassili Kurman
 * @version 0.1
 */
public class CloseButtonPanel extends JPanel {
	
	/**
	 * Generated serialVersionUID.
	 */
	private static final long serialVersionUID = 907003517495419031L;
	private JButton closeButton;
	private Window parent;
	
	/**
	 * Constructor.
	 * 
	 * @param window
	 */
	public CloseButtonPanel(Window window){
		parent = window;
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		closeButton = new JButton("Close");
		closeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				parent.dispose();
			}
		});
		add(closeButton);
	}
	
	/**
	 * Constructor.
	 * 
	 * @param window
	 * @param text
	 */
	public CloseButtonPanel(Window window, String text){
		parent = window;
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		closeButton = new JButton(text);
		closeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
				parent.dispose();
			}
		});
		add(closeButton);
	}
}