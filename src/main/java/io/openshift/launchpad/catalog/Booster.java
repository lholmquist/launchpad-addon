/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package io.openshift.launchpad.catalog;

import java.beans.Transient;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * A quickstart representation
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public class Booster
{
   private String id;
   private String githubRepo;
   private String gitRef;
   private String description = "No description available";
   private String boosterDescriptorPath = ".openshiftio/booster.yaml";
   private String missionId;

   private Map<String, Object> metadata = Collections.emptyMap();

   public String getName()
   {
      return Objects.toString(getMetadata().get("name"), getId());
   }

   public String getDescription()
   {
      return Objects.toString(getMetadata().get("description"), description);
   }

   /**
    * @return the boosterDescriptionPath
    */
   public String getBoosterDescriptionPath()
   {
      return Objects.toString(getMetadata().get("descriptionPath"), ".openshiftio/description.adoc");
   }

   /**
    * @return the id
    */
   public String getId()
   {
      return id;
   }

   /**
    * @return the githubRepo
    */
   public String getGithubRepo()
   {
      return githubRepo;
   }

   /**
    * @return the gitRef
    */
   public String getGitRef()
   {
      return gitRef;
   }

   /**
    * @return the boosterDescriptorPath
    */
   @Transient
   public String getBoosterDescriptorPath()
   {
      return boosterDescriptorPath;
   }

   /**
    * @param id the id to set
    */
   public void setId(String id)
   {
      this.id = id;
   }

   /**
    * @param githubRepo the githubRepo to set
    */
   public void setGithubRepo(String githubRepo)
   {
      this.githubRepo = githubRepo;
   }

   /**
    * @param gitRef the gitRef to set
    */
   public void setGitRef(String gitRef)
   {
      this.gitRef = gitRef;
   }

   /**
    * @param boosterDescriptorPath the obsidianDescriptorPath to set
    */
   public void setBoosterDescriptorPath(String boosterDescriptorPath)
   {
      this.boosterDescriptorPath = boosterDescriptorPath;
   }

   /**
    * @param description the description to set
    */
   public void setDescription(String description)
   {
      this.description = description;
   }

   /**
    * @param missionId the missionId to set
    */
   public void setMissionId(String missionId)
   {
      this.missionId = missionId;
   }

   /**
    * @return the missionId
    */
   public String getMissionId()
   {
      return missionId;
   }

   /**
    * @return the metadata
    */
   public Map<String, Object> getMetadata()
   {
      return metadata;
   }

   /**
    * @param metadata the metadata to set
    */
   public void setMetadata(Map<String, Object> metadata)
   {
      this.metadata = metadata;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((gitRef == null) ? 0 : gitRef.hashCode());
      result = prime * result + ((githubRepo == null) ? 0 : githubRepo.hashCode());
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      result = prime * result + ((boosterDescriptorPath == null) ? 0 : boosterDescriptorPath.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Booster other = (Booster) obj;
      if (gitRef == null)
      {
         if (other.gitRef != null)
            return false;
      }
      else if (!gitRef.equals(other.gitRef))
         return false;
      if (githubRepo == null)
      {
         if (other.githubRepo != null)
            return false;
      }
      else if (!githubRepo.equals(other.githubRepo))
         return false;
      if (id == null)
      {
         if (other.id != null)
            return false;
      }
      else if (!id.equals(other.id))
         return false;
      if (boosterDescriptorPath == null)
      {
         if (other.boosterDescriptorPath != null)
            return false;
      }
      else if (!boosterDescriptorPath.equals(other.boosterDescriptorPath))
         return false;
      return true;
   }

   @Override
   public String toString()
   {
      return "Booster [githubRepo=" + githubRepo + ", gitRef=" + gitRef + ", obsidianDescriptorPath="
               + boosterDescriptorPath + ", metadata=" + metadata + ", getName()=" + getName() + ", getDescription()="
               + getDescription() + "]";
   }
}
