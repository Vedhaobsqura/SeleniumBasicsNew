package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer
{
//for n/w failure,if we page is not loaded,not clickable
	
	int counter = 0;
	int retryLimit = 2;

	public boolean retry(ITestResult result) 
	{

		if (counter < retryLimit)
		{
			counter++;
			return true;
		}
		
		//retry is more than 2 its failure
		return false;
	}	
	
	
	
		
}
