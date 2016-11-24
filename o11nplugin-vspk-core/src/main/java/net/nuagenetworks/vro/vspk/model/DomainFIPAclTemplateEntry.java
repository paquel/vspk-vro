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
import net.nuagenetworks.vro.vspk.model.fetchers.GlobalMetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.fetchers.MetadatasFetcher;

import net.nuagenetworks.vro.vspk.model.enums.DomainFIPAclTemplateEntryAction;

import net.nuagenetworks.vro.vspk.model.enums.DomainFIPAclTemplateEntryAssociatedApplicationObjectType;

import net.nuagenetworks.vro.vspk.model.enums.DomainFIPAclTemplateEntryDestinationType;

import net.nuagenetworks.vro.vspk.model.enums.DomainFIPAclTemplateEntryEntityScope;

import net.nuagenetworks.vro.vspk.model.enums.DomainFIPAclTemplateEntryLocationType;

import net.nuagenetworks.vro.vspk.model.enums.DomainFIPAclTemplateEntryNetworkType;

import net.nuagenetworks.vro.vspk.model.enums.DomainFIPAclTemplateEntryPolicyState;

import net.nuagenetworks.vro.vspk.model.enums.DomainFIPAclTemplateEntrySourceType;
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

@VsoFinder(name = Constants.DOMAINFIPACLTEMPLATEENTRY, datasource = Constants.DATASOURCE, image = Constants.DOMAINFIPACLTEMPLATEENTRY_IMAGE_FILENAME, idAccessor = Constants.ID_ACCESSOR, relations = {
        @VsoRelation(inventoryChildren = true, name = Constants.METADATAS_FETCHER, type = Constants.METADATAS_FETCHER)
})
@VsoObject(create = false, strict = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "egressdomainfloatingipaclentrytemplate", resourceName = "egressdomainfloatingipaclentrytemplates")
public class DomainFIPAclTemplateEntry extends BaseObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty(value = "ACLTemplateName")
    protected String ACLTemplateName;
    
    @JsonProperty(value = "DSCP")
    protected String DSCP;
    
    @JsonProperty(value = "ICMPCode")
    protected String ICMPCode;
    
    @JsonProperty(value = "ICMPType")
    protected String ICMPType;
    
    @JsonProperty(value = "action")
    protected DomainFIPAclTemplateEntryAction action;
    
    @JsonProperty(value = "actionDetails")
    protected Object actionDetails;
    
    @JsonProperty(value = "addressOverride")
    protected String addressOverride;
    
    @JsonProperty(value = "associatedApplicationID")
    protected String associatedApplicationID;
    
    @JsonProperty(value = "associatedApplicationObjectID")
    protected String associatedApplicationObjectID;
    
    @JsonProperty(value = "associatedApplicationObjectType")
    protected DomainFIPAclTemplateEntryAssociatedApplicationObjectType associatedApplicationObjectType;
    
    @JsonProperty(value = "associatedLiveEntityID")
    protected String associatedLiveEntityID;
    
    @JsonProperty(value = "description")
    protected String description;
    
    @JsonProperty(value = "destPgId")
    protected String destPgId;
    
    @JsonProperty(value = "destPgType")
    protected String destPgType;
    
    @JsonProperty(value = "destinationPort")
    protected String destinationPort;
    
    @JsonProperty(value = "destinationType")
    protected DomainFIPAclTemplateEntryDestinationType destinationType;
    
    @JsonProperty(value = "destinationValue")
    protected String destinationValue;
    
    @JsonProperty(value = "domainName")
    protected String domainName;
    
    @JsonProperty(value = "enterpriseName")
    protected String enterpriseName;
    
    @JsonProperty(value = "entityScope")
    protected DomainFIPAclTemplateEntryEntityScope entityScope;
    
    @JsonProperty(value = "etherType")
    protected String etherType;
    
    @JsonProperty(value = "externalID")
    protected String externalID;
    
    @JsonProperty(value = "flowLoggingEnabled")
    protected Boolean flowLoggingEnabled;
    
    @JsonProperty(value = "lastUpdatedBy")
    protected String lastUpdatedBy;
    
    @JsonProperty(value = "locationID")
    protected String locationID;
    
    @JsonProperty(value = "locationType")
    protected DomainFIPAclTemplateEntryLocationType locationType;
    
    @JsonProperty(value = "mirrorDestinationID")
    protected String mirrorDestinationID;
    
    @JsonProperty(value = "networkID")
    protected String networkID;
    
    @JsonProperty(value = "networkType")
    protected DomainFIPAclTemplateEntryNetworkType networkType;
    
    @JsonProperty(value = "policyState")
    protected DomainFIPAclTemplateEntryPolicyState policyState;
    
    @JsonProperty(value = "priority")
    protected Long priority;
    
    @JsonProperty(value = "protocol")
    protected String protocol;
    
    @JsonProperty(value = "reflexive")
    protected Boolean reflexive;
    
    @JsonProperty(value = "sourcePgId")
    protected String sourcePgId;
    
    @JsonProperty(value = "sourcePgType")
    protected String sourcePgType;
    
    @JsonProperty(value = "sourcePort")
    protected String sourcePort;
    
    @JsonProperty(value = "sourceType")
    protected DomainFIPAclTemplateEntrySourceType sourceType;
    
    @JsonProperty(value = "sourceValue")
    protected String sourceValue;
    
    @JsonProperty(value = "stateful")
    protected Boolean stateful;
    
    @JsonProperty(value = "statsID")
    protected String statsID;
    
    @JsonProperty(value = "statsLoggingEnabled")
    protected Boolean statsLoggingEnabled;
    
    @JsonIgnore
    private GlobalMetadatasFetcher globalMetadatas;
    
    @JsonIgnore
    private MetadatasFetcher metadatas;
    
    @VsoConstructor
    public DomainFIPAclTemplateEntry() {
        globalMetadatas = new GlobalMetadatasFetcher(this);
        
        metadatas = new MetadatasFetcher(this);
        }

    @VsoProperty(displayName = "Session", readOnly = true)
    public Session getSession() {
        return (Session) super.getSession();
    }
    @VsoProperty(displayName = "Name", readOnly = false)
    public String getName() {
        return getId();
    }
    @VsoProperty(displayName = "RestName", readOnly = true)
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
    @VsoProperty(displayName = "ACLTemplateName", readOnly = false)   
    public String getACLTemplateName() {
       return ACLTemplateName;
    }

    @JsonIgnore
    public void setACLTemplateName(String value) { 
        this.ACLTemplateName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DSCP", readOnly = false)   
    public String getDSCP() {
       return DSCP;
    }

    @JsonIgnore
    public void setDSCP(String value) { 
        this.DSCP = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ICMPCode", readOnly = false)   
    public String getICMPCode() {
       return ICMPCode;
    }

    @JsonIgnore
    public void setICMPCode(String value) { 
        this.ICMPCode = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ICMPType", readOnly = false)   
    public String getICMPType() {
       return ICMPType;
    }

    @JsonIgnore
    public void setICMPType(String value) { 
        this.ICMPType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Action", readOnly = false)   
    public DomainFIPAclTemplateEntryAction getAction() {
       return action;
    }

    @JsonIgnore
    public void setAction(DomainFIPAclTemplateEntryAction value) { 
        this.action = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "ActionDetails", readOnly = false)   
    public Object getActionDetails() {
       return actionDetails;
    }

    @JsonIgnore
    public void setActionDetails(Object value) { 
        this.actionDetails = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AddressOverride", readOnly = false)   
    public String getAddressOverride() {
       return addressOverride;
    }

    @JsonIgnore
    public void setAddressOverride(String value) { 
        this.addressOverride = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedApplicationID", readOnly = false)   
    public String getAssociatedApplicationID() {
       return associatedApplicationID;
    }

    @JsonIgnore
    public void setAssociatedApplicationID(String value) { 
        this.associatedApplicationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedApplicationObjectID", readOnly = false)   
    public String getAssociatedApplicationObjectID() {
       return associatedApplicationObjectID;
    }

    @JsonIgnore
    public void setAssociatedApplicationObjectID(String value) { 
        this.associatedApplicationObjectID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedApplicationObjectType", readOnly = false)   
    public DomainFIPAclTemplateEntryAssociatedApplicationObjectType getAssociatedApplicationObjectType() {
       return associatedApplicationObjectType;
    }

    @JsonIgnore
    public void setAssociatedApplicationObjectType(DomainFIPAclTemplateEntryAssociatedApplicationObjectType value) { 
        this.associatedApplicationObjectType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "AssociatedLiveEntityID", readOnly = false)   
    public String getAssociatedLiveEntityID() {
       return associatedLiveEntityID;
    }

    @JsonIgnore
    public void setAssociatedLiveEntityID(String value) { 
        this.associatedLiveEntityID = value;
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
    @VsoProperty(displayName = "DestPgId", readOnly = false)   
    public String getDestPgId() {
       return destPgId;
    }

    @JsonIgnore
    public void setDestPgId(String value) { 
        this.destPgId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestPgType", readOnly = false)   
    public String getDestPgType() {
       return destPgType;
    }

    @JsonIgnore
    public void setDestPgType(String value) { 
        this.destPgType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationPort", readOnly = false)   
    public String getDestinationPort() {
       return destinationPort;
    }

    @JsonIgnore
    public void setDestinationPort(String value) { 
        this.destinationPort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationType", readOnly = false)   
    public DomainFIPAclTemplateEntryDestinationType getDestinationType() {
       return destinationType;
    }

    @JsonIgnore
    public void setDestinationType(DomainFIPAclTemplateEntryDestinationType value) { 
        this.destinationType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DestinationValue", readOnly = false)   
    public String getDestinationValue() {
       return destinationValue;
    }

    @JsonIgnore
    public void setDestinationValue(String value) { 
        this.destinationValue = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "DomainName", readOnly = false)   
    public String getDomainName() {
       return domainName;
    }

    @JsonIgnore
    public void setDomainName(String value) { 
        this.domainName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EnterpriseName", readOnly = false)   
    public String getEnterpriseName() {
       return enterpriseName;
    }

    @JsonIgnore
    public void setEnterpriseName(String value) { 
        this.enterpriseName = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EntityScope", readOnly = false)   
    public DomainFIPAclTemplateEntryEntityScope getEntityScope() {
       return entityScope;
    }

    @JsonIgnore
    public void setEntityScope(DomainFIPAclTemplateEntryEntityScope value) { 
        this.entityScope = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "EtherType", readOnly = false)   
    public String getEtherType() {
       return etherType;
    }

    @JsonIgnore
    public void setEtherType(String value) { 
        this.etherType = value;
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
    @VsoProperty(displayName = "FlowLoggingEnabled", readOnly = false)   
    public Boolean getFlowLoggingEnabled() {
       return flowLoggingEnabled;
    }

    @JsonIgnore
    public void setFlowLoggingEnabled(Boolean value) { 
        this.flowLoggingEnabled = value;
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
    @VsoProperty(displayName = "LocationID", readOnly = false)   
    public String getLocationID() {
       return locationID;
    }

    @JsonIgnore
    public void setLocationID(String value) { 
        this.locationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "LocationType", readOnly = false)   
    public DomainFIPAclTemplateEntryLocationType getLocationType() {
       return locationType;
    }

    @JsonIgnore
    public void setLocationType(DomainFIPAclTemplateEntryLocationType value) { 
        this.locationType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "MirrorDestinationID", readOnly = false)   
    public String getMirrorDestinationID() {
       return mirrorDestinationID;
    }

    @JsonIgnore
    public void setMirrorDestinationID(String value) { 
        this.mirrorDestinationID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkID", readOnly = false)   
    public String getNetworkID() {
       return networkID;
    }

    @JsonIgnore
    public void setNetworkID(String value) { 
        this.networkID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "NetworkType", readOnly = false)   
    public DomainFIPAclTemplateEntryNetworkType getNetworkType() {
       return networkType;
    }

    @JsonIgnore
    public void setNetworkType(DomainFIPAclTemplateEntryNetworkType value) { 
        this.networkType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "PolicyState", readOnly = false)   
    public DomainFIPAclTemplateEntryPolicyState getPolicyState() {
       return policyState;
    }

    @JsonIgnore
    public void setPolicyState(DomainFIPAclTemplateEntryPolicyState value) { 
        this.policyState = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Priority", readOnly = false)   
    public Long getPriority() {
       return priority;
    }

    @JsonIgnore
    public void setPriority(Long value) { 
        this.priority = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Protocol", readOnly = false)   
    public String getProtocol() {
       return protocol;
    }

    @JsonIgnore
    public void setProtocol(String value) { 
        this.protocol = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Reflexive", readOnly = false)   
    public Boolean getReflexive() {
       return reflexive;
    }

    @JsonIgnore
    public void setReflexive(Boolean value) { 
        this.reflexive = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourcePgId", readOnly = false)   
    public String getSourcePgId() {
       return sourcePgId;
    }

    @JsonIgnore
    public void setSourcePgId(String value) { 
        this.sourcePgId = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourcePgType", readOnly = false)   
    public String getSourcePgType() {
       return sourcePgType;
    }

    @JsonIgnore
    public void setSourcePgType(String value) { 
        this.sourcePgType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourcePort", readOnly = false)   
    public String getSourcePort() {
       return sourcePort;
    }

    @JsonIgnore
    public void setSourcePort(String value) { 
        this.sourcePort = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourceType", readOnly = false)   
    public DomainFIPAclTemplateEntrySourceType getSourceType() {
       return sourceType;
    }

    @JsonIgnore
    public void setSourceType(DomainFIPAclTemplateEntrySourceType value) { 
        this.sourceType = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "SourceValue", readOnly = false)   
    public String getSourceValue() {
       return sourceValue;
    }

    @JsonIgnore
    public void setSourceValue(String value) { 
        this.sourceValue = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Stateful", readOnly = false)   
    public Boolean getStateful() {
       return stateful;
    }

    @JsonIgnore
    public void setStateful(Boolean value) { 
        this.stateful = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsID", readOnly = false)   
    public String getStatsID() {
       return statsID;
    }

    @JsonIgnore
    public void setStatsID(String value) { 
        this.statsID = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "StatsLoggingEnabled", readOnly = false)   
    public Boolean getStatsLoggingEnabled() {
       return statsLoggingEnabled;
    }

    @JsonIgnore
    public void setStatsLoggingEnabled(Boolean value) { 
        this.statsLoggingEnabled = value;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "GlobalMetadatas", readOnly = true)   
    public GlobalMetadatasFetcher getGlobalMetadatas() {
        return globalMetadatas;
    }
    
    @JsonIgnore
    @VsoProperty(displayName = "Metadatas", readOnly = true)   
    public MetadatasFetcher getMetadatas() {
        return metadatas;
    }
    @VsoMethod
    public void fetch(Session session) throws RestException {
        super.fetch(session);
    }

    @VsoMethod
    public void save(Session session, Integer responseChoice) throws RestException {
        super.save(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAINFIPACLTEMPLATEENTRY, getId());
        }
    }

    @VsoMethod
    public void delete(Session session, Integer responseChoiceObj) throws RestException {
        int responseChoice = (responseChoiceObj != null) ? responseChoiceObj.intValue() : 1;
        super.delete(session, responseChoice);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementDeleted(Constants.DOMAINFIPACLTEMPLATEENTRY, getId());
        }
    }
    @VsoMethod
    public void assignGlobalMetadatas(Session session, GlobalMetadata[] childRestObjs, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.assign(session, java.util.Arrays.asList(childRestObjs), commit);
        if (!session.getNotificationsEnabled()) { 
           SessionManager.getInstance().notifyElementUpdated(Constants.DOMAINFIPACLTEMPLATEENTRY, getId());
        }
    }
    
    @VsoMethod
    public void createGlobalMetadata(Session session, GlobalMetadata childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.GLOBALMETADATAS_FETCHER, getId());
        }
    }
    @VsoMethod
    public void createMetadata(Session session, Metadata childRestObj, Integer responseChoice, Boolean commitObj) throws RestException {
        boolean commit = (commitObj != null) ? commitObj.booleanValue() : true;
        super.createChild(session, childRestObj, responseChoice, commit);
        if (!session.getNotificationsEnabled()) {
           SessionManager.getInstance().notifyElementInvalidate(Constants.METADATAS_FETCHER, getId());
        }
    }public String toString() {
        return "DomainFIPAclTemplateEntry [" + "ACLTemplateName=" + ACLTemplateName + ", DSCP=" + DSCP + ", ICMPCode=" + ICMPCode + ", ICMPType=" + ICMPType + ", action=" + action + ", actionDetails=" + actionDetails + ", addressOverride=" + addressOverride + ", associatedApplicationID=" + associatedApplicationID + ", associatedApplicationObjectID=" + associatedApplicationObjectID + ", associatedApplicationObjectType=" + associatedApplicationObjectType + ", associatedLiveEntityID=" + associatedLiveEntityID + ", description=" + description + ", destPgId=" + destPgId + ", destPgType=" + destPgType + ", destinationPort=" + destinationPort + ", destinationType=" + destinationType + ", destinationValue=" + destinationValue + ", domainName=" + domainName + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", etherType=" + etherType + ", externalID=" + externalID + ", flowLoggingEnabled=" + flowLoggingEnabled + ", lastUpdatedBy=" + lastUpdatedBy + ", locationID=" + locationID + ", locationType=" + locationType + ", mirrorDestinationID=" + mirrorDestinationID + ", networkID=" + networkID + ", networkType=" + networkType + ", policyState=" + policyState + ", priority=" + priority + ", protocol=" + protocol + ", reflexive=" + reflexive + ", sourcePgId=" + sourcePgId + ", sourcePgType=" + sourcePgType + ", sourcePort=" + sourcePort + ", sourceType=" + sourceType + ", sourceValue=" + sourceValue + ", stateful=" + stateful + ", statsID=" + statsID + ", statsLoggingEnabled=" + statsLoggingEnabled + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
                 + lastUpdatedDate + ", owner=" + owner  + "]";
    }
}