package home;

import common.View;
import member.MemberController;

public class Home {
	
	private HomeView homeView = HomeView.getInstance();
	private MemberController membercontroller = MemberController.getInstance();
	
	public void start() {
		int view = View.HOME;
		
		loof: while (true) {
			switch (view) {
			case View.HOME:
				view = homeView.init();
				break;
				
			}
		}
	}
}
