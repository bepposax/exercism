import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<Signal>(Signal.values().length);

        for (Signal s : Signal.values()) {
            if ((number & 1) == 1)
                handshake.add(s);
            number >>= 1;
        }
        if ((number & 1) == 1)
            Collections.reverse(handshake);

        return handshake;
    }
}