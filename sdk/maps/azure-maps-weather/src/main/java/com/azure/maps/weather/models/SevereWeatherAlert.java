// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about a severe weather alert. */
@Fluent
public final class SevereWeatherAlert {
    /*
     * 2-character ISO 3166-1 Alpha-2 country code, for example, "US".
     */
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /*
     * A unique numerical identifier for a weather alert.
     */
    @JsonProperty(value = "alertId")
    private Integer alertId;

    /*
     * Description of the alert.
     */
    @JsonProperty(value = "description")
    private SevereWeatherAlertDescription description;

    /*
     * Category of the alert.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * Number signifying the importance or ranking order of the given alert within the country/region it has
     * originated. A lower number signifies a higher priority. For example, 1 is the highest priority. The number
     * varies by country/region and can change over time as each country/region evolves their alert systems.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Classification of the alert. This field is not available for all countries and therefore not always returned.
     */
    @JsonProperty(value = "class")
    private String classification;

    /*
     * Severity level of the alert. This field is not available for all countries and therefore not always returned.
     */
    @JsonProperty(value = "level")
    private String level;

    /*
     * The provider of the alert information. By default the source is returned in English (en-US). The alerts are from
     * official Government Meteorological Agencies and leading global weather alert providers.
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * A numerical identifier associated with the source provider name of the alert data.
     */
    @JsonProperty(value = "sourceId")
    private Integer sourceId;

    /*
     * A disclaimer regarding the source of the alert information. This field is not always available. For example,
     * disclaimer may include details about the delays or potential issues related to the alarm.
     */
    @JsonProperty(value = "disclaimer")
    private String disclaimer;

    /*
     * Information about the alert specific to the affected area(s).
     */
    @JsonProperty(value = "alertAreas")
    private List<AlertDetails> alertDetails;

    /** Set default SevereWeatherAlert constructor to private */
    private SevereWeatherAlert() {}

    /**
     * Get the countryCode property: 2-character ISO 3166-1 Alpha-2 country code, for example, "US".
     *
     * @return the countryCode value.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Get the alertId property: A unique numerical identifier for a weather alert.
     *
     * @return the alertId value.
     */
    public Integer getAlertId() {
        return this.alertId;
    }

    /**
     * Get the description property: Description of the alert.
     *
     * @return the description value.
     */
    public SevereWeatherAlertDescription getDescription() {
        return this.description;
    }

    /**
     * Get the category property: Category of the alert.
     *
     * @return the category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Get the priority property: Number signifying the importance or ranking order of the given alert within the
     * country/region it has originated. A lower number signifies a higher priority. For example, 1 is the highest
     * priority. The number varies by country/region and can change over time as each country/region evolves their alert
     * systems.
     *
     * @return the priority value.
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Get the classification property: Classification of the alert. This field is not available for all countries and
     * therefore not always returned.
     *
     * @return the classification value.
     */
    public String getClassification() {
        return this.classification;
    }

    /**
     * Get the level property: Severity level of the alert. This field is not available for all countries and therefore
     * not always returned.
     *
     * @return the level value.
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * Get the source property: The provider of the alert information. By default the source is returned in English
     * (en-US). The alerts are from official Government Meteorological Agencies and leading global weather alert
     * providers.
     *
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Get the sourceId property: A numerical identifier associated with the source provider name of the alert data.
     *
     * @return the sourceId value.
     */
    public Integer getSourceId() {
        return this.sourceId;
    }

    /**
     * Get the disclaimer property: A disclaimer regarding the source of the alert information. This field is not always
     * available. For example, disclaimer may include details about the delays or potential issues related to the alarm.
     *
     * @return the disclaimer value.
     */
    public String getDisclaimer() {
        return this.disclaimer;
    }

    /**
     * Get the alertDetails property: Information about the alert specific to the affected area(s).
     *
     * @return the alertDetails value.
     */
    public List<AlertDetails> getAlertDetails() {
        return this.alertDetails;
    }
}