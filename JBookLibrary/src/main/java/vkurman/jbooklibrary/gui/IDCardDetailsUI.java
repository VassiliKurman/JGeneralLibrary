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

package vkurman.jbooklibrary.gui;

import java.awt.BorderLayout;
import java.awt.Dialog;

import javax.swing.JDialog;
import javax.swing.JFrame;

import vkurman.jbooklibrary.core.IDCard;
import vkurman.jbooklibrary.gui.components.CloseButtonPanel;
import vkurman.jbooklibrary.gui.components.IDCardDetailsPanel;

/**
 * Dialog with details about IDCard.
 * 
 * <p>Date created: 2013.07.28
 * 
 *
 * @author Vassili Kurman
 * @version 0.1
 */
public class IDCardDetailsUI extends JDialog {

	private static final long serialVersionUID = -3629755861480374887L;
	private IDCard idCard;
	
	/**
	 * Counstructor.
	 * 
	 * @param idCard
	 */
	public IDCardDetailsUI(IDCard idCard) {
		this.idCard = idCard;
		
		showUI();
	}
	
	/**
	 * Creates and displays UI.
	 */
	private void showUI(){
		setTitle("Details of "+idCard.getUserName()+" IDCard: " + idCard.getCardID());
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		
		setLayout(new BorderLayout(10, 10));
		
		add(new IDCardDetailsPanel(idCard), BorderLayout.CENTER);
		add(new CloseButtonPanel(this), BorderLayout.PAGE_END);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}