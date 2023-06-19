package ru.covariance.codeforcesapi.apireader;

import ru.covariance.codeforcesapi.apisource.CodeforcesApi;
import ru.covariance.codeforcesapi.constants.CodeForcesConstants;

public class ApiReader {
  public static CodeforcesApi callApi() {
    return
        new CodeforcesApi(CodeForcesConstants.API_KEY,CodeForcesConstants.API_SECRET);
  }
}
