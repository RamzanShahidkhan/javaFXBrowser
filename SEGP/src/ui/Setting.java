package ui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXDrawersStack;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXDrawer.DrawerDirection;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Setting {

	public Tab getSettingView(Tab settingTab, BorderPane borderpane) {

		JFXButton setting = new JFXButton("Setting");setting.setMinSize(100, 50);
		JFXButton history = new JFXButton("History");history.setMinSize(100, 50);

		/*
		 * Add two buttons in gridpane that will be put in
		 * drawer->drawerstack(container) -> left side of border to come ount
		 * whenever user click the setting button
		 */
		GridPane gridPane = new GridPane();
		gridPane.add(setting, 0, 0);
		gridPane.add(history, 0, 1);

		// ------------------------------------------------------Right----DrawerStack--------------------------------

		// Alredy detialed mention in Hamburger class about JFx DrawerStack and
		// JFXDrawer
		JFXDrawersStack drawersStack = new JFXDrawersStack();
		JFXDrawer leftDrawer = new JFXDrawer();
		leftDrawer.setDirection(DrawerDirection.LEFT);
		leftDrawer.setDefaultDrawerSize(80);
		leftDrawer.setSidePane(gridPane);
		leftDrawer.setResizableOnDrag(true);

		borderpane.setLeft(drawersStack);
		drawersStack.toggle(leftDrawer);
		settingTab.setContent(borderpane);
		return settingTab;
	}

}