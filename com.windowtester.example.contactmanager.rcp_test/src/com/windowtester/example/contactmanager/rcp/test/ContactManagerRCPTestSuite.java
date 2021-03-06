/*******************************************************************************
 *
 *   Copyright (c) 2012 Google, Inc.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   Google, Inc. - initial API and implementation
 *******************************************************************************/

package com.windowtester.example.contactmanager.rcp.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ContactManagerRCPTestSuite {
	
	public static Test suite() {
		TestSuite suite = new TestSuite("Test ContactManagerRCP");
		suite.addTestSuite(NewEntryTest.class);
		
		return suite;

	}

}
