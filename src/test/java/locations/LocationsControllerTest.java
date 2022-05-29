package locations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LocationsControllerTest {

    @Mock
    LocationsService locationsService;

    @InjectMocks
    LocationsController locationsController;


    @Test
    void testGetLocations() {
        when(locationsService.getLocations())
                .thenReturn(Arrays.asList(
                        new Location("Budapest", 47.497912, 19.040235),
                        new Location("Róma", 41.90383, 12.50557),
                        new Location("Athén", 37.97954, 23.72638))
                );

        List<Location> locations = locationsService.getLocations();

        assertThat(locations)
                .hasSize(3)
                .extracting(Location::getName)
                .contains("Róma");

        verify(locationsService).getLocations();
    }
}