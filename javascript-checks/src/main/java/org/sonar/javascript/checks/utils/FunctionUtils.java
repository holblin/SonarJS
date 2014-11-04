/*
 * SonarQube JavaScript Plugin
 * Copyright (C) 2011 SonarSource and Eriks Nukis
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.javascript.checks.utils;

import org.sonar.javascript.parser.EcmaScriptGrammar;
import org.sonar.sslr.grammar.GrammarRuleKey;

import java.util.Arrays;

public class FunctionUtils {

  private FunctionUtils() {
  }

  public static final GrammarRuleKey[] FUNCTION_NODES = {
    EcmaScriptGrammar.FUNCTION_EXPRESSION,
    EcmaScriptGrammar.FUNCTION_DECLARATION,
    EcmaScriptGrammar.METHOD,
    EcmaScriptGrammar.GENERATOR_METHOD,
    EcmaScriptGrammar.GENERATOR_DECLARATION,
    EcmaScriptGrammar.GENERATOR_EXPRESSION,
    EcmaScriptGrammar.ARROW_FUNCTION,
    EcmaScriptGrammar.ARROW_FUNCTION_NO_IN};

  public static GrammarRuleKey[] getFunctionNodes() {
    return Arrays.copyOf(FUNCTION_NODES, FUNCTION_NODES.length);
  }
}
