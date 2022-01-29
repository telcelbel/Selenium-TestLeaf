package assignmentweek3;

public class Automation extends MultipleLangauge implements Language, TestTool  {

	public void Selenium() {
		System.out.println("Learn selenium");
		
	}

	public void java() {
		
		System.out.println("Learn JAVA");
	}

	@Override
	public void ruby() {
		System.out.println("Learn Ruby");
		
	}
	
	public static void main(String[] args) {
		Automation ai=new Automation();
		ai.Selenium();
		ai.java();
		ai.ruby();
		ai.python();
	}

}
	
