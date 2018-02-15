import org.jointheleague.graphical.robot.Robot;

public class ValentinesDay {
	public static void main(String[] args) {
		Robot harold= new Robot();
		harold.setWindowImage("appley.png");
		harold.setX(300);
		harold.setY(400);
		harold.penDown();
		harold.setPenColor(0, 0, 0);
		harold.setPenWidth(100);
		harold.setSpeed(50000000);
		harold.setAngle(-40);
		harold.move(350);
		harold.setAngle(0);
		for (int r=0; r<2; r++) {
		
			for (int i=0; i<180; i+=2) {
				harold.move(4);
				harold.turn(2);
		
			}
			harold.setAngle(0);
		}
		harold.setAngle(220);
		harold.move(360);
		harold.hide();
	}
	

}
