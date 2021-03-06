/**
 *
 */
package au.org.ala.sds.model;

import java.io.Serializable;

/**
 *
 * @author Peter Flemming (peter.flemming@csiro.au)
 */
public class ConservationInstance extends SensitivityInstance implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String locationGeneralisation;

    /**
     * @param category
     * @param authority
     * @param zone
     * @param generalisation
     */
    public ConservationInstance(
            SensitivityCategory category,
            String authority,
            String dataResourceId,
            SensitivityZone zone,
            String reason,
            String remarks,
            String generalisation) {
        super(category, authority, dataResourceId, zone, reason, remarks);
        this.locationGeneralisation = generalisation;
    }

    public String getLocationGeneralisation() {
        return locationGeneralisation;
    }
}
