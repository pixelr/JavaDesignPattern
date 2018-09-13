public class Window extends Composite implements NonComposable {
	public Window(String name){
		super(name);
	}

	public void show(){
		System.out.println("window" + name + "displayed");
		showHelper();
	}

	public void hide(){
		System.out.println("window" + name + "hidden");
		showHelper();
	}

}
