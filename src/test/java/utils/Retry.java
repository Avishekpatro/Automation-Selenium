package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    @Override
    public boolean retry(ITestResult iTestResult) {

        int count =0;
        int retryCount = 1;

        while (count < retryCount){
            count++;
            return true;
        }
        return false;
    }
}
