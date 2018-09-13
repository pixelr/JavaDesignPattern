public class Button extends Composite implements NonComposable {
	public Button(String name){
		super(name);
	}

	public void show(){
		System.out.println("button" + name + "displayed");
		showHelper();
	}

	public void hide(){
		System.out.println("button" + name + "hidden");
		showHelper();
	}

}

