package com.jagex;/* Class390 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IComponentScripter {
    IComponentDefinitionCollection IComponentDefinitionCollection;
    IComponentDefinition componentDefinition;

    IComponentScripter() {

    }

    boolean clearComponent(IComponentDefinitionCollection IComponentDefinitionCollection, int componentID) {
        if (IComponentDefinitionCollection != null) {
            IComponentDefinition componentDefinition = IComponentDefinitionCollection.componentWithinInterface(componentID);
            if (componentDefinition != null) {
                this.IComponentDefinitionCollection = IComponentDefinitionCollection;
                this.componentDefinition = componentDefinition;
                return true;
            }
        }
        clear();
        return false;
    }

    boolean containerComponentExists(int interfaceHash, int childIndex) {
        IComponentDefinition componentDefinition = IComponentDefinition.getContainerComponent(interfaceHash, childIndex);
        if (componentDefinition != null) {
            this.IComponentDefinitionCollection = IComponentDefinition.getIComponentDefinitionCollections[interfaceHash >> 16];
            this.componentDefinition = componentDefinition;
            //System.out.println("Interface: " + (interfaceHash >> 16));
            //System.out.println("Interface" + (interfaceHash && 0xFFFF));
            return true;
        }
        clear();
        return false;
    }

    IComponentDefinition componentExists() {
        return (this.IComponentDefinitionCollection.componentWithinInterface(this.componentDefinition.interfaceHash * -440872681));
    }

    void clear() {
        this.IComponentDefinitionCollection = null;
        this.componentDefinition = null;
    }

}
