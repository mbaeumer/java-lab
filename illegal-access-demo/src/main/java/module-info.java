module illegalaccessdemo {
    requires javafx.controls;
    requires java.sql;
    requires java.desktop;
    opens se.mbaeumer.javalab.illegalaccess to javafx.graphics;
    //opens se.mbaeumer.fxlink.models to javafx.base;
}

