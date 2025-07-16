package com.jagex;/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.game.cache.config.prefetch.Js5List;

public class IComponentDefinitionCollection {
    public boolean accessed;
    public IComponentDefinition[] componentDefinitions;
    IComponentDefinition[] refreshedComponentDefinitions;

    IComponentDefinitionCollection(boolean accessed, IComponentDefinition[] componentDefinitions) {
        this.componentDefinitions = componentDefinitions;
        this.accessed = accessed;
    }

    public static void setInterfaceDefinitionSize() {
        IComponentDefinition.getIComponentDefinitionCollections = new IComponentDefinitionCollection[Js5List.JS5_INTERFACE.getContainerLength()];
        IComponentDefinition.interfaceComponentsExists = new boolean[Js5List.JS5_INTERFACE.getContainerLength()];
    }

    public static IComponentDefinitionCollection get(int interfaceID, int[] keys, IComponentDefinitionCollection IComponentDefinitionCollection, boolean accessed) {
        if (!Js5List.JS5_INTERFACE.loadContainer(interfaceID))
            return null;
        int interfaceFileCount = Js5List.JS5_INTERFACE.getFileSystem(interfaceID);
        IComponentDefinition[] componentDefinitions;
        if (interfaceFileCount == 0) {
            componentDefinitions = new IComponentDefinition[0];
        } else if (IComponentDefinitionCollection == null) {
            componentDefinitions = new IComponentDefinition[interfaceFileCount];
        } else {
            componentDefinitions = IComponentDefinitionCollection.componentDefinitions;
        }
        if (IComponentDefinitionCollection == null)
            IComponentDefinitionCollection = new IComponentDefinitionCollection(accessed, componentDefinitions);
        else {
            IComponentDefinitionCollection.componentDefinitions = componentDefinitions;
            IComponentDefinitionCollection.accessed = accessed;
        }
        for (int componentID = 0; componentID < interfaceFileCount; componentID++) {
            if (IComponentDefinitionCollection.componentDefinitions[componentID] == null) {
                byte[] data = Js5List.JS5_INTERFACE.getFile(interfaceID, componentID, keys);
                if (null != data) {
                    IComponentDefinition component = (IComponentDefinitionCollection.componentDefinitions[componentID] = new IComponentDefinition());
                    component.interfaceHash = (componentID + (interfaceID << 16));
                    component.decode(new Buffer(data));
                }
            }
        }
        return IComponentDefinitionCollection;
    }

    public IComponentDefinition[] getComponentDefinitions() {
        return (this.refreshedComponentDefinitions == null ? this.componentDefinitions : this.refreshedComponentDefinitions);
    }

    public IComponentDefinition[] resetComponents() {
        if (this.refreshedComponentDefinitions == null) {
            int size = componentDefinitions.length;
            this.refreshedComponentDefinitions = new IComponentDefinition[size];
            System.arraycopy(componentDefinitions, 0, this.refreshedComponentDefinitions, 0, this.componentDefinitions.length);
        }
        return this.refreshedComponentDefinitions;
    }

    public IComponentDefinition componentWithinInterface(int interfaceHash) {
        if (componentDefinitions[0].interfaceHash >>> 16 != interfaceHash >>> 16)
            throw new IllegalArgumentException();
        return componentDefinitions[interfaceHash & 0xFFFF];
    }

}
