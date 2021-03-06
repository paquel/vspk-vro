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

package net.nuagenetworks.vro.vspk.model.enums;

import net.nuagenetworks.vro.vspk.model.Constants;

import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.annotation.VsoProperty;

@VsoFinder(name = Constants.NATMAPENTRY_TYPE_ENUM, datasource = Constants.DATASOURCE, idAccessor = Constants.ID_ACCESSOR)
@VsoObject(strict = true)
public enum NATMapEntryType {

    MANY_TO_ONE_PAT("MANY_TO_ONE_PAT", "MANY_TO_ONE_PAT"), ONE_TO_MANY_PAT("ONE_TO_MANY_PAT", "ONE_TO_MANY_PAT"), ONE_TO_ONE_NAT("ONE_TO_ONE_NAT", "ONE_TO_ONE_NAT"), UNKNOWN("UNKNOWN", "UNKNOWN");

    private final String id;
    private final String name;
   
    NATMapEntryType(String id, String name) {
        this.id = id;
        this.name = name;
    }
   
    @VsoProperty(displayName = "Id", readOnly = true)
    public String getId() {
        return id;
    }
   
    @VsoProperty(displayName = "Name", readOnly = true)
    public String getName() {
        return name;
    }

    
    @VsoProperty(displayName = "MANY_TO_ONE_PAT", readOnly = true)
    public NATMapEntryType getMANY_TO_ONE_PAT() {
        return MANY_TO_ONE_PAT;
    }
    
    @VsoProperty(displayName = "ONE_TO_MANY_PAT", readOnly = true)
    public NATMapEntryType getONE_TO_MANY_PAT() {
        return ONE_TO_MANY_PAT;
    }
    
    @VsoProperty(displayName = "ONE_TO_ONE_NAT", readOnly = true)
    public NATMapEntryType getONE_TO_ONE_NAT() {
        return ONE_TO_ONE_NAT;
    }
    
    @VsoProperty(displayName = "UNKNOWN", readOnly = true)
    public NATMapEntryType getUNKNOWN() {
        return UNKNOWN;
    }
    

    public static NATMapEntryType getEnumById(String id) {
        for (NATMapEntryType item : values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
};