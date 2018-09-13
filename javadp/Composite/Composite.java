import java.util.*;

public abstract class Composite extends Component{
	private List<Component> components;

	public Composite(String name){
		super(name);
		components = new ArrayList<>();
	}

	public void add(Component c){
		//throw exception instead
		if(c instanceof NonComposable)
			return;

		components.add(c);
	}

	public void remove(Component c){
		components.remove(c);
	}

	protected void hideHelper(){
		for(Component c: components){
			c.hide();
		}
	}

	protected void showHelper(){
		for(Component c: components){
			c.show();
		}
	}
}
