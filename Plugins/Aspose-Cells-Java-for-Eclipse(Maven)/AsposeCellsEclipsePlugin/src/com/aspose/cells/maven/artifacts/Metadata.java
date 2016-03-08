//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.26 at 03:01:37 PM PKT 
//
package com.aspose.cells.maven.artifacts;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p/>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/> &lt;element
 * name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;element name="versioning"> &lt;complexType> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence> &lt;element name="latest"
 * type="{http://www.w3.org/2001/XMLSchema}string"/> &lt;element name="release"
 * type="{http://www.w3.org/2001/XMLSchema}string"/> &lt;element
 * name="versions"> &lt;complexType> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="version" type="{http://www.w3.org/2001/XMLSchema}string"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType> &lt;/element> &lt;element
 * name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}long"/>
 * &lt;/sequence> &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * &lt;/element> &lt;/sequence> &lt;/restriction> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groupId",
    "artifactId",
    "version",
    "versioning",
    "classifier"
})
@XmlRootElement(name = "metadata")
public class Metadata {

    /**
     *
     */
    @XmlElement(required = true)
    protected String groupId;

    /**
     *
     */
    @XmlElement(required = true)
    protected String artifactId;

    /**
     *
     */
    @XmlElement(required = true)
    protected String version;

    /**
     *
     */
    @XmlElement(required = true)
    protected Metadata.Versioning versioning;

    /**
     *
     */
    protected String classifier;

    /**
     * Gets the value of the groupId property.
     *
     * @return possible object is {@link String }
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the artifactId property.
     *
     * @return possible object is {@link String }
     */
    public String getArtifactId() {
        return artifactId;
    }

    /**
     * Sets the value of the artifactId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setArtifactId(String value) {
        this.artifactId = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is {@link String }
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the versioning property.
     *
     * @return possible object is {@link Metadata.Versioning }
     */
    public Metadata.Versioning getVersioning() {
        return versioning;
    }

    /**
     * Sets the value of the versioning property.
     *
     * @param value allowed object is {@link Metadata.Versioning }
     */
    public void setVersioning(Metadata.Versioning value) {
        this.versioning = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * <p/>
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * <p/>
     * <
     * pre>
     * &lt;complexType> &lt;complexContent> &lt;restriction
     * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence>
     * &lt;element name="latest"
     * type="{http://www.w3.org/2001/XMLSchema}string"/> &lt;element
     * name="release" type="{http://www.w3.org/2001/XMLSchema}string"/>
     * &lt;element name="versions"> &lt;complexType> &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence> &lt;element name="version"
     * type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"
     * minOccurs="0"/> &lt;/sequence> &lt;/restriction> &lt;/complexContent>
     * &lt;/complexType> &lt;/element> &lt;element name="lastUpdated"
     * type="{http://www.w3.org/2001/XMLSchema}long"/> &lt;/sequence>
     * &lt;/restriction> &lt;/complexContent> &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "latest",
        "release",
        "versions",
        "lastUpdated"
    })
    public static class Versioning {

        /**
         *
         */
        @XmlElement(required = true)
        protected String latest;

        /**
         *
         */
        @XmlElement(required = true)
        protected String release;

        /**
         *
         */
        @XmlElement(required = true)
        protected Metadata.Versioning.Versions versions;

        /**
         *
         */
        protected long lastUpdated;

        /**
         * Gets the value of the latest property.
         *
         * @return possible object is {@link String }
         */
        public String getLatest() {
            return latest;
        }

        /**
         * Sets the value of the latest property.
         *
         * @param value allowed object is {@link String }
         */
        public void setLatest(String value) {
            this.latest = value;
        }

        /**
         * Gets the value of the release property.
         *
         * @return possible object is {@link String }
         */
        public String getRelease() {
            return release;
        }

        /**
         * Sets the value of the release property.
         *
         * @param value allowed object is {@link String }
         */
        public void setRelease(String value) {
            this.release = value;
        }

        /**
         * Gets the value of the versions property.
         *
         * @return possible object is {@link Metadata.Versioning.Versions }
         */
        public Metadata.Versioning.Versions getVersions() {
            return versions;
        }

        /**
         * Sets the value of the versions property.
         *
         * @param value allowed object is {@link Metadata.Versioning.Versions }
         */
        public void setVersions(Metadata.Versioning.Versions value) {
            this.versions = value;
        }

        /**
         * Gets the value of the lastUpdated property.
         * @return 
         */
        public long getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Sets the value of the lastUpdated property.
         * @param value
         */
        public void setLastUpdated(long value) {
            this.lastUpdated = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * <p/>
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * <p/>
         * <
         * pre>
         * &lt;complexType> &lt;complexContent> &lt;restriction
         * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence>
         * &lt;element name="version"
         * type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"
         * minOccurs="0"/> &lt;/sequence> &lt;/restriction> &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "version"
        })
        public static class Versions {

            /**
             *
             */
            protected List<String> version;

            /**
             * Gets the value of the version property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the version property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVersion().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * @return 
             */
            public List<String> getVersion() {
                if (version == null) {
                    version = new ArrayList<String>();
                }
                return this.version;
            }

        }

    }

    /**
     * Gets the value of the classifier property.
     *
     * @return possible object is {@link String }
     */
    public String getClassifier() {
        return classifier;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is {@link String }
     */
    public void setClassifier(String value) {
        this.classifier = value;
    }

}
