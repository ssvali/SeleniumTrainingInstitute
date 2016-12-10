package learningSelenium;

public class AboutXpath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * XPath is designed to allow the navigation of XML documents,
		 * with the purpose of selecting individual elements, attributes, or some other part of an XML document
		 * 
		 * Absolute XPath
				Absolute XPath starts with the root node or a forward slash (/).
				The advantage of using absolute is, it identifies the element very fast.
				Disadvantage here is, if any thing goes wrong or some other tag added in between, then this path will no longer works.

				Example:
				If the Path we defined as
				1. html/head/body/table/tbody/tr/th
				
			Relative Xpath
				A relative xpath is one where the path starts from the node of your choise - it doesn't need to start from the root node.
				It starts with Double forward slash(//)
				Syntax:
				//table/tbody/tr/th
				Advantage of using relative xpath is, you don't need to mention the long xpath, you can start from the middle or in between.
				Disadvantage here is, it will take more time in identifying the element as we specify the partial path not (exact path).				
		   
		
		*
		*/

	}

}
