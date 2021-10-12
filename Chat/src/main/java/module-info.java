module UA1.Chat {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.xml.bind;
	requires javafx.base;
    opens UA1.Chat to javafx.fxml;
    exports UA1.Chat;
}
