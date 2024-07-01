package com.omega.watch.modal; 

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.ArrayList;

// mvn test -Dtest=WatchTest
@ExtendWith(SpringExtension.class)
class WatchTest {

    @Test
    void testWatchCreationAndProperties() {

        List<String> tags = new ArrayList<>();
        tags.add("Anti-magnetic");
        tags.add("Chronometer");

        Watch watch = new Watch(
            "Seamaster Diver 300M 42 mm", "210.30.42.20.01.001", "Self winding",
            "Steel", 42.0, 13.6, 49.9, 20.0, "Black",
            "Sapphire", "Domed, scratch-resistant, anti-reflective",
            "Omega 8800", 55, 30, 194.0, tags, 9500
        );

        assertThat(watch.getModelName()).isEqualTo("Seamaster Diver 300M 42 mm");
        assertThat(watch.getReferenceNumber()).isEqualTo("210.30.42.20.01.001");
        assertThat(watch.getMovementType()).isEqualTo("Self winding");
        assertThat(watch.getCaseMaterial()).isEqualTo("Steel");
        assertThat(watch.getCaseDiameterMm()).isEqualTo(42.0);

        assertThat(watch.getTags()).containsExactly("Anti-magnetic", "Chronometer");
        assertThat(watch.getPrice()).isEqualTo(9500);
    }

    @Test
    void testEmptyConstructor() {
        Watch watch = new Watch();
        assertThat(watch.getTags()).isEmpty();
        assertThat(watch.getPrice()).isZero();
    }

}
