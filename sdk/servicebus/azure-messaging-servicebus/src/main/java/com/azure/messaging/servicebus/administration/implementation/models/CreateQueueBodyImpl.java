// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The request body for creating a queue.
 */
@Fluent
public final class CreateQueueBodyImpl implements XmlSerializable<CreateQueueBodyImpl> {
    private static final String WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM = "http://www.w3.org/2005/Atom";

    /*
     * QueueDescription for the new queue.
     */
    private CreateQueueBodyContentImpl content;

    /**
     * Creates an instance of CreateQueueBody class.
     */
    public CreateQueueBodyImpl() {
    }

    /**
     * Get the content property: QueueDescription for the new queue.
     * 
     * @return the content value.
     */
    public CreateQueueBodyContentImpl getContent() {
        return this.content;
    }

    /**
     * Set the content property: QueueDescription for the new queue.
     * 
     * @param content the content value to set.
     * @return the CreateQueueBody object itself.
     */
    public CreateQueueBodyImpl setContent(CreateQueueBodyContentImpl content) {
        this.content = content;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "entry" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeNamespace(WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM);
        xmlWriter.writeXml(this.content, "content");
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of CreateQueueBody from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of CreateQueueBody if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the CreateQueueBody.
     */
    public static CreateQueueBodyImpl fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of CreateQueueBody from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of CreateQueueBody if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the CreateQueueBody.
     */
    public static CreateQueueBodyImpl fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "entry" : rootElementName;
        return xmlReader.readObject(WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM, finalRootElementName, reader -> {
            CreateQueueBodyImpl deserializedCreateQueueBody = new CreateQueueBodyImpl();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("content".equals(elementName.getLocalPart())
                    && WWW_W3_ORG_TWO_ZERO_ZERO_FIVE_ATOM.equals(elementName.getNamespaceURI())) {
                    deserializedCreateQueueBody.content = CreateQueueBodyContentImpl.fromXml(reader, "content");
                } else {
                    reader.skipElement();
                }
            }

            return deserializedCreateQueueBody;
        });
    }
}
