/**
* Hawk.java
*
* DESCRIPTION:
* This file contains the unique characteristics of the Hawk Wildlife descendant. This class inherits from
* the Fauna abstract class.
*
* AUTHORS: 	Tristan Heisler 200351317
* 			Jonathon Wells 200328640
* 			Quinn Bast 200352973		
*/

package WildlifeSimulation;

public class Hawk extends Fauna 
{
	//Default constructor
	public Hawk()
	{
		super("hawk", 'H', 4, 100);
		preyList.add(new Mouse());
		preyList.add(new Squirrel());
	}
}
