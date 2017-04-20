/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package io.openshift.launchpad.ui.booster;

/**
 *
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public enum DeploymentType
{
   /**
    * Deploy as a ZIP file
    */
   ZIP("ZIP File"),
   /**
    * Deploy in Openshift
    */
   CONTINUOUS_DELIVERY("Continuous delivery");

   private String description;

   private DeploymentType(String description)
   {
      this.description = description;
   }

   public String getDescription()
   {
      return description;
   }
}