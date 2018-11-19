/**
* @wi.implements COEDemo/COED-509:16 Returns author of this book
*/

/**
* @wi.implements gitTester/GITT-372:6 Returns author of this book
*/
/* This is a simple Java program. 
FileName : "HelloWorld.java". */
class HelloWorld 
{ 
	String name = "Sultan";
	// Your program begins with a call to main(). 
	// Prints "Hello, World" to the terminal window. 
	
	public static void main(String args[]) 
	{ 
		System.out.println("The name is : " + name); 
		
	} 
	/**
	* @wi.implements COEDemo/COED-509:16 Function to Get the name
	*/
	public getName()
	{
		return name;
	}
	/**
	* @wi.implements COEDemo/COED-509:17 Function to Set the name
	*/
	public setName(String newName)
	{
		name = newName;
	}
} 

/**
* {@wi.implements elibrary_alm/EL-122 messages can take up 
* several lines in the code. Just surround the whole parsing syntax 
* with {tested}  
* Anything commented after will not be included.
*/ 
      
