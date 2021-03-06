/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://oss.oracle.com/licenses/CDDL+GPL-1.1
 * or LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

/**
 * API for programmatic invocation of XJC and schemagen.
 *
 * <p>
 * This package provides a way to invoke XJC from within another program. The primary target of this API is the JAX-WS
 * RI, but we hope that this API would be useful for other integration purposes as well.
 *
 * <h2>Getting Started: Using XJC</h2>
 * <p>
 * To invoke XJC, a typical client would do something like this:
 * <pre>
 *    SchemaCompiler sc = XJC.createSchemaCompiler();
 *    sc.parseSchema(new InputSource(schema1Url.toExternalForm()));
 *    sc.parseSchema(new InputSource(schema2Url.toExternalForm()));
 *    ...
 *    S2JModel model = sc.bind();
 * </pre>
 * <p>
 * The bind operation causes XJC to do the bulk of the work, such as figuring out what classes to generate, what
 * methods/fields to generate, etc. The obtained model contains useful introspective information about how the binding
 * was performed (such as the mapping between XML types and generated Java classes)
 *
 * <p>
 * Once the model is obtained, generate the code into the file system as follows:
 * <pre>
 *   JCodeModel cm = model.generateCode( null, ... );
 *   cm.build(new FileCodeWriter(outputDir));
 * </pre>
 *
 * <h2>Implementation Note</h2>
 * <p>
 * This package shouldn't contain any implementation code.
 */
package com.sun.tools.xjc.api;
