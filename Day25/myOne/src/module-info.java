import ringo.item03.MyService;
import ringo.item03.impl.Kun;
import ringo.item03.impl.Ringo;

module myOne {
    exports ringo.item01;
    exports ringo.item03;

    provides MyService with Kun;
}

