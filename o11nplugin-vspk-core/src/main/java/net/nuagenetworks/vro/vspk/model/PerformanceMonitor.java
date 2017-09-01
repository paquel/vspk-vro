/*
  Copyright (c) 2015, Alcatel-Lucent Inc
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are met:
      * Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
      * Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
      * Neither the name of the copyright holder nor the names of its contributors
        may be used to endorse or promote products derived from this software without
        specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package net.nuagenetworks.vro.vspk.model;
import net.nuagenetworks.vro.vspk.model.fetchers.ApplicationperformancemanagementsFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.NSGatewaysFetcher;

import net.nuagenetworks.vro.vspk.model.enums.PerformanceMonitorEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.PerformanceMonitorProbeType;

import net.nuagenetworks.vro.vspk.model.enums.PerformanceMonitorServiceClass;
import net.nuagenetworks.bambou.RestException;
import net.nuagenetworks.bambou.annotation.RestEntity;
import net.nuagenetworks.vro.model.BaseObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vmware.o11n.plugin.sdk.annotation.VsoConstructor;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;
import com.vmware.o11n.plugin.sdk.annotation.VsoRelation;

@VsoFinder(name = Constants.PERFORMANCEMONITOR, datasource = Constants.DATASOURCE, image = Constants.PERFORMANCEMONITOR_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "performancemonitor", resourceName = "performancemonitors")
public class PerformanceMonitor extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "destinationTargetList")
    protected java.util.List<String> destinationTargetList;
    
    @JsonProperty(value = "downThresholdCount")
    protected Long downThresholdCount;
    
    @JsonProperty(value = "entityScope")
    protected PerformanceMonitorEntityScope entityScope;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "interval")
    protected Long interval;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "name")
    protected String name;
    
    @JsonProperty(value = "numberOfPackets")
    protected Long numberOfPackets;
    
    @JsonProperty(value = "payloadSize")
    protected Long payloadSize;
    
    @JsonProperty(value = "probeType")
    protected PerformanceMonitorProbeType probeType;
    
    @JsonProperty(value = "readOnly")
    protected Boolean readOnly;
    
    @JsonProperty(value = "serviceClass")
    protected PerformanceMonitorServiceClass serviceClass;
    
    @JsonProperty(value = "timeout")
    protected Long timeout;
    
    @JsonIgnore
    private ApplicationperformancemanagementsFetcher applicationperformancemanagements;
    
    @JsonIgnore
    private NSGatewaysFetcher nSGateways;
    
    @VsoConstructor
    public PerformanceMonitor() {
        applicationperformancemanagements = new ApplicationperformancemanagementsFetcher(this);
        
        nSGateways = new NSGatewaysFetcher(this);
        }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }@VsoProperty(displayName = "RestName", readOnly = true)
    public String getRestName() {
        return super.getRestName();
    }
    @VsoProperty(displayName = "Id", readOnly = false)
    public String getId() {
        return super.getId();
    }
    @VsoProperty(displayName = "ParentId", readOnly = false)
    public String getParentId() {
        return super.getParentId();
    }

    @VsoProperty(displayName = "ParentType", readOnly = false)
    public String getParentType() {
        return super.getParentType();
    }

    @VsoProperty(displayName = "CreationDate", readOnly = false)
    public String getCreationDate() {
        return super.getCreationDate();
    }

    @VsoProperty(displayName = "UpdatedDate", readOnly = false)
    public String getLastUpdatedDate() {
        return super.getLastUpdatedDate();
    }

    @VsoProperty(displayName = "Owner", readOnly = false)
    public String getOwner() {
        return super.getOwner();
    }
    @JsonIgnore
    @VsoProperty(displayName = "Description", readOnly = false)   
    public String getDescription() {
       return description;
    }

    @JsonIgnore
    public void setDescription(String value) { 
        this.description = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationTargetList", readOnly = false)   
    public java.util.List<String> getDestinationTargetList() {
       return destinationTargetList;
    }

    @JsonIgnore
    public void setDestinationTargetList(java.util.List<String> value) { 
        this.destinationTargetList = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DownThresholdCount", readOnly = false)   
    public Long getDownThresholdCount() {
       return downThresholdCount;
    }

    @JsonIgnore
    public void setDownThresholdCount(Long value) { 
        this.downThresholdCount = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public PerformanceMonitorEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(PerformanceMonitorEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ExternalID", readOnly = false)   
    public String getExternalID() {
       return externalID;
    }

    @JsonIgnore
    public void setExternalID(String value) { 
        this.externalID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Interval", readOnly = false)   
    public Long getInterval() {
       return interval;
    }

    @JsonIgnore
    public void setInterval(Long value) { 
        this.interval = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LastUpdatedBy", readOnly = false)   
    public String getLastUpdatedBy() {
       return lastUpdatedBy;
    }

    @JsonIgnore
    public void setLastUpdatedBy(String value) { 
        this.lastUpdatedBy = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Name", readOnly = false)   
    public String getName() {
       return name;
    }

    @JsonIgnore
    public void setName(String value) { 
        this.name = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NumberOfPackets", readOnly = false)   
    public Long getNumberOfPackets() {
       return numberOfPackets;
    }

    @JsonIgnore
    public void setNumberOfPackets(Long value) { 
        this.numberOfPackets = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PayloadSize", readOnly = false)   
    public Long getPayloadSize() {
       return payloadSize;
    }

    @JsonIgnore
    public void setPayloadSize(Long value) { 
        this.payloadSize = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ProbeType", readOnly = false)   
    public PerformanceMonitorProbeType getProbeType() {
       return probeType;
    }

    @JsonIgnore
    public void setProbeType(PerformanceMonitorProbeType value) { 
        this.probeType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ReadOnly", readOnly = false)   
    public Boolean getReadOnly() {
       return readOnly;
    }

    @JsonIgnore
    public void setReadOnly(Boolean value) { 
        this.readOnly = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ServiceClass", readOnly = false)   
    public PerformanceMonitorServiceClass getServiceClass() {
       return serviceClass;
    }

    @JsonIgnore
    public void setServiceClass(PerformanceMonitorServiceClass value) { 
        this.serviceClass = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Timeout", readOnly = false)   
    public Long getTimeout() {
       return timeout;
    }

    @JsonIgnore
    public void setTimeout(Long value) { 
        this.timeout = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Applicationperformancemanagements", readOnly = true)   
    public ApplicationperformancemanagementsFetcher getApplicationperformancemanagements() {
        return applicationperformancemanagements;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NSGateways", readOnly = true)   
    public NSGatewaysFetcher getNSGateways() {
        return nSGateways;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.PERFORMANCEMONITOR, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.PERFORMANCEMONITOR, getId());
        }
    }
    @VsoMethod
    public void assignNSGateways(Session session, NSGateway[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.PERFORMANCEMONITOR, getId());
        }
    }
    public String toString() {
        return "PerformanceMonitor [" + "description=" + description + ", destinationTargetList=" + destinationTargetList + ", downThresholdCount=" + downThresholdCount + ", entityScope=" + entityScope + ", externalID=" + externalID + ", interval=" + interval + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", numberOfPackets=" + numberOfPackets + ", payloadSize=" + payloadSize + ", probeType=" + probeType + ", readOnly=" + readOnly + ", serviceClass=" + serviceClass + ", timeout=" + timeout + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}