package video.main;

import static video.ui.AppUi.*;

public class Main {

	public static void main(String[] args) {

		AppController appController = new AppController();

		while (true) {
			startScreen();
			int selectNumber = inputInteger(">>> ");

			appController.chooseSystem(selectNumber);
		}

	}
}
