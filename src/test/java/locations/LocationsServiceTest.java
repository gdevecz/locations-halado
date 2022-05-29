package locations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LocationsServiceTest {

    @Test
    void testGetLocations() {
        LocationsService locationsService = new LocationsService();
        List<Location> locations = locationsService.getLocations();

        assertThat(locations)
                .hasSize(3)
                .extracting(Location::getName)
                .contains("Róma");
    }
}