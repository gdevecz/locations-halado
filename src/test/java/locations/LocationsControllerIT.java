package locations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LocationsControllerIT {

    @Autowired
    LocationsController locationsController;

    @Test
    void testGetLocations() {
        String locations = locationsController.getLocations();

        assertThat(locations)
                .contains("Róma");
    }
}
