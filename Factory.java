public interface UIFactory{
	public String clickButton();
	public String showMenu();
}
public class AndroidFactory implements UIFactory{
	@Override
	public String clickButton()
	{
		return "Button from Android";
	}
	
	@Override
	public String showMenu()
	{
		return "Menu from Android";
	}
}
public class IosFactory implements UIFactory{
	@Override
	public String clickButton()
	{
		return "Button from Ios";
	}
	
	@Override
	public String showMenu()
	{
		return "Menu from Ios";
	}
}
public enum FactoryType{
	ANDROID,
	IOS
}
public class Selector{
	public UIFactory getFactory(FactoryType type){
		if(type==FactoryType.ANDROID){
			return new AndroidFactory();
		}
		else{
			return new IosFactory();
		}
	}
}
public class Solution{
	public static void main(String[] args){
		Selector obj = new Selector();
		UIFactory os = obj.getFactory(FactoryType.ANDROID);
		os.clickButton();
	}
}