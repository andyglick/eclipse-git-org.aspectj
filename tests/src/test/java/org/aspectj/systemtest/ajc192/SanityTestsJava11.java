/*******************************************************************************
 * Copyright (c) 2006, 2018 Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *******************************************************************************/
package org.aspectj.systemtest.ajc192;

import org.aspectj.testing.XMLBasedAjcTestCase;
import org.aspectj.testing.XMLBasedAjcTestCaseForJava11OrLater;

import junit.framework.Test;

/*
 * Some very trivial tests that help verify things are OK.
 * These are a copy of the earlier Sanity Tests created for 1.6 but these supply the -11 option
 * to check code generation and modification with that version specified.
 *
 * @author Andy Clement
 */
public class SanityTestsJava11 extends XMLBasedAjcTestCaseForJava11OrLater {

	// Incredibly trivial test programs that check the compiler works at all (these are easy-ish to debug)
	public void testSimpleJava_A() {
		runTest("simple - a");
	}

	public void testSimpleJava_B() {
		runTest("simple - b");
	}

	public void testSimpleCode_C() {
		runTest("simple - c");
	}

	public void testSimpleCode_D() {
		runTest("simple - d");
	}

	public void testSimpleCode_E() {
		runTest("simple - e");
	}

	public void testSimpleCode_F() {
		runTest("simple - f");
	}

	public void testSimpleCode_G() {
		runTest("simple - g");
	}

	public void testSimpleCode_H() {
		runTest("simple - h", true);
	}

	public void testSimpleCode_I() {
		runTest("simple - i");
	}

	public void testVersionCorrect1() throws ClassNotFoundException {
		runTest("simple - j");
		checkVersion("A", 55, 0);
	}

	public void testVersionCorrect2() throws ClassNotFoundException {
		runTest("simple - k");
		checkVersion("A", 55, 0);
	}

	public void testVersionCorrect4() throws ClassNotFoundException { // check it is 49.0 when -1.5 is specified
		runTest("simple - m");
		checkVersion("A", 49, 0);
	}


	// ///////////////////////////////////////
	public static Test suite() {
		return XMLBasedAjcTestCase.loadSuite(SanityTestsJava11.class);
	}

	@Override
	protected java.net.URL getSpecFile() {
		return getClassResource("sanity-tests-11.xml");
	}

}
