/*
 * Sonar Objective-C Plugin
 * Copyright (C) 2012 OCTO Technology, Backelite
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
package org.sonar.plugins.objectivec.colorizer;

import java.util.List;

import org.sonar.api.web.CodeColorizerFormat;
import org.sonar.colorizer.*;
import org.sonar.objectivec.api.ObjectiveCKeyword;
import org.sonar.plugins.objectivec.core.ObjectiveC;

import java.util.ArrayList;
import java.util.List;

public class ObjectiveCColorizerFormat extends CodeColorizerFormat {

    public ObjectiveCColorizerFormat() {
        super(ObjectiveC.KEY);
    }

    @Override
    public List<Tokenizer> getTokenizers() {
        return new ArrayList<Tokenizer>();
    }

}
