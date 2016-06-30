/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.jira.configuration.plugin;

/**
 * Testing the addition of a servlet.
 */
public class GlobalPermissionsServlet extends AbstractPageServlet {

  private static final long serialVersionUID = -4704767395527396521L;

  @Override
  protected String getPageTemplateResourceURL() {
    return "/META-INF/pages/global_permissions.html";
  }

  @Override
  protected boolean isWebSudoNecessary() {
    return true;
  }
}
