public class Main{

	public static void main(String[] args){
	
	Window w = new Window("top window");
	
	Button b1 = new Button("button 1");
	Button b2 = new Button("button 2");

	w.add(b1);
	w.add(b2);
	w.show();

	}

}
